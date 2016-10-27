package com.ecshop.dao.base.hibernate;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.Id;

import org.hibernate.Criteria;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.ecshop.dao.base.GenericDao;
import com.ecshop.dao.base.page.PageModel;
import com.ecshop.dao.base.page.PageView;



/**
 * GenericDAO接口的Hibernate实现。
 * <p>
 * 
 * 【使用说明】<br>
 * 1. 不包含任何具有特定数据库风格的函数，例如informix的updateStatics。<br>
 * 2. 每一个DAO实现类，都必须实现setInjectSessionFactory。 因为在Spring 2.5中
 * HibernateDaoSupport不支持注解且被声明为final无法override。<br>
 * 3. 受团队风格影响，目前仅向产品提供HQL、SimpleQuery的支持。QBC/QBE暂不提供。
 * 
 * @since 2010-11-19 
 * @since 2011-02-18 
 */
@SuppressWarnings("unchecked")
public abstract class HibernateGenericDao<T, ID extends Serializable> implements GenericDao<T, ID> {

	protected static Logger logger = LoggerFactory
			.getLogger(HibernateGenericDao.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	/** 持久化对象的实际类型 。 */
	private Class<T> entityClass;

	/**
	 * 构造函数(默认)
	 */
	public HibernateGenericDao() {
		// 获取当前Class为泛型超类的第一个类型参数
		this.entityClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	/**
	 * 如需运行时变更持久化类型，可override本函数。
	 * 
	 * @return 持久化对象类型
	 */
	public Class<T> getEntityClass() {
		return entityClass;
	}

	public T findById(ID id) {
		return (T) this.getSession().get(entityClass, id);
	}
	
	public  T findById(Class<?> classZ,ID id) {
		return (T) this.getSession().get(classZ, id);
	}

	public T findById(ID id, boolean lock) {
		if (lock) {
			return (T) this.getSession().get(entityClass, id,
					LockOptions.UPGRADE);
		} else {
			return findById(id);
		}
	}

	public List<T> findAll() {
		String queryString = "from " + entityClass.getSimpleName();
		Query queryObject = getSession().createQuery(queryString);
		List<T> results = (List<T>)queryObject.list();
		return results;
	}

	public void delete(T entity) {
		this.getSession().delete(entity);
	}

	public void deleteById(ID id) {
		T entity = this.findById(id);
		if (entity != null)
			this.delete(entity);
	}

	public T save(T entity) {
		this.getSession().save(entity);
		return entity;
	}

	public T update(T entity) {
		this.getSession().update(entity);
		return entity;
	}
	
	/**
	 * 通过ID和不为空的字段更新数据
	 * @param id 主键数据
	 * @param entity 待更新的不为空的字段
	 * @return 原数据
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public T updateNotNull(ID id,T entity) throws IllegalArgumentException, IllegalAccessException {		
		T old= (T)getSession().get(entity.getClass(), id);
		for(Field field : entity.getClass().getDeclaredFields()){
			if(field.getDeclaredAnnotations().length<1){
				continue;
			}
			field.setAccessible(true);
			Object value=field.get(entity);
			if(value==null){
					continue;
			}
			if(field.getAnnotation(Id.class)!=null){// 忽略主键赋值
				continue;
			}
			field.set(old, value);		
		}	
		getSession().update(old);
		return old;
	}

	public T saveOrUpdate(T entity) {
		this.getSession().saveOrUpdate(entity);
		return entity;
	}

	/**
	 * 根据属性值查询对象
	 * 
	 * @param propName 属性名
	 * @param propValue 属性值
	 */
	public List<T> findByProperty(String propName, Object propValue) {
		Assert.hasText(propName);
		DetachedCriteria dc = DetachedCriteria.forClass(getEntityClass());
		dc.add(Restrictions.eq(propName, propValue));
		Criteria criteria = dc.getExecutableCriteria(getSession());
		return criteria.list();
	}
	
	public List<T> findByProperty(String [] propNames,Object[] propvalues){
		Assert.notNull(propvalues);
		Assert.notNull(propNames);
		int i=0;
		DetachedCriteria dc = DetachedCriteria.forClass(getEntityClass());
		for(String propName:propNames){
			if(propName != null ){
				if(propvalues.length > i)
					dc.add(Restrictions.eq(propName, propvalues[i]));
				else{
					logger.warn("propNames are more than propValues' size!");
					break;
				}
			}
			i++;
		}
		Criteria criteria = dc.getExecutableCriteria(getSession());
		return criteria.list();
	}


	
	
	/**
	 *------------------------------ HQL支持 ------------------------------<p>
	 * 经前期试用反馈，得知QBC风格普遍不被接受，同志们还是习惯HQL。<p>
	 * 两种风格的find也使新进程序员产生困惑，经小组讨论，决定去QBC风格，即参数不再有Criteria。<p>
	 * 并重构精简代码，去除无实际意义的回调，使代码易读。<p>
	 * 2011-02-18 yelm<p>
	 * --------------------------------------------------------------------
	 * <p>
	 * 使用该方法时，请注意委托Session管理给本地的hibernateTemplate，避免连接池无法正常释放和事务特性的不正确。<p>
	 * 例：<p>
	 * <pre><blockquote>
	 *  getHibernateTemplate().executeWithNativeSession(new HibernateCallback() {
	 *    public Object doInHibernate(Session session) throws HibernateException,SQLException {
	 *      return createQuery(session,hql, values).uniqueResult();
	 *    }
	 *  });
	 * </blockquote><pre>
	 * 
	 * @param session
	 * @param hql
	 * @param values
	 * @return
	 */
	protected Query createQuery(String hql, Object... values) {
		Assert.hasText(hql);
		Query query = this.getSession().createQuery(hql);
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				query.setParameter(i, values[i]);
			}
		}
		return query;
	}
	


	/**
	 * HQL单一查询，例如select count(*)/sum(property) from ...
	 */
	protected Object findUnique(final String hql, final Object... values) {
		return createQuery(hql, values).uniqueResult();
			
	}
	


	/**
	 * 执行count查询获得本次Hql查询所能获得的对象总数<br>
	 * 只能处理简单的hql语句，不支持union等复杂的hql查询。<br>
	 * 复杂的查询语句请通过建立视图或重构数据库设计解决。
	 */
     public int countHqlResult(final String hql, final Object... values) {
		// 剔除语句中select部分和order by部分
		String s = hql.toUpperCase();
		int i = s.indexOf("FROM ");
		if (i > -1) {
			i = i + 5;
		} else {
			i = 0;
		}
		int j = s.indexOf(" ORDER BY");
		if (j == -1) {
			j = s.length();
		}
		s = hql.substring(i, j);
		// 拼装成select count(*)语句
		String countHql = "SELECT COUNT(*) FROM " + s;
		Long count = (Long)findUnique(countHql, values);
        return count == null ? 0 : count.intValue();
	}
	
	


	/**
	 * HQL查询，支持变参列表<br>
	 */
	public List<T> find(final String hql, final Object... values) {
		Query query = this.createQuery(hql, values);
		return query.list();
	}
	
	

	/**
	 * HQL分页查询
	 */
	public List<T> find(final String hql, final PageView<T> pageView, final Object... values) {
			// 查总记录数
			int totalCount = countHqlResult(hql, values);
		
			Query query = createQuery(hql, values);
			query.setFirstResult(pageView.getFirstResult());
			query.setMaxResults(pageView.getPageSize());
			pageView.setRowCount(totalCount);
			//pageView.setRecords(query.list());
			return query.list();
		
	}
	
	/**
	 * HQL分页  返回PageModel模型
	 * @param hql
	 * @param pageNo
	 * @param pageSize
	 * @param values
	 * @return
	 */
	public PageModel<T> find(final String hql, int pageNo,int pageSize, final Object... values) {
			// 查总记录数
			int totalCount = countHqlResult(hql, values);
		
			Query query = createQuery(hql, values);
			query.setFirstResult((pageNo-1)*pageSize);
			query.setMaxResults(pageSize);
			
			PageModel<T> pageModel = new PageModel<T>();
			pageModel.setTotal(totalCount);
			pageModel.setRows(query.list());
			return pageModel;
		
	}
	

	
	public List<T> findList(final String hql, final int startIndex,
			final int pageSize, final Object... values) {
			Query query = createQuery(hql, values);
			query.setFirstResult(startIndex);
			query.setMaxResults(pageSize);
			return query.list();
		
	}
	
	/**
	 * HQL分页查询，返回List对象
	 * add by liuwendi
	 */
	public List<T> findToList(final String hql, final int startIndex,
		final int pageSize, final Object... values) {
			// 查总记录数
			int totalCount = countHqlResult(hql, values);
			// 查分页数据，先创建分页对象是为了对startIndex和pageSize进行容错处理
			Query query = createQuery(hql, values);
			query.setFirstResult(startIndex);
			if(totalCount < pageSize) {
				query.setMaxResults(totalCount);
			} else {
				query.setMaxResults(pageSize);
			}
			return query.list();
		
	}
	

	/**
	 * 通过条件对象返回对象列表
	 * @param instance
	 * @return
	 */
	public  List<T> find(T instance) {
		Criteria criteria = getSession().createCriteria(instance.getClass());
		criteria.add(Example.create(instance));
		List<T> list = (List<T>) criteria.list();
		return list;
	}

	@Override
	public  List<T> find(T instance,PageView<T> pageView, Order ...orders) {
		try {

			Criteria criteria = getSession().createCriteria(instance.getClass());
			criteria.add(Example.create(instance));
			for(Order order:orders){
				criteria.addOrder(order);
			}
			
			//先取汇总
			@SuppressWarnings({ "rawtypes" })
			List list = (List<T>) criteria.setProjection(
					Projections.projectionList() 
					.add( Projections.rowCount())).list();
			
			long total=Long.parseLong(list.get(0).toString());
			int index=pageView.getFirstResult();
			pageView.setRowCount(total);
			
			//再查询分页数据
			criteria.setProjection(null);//取消投影汇总
			List<T> page = (List<T>) criteria
					.setFirstResult(index)
					.setMaxResults(pageView.getPageSize())
					.list();
			pageView.setRecords(page);
			
			return page;
		} catch (RuntimeException re) {
			logger.error("findByPage Method Run Failed", re);
			throw re;
		}
	}
	
	/**
	 * 处理范围类的扩展条件，
	 * @param criteria 条件集合
	 * @param conditions 外部条件
	 * @param field 字段
	 */
	private void addContintion(Criteria criteria,Map<String,Object> conditions,Field field){
		Object value=null;
		String key=field.getName()+"_begin";
		if(conditions.containsKey(key)){
			value=conditions.get(key);
			criteria.add(Restrictions.ge(field.getName(), value));
		}
		key=field.getName()+"_end";
		if(conditions.containsKey(key)){
			value=conditions.get(key);
			criteria.add(Restrictions.lt(field.getName(), value));
		}
		
		key=field.getName()+"_in";
		if(conditions.containsKey(key)){
			value=conditions.get(key);
			Object[] list=(Object[])value;
			criteria.add(Restrictions.in(field.getName(), list));
		}
	}
	
	@Override
	public  List<T> findLike(T instance,PageView<T> pageView, Order ...orders) {
		return findLike(instance,null,pageView,orders);
	}

	/**
	 * 查询分页数据，如果是string类型使用like匹配，其他完全匹配
	 */
	@Override
	public  List<T> findLike(T instance,Map<String,Object> conditions,PageView<T> pageView, Order ...orders) {
		try {

			Criteria criteria = getSession().createCriteria(instance.getClass());
			Disjunction or = null;
			//criteria.add(Example.create(instance));
			for(Field field : instance.getClass().getDeclaredFields()){
				if(field.getDeclaredAnnotations().length<1){
					continue;
				}
				field.setAccessible(true);
				String name=field.getName();
				Object value=null;
				try {
					value=field.get(instance);
					if(value==null){
						if(conditions!=null){// 追加附加条件
							addContintion(criteria,conditions,field);
						}
						continue;
					}
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				if(field.getType() ==String.class){
					String str=value.toString();
					if( str.isEmpty()){
						continue;
					}
					if(or==null){
						or=Restrictions.or(Restrictions.like(name, str, MatchMode.ANYWHERE));
					}else{
						or.add(Restrictions.like(name, str, MatchMode.ANYWHERE));
					}
					//criteria.add(Restrictions.like(name, str, MatchMode.ANYWHERE));
					
				}else{
					criteria.add(Restrictions.eq(name, value));
				}
				
			}
			if(or!=null){
				criteria.add(or);
			}
			
			for(Order order:orders){
				criteria.addOrder(order);
			}
			
			//先取汇总
			@SuppressWarnings({ "rawtypes" })
			List list = (List<T>) criteria.setProjection(
					Projections.projectionList() 
					.add( Projections.rowCount())).list();
			
			long total=Long.parseLong(list.get(0).toString());
			int index=pageView.getFirstResult();
			pageView.setRowCount(total);
			
			//再查询分页数据
			criteria.setProjection(null);//取消投影汇总
			List<T> page = (List<T>) criteria
					.setFirstResult(index)
					.setMaxResults(pageView.getPageSize())
					.list();
			pageView.setRecords(page);
			
			return page;
		} catch (RuntimeException re) {
			logger.error("findByPage Method Run Failed", re);
			throw re;
		}
	}
	
	@Override
	public PageModel<T> findLike(T instance,int pageNo,int pageSize,Order...orders){
		PageModel<T> res=new PageModel<T>();
		PageView<T> page=new PageView<T>();
		page.setPageNow(pageNo);
		page.setPageSize(pageSize);
		
		List<T> rows=findLike(instance,page, orders);
		res.setRows(rows);
		res.setTotal((int)page.getRowCount());
		return res;
		
	}
	
	@Override
	public List<T> find( List<Criterion> criterions, PageView<T> pageView, Order ...orders) {
		try {

			Criteria criteria=getSession().createCriteria(entityClass);
			if(criterions!=null && criterions.size()>0)
			for(Criterion criterion : criterions){
				criteria.add(criterion);
			}
			for(Order order:orders){
				criteria.addOrder(order);
			}

			@SuppressWarnings({ "rawtypes" })
			List list = criteria.setProjection(
							Projections.projectionList() 
							.add( Projections.rowCount())).list();
			long total=Long.parseLong(list.get(0).toString());
			int index=pageView.getFirstResult();
			pageView.setRowCount(total);
			
			criteria.setProjection(null);//取消映射汇总
			List<T> page = (List<T>) criteria
					.setFirstResult(index).setMaxResults(pageView.getPageSize())
					.list();
			return page;
		} catch (RuntimeException re) {
			logger.error("findByPageData criterions Method Run Failed", re);
			throw re;
		}
	}

	/**
	 * 执行HQL语句，限用于批量修改/删除操作。
	 * 
	 * @param hql
	 * @param values
	 * @return 返回删除/更新记录数
	 */
	protected int excute(final String hql, final Object... values) {
		Query query = createQuery(hql, values);
		return query.executeUpdate();
		
	}
	

	/**
	 * 以下新增支持sql原生查询的基础方法
	 * 
	 * 
    */
	
	/**
	 * 封装SQLQuery变参列表
	 */
	protected SQLQuery createSQLQuery(String sql, Object... values) {
		SQLQuery query = this.getSession().createSQLQuery(sql);
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				Object value=values[i];
				//query.setParameter(i, values[i]);				
				if(value instanceof Array) {
					query.setParameterList("list", (Object[])value);
					
				}else if(value instanceof Collection) {
					query.setParameterList("list", (Collection<?>)value);
					
				}else{
					query.setParameter(i, value);
				}
			}
		}
		return query;
	}
		
	/**
	 * count查询获得本次sql查询所能获得的对象总数<br>
	 * @param sql
	 * @param values
	 * @return
	 */
	protected int countSqlResult(final String sql, final Object... values) {
		// 剔除语句中select部分和order by部分
		String s = sql.toUpperCase();
		String countSql = "";
//		if(s.indexOf("UNION")==-1){
//			int i = s.indexOf("FROM ");
//			if (i > -1) {
//				i = i + 5;
//			} else {
//				i = 0;
//			}
//			int j = s.indexOf(" ORDER BY");
//			if (j == -1) {
//				j = s.length();
//			}
//			s = sql.substring(i, j);
//			// 拼装成select count(*)语句
//			countSql = "SELECT COUNT(*) FROM " + s;
//		}else{
//			int j = s.indexOf(" ORDER BY");
//			if (j == -1) {
//				j = s.length();
//			}
//			s = sql.substring(0, j);
//			// 拼装成select count(*)语句
//			countSql = "SELECT COUNT(*) FROM (" + s + ") as javacsru";
//		}
		int count=0;
		try {
			int j = s.indexOf(" ORDER BY");
			if (j>-1) {
				countSql=sql.substring(0, j);
			}else{
				countSql=sql;
			}
			countSql = "SELECT COUNT(*) FROM (" + countSql + ") as javacsru";
			count = Integer.parseInt(findUniqueBySql(countSql, values).toString());
		} catch (Exception e) {
		}
        return count == 0 ? 0 : count;
	}
	
	/**
	 * SQL单一查询，例如select count(*)/sum(property) from ...
	 */
	protected Object findUniqueBySql(final String sql, final Object... values) {
		return createSQLQuery(sql,values).uniqueResult();
			
	}
	
	/**
	 * 原生sql分页查询
	 * @param sql
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	public List<T> findBySql(final String sql, final PageView<T> pageView,final Object... values) {
		// 查总记录数((BigDecimal)query.uniqueResult()).intValue();
		int totalCount = countSqlResult(sql,values);
		// 查分页数据，先创建分页对象是为了对startIndex和pageSize进行容错处理
		SQLQuery query = createSQLQuery(sql,values).addEntity(entityClass);
		query.setFirstResult(pageView.getFirstResult());
		query.setMaxResults(pageView.getPageSize());
		pageView.setRowCount(totalCount);
		List<T> list=query.list();
		pageView.setRecords(list);
		return list;
	}
	
	/**
	 * SQL查询 ，支持变参列表
	 */
	public List<T> findBySql(final String sql, final Object... values) {
		SQLQuery query = createSQLQuery(sql,values).addEntity(entityClass);
		return query.list();
	}
	
	
	/* (non-Javadoc)
	 * @see com.vveplat.dao.base.GenericDao#findMaps(java.lang.String)
	 */
	@Override
	public List<Map<String, Object>> findMaps(String sql,Object... values) {
		SQLQuery query= createSQLQuery(sql,values);
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List<Map<String, Object>> list=(List<Map<String, Object>>)query.list();
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.vveplat.dao.base.GenericDao#findMaps(java.lang.String)
	 */
	@Override
	public List<Map<String, Object>> findMaps(String sql, PageView<Map<String, Object>> pageView, Object... values) {
		int totalCount = countSqlResult(sql,values);
		SQLQuery query= createSQLQuery(sql,values);
		
		query.setFirstResult(pageView.getFirstResult());
		query.setMaxResults(pageView.getPageSize());
		pageView.setRowCount(totalCount);
		
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List<Map<String, Object>> list=(List<Map<String, Object>>)query.list();
		pageView.setRecords(list);
		return list;
	}
	
	
	
	@Override
	public PageModel<Map<String, Object>> findMaps(String sql,int pageNo,int pageSize,Object... values) {
		
		PageModel<Map<String, Object>> pageModel = new PageModel<Map<String, Object>>();
		int totalCount = countSqlResult(sql,values);
		SQLQuery query= createSQLQuery(sql,values);
		query.setFirstResult((pageNo-1)* pageSize);
		query.setMaxResults(pageSize);
		
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List<Map<String, Object>> list=(List<Map<String, Object>>)query.list();
		pageModel.setTotal(totalCount);
		pageModel.setRows(list);
		return pageModel;
	}
	
	
	/**
	 * 执行SQL语句，限用于批量修改/删除操作。
	 * 
	 * @param SQL
	 * @param values
	 * @return 返回删除/更新记录数
	 */
	public int excuteBySql(final String sql, final Object... values) {
		SQLQuery query = createSQLQuery(sql, values);
		return query.executeUpdate();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getSession(){
		return this.getSessionFactory().getCurrentSession();
	}

}

package com.ecshop.dao.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;

import com.ecshop.dao.base.page.PageModel;
import com.ecshop.dao.base.page.PageView;




/**
 * <p>
 * 泛型数据库操作接口
 * </p>
 * 
 * <p>
 * GenericDao的存在，仅仅是为了避免重复的CRUD定义和实现出现在各个dao的接口和实现类中。
 * </p>
 * <p>
 * 由于该层接口将直接被dao层接口继承，被业务层调用，所以，<b>该接口内不允许有方言特性的行为定义。</b>
 * </p>
 * 
 * 一个使用的范例：
 * 
 * <PRE>
 * 		package  ......dao
 * 
 * 		public class AccountDao extends GenericDao&lt;Account,String&gt;{	
 * 			public List&lt;Account&gt; findAccountsByPagination(Page&lt;Accountgt; page,Account exampleInstance,String ... excludeProperty);
 * 			...
 * 		}
 * 		
 * 		package  ......dao.hibernate
 *      
 * 		public class AccountDaoImpl extends HibernateGenericDao&lt;Account,String> implements AccountDao{
 * 			public List&lt;Account&gt; findAccountsByPagination(Page&lt;Account&gt; page,Account exampleInstance,String ... excludeProperty){
 * 				...
 * 			}
 * 			...
 * 		}
 * 
 * </PRE>
 * 
 * @author 
 * 
 */
public interface GenericDao<T, ID extends Serializable> {

	/**
	 * <p>
	 * 根据主键查询对象
	 * </p>
	 * 
	 * @param id 主键
	 * @return 查询结果
	 */
	public T findById(ID id);

	/**
	 * <p>
	 * 根据主键查询对象，同时根据传入的<tt>lock</tt>标识确定是否锁定该列。
	 * </p>
	 * <p>
	 * 当<tt>lock==true</tt>时，类似于sql语句：
	 * <tt>select * from TABLE WHERE ID=? FOR UPDATE</tt>
	 * </p>
	 * 
	 * 
	 * @param id 主键
	 * @param lock
	 * @return
	 */
	public T findById(ID id, boolean lock);

	/**
	 * <p>
	 * 查询所有数据
	 * </p>
	 * 
	 * @return 所有数据列表
	 */
	public List<T> findAll();

	/**
	 * <p>
	 * 保存实体对象
	 * </p>
	 * 
	 * @param entity 待保存对象
	 * @return
	 */
	public T save(T entity);

	/**
	 * <p>
	 * 更新实体对象
	 * </p>
	 * 
	 * @param entity 待更新对象
	 * @return
	 */
	public T update(T entity);

	/**
	 * <p>
	 * 保存或更新实体对象
	 * </p>
	 * 
	 * <p>
	 * 当判定<tt>entity</tt>不存在时，调用保存方法(<code>{@link #save(Object)}</code>) 当判定
	 * <tt>entity</tt>存在时，调用更新方法(<code>{@link #update(Object)}</code>)
	 * </p>
	 * 
	 * @param entity
	 * @return
	 */
	public T saveOrUpdate(T entity);

	/**
	 * <p>
	 * 删除实体
	 * </p>
	 * 
	 * @param entity 待删除实体
	 */
	public void delete(T entity);

	/**
	 * 根据ID删除对象
	 * 
	 * @param id 对象ID
	 */
	public void deleteById(ID id);

	/**
	 * @param instance 查询参数
	 * @param pageView 页面参数
	 * @param orders 排序字段
	 * @return 分页数据
	 */
	List<T> find(T instance, PageView<T> pageView,Order ...orders);

	/**
	 * @param criterions  查询参数
	 * @param pageView 页面参数
	 * @param orders 排序字段
	 * @return 分页数据
	 */
	List<T> find(List<Criterion> criterions,PageView<T> pageView, Order...orders);

	/**
	 * @param instance  查询参数.字符串参数  会使用like匹配
	 * @param pageView  页面参数
	 * @param orders  排序字段
	 * @return 分页数据
	 */
	List<T> findLike(T instance, PageView<T> pageView, Order...orders);
	
	/**
	 * @param instance  查询参数.字符串参数  会使用like匹配
	 * @param conditions  范围扩展条件
	 * @param pageView  页面参数
	 * @param orders  排序字段
	 * @return 分页数据
	 */
	List<T> findLike(T instance,Map<String,Object> conditions, PageView<T> pageView, Order...orders);

	/**
	 * 查询map数据  不封装具体model
	 * @param sql 
	 * @param params 参数列表。
	 * @return
	 */
	List<Map<String, Object>> findMaps(String sql, Object... params);
	
	/**
	 * HQL分页  返回pageModel模型
	 * @param hql
	 * @param pageNo
	 * @param pageSize
	 * @param values
	 * @return
	 */
	public PageModel<T> find(final String hql, int pageNo,int pageSize, final Object... values);
	
	
	/**
	 * 查询map数据  不封装具体model
	 * @param sql 
	 * @param pageNo 当前页号
	 * @param pageSize 每页大小
	 * @param values 值列表
	 * @return
	 */
	public PageModel<Map<String, Object>> findMaps(String sql,int page,int pageSize,Object... values);

	/**
	 * 查询map数据  不封装具体model
	 * @param sql 
	 * @param pageView 分页设置
	 * @param values 值列表
	 * @return
	 */
	public List<Map<String, Object>> findMaps(String sql, PageView<Map<String, Object>> pageView,
			Object... values);

	/**
	 * 新分页风格的findLike版本查询
	 * @param instance 查询条件
	 * @param pageNo 分页索引
	 * @param pageSize 分页大小
	 * @param orders 排序字段
	 * @return
	 */
	PageModel<T> findLike(T instance, int pageNo, int pageSize, Order...orders);


}

package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for TNews
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TNews
 * @author MyEclipse Persistence Tools
 */
@Component
public class TNewsDAO extends HibernateGenericDao<TNews, Long> {
	private static final Logger log = LoggerFactory.getLogger(TNewsDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String IMG_URL = "imgUrl";
	public static final String NEWS_CATEGORY_ID = "newsCategoryId";
	public static final String CONTENT = "content";
	public static final String SCOPE = "scope";
	public static final String PUBLISHER = "publisher";
	public static final String USER_TYPE_STR = "userTypeStr";
	public static final String CENTER_ID = "centerId";

	public TNews findById(java.lang.Long id) {
		log.debug("getting TNews instance with id: " + id);
		try {
			TNews instance = (TNews) getSession().get(
					"com.vveplat.dao.business.models.TNews", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TNews> findByExample(TNews instance) {
		log.debug("finding TNews instance by example");
		try {
			List<TNews> results = (List<TNews>) getSession().createCriteria(
					"com.vveplat.dao.business.models.TNews").add(
					create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TNews> findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List<TNews> findByImgUrl(Object imgUrl) {
		return findByProperty(IMG_URL, imgUrl);
	}

	public List<TNews> findByNewsCategoryId(Object newsCategoryId) {
		return findByProperty(NEWS_CATEGORY_ID, newsCategoryId);
	}

	public List<TNews> findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List<TNews> findByScope(Object scope) {
		return findByProperty(SCOPE, scope);
	}

	public List<TNews> findByPublisher(Object publisher) {
		return findByProperty(PUBLISHER, publisher);
	}

	public List<TNews> findByUserTypeStr(Object userTypeStr) {
		return findByProperty(USER_TYPE_STR, userTypeStr);
	}

	public List<TNews> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

}
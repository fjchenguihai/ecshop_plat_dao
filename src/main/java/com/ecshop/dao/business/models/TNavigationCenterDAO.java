package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TNavigationCenter entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TNavigationCenter
 * @author MyEclipse Persistence Tools
 */
@Component
public class TNavigationCenterDAO extends
		HibernateGenericDao<TNavigationCenter, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TNavigationCenterDAO.class);
	// property constants
	public static final String IMG_URL = "imgUrl";
	public static final String NAVIGATION_TYPE = "navigationType";
	public static final String NAVIGATION_NAME = "navigationName";
	public static final String TARGET_ID = "targetId";
	public static final String SCOPE = "scope";
	public static final String CENTER_ID = "centerId";
	public static final String NAVIGATION_ID = "navigationId";

	public TNavigationCenter findById(java.lang.Long id) {
		log.debug("getting TNavigationCenter instance with id: " + id);
		try {
			TNavigationCenter instance = (TNavigationCenter) getSession().get(
					"com.vveplat.dao.business.models.TNavigationCenter", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TNavigationCenter> findByExample(TNavigationCenter instance) {
		log.debug("finding TNavigationCenter instance by example");
		try {
			List<TNavigationCenter> results = (List<TNavigationCenter>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TNavigationCenter")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TNavigationCenter> findByImgUrl(Object imgUrl) {
		return findByProperty(IMG_URL, imgUrl);
	}

	public List<TNavigationCenter> findByNavigationType(Object navigationType) {
		return findByProperty(NAVIGATION_TYPE, navigationType);
	}

	public List<TNavigationCenter> findByNavigationName(Object navigationName) {
		return findByProperty(NAVIGATION_NAME, navigationName);
	}

	public List<TNavigationCenter> findByTargetId(Object targetId) {
		return findByProperty(TARGET_ID, targetId);
	}

	public List<TNavigationCenter> findByScope(Object scope) {
		return findByProperty(SCOPE, scope);
	}

	public List<TNavigationCenter> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

	public List<TNavigationCenter> findByNavigationId(Object navigationId) {
		return findByProperty(NAVIGATION_ID, navigationId);
	}

}
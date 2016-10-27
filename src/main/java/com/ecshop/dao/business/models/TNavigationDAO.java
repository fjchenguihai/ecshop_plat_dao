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
 * TNavigation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TNavigation
 * @author MyEclipse Persistence Tools
 */
@Component
public class TNavigationDAO extends HibernateGenericDao<TNavigation, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TNavigationDAO.class);
	// property constants
	public static final String IMG_URL = "imgUrl";
	public static final String NAVIGATION_TYPE = "navigationType";
	public static final String NAVIGATION_NAME = "navigationName";
	public static final String TARGET_ID = "targetId";
	public static final String IS_DELETE = "isDelete";

	public TNavigation findById(java.lang.Long id) {
		log.debug("getting TNavigation instance with id: " + id);
		try {
			TNavigation instance = (TNavigation) getSession().get(
					"com.vveplat.dao.business.models.TNavigation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TNavigation> findByExample(TNavigation instance) {
		log.debug("finding TNavigation instance by example");
		try {
			List<TNavigation> results = (List<TNavigation>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TNavigation").add(
							create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TNavigation> findByImgUrl(Object imgUrl) {
		return findByProperty(IMG_URL, imgUrl);
	}

	public List<TNavigation> findByNavigationType(Object navigationType) {
		return findByProperty(NAVIGATION_TYPE, navigationType);
	}

	public List<TNavigation> findByNavigationName(Object navigationName) {
		return findByProperty(NAVIGATION_NAME, navigationName);
	}

	public List<TNavigation> findByTargetId(Object targetId) {
		return findByProperty(TARGET_ID, targetId);
	}

	public List<TNavigation> findByIsDelete(Object isDelete) {
		return findByProperty(IS_DELETE, isDelete);
	}

}
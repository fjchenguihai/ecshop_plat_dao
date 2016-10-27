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
 * TMallCollection entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallCollection
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallCollectionDAO extends
		HibernateGenericDao<TMallCollection, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallCollectionDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String USER_ID = "userId";
	public static final String CENTER_ID = "centerId";

	public TMallCollection findById(java.lang.Long id) {
		log.debug("getting TMallCollection instance with id: " + id);
		try {
			TMallCollection instance = (TMallCollection) getSession().get(
					"com.vveplat.dao.business.models.TMallCollection", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallCollection> findByExample(TMallCollection instance) {
		log.debug("finding TMallCollection instance by example");
		try {
			List<TMallCollection> results = (List<TMallCollection>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallCollection")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallCollection> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMallCollection> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TMallCollection> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

}
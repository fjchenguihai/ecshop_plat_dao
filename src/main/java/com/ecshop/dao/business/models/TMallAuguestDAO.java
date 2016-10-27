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
 * TMallAuguest entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallAuguest
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallAuguestDAO extends HibernateGenericDao<TMallAuguest, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallAuguestDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String USER_ID = "userId";

	public TMallAuguest findById(java.lang.Long id) {
		log.debug("getting TMallAuguest instance with id: " + id);
		try {
			TMallAuguest instance = (TMallAuguest) getSession().get(
					"com.vveplat.dao.business.models.TMallAuguest", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallAuguest> findByExample(TMallAuguest instance) {
		log.debug("finding TMallAuguest instance by example");
		try {
			List<TMallAuguest> results = (List<TMallAuguest>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallAuguest")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallAuguest> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMallAuguest> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

}
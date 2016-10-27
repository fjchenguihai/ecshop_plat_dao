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
 * TMallDealers entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallDealers
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallDealersDAO extends HibernateGenericDao<TMallDealers, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallDealersDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String USER_ID = "userId";

	public TMallDealers findById(java.lang.Long id) {
		log.debug("getting TMallDealers instance with id: " + id);
		try {
			TMallDealers instance = (TMallDealers) getSession().get(
					"com.vveplat.dao.business.models.TMallDealers", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallDealers> findByExample(TMallDealers instance) {
		log.debug("finding TMallDealers instance by example");
		try {
			List<TMallDealers> results = (List<TMallDealers>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallDealers")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallDealers> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMallDealers> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

}
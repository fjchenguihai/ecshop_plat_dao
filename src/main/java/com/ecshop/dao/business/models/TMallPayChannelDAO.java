package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TMallPayChannel entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallPayChannel
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallPayChannelDAO extends
		HibernateGenericDao<TMallPayChannel, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallPayChannelDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String PAYMENT_TYPE_ID = "paymentTypeId";

	public TMallPayChannel findById(java.lang.Long id) {
		log.debug("getting TMallPayChannel instance with id: " + id);
		try {
			TMallPayChannel instance = (TMallPayChannel) getSession().get(
					"com.vveplat.dao.business.models.TMallPayChannel", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallPayChannel> findByExample(TMallPayChannel instance) {
		log.debug("finding TMallPayChannel instance by example");
		try {
			List<TMallPayChannel> results = (List<TMallPayChannel>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallPayChannel")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallPayChannel> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMallPayChannel> findByPaymentTypeId(Object paymentTypeId) {
		return findByProperty(PAYMENT_TYPE_ID, paymentTypeId);
	}

}
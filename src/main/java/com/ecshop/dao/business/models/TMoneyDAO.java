package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TMoney entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMoney
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMoneyDAO extends HibernateGenericDao<TMoney, Long> {
	private static final Logger log = LoggerFactory.getLogger(TMoneyDAO.class);
	// property constants
	public static final String USE_MONEY = "useMoney";
	public static final String PROMISE_MONEY = "promiseMoney";
	public static final String FROZEN_MONEY = "frozenMoney";

	public TMoney findById(java.lang.Long id) {
		log.debug("getting TMoney instance with id: " + id);
		try {
			TMoney instance = (TMoney) getSession().get(
					"com.vveplat.dao.business.models.TMoney", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMoney> findByExample(TMoney instance) {
		log.debug("finding TMoney instance by example");
		try {
			List<TMoney> results = (List<TMoney>) getSession().createCriteria(
					"com.vveplat.dao.business.models.TMoney").add(
					create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMoney> findByUseMoney(Object useMoney) {
		return findByProperty(USE_MONEY, useMoney);
	}

	public List<TMoney> findByPromiseMoney(Object promiseMoney) {
		return findByProperty(PROMISE_MONEY, promiseMoney);
	}

	public List<TMoney> findByFrozenMoney(Object frozenMoney) {
		return findByProperty(FROZEN_MONEY, frozenMoney);
	}

}
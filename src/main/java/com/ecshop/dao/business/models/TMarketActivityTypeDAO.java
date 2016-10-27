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
 * TMarketActivityType entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMarketActivityType
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMarketActivityTypeDAO extends
		HibernateGenericDao<TMarketActivityType, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMarketActivityTypeDAO.class);
	// property constants
	public static final String MARKET_ACTIVITY_TYPE_CODE = "marketActivityTypeCode";
	public static final String MARKET_ACTIVITY_TYPE_NAME = "marketActivityTypeName";

	public TMarketActivityType findById(java.lang.Long id) {
		log.debug("getting TMarketActivityType instance with id: " + id);
		try {
			TMarketActivityType instance = (TMarketActivityType) getSession()
					.get("com.vveplat.dao.business.models.TMarketActivityType",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMarketActivityType> findByExample(TMarketActivityType instance) {
		log.debug("finding TMarketActivityType instance by example");
		try {
			List<TMarketActivityType> results = (List<TMarketActivityType>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMarketActivityType")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMarketActivityType> findByMarketActivityTypeCode(
			Object marketActivityTypeCode) {
		return findByProperty(MARKET_ACTIVITY_TYPE_CODE, marketActivityTypeCode);
	}

	public List<TMarketActivityType> findByMarketActivityTypeName(
			Object marketActivityTypeName) {
		return findByProperty(MARKET_ACTIVITY_TYPE_NAME, marketActivityTypeName);
	}

}
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
 * TMarketActivity entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMarketActivity
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMarketActivityDAO extends
		HibernateGenericDao<TMarketActivity, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMarketActivityDAO.class);
	// property constants
	public static final String MARKET_ACTIVITY_TYPE_ID = "marketActivityTypeId";
	public static final String ACTIVITY_NAME = "activityName";
	public static final String CRE_USER_ID = "creUserId";

	public TMarketActivity findById(java.lang.Long id) {
		log.debug("getting TMarketActivity instance with id: " + id);
		try {
			TMarketActivity instance = (TMarketActivity) getSession().get(
					"com.vveplat.dao.business.models.TMarketActivity", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMarketActivity> findByExample(TMarketActivity instance) {
		log.debug("finding TMarketActivity instance by example");
		try {
			List<TMarketActivity> results = (List<TMarketActivity>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMarketActivity")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMarketActivity> findByMarketActivityTypeId(
			Object marketActivityTypeId) {
		return findByProperty(MARKET_ACTIVITY_TYPE_ID, marketActivityTypeId);
	}

	public List<TMarketActivity> findByActivityName(Object activityName) {
		return findByProperty(ACTIVITY_NAME, activityName);
	}

	public List<TMarketActivity> findByCreUserId(Object creUserId) {
		return findByProperty(CRE_USER_ID, creUserId);
	}

}
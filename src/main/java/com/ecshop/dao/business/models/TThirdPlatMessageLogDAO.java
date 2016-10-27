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
 * TThirdPlatMessageLog entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TThirdPlatMessageLog
 * @author MyEclipse Persistence Tools
 */
@Component
public class TThirdPlatMessageLogDAO extends
		HibernateGenericDao<TThirdPlatMessageLog, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TThirdPlatMessageLogDAO.class);
	// property constants
	public static final String APP_ID = "appId";
	public static final String REQUEST = "request";
	public static final String RESPONSE = "response";
	public static final String ACTION = "action";
	public static final String PLAT_TYPE = "platType";

	public TThirdPlatMessageLog findById(java.lang.Long id) {
		log.debug("getting TThirdPlatMessageLog instance with id: " + id);
		try {
			TThirdPlatMessageLog instance = (TThirdPlatMessageLog) getSession()
					.get("com.vveplat.dao.business.models.TThirdPlatMessageLog",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TThirdPlatMessageLog> findByExample(
			TThirdPlatMessageLog instance) {
		log.debug("finding TThirdPlatMessageLog instance by example");
		try {
			List<TThirdPlatMessageLog> results = (List<TThirdPlatMessageLog>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TThirdPlatMessageLog")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TThirdPlatMessageLog> findByAppId(Object appId) {
		return findByProperty(APP_ID, appId);
	}

	public List<TThirdPlatMessageLog> findByRequest(Object request) {
		return findByProperty(REQUEST, request);
	}

	public List<TThirdPlatMessageLog> findByResponse(Object response) {
		return findByProperty(RESPONSE, response);
	}

	public List<TThirdPlatMessageLog> findByAction(Object action) {
		return findByProperty(ACTION, action);
	}

	public List<TThirdPlatMessageLog> findByPlatType(Object platType) {
		return findByProperty(PLAT_TYPE, platType);
	}

}
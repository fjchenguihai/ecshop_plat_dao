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
 * TAlianceMall entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TAlianceMall
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAlianceMallDAO extends HibernateGenericDao<TAlianceMall, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TAlianceMallDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String ALIANCE_ID = "alianceId";
	public static final String JOIN_TYPE = "joinType";

	public TAlianceMall findById(java.lang.Long id) {
		log.debug("getting TAlianceMall instance with id: " + id);
		try {
			TAlianceMall instance = (TAlianceMall) getSession().get(
					"com.vveplat.dao.business.models.TAlianceMall", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAlianceMall> findByExample(TAlianceMall instance) {
		log.debug("finding TAlianceMall instance by example");
		try {
			List<TAlianceMall> results = (List<TAlianceMall>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TAlianceMall")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAlianceMall> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TAlianceMall> findByAlianceId(Object alianceId) {
		return findByProperty(ALIANCE_ID, alianceId);
	}

	public List<TAlianceMall> findByJoinType(Object joinType) {
		return findByProperty(JOIN_TYPE, joinType);
	}

}
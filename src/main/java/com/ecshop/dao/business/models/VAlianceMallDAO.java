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
 * VAlianceMall entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VAlianceMall
 * @author MyEclipse Persistence Tools
 */
@Component
public class VAlianceMallDAO extends HibernateGenericDao<VAlianceMall, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VAlianceMallDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String ALIANCE_ID = "alianceId";
	public static final String JOIN_TYPE = "joinType";
	public static final String MALL_NAME = "mallName";

	public VAlianceMall findById(java.lang.Long id) {
		log.debug("getting VAlianceMall instance with id: " + id);
		try {
			VAlianceMall instance = (VAlianceMall) getSession().get(
					"com.vveplat.dao.business.models.VAlianceMall", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VAlianceMall> findByExample(VAlianceMall instance) {
		log.debug("finding VAlianceMall instance by example");
		try {
			List<VAlianceMall> results = (List<VAlianceMall>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VAlianceMall")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VAlianceMall> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VAlianceMall> findByAlianceId(Object alianceId) {
		return findByProperty(ALIANCE_ID, alianceId);
	}

	public List<VAlianceMall> findByJoinType(Object joinType) {
		return findByProperty(JOIN_TYPE, joinType);
	}

	public List<VAlianceMall> findByMallName(Object mallName) {
		return findByProperty(MALL_NAME, mallName);
	}

}
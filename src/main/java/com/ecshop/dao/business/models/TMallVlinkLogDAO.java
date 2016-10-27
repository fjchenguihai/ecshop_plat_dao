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
 * TMallVlinkLog entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallVlinkLog
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallVlinkLogDAO extends HibernateGenericDao<TMallVlinkLog, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallVlinkLogDAO.class);
	// property constants
	public static final String MALL_VLINK_ID = "mallVlinkId";
	public static final String APPLY_USER_ID = "applyUserId";
	public static final String AUDIT_USER_ID = "auditUserId";
	public static final String REMARK = "remark";

	public TMallVlinkLog findById(java.lang.Long id) {
		log.debug("getting TMallVlinkLog instance with id: " + id);
		try {
			TMallVlinkLog instance = (TMallVlinkLog) getSession().get(
					"com.vveplat.dao.business.models.TMallVlinkLog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallVlinkLog> findByExample(TMallVlinkLog instance) {
		log.debug("finding TMallVlinkLog instance by example");
		try {
			List<TMallVlinkLog> results = (List<TMallVlinkLog>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallVlinkLog")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallVlinkLog> findByMallVlinkId(Object mallVlinkId) {
		return findByProperty(MALL_VLINK_ID, mallVlinkId);
	}

	public List<TMallVlinkLog> findByApplyUserId(Object applyUserId) {
		return findByProperty(APPLY_USER_ID, applyUserId);
	}

	public List<TMallVlinkLog> findByAuditUserId(Object auditUserId) {
		return findByProperty(AUDIT_USER_ID, auditUserId);
	}

	public List<TMallVlinkLog> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

}
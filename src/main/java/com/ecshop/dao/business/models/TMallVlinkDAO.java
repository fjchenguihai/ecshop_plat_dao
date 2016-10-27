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
 * TMallVlink entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallVlink
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallVlinkDAO extends HibernateGenericDao<TMallVlink, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallVlinkDAO.class);
	// property constants
	public static final String SETTLED_TYPE = "settledType";
	public static final String MALL_ID = "mallId";
	public static final String CENTER_ID = "centerId";
	public static final String REMARK = "remark";
	public static final String APPLY_USER_ID = "applyUserId";
	public static final String AUDIT_STATUS = "auditStatus";

	public TMallVlink findById(java.lang.Long id) {
		log.debug("getting TMallVlink instance with id: " + id);
		try {
			TMallVlink instance = (TMallVlink) getSession().get(
					"com.vveplat.dao.business.models.TMallVlink", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallVlink> findByExample(TMallVlink instance) {
		log.debug("finding TMallVlink instance by example");
		try {
			List<TMallVlink> results = (List<TMallVlink>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallVlink").add(
							create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallVlink> findBySettledType(Object settledType) {
		return findByProperty(SETTLED_TYPE, settledType);
	}

	public List<TMallVlink> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMallVlink> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

	public List<TMallVlink> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List<TMallVlink> findByApplyUserId(Object applyUserId) {
		return findByProperty(APPLY_USER_ID, applyUserId);
	}

	public List<TMallVlink> findByAuditStatus(Object auditStatus) {
		return findByProperty(AUDIT_STATUS, auditStatus);
	}

}
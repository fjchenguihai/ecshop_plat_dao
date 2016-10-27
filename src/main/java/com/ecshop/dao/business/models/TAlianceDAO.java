package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TAliance entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TAliance
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAlianceDAO extends HibernateGenericDao<TAliance, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TAlianceDAO.class);
	// property constants
	public static final String ALIANCE_NAME = "alianceName";
	public static final String MALL_ID = "mallId";
	public static final String USER_ID = "userId";
	public static final String STATUS = "status";
	public static final String AUDIT_USER_ID = "auditUserId";
	public static final String REMARK = "remark";

	public TAliance findById(java.lang.Long id) {
		log.debug("getting TAliance instance with id: " + id);
		try {
			TAliance instance = (TAliance) getSession().get(
					"com.vveplat.dao.business.models.TAliance", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAliance> findByExample(TAliance instance) {
		log.debug("finding TAliance instance by example");
		try {
			List<TAliance> results = (List<TAliance>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TAliance")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAliance> findByAlianceName(Object alianceName) {
		return findByProperty(ALIANCE_NAME, alianceName);
	}

	public List<TAliance> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TAliance> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TAliance> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<TAliance> findByAuditUserId(Object auditUserId) {
		return findByProperty(AUDIT_USER_ID, auditUserId);
	}

	public List<TAliance> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

}
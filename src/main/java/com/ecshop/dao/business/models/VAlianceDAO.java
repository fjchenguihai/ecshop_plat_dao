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
 * VAliance entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VAliance
 * @author MyEclipse Persistence Tools
 */
@Component
public class VAlianceDAO extends HibernateGenericDao<VAliance, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VAlianceDAO.class);
	// property constants
	public static final String ALIANCE_NAME = "alianceName";
	public static final String MALL_ID = "mallId";
	public static final String USER_ID = "userId";
	public static final String STATUS = "status";
	public static final String AUDIT_USER_ID = "auditUserId";
	public static final String REMARK = "remark";
	public static final String MALL_NAME = "mallName";
	public static final String USERNAME = "username";
	public static final String REALNAME = "realname";

	public VAliance findById(java.lang.Long id) {
		log.debug("getting VAliance instance with id: " + id);
		try {
			VAliance instance = (VAliance) getSession().get(
					"com.vveplat.dao.business.models.VAliance", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VAliance> findByExample(VAliance instance) {
		log.debug("finding VAliance instance by example");
		try {
			List<VAliance> results = (List<VAliance>) getSession()
					.createCriteria("com.vveplat.dao.business.models.VAliance")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VAliance> findByAlianceName(Object alianceName) {
		return findByProperty(ALIANCE_NAME, alianceName);
	}

	public List<VAliance> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VAliance> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<VAliance> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<VAliance> findByAuditUserId(Object auditUserId) {
		return findByProperty(AUDIT_USER_ID, auditUserId);
	}

	public List<VAliance> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List<VAliance> findByMallName(Object mallName) {
		return findByProperty(MALL_NAME, mallName);
	}

	public List<VAliance> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<VAliance> findByRealname(Object realname) {
		return findByProperty(REALNAME, realname);
	}

}
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
 * TAdditionalOfflineLog entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TAdditionalOfflineLog
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAdditionalOfflineLogDAO extends
		HibernateGenericDao<TAdditionalOfflineLog, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TAdditionalOfflineLogDAO.class);
	// property constants
	public static final String ADD_ORDER_OFFLINE_ID = "addOrderOfflineId";
	public static final String APPLY_USER_ID = "applyUserId";
	public static final String AUDIT_USER_ID = "auditUserId";
	public static final String REMARK = "remark";

	public TAdditionalOfflineLog findById(java.lang.Long id) {
		log.debug("getting TAdditionalOfflineLog instance with id: " + id);
		try {
			TAdditionalOfflineLog instance = (TAdditionalOfflineLog) getSession()
					.get("com.vveplat.dao.business.models.TAdditionalOfflineLog",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAdditionalOfflineLog> findByExample(
			TAdditionalOfflineLog instance) {
		log.debug("finding TAdditionalOfflineLog instance by example");
		try {
			List<TAdditionalOfflineLog> results = (List<TAdditionalOfflineLog>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TAdditionalOfflineLog")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAdditionalOfflineLog> findByAddOrderOfflineId(
			Object addOrderOfflineId) {
		return findByProperty(ADD_ORDER_OFFLINE_ID, addOrderOfflineId);
	}

	public List<TAdditionalOfflineLog> findByApplyUserId(Object applyUserId) {
		return findByProperty(APPLY_USER_ID, applyUserId);
	}

	public List<TAdditionalOfflineLog> findByAuditUserId(Object auditUserId) {
		return findByProperty(AUDIT_USER_ID, auditUserId);
	}

	public List<TAdditionalOfflineLog> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

}
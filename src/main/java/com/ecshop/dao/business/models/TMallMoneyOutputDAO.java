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
 * TMallMoneyOutput entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallMoneyOutput
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallMoneyOutputDAO extends
		HibernateGenericDao<TMallMoneyOutput, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallMoneyOutputDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String AMOUNT = "amount";
	public static final String APPLY_USER_ID = "applyUserId";
	public static final String AUDIT_STATUS = "auditStatus";
	public static final String AUDIT_OPINION = "auditOpinion";
	public static final String IS_TRANSFER = "isTransfer";

	public TMallMoneyOutput findById(java.lang.Long id) {
		log.debug("getting TMallMoneyOutput instance with id: " + id);
		try {
			TMallMoneyOutput instance = (TMallMoneyOutput) getSession().get(
					"com.vveplat.dao.business.models.TMallMoneyOutput", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallMoneyOutput> findByExample(TMallMoneyOutput instance) {
		log.debug("finding TMallMoneyOutput instance by example");
		try {
			List<TMallMoneyOutput> results = (List<TMallMoneyOutput>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallMoneyOutput")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallMoneyOutput> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMallMoneyOutput> findByAmount(Object amount) {
		return findByProperty(AMOUNT, amount);
	}

	public List<TMallMoneyOutput> findByApplyUserId(Object applyUserId) {
		return findByProperty(APPLY_USER_ID, applyUserId);
	}

	public List<TMallMoneyOutput> findByAuditStatus(Object auditStatus) {
		return findByProperty(AUDIT_STATUS, auditStatus);
	}

	public List<TMallMoneyOutput> findByAuditOpinion(Object auditOpinion) {
		return findByProperty(AUDIT_OPINION, auditOpinion);
	}

	public List<TMallMoneyOutput> findByIsTransfer(Object isTransfer) {
		return findByProperty(IS_TRANSFER, isTransfer);
	}

}
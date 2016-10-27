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
 * TFinancialLog entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TFinancialLog
 * @author MyEclipse Persistence Tools
 */
@Component
public class TFinancialLogDAO extends HibernateGenericDao<TFinancialLog, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TFinancialLogDAO.class);
	// property constants
	public static final String PAY_NO = "payNo";
	public static final String AUDITSTATUS = "auditstatus";
	public static final String AUDIT_MEMBER = "auditMember";
	public static final String AUDIT_REASON = "auditReason";

	public TFinancialLog findById(java.lang.Long id) {
		log.debug("getting TFinancialLog instance with id: " + id);
		try {
			TFinancialLog instance = (TFinancialLog) getSession().get(
					"com.vveplat.dao.business.models.TFinancialLog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TFinancialLog> findByExample(TFinancialLog instance) {
		log.debug("finding TFinancialLog instance by example");
		try {
			List<TFinancialLog> results = (List<TFinancialLog>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TFinancialLog")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TFinancialLog> findByPayNo(Object payNo) {
		return findByProperty(PAY_NO, payNo);
	}

	public List<TFinancialLog> findByAuditstatus(Object auditstatus) {
		return findByProperty(AUDITSTATUS, auditstatus);
	}

	public List<TFinancialLog> findByAuditMember(Object auditMember) {
		return findByProperty(AUDIT_MEMBER, auditMember);
	}

	public List<TFinancialLog> findByAuditReason(Object auditReason) {
		return findByProperty(AUDIT_REASON, auditReason);
	}

}
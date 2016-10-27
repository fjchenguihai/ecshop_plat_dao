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
 * TAfterSalesLog entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TAfterSalesLog
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAfterSalesLogDAO extends
		HibernateGenericDao<TAfterSalesLog, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TAfterSalesLogDAO.class);
	// property constants
	public static final String AFTER_SALES_ID = "afterSalesId";
	public static final String ADMIN_ID = "adminId";
	public static final String USERNAME = "username";
	public static final String CONTENT = "content";

	public TAfterSalesLog findById(java.lang.Long id) {
		log.debug("getting TAfterSalesLog instance with id: " + id);
		try {
			TAfterSalesLog instance = (TAfterSalesLog) getSession().get(
					"com.vveplat.dao.business.models.TAfterSalesLog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAfterSalesLog> findByExample(TAfterSalesLog instance) {
		log.debug("finding TAfterSalesLog instance by example");
		try {
			List<TAfterSalesLog> results = (List<TAfterSalesLog>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TAfterSalesLog")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAfterSalesLog> findByAfterSalesId(Object afterSalesId) {
		return findByProperty(AFTER_SALES_ID, afterSalesId);
	}

	public List<TAfterSalesLog> findByAdminId(Object adminId) {
		return findByProperty(ADMIN_ID, adminId);
	}

	public List<TAfterSalesLog> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<TAfterSalesLog> findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

}
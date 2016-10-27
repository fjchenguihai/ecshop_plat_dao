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
 * TEnsureSheetLog entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TEnsureSheetLog
 * @author MyEclipse Persistence Tools
 */
@Component
public class TEnsureSheetLogDAO extends
		HibernateGenericDao<TEnsureSheetLog, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TEnsureSheetLogDAO.class);
	// property constants
	public static final String SHEET_ID = "sheetId";
	public static final String ADMIN_ID = "adminId";
	public static final String CONTENT = "content";
	public static final String SHEET_NO = "sheetNo";

	public TEnsureSheetLog findById(java.lang.Long id) {
		log.debug("getting TEnsureSheetLog instance with id: " + id);
		try {
			TEnsureSheetLog instance = (TEnsureSheetLog) getSession().get(
					"com.vveplat.dao.business.models.TEnsureSheetLog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TEnsureSheetLog> findByExample(TEnsureSheetLog instance) {
		log.debug("finding TEnsureSheetLog instance by example");
		try {
			List<TEnsureSheetLog> results = (List<TEnsureSheetLog>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TEnsureSheetLog")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TEnsureSheetLog> findBySheetId(Object sheetId) {
		return findByProperty(SHEET_ID, sheetId);
	}

	public List<TEnsureSheetLog> findByAdminId(Object adminId) {
		return findByProperty(ADMIN_ID, adminId);
	}

	public List<TEnsureSheetLog> findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List<TEnsureSheetLog> findBySheetNo(Object sheetNo) {
		return findByProperty(SHEET_NO, sheetNo);
	}

}
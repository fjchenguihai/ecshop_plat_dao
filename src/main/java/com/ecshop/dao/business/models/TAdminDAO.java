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
 * TAdmin entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TAdmin
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAdminDAO extends HibernateGenericDao<TAdmin, Long> {
	private static final Logger log = LoggerFactory.getLogger(TAdminDAO.class);
	// property constants
	public static final String ACCOUNT = "account";
	public static final String PASSWORD = "password";
	public static final String USERNAME = "username";
	public static final String EMAIL = "email";
	public static final String PHONE = "phone";
	public static final String STATUS = "status";
	public static final String REMARK = "remark";

	public TAdmin findById(java.lang.Long id) {
		log.debug("getting TAdmin instance with id: " + id);
		try {
			TAdmin instance = (TAdmin) getSession().get(
					"com.vveplat.dao.business.models.TAdmin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAdmin> findByExample(TAdmin instance) {
		log.debug("finding TAdmin instance by example");
		try {
			List<TAdmin> results = (List<TAdmin>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TAdmin")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAdmin> findByAccount(Object account) {
		return findByProperty(ACCOUNT, account);
	}

	public List<TAdmin> findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List<TAdmin> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<TAdmin> findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List<TAdmin> findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List<TAdmin> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<TAdmin> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

}
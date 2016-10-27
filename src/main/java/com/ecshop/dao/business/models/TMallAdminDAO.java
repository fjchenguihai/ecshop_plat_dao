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
 * TMallAdmin entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallAdmin
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallAdminDAO extends HibernateGenericDao<TMallAdmin, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallAdminDAO.class);
	// property constants
	public static final String ACCOUNT = "account";
	public static final String PASSWORD = "password";
	public static final String USERNAME = "username";
	public static final String MALL_ID = "mallId";
	public static final String STATION_ID = "stationId";
	public static final String EMAIL = "email";
	public static final String PHONE = "phone";
	public static final String STATUS = "status";
	public static final String REMARK = "remark";

	public TMallAdmin findById(java.lang.Long id) {
		log.debug("getting TMallAdmin instance with id: " + id);
		try {
			TMallAdmin instance = (TMallAdmin) getSession().get(
					"com.vveplat.dao.business.models.TMallAdmin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallAdmin> findByExample(TMallAdmin instance) {
		log.debug("finding TMallAdmin instance by example");
		try {
			List<TMallAdmin> results = (List<TMallAdmin>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallAdmin")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallAdmin> findByAccount(Object account) {
		return findByProperty(ACCOUNT, account);
	}

	public List<TMallAdmin> findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List<TMallAdmin> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<TMallAdmin> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMallAdmin> findByStationId(Object stationId) {
		return findByProperty(STATION_ID, stationId);
	}

	public List<TMallAdmin> findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List<TMallAdmin> findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List<TMallAdmin> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<TMallAdmin> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

}
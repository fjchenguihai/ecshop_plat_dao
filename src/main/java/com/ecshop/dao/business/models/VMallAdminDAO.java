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
 * VMallAdmin entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VMallAdmin
 * @author MyEclipse Persistence Tools
 */
@Component
public class VMallAdminDAO extends HibernateGenericDao<VMallAdmin, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VMallAdminDAO.class);
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
	public static final String MALL_NAME = "mallName";
	public static final String MALL_TYPE = "mallType";
	public static final String STATION_TYPE = "stationType";
	public static final String STATION_NAME = "stationName";
	public static final String ROLE_ID = "roleId";
	public static final String ROLE_NAME = "roleName";
	public static final String ROLE_KEY = "roleKey";

	public VMallAdmin findById(java.lang.Long id) {
		log.debug("getting VMallAdmin instance with id: " + id);
		try {
			VMallAdmin instance = (VMallAdmin) getSession().get(
					"com.vveplat.dao.business.models.VMallAdmin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VMallAdmin> findByExample(VMallAdmin instance) {
		log.debug("finding VMallAdmin instance by example");
		try {
			List<VMallAdmin> results = (List<VMallAdmin>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VMallAdmin")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VMallAdmin> findByAccount(Object account) {
		return findByProperty(ACCOUNT, account);
	}

	public List<VMallAdmin> findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List<VMallAdmin> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<VMallAdmin> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VMallAdmin> findByStationId(Object stationId) {
		return findByProperty(STATION_ID, stationId);
	}

	public List<VMallAdmin> findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List<VMallAdmin> findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List<VMallAdmin> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<VMallAdmin> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List<VMallAdmin> findByMallName(Object mallName) {
		return findByProperty(MALL_NAME, mallName);
	}

	public List<VMallAdmin> findByMallType(Object mallType) {
		return findByProperty(MALL_TYPE, mallType);
	}

	public List<VMallAdmin> findByStationType(Object stationType) {
		return findByProperty(STATION_TYPE, stationType);
	}

	public List<VMallAdmin> findByStationName(Object stationName) {
		return findByProperty(STATION_NAME, stationName);
	}

	public List<VMallAdmin> findByRoleId(Object roleId) {
		return findByProperty(ROLE_ID, roleId);
	}

	public List<VMallAdmin> findByRoleName(Object roleName) {
		return findByProperty(ROLE_NAME, roleName);
	}

	public List<VMallAdmin> findByRoleKey(Object roleKey) {
		return findByProperty(ROLE_KEY, roleKey);
	}

}
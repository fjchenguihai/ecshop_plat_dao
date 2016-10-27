package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TMallRole entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallRole
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallRoleDAO extends HibernateGenericDao<TMallRole, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallRoleDAO.class);
	// property constants
	public static final String ROLE_NAME = "roleName";
	public static final String ROLE_KEY = "roleKey";
	public static final String REMARKS = "remarks";
	public static final String STATUS = "status";
	public static final String MALL_TYPE = "mallType";

	public TMallRole findById(java.lang.Long id) {
		log.debug("getting TMallRole instance with id: " + id);
		try {
			TMallRole instance = (TMallRole) getSession().get(
					"com.vveplat.dao.business.models.TMallRole", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallRole> findByExample(TMallRole instance) {
		log.debug("finding TMallRole instance by example");
		try {
			List<TMallRole> results = (List<TMallRole>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TMallRole")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallRole> findByRoleName(Object roleName) {
		return findByProperty(ROLE_NAME, roleName);
	}

	public List<TMallRole> findByRoleKey(Object roleKey) {
		return findByProperty(ROLE_KEY, roleKey);
	}

	public List<TMallRole> findByRemarks(Object remarks) {
		return findByProperty(REMARKS, remarks);
	}

	public List<TMallRole> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<TMallRole> findByMallType(Object mallType) {
		return findByProperty(MALL_TYPE, mallType);
	}

}
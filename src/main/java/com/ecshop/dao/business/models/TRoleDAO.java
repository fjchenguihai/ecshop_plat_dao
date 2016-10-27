package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for TRole
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TRole
 * @author MyEclipse Persistence Tools
 */
@Component
public class TRoleDAO extends HibernateGenericDao<TRole, Long> {
	private static final Logger log = LoggerFactory.getLogger(TRoleDAO.class);
	// property constants
	public static final String ROLE_NAME = "roleName";
	public static final String ROLE_KEY = "roleKey";
	public static final String REMARKS = "remarks";
	public static final String STATUS = "status";

	public TRole findById(java.lang.Long id) {
		log.debug("getting TRole instance with id: " + id);
		try {
			TRole instance = (TRole) getSession().get(
					"com.vveplat.dao.business.models.TRole", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TRole> findByExample(TRole instance) {
		log.debug("finding TRole instance by example");
		try {
			List<TRole> results = (List<TRole>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TRole")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TRole> findByRoleName(Object roleName) {
		return findByProperty(ROLE_NAME, roleName);
	}

	public List<TRole> findByRoleKey(Object roleKey) {
		return findByProperty(ROLE_KEY, roleKey);
	}

	public List<TRole> findByRemarks(Object remarks) {
		return findByProperty(REMARKS, remarks);
	}

	public List<TRole> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

}
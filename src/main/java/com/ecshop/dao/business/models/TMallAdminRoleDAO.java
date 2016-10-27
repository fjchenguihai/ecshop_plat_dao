package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TMallAdminRole entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallAdminRole
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallAdminRoleDAO extends
		HibernateGenericDao<TMallAdminRole, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallAdminRoleDAO.class);
	// property constants
	public static final String ADMIN_ID = "adminId";
	public static final String ROLE_ID = "roleId";

	public TMallAdminRole findById(java.lang.Long id) {
		log.debug("getting TMallAdminRole instance with id: " + id);
		try {
			TMallAdminRole instance = (TMallAdminRole) getSession().get(
					"com.vveplat.dao.business.models.TMallAdminRole", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallAdminRole> findByExample(TMallAdminRole instance) {
		log.debug("finding TMallAdminRole instance by example");
		try {
			List<TMallAdminRole> results = (List<TMallAdminRole>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallAdminRole")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallAdminRole> findByAdminId(Object adminId) {
		return findByProperty(ADMIN_ID, adminId);
	}

	public List<TMallAdminRole> findByRoleId(Object roleId) {
		return findByProperty(ROLE_ID, roleId);
	}

}
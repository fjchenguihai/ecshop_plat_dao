package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TAdminRole entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TAdminRole
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAdminRoleDAO extends HibernateGenericDao<TAdminRole, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TAdminRoleDAO.class);
	// property constants
	public static final String ADMIN_ID = "adminId";
	public static final String ROLE_ID = "roleId";

	public TAdminRole findById(java.lang.Long id) {
		log.debug("getting TAdminRole instance with id: " + id);
		try {
			TAdminRole instance = (TAdminRole) getSession().get(
					"com.vveplat.dao.business.models.TAdminRole", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAdminRole> findByExample(TAdminRole instance) {
		log.debug("finding TAdminRole instance by example");
		try {
			List<TAdminRole> results = (List<TAdminRole>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TAdminRole")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAdminRole> findByAdminId(Object adminId) {
		return findByProperty(ADMIN_ID, adminId);
	}

	public List<TAdminRole> findByRoleId(Object roleId) {
		return findByProperty(ROLE_ID, roleId);
	}

}
package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TMallRoleResources entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallRoleResources
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallRoleResourcesDAO extends
		HibernateGenericDao<TMallRoleResources, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallRoleResourcesDAO.class);
	// property constants
	public static final String ROLE_ID = "roleId";
	public static final String RESOURCES_ID = "resourcesId";

	public TMallRoleResources findById(java.lang.Long id) {
		log.debug("getting TMallRoleResources instance with id: " + id);
		try {
			TMallRoleResources instance = (TMallRoleResources) getSession()
					.get("com.vveplat.dao.business.models.TMallRoleResources",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallRoleResources> findByExample(TMallRoleResources instance) {
		log.debug("finding TMallRoleResources instance by example");
		try {
			List<TMallRoleResources> results = (List<TMallRoleResources>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallRoleResources")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallRoleResources> findByRoleId(Object roleId) {
		return findByProperty(ROLE_ID, roleId);
	}

	public List<TMallRoleResources> findByResourcesId(Object resourcesId) {
		return findByProperty(RESOURCES_ID, resourcesId);
	}

}
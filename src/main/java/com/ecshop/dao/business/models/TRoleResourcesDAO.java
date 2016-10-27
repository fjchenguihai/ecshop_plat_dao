package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TRoleResources entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TRoleResources
 * @author MyEclipse Persistence Tools
 */
@Component
public class TRoleResourcesDAO extends
		HibernateGenericDao<TRoleResources, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TRoleResourcesDAO.class);
	// property constants
	public static final String ROLE_ID = "roleId";
	public static final String RESOURCES_ID = "resourcesId";

	public TRoleResources findById(java.lang.Long id) {
		log.debug("getting TRoleResources instance with id: " + id);
		try {
			TRoleResources instance = (TRoleResources) getSession().get(
					"com.vveplat.dao.business.models.TRoleResources", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TRoleResources> findByExample(TRoleResources instance) {
		log.debug("finding TRoleResources instance by example");
		try {
			List<TRoleResources> results = (List<TRoleResources>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TRoleResources")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TRoleResources> findByRoleId(Object roleId) {
		return findByProperty(ROLE_ID, roleId);
	}

	public List<TRoleResources> findByResourcesId(Object resourcesId) {
		return findByProperty(RESOURCES_ID, resourcesId);
	}

}
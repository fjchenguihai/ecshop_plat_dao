package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TMallResources entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallResources
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallResourcesDAO extends
		HibernateGenericDao<TMallResources, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallResourcesDAO.class);
	// property constants
	public static final String RESOURCES_NAME = "resourcesName";
	public static final String UP_RESOURCES_ID = "upResourcesId";
	public static final String RESOURCES_KEY = "resourcesKey";
	public static final String TYPE = "type";
	public static final String URL = "url";
	public static final String RESOURCES_LEVEL = "resourcesLevel";
	public static final String REMARKS = "remarks";
	public static final String ORDER_NO = "orderNo";

	public TMallResources findById(java.lang.Long id) {
		log.debug("getting TMallResources instance with id: " + id);
		try {
			TMallResources instance = (TMallResources) getSession().get(
					"com.vveplat.dao.business.models.TMallResources", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallResources> findByExample(TMallResources instance) {
		log.debug("finding TMallResources instance by example");
		try {
			List<TMallResources> results = (List<TMallResources>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallResources")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallResources> findByResourcesName(Object resourcesName) {
		return findByProperty(RESOURCES_NAME, resourcesName);
	}

	public List<TMallResources> findByUpResourcesId(Object upResourcesId) {
		return findByProperty(UP_RESOURCES_ID, upResourcesId);
	}

	public List<TMallResources> findByResourcesKey(Object resourcesKey) {
		return findByProperty(RESOURCES_KEY, resourcesKey);
	}

	public List<TMallResources> findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List<TMallResources> findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List<TMallResources> findByResourcesLevel(Object resourcesLevel) {
		return findByProperty(RESOURCES_LEVEL, resourcesLevel);
	}

	public List<TMallResources> findByRemarks(Object remarks) {
		return findByProperty(REMARKS, remarks);
	}

	public List<TMallResources> findByOrderNo(Object orderNo) {
		return findByProperty(ORDER_NO, orderNo);
	}

}
package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TResources entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TResources
 * @author MyEclipse Persistence Tools
 */
@Component
public class TResourcesDAO extends HibernateGenericDao<TResources, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TResourcesDAO.class);
	// property constants
	public static final String RESOURCES_NAME = "resourcesName";
	public static final String UP_RESOURCES_ID = "upResourcesId";
	public static final String RESOURCES_KEY = "resourcesKey";
	public static final String TYPE = "type";
	public static final String URL = "url";
	public static final String RESOURCES_LEVEL = "resourcesLevel";
	public static final String REMARKS = "remarks";
	public static final String ORDER_NO = "orderNo";
	public static final String APPID = "appId";

	public TResources findById(java.lang.Long id) {
		log.debug("getting TResources instance with id: " + id);
		try {
			TResources instance = (TResources) getSession().get(
					"com.vveplat.dao.business.models.TResources", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TResources> findByExample(TResources instance) {
		log.debug("finding TResources instance by example");
		try {
			List<TResources> results = (List<TResources>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TResources")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TResources> findByResourcesName(Object resourcesName) {
		return findByProperty(RESOURCES_NAME, resourcesName);
	}

	public List<TResources> findByUpResourcesId(Object upResourcesId) {
		return findByProperty(UP_RESOURCES_ID, upResourcesId);
	}

	public List<TResources> findByResourcesKey(Object resourcesKey) {
		return findByProperty(RESOURCES_KEY, resourcesKey);
	}

	public List<TResources> findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List<TResources> findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List<TResources> findByResourcesLevel(Object resourcesLevel) {
		return findByProperty(RESOURCES_LEVEL, resourcesLevel);
	}

	public List<TResources> findByRemarks(Object remarks) {
		return findByProperty(REMARKS, remarks);
	}

	public List<TResources> findByOrderNo(Object orderNo) {
		return findByProperty(ORDER_NO, orderNo);
	}
	
	public List<TResources> findByAppId(Object appId) {
		return findByProperty(APPID, appId);
	}

}
package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCenterRegionMap entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TCenterRegionMap
 * @author MyEclipse Persistence Tools
 */
@Component
public class TCenterRegionMapDAO extends
		HibernateGenericDao<TCenterRegionMap, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TCenterRegionMapDAO.class);
	// property constants
	public static final String CENTER_ID = "centerId";
	public static final String REGION_ID = "regionId";
	public static final String CITY_ID = "cityId";

	public TCenterRegionMap findById(java.lang.Long id) {
		log.debug("getting TCenterRegionMap instance with id: " + id);
		try {
			TCenterRegionMap instance = (TCenterRegionMap) getSession().get(
					"com.vveplat.dao.business.models.TCenterRegionMap", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TCenterRegionMap> findByExample(TCenterRegionMap instance) {
		log.debug("finding TCenterRegionMap instance by example");
		try {
			List<TCenterRegionMap> results = (List<TCenterRegionMap>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TCenterRegionMap")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TCenterRegionMap> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

	public List<TCenterRegionMap> findByRegionId(Object regionId) {
		return findByProperty(REGION_ID, regionId);
	}

	public List<TCenterRegionMap> findByCityId(Object cityId) {
		return findByProperty(CITY_ID, cityId);
	}

}
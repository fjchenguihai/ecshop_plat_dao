package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TRegion entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TRegion
 * @author MyEclipse Persistence Tools
 */
@Component
public class TRegionDAO extends HibernateGenericDao<TRegion, Integer> {
	private static final Logger log = LoggerFactory.getLogger(TRegionDAO.class);
	// property constants
	public static final String PARENT_ID = "parentId";
	public static final String REGION_NAME = "regionName";
	public static final String REGION_TYPE = "regionType";

	public TRegion findById(java.lang.Integer id) {
		log.debug("getting TRegion instance with id: " + id);
		try {
			TRegion instance = (TRegion) getSession().get(
					"com.vveplat.dao.business.models.TRegion", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TRegion> findByExample(TRegion instance) {
		log.debug("finding TRegion instance by example");
		try {
			List<TRegion> results = (List<TRegion>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TRegion")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TRegion> findByParentId(Object parentId) {
		return findByProperty(PARENT_ID, parentId);
	}

	public List<TRegion> findByRegionName(Object regionName) {
		return findByProperty(REGION_NAME, regionName);
	}

	public List<TRegion> findByRegionType(Object regionType) {
		return findByProperty(REGION_TYPE, regionType);
	}

}
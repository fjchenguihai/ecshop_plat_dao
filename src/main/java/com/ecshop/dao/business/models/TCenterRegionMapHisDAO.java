package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCenterRegionMapHis entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TCenterRegionMapHis
 * @author MyEclipse Persistence Tools
 */
@Component
public class TCenterRegionMapHisDAO extends
		HibernateGenericDao<TCenterRegionMapHis, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TCenterRegionMapHisDAO.class);
	// property constants
	public static final String CENTER_ID = "centerId";
	public static final String REGION_ID = "regionId";

	public TCenterRegionMapHis findById(java.lang.Long id) {
		log.debug("getting TCenterRegionMapHis instance with id: " + id);
		try {
			TCenterRegionMapHis instance = (TCenterRegionMapHis) getSession()
					.get("com.vveplat.dao.business.models.TCenterRegionMapHis",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TCenterRegionMapHis> findByExample(TCenterRegionMapHis instance) {
		log.debug("finding TCenterRegionMapHis instance by example");
		try {
			List<TCenterRegionMapHis> results = (List<TCenterRegionMapHis>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TCenterRegionMapHis")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TCenterRegionMapHis> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

	public List<TCenterRegionMapHis> findByRegionId(Object regionId) {
		return findByProperty(REGION_ID, regionId);
	}

}
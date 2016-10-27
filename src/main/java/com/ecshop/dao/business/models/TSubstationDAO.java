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
 * TSubstation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TSubstation
 * @author MyEclipse Persistence Tools
 */
@Component
public class TSubstationDAO extends HibernateGenericDao<TSubstation, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TSubstationDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String STATION_NAME = "stationName";
	public static final String STATION_TYPE = "stationType";
	public static final String PROVINCE_ID = "provinceId";
	public static final String CITY_ID = "cityId";
	public static final String DISTRICT_ID = "districtId";
	public static final String STATUS = "status";
	public static final String REMARK = "remark";

	public TSubstation findById(java.lang.Long id) {
		log.debug("getting TSubstation instance with id: " + id);
		try {
			TSubstation instance = (TSubstation) getSession().get(
					"com.vveplat.dao.business.models.TSubstation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TSubstation> findByExample(TSubstation instance) {
		log.debug("finding TSubstation instance by example");
		try {
			List<TSubstation> results = (List<TSubstation>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TSubstation")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TSubstation> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TSubstation> findByStationName(Object stationName) {
		return findByProperty(STATION_NAME, stationName);
	}

	public List<TSubstation> findByStationType(Object stationType) {
		return findByProperty(STATION_TYPE, stationType);
	}

	public List<TSubstation> findByProvinceId(Object provinceId) {
		return findByProperty(PROVINCE_ID, provinceId);
	}

	public List<TSubstation> findByCityId(Object cityId) {
		return findByProperty(CITY_ID, cityId);
	}

	public List<TSubstation> findByDistrictId(Object districtId) {
		return findByProperty(DISTRICT_ID, districtId);
	}

	public List<TSubstation> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<TSubstation> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

}
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
 * VSubstation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VSubstation
 * @author MyEclipse Persistence Tools
 */
@Component
public class VSubstationDAO extends HibernateGenericDao<VSubstation, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VSubstationDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String STATION_NAME = "stationName";
	public static final String STATION_TYPE = "stationType";
	public static final String PROVINCE_ID = "provinceId";
	public static final String CITY_ID = "cityId";
	public static final String DISTRICT_ID = "districtId";
	public static final String STATUS = "status";
	public static final String REMARK = "remark";
	public static final String MALL_NAME = "mallName";
	public static final String MALL_TYPE = "mallType";
	public static final String MALL_NO = "mallNo";
	public static final String PROVINCE_NAME = "provinceName";
	public static final String CITY_NAME = "cityName";
	public static final String DISTRICT_NAME = "districtName";

	public VSubstation findById(java.lang.Long id) {
		log.debug("getting VSubstation instance with id: " + id);
		try {
			VSubstation instance = (VSubstation) getSession().get(
					"com.vveplat.dao.business.models.VSubstation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VSubstation> findByExample(VSubstation instance) {
		log.debug("finding VSubstation instance by example");
		try {
			List<VSubstation> results = (List<VSubstation>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VSubstation")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VSubstation> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VSubstation> findByStationName(Object stationName) {
		return findByProperty(STATION_NAME, stationName);
	}

	public List<VSubstation> findByStationType(Object stationType) {
		return findByProperty(STATION_TYPE, stationType);
	}

	public List<VSubstation> findByProvinceId(Object provinceId) {
		return findByProperty(PROVINCE_ID, provinceId);
	}

	public List<VSubstation> findByCityId(Object cityId) {
		return findByProperty(CITY_ID, cityId);
	}

	public List<VSubstation> findByDistrictId(Object districtId) {
		return findByProperty(DISTRICT_ID, districtId);
	}

	public List<VSubstation> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<VSubstation> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List<VSubstation> findByMallName(Object mallName) {
		return findByProperty(MALL_NAME, mallName);
	}

	public List<VSubstation> findByMallType(Object mallType) {
		return findByProperty(MALL_TYPE, mallType);
	}

	public List<VSubstation> findByMallNo(Object mallNo) {
		return findByProperty(MALL_NO, mallNo);
	}

	public List<VSubstation> findByProvinceName(Object provinceName) {
		return findByProperty(PROVINCE_NAME, provinceName);
	}

	public List<VSubstation> findByCityName(Object cityName) {
		return findByProperty(CITY_NAME, cityName);
	}

	public List<VSubstation> findByDistrictName(Object districtName) {
		return findByProperty(DISTRICT_NAME, districtName);
	}

}
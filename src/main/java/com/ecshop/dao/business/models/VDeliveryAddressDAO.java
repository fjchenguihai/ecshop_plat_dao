package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * VDeliveryAddress entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VDeliveryAddress
 * @author MyEclipse Persistence Tools
 */
@Component
public class VDeliveryAddressDAO extends
		HibernateGenericDao<VDeliveryAddress, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VDeliveryAddressDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String ADDRESSEE = "addressee";
	public static final String PROVINCE_ID = "provinceId";
	public static final String CITY_ID = "cityId";
	public static final String DISTRICT_ID = "districtId";
	public static final String ADDRESS = "address";
	public static final String MOBILE = "mobile";
	public static final String ZIP_CODE = "zipCode";
	public static final String IF_DEFAULT = "ifDefault";
	public static final String ADDRESSALIAS = "addressalias";
	public static final String PROVINCE_NAME = "provinceName";
	public static final String CITY_NAME = "cityName";
	public static final String DISTRICT_NAME = "districtName";

	public VDeliveryAddress findById(java.lang.Long id) {
		log.debug("getting VDeliveryAddress instance with id: " + id);
		try {
			VDeliveryAddress instance = (VDeliveryAddress) getSession().get(
					"com.vveplat.dao.business.models.VDeliveryAddress", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VDeliveryAddress> findByExample(VDeliveryAddress instance) {
		log.debug("finding VDeliveryAddress instance by example");
		try {
			List<VDeliveryAddress> results = (List<VDeliveryAddress>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VDeliveryAddress")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VDeliveryAddress> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VDeliveryAddress> findByAddressee(Object addressee) {
		return findByProperty(ADDRESSEE, addressee);
	}

	public List<VDeliveryAddress> findByProvinceId(Object provinceId) {
		return findByProperty(PROVINCE_ID, provinceId);
	}

	public List<VDeliveryAddress> findByCityId(Object cityId) {
		return findByProperty(CITY_ID, cityId);
	}

	public List<VDeliveryAddress> findByDistrictId(Object districtId) {
		return findByProperty(DISTRICT_ID, districtId);
	}

	public List<VDeliveryAddress> findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List<VDeliveryAddress> findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List<VDeliveryAddress> findByZipCode(Object zipCode) {
		return findByProperty(ZIP_CODE, zipCode);
	}

	public List<VDeliveryAddress> findByIfDefault(Object ifDefault) {
		return findByProperty(IF_DEFAULT, ifDefault);
	}

	public List<VDeliveryAddress> findByAddressalias(Object addressalias) {
		return findByProperty(ADDRESSALIAS, addressalias);
	}

	public List<VDeliveryAddress> findByProvinceName(Object provinceName) {
		return findByProperty(PROVINCE_NAME, provinceName);
	}

	public List<VDeliveryAddress> findByCityName(Object cityName) {
		return findByProperty(CITY_NAME, cityName);
	}

	public List<VDeliveryAddress> findByDistrictName(Object districtName) {
		return findByProperty(DISTRICT_NAME, districtName);
	}

}
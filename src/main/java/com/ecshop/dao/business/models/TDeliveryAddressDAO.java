package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TDeliveryAddress entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TDeliveryAddress
 * @author MyEclipse Persistence Tools
 */
@Component
public class TDeliveryAddressDAO extends
		HibernateGenericDao<TDeliveryAddress, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TDeliveryAddressDAO.class);
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

	public TDeliveryAddress findById(java.lang.Long id) {
		log.debug("getting TDeliveryAddress instance with id: " + id);
		try {
			TDeliveryAddress instance = (TDeliveryAddress) getSession().get(
					"com.vveplat.dao.business.models.TDeliveryAddress", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TDeliveryAddress> findByExample(TDeliveryAddress instance) {
		log.debug("finding TDeliveryAddress instance by example");
		try {
			List<TDeliveryAddress> results = (List<TDeliveryAddress>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TDeliveryAddress")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TDeliveryAddress> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TDeliveryAddress> findByAddressee(Object addressee) {
		return findByProperty(ADDRESSEE, addressee);
	}

	public List<TDeliveryAddress> findByProvinceId(Object provinceId) {
		return findByProperty(PROVINCE_ID, provinceId);
	}

	public List<TDeliveryAddress> findByCityId(Object cityId) {
		return findByProperty(CITY_ID, cityId);
	}

	public List<TDeliveryAddress> findByDistrictId(Object districtId) {
		return findByProperty(DISTRICT_ID, districtId);
	}

	public List<TDeliveryAddress> findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List<TDeliveryAddress> findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List<TDeliveryAddress> findByZipCode(Object zipCode) {
		return findByProperty(ZIP_CODE, zipCode);
	}

	public List<TDeliveryAddress> findByIfDefault(Object ifDefault) {
		return findByProperty(IF_DEFAULT, ifDefault);
	}

	public List<TDeliveryAddress> findByAddressalias(Object addressalias) {
		return findByProperty(ADDRESSALIAS, addressalias);
	}

}
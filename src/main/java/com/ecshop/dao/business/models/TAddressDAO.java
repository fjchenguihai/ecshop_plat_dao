package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TAddress entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TAddress
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAddressDAO extends HibernateGenericDao<TAddress, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TAddressDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String ADDRESS = "address";
	public static final String TELEPHONE = "telephone";
	public static final String ADDRESSEE = "addressee";
	public static final String IF_DEFAULT = "ifDefault";
	public static final String PROVINCE_ID = "provinceId";
	public static final String CITY_ID = "cityId";
	public static final String DISTRICT_ID = "districtId";
	public static final String MOBILE = "mobile";
	public static final String ZIP_CODE = "zipCode";
	public static final String ADDRESSALIAS = "addressalias";

	public TAddress findById(java.lang.Long id) {
		log.debug("getting TAddress instance with id: " + id);
		try {
			TAddress instance = (TAddress) getSession().get(
					"com.vveplat.dao.business.models.TAddress", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAddress> findByExample(TAddress instance) {
		log.debug("finding TAddress instance by example");
		try {
			List<TAddress> results = (List<TAddress>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TAddress")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAddress> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TAddress> findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List<TAddress> findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	public List<TAddress> findByAddressee(Object addressee) {
		return findByProperty(ADDRESSEE, addressee);
	}

	public List<TAddress> findByIfDefault(Object ifDefault) {
		return findByProperty(IF_DEFAULT, ifDefault);
	}

	public List<TAddress> findByProvinceId(Object provinceId) {
		return findByProperty(PROVINCE_ID, provinceId);
	}

	public List<TAddress> findByCityId(Object cityId) {
		return findByProperty(CITY_ID, cityId);
	}

	public List<TAddress> findByDistrictId(Object districtId) {
		return findByProperty(DISTRICT_ID, districtId);
	}

	public List<TAddress> findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List<TAddress> findByZipCode(Object zipCode) {
		return findByProperty(ZIP_CODE, zipCode);
	}

	public List<TAddress> findByAddressalias(Object addressalias) {
		return findByProperty(ADDRESSALIAS, addressalias);
	}

}
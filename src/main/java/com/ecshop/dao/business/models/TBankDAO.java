package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for TBank
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TBank
 * @author MyEclipse Persistence Tools
 */
@Component
public class TBankDAO extends HibernateGenericDao<TBank, Long> {
	private static final Logger log = LoggerFactory.getLogger(TBankDAO.class);
	// property constants
	public static final String BANK_NAME = "bankName";
	public static final String BANK_CITY = "bankCity";
	public static final String BANK_NO = "bankNo";
	public static final String HOLDER_NAME = "holderName";
	public static final String BANK_BRANCH = "bankBranch";
	public static final String BANK_TYPE = "bankType";
	public static final String USER_ID = "userId";
	public static final String MALL_ID = "mallId";
	public static final String BANK_IMG = "bankImg";
	public static final String PROVINCE_ID = "provinceId";
	public static final String CITY_ID = "cityId";
	public static final String DISTRICT_ID = "districtId";

	public TBank findById(java.lang.Long id) {
		log.debug("getting TBank instance with id: " + id);
		try {
			TBank instance = (TBank) getSession().get(
					"com.vveplat.dao.business.models.TBank", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TBank> findByExample(TBank instance) {
		log.debug("finding TBank instance by example");
		try {
			List<TBank> results = (List<TBank>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TBank")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TBank> findByBankName(Object bankName) {
		return findByProperty(BANK_NAME, bankName);
	}

	public List<TBank> findByBankCity(Object bankCity) {
		return findByProperty(BANK_CITY, bankCity);
	}

	public List<TBank> findByBankNo(Object bankNo) {
		return findByProperty(BANK_NO, bankNo);
	}

	public List<TBank> findByHolderName(Object holderName) {
		return findByProperty(HOLDER_NAME, holderName);
	}

	public List<TBank> findByBankBranch(Object bankBranch) {
		return findByProperty(BANK_BRANCH, bankBranch);
	}

	public List<TBank> findByBankType(Object bankType) {
		return findByProperty(BANK_TYPE, bankType);
	}

	public List<TBank> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TBank> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TBank> findByBankImg(Object bankImg) {
		return findByProperty(BANK_IMG, bankImg);
	}

	public List<TBank> findByProvinceId(Object provinceId) {
		return findByProperty(PROVINCE_ID, provinceId);
	}

	public List<TBank> findByCityId(Object cityId) {
		return findByProperty(CITY_ID, cityId);
	}

	public List<TBank> findByDistrictId(Object districtId) {
		return findByProperty(DISTRICT_ID, districtId);
	}

}
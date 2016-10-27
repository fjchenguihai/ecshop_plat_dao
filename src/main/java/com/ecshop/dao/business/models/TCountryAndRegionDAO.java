package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCountryAndRegion entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TCountryAndRegion
 * @author MyEclipse Persistence Tools
 */
@Component
public class TCountryAndRegionDAO extends
		HibernateGenericDao<TCountryAndRegion, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TCountryAndRegionDAO.class);
	// property constants
	public static final String CHINESE_NAME = "chineseName";
	public static final String ENGLISH_NAME = "englishName";
	public static final String DOMAIN_NAME_ABBREVIATION = "domainNameAbbreviation";
	public static final String PHONE_CODE = "phoneCode";

	public TCountryAndRegion findById(java.lang.Long id) {
		log.debug("getting TCountryAndRegion instance with id: " + id);
		try {
			TCountryAndRegion instance = (TCountryAndRegion) getSession().get(
					"com.vveplat.dao.business.models.TCountryAndRegion", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TCountryAndRegion> findByExample(TCountryAndRegion instance) {
		log.debug("finding TCountryAndRegion instance by example");
		try {
			List<TCountryAndRegion> results = (List<TCountryAndRegion>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TCountryAndRegion")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TCountryAndRegion> findByChineseName(Object chineseName) {
		return findByProperty(CHINESE_NAME, chineseName);
	}

	public List<TCountryAndRegion> findByEnglishName(Object englishName) {
		return findByProperty(ENGLISH_NAME, englishName);
	}

	public List<TCountryAndRegion> findByDomainNameAbbreviation(
			Object domainNameAbbreviation) {
		return findByProperty(DOMAIN_NAME_ABBREVIATION, domainNameAbbreviation);
	}

	public List<TCountryAndRegion> findByPhoneCode(Object phoneCode) {
		return findByProperty(PHONE_CODE, phoneCode);
	}

}
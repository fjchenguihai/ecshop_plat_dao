package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TIndustry entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TIndustry
 * @author MyEclipse Persistence Tools
 */
@Component
public class TIndustryDAO extends HibernateGenericDao<TIndustry, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TIndustryDAO.class);
	// property constants
	public static final String INDUSTRY_NAME = "industryName";
	public static final String UP_INDUSTRY_ID = "upIndustryId";
	public static final String INDUSTRY_IMG = "industryImg";
	public static final String INDUSTRY_CODE = "industryCode";
	public static final String STATUS = "status";

	public TIndustry findById(java.lang.Long id) {
		log.debug("getting TIndustry instance with id: " + id);
		try {
			TIndustry instance = (TIndustry) getSession().get(
					"com.vveplat.dao.business.models.TIndustry", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TIndustry> findByExample(TIndustry instance) {
		log.debug("finding TIndustry instance by example");
		try {
			List<TIndustry> results = (List<TIndustry>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TIndustry")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TIndustry> findByIndustryName(Object industryName) {
		return findByProperty(INDUSTRY_NAME, industryName);
	}

	public List<TIndustry> findByUpIndustryId(Object upIndustryId) {
		return findByProperty(UP_INDUSTRY_ID, upIndustryId);
	}

	public List<TIndustry> findByIndustryImg(Object industryImg) {
		return findByProperty(INDUSTRY_IMG, industryImg);
	}

	public List<TIndustry> findByIndustryCode(Object industryCode) {
		return findByProperty(INDUSTRY_CODE, industryCode);
	}

	public List<TIndustry> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

}
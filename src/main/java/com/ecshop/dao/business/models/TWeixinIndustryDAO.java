package com.ecshop.dao.business.models;

import java.util.Date;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TWeixinIndustry entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TWeixinIndustry
 * @author MyEclipse Persistence Tools
 */
@Component
public class TWeixinIndustryDAO extends
		HibernateGenericDao<TWeixinIndustry, Integer> {
	private static final Logger log = LoggerFactory
			.getLogger(TWeixinIndustryDAO.class);
	// property constants
	public static final String MAIN_INDUSTRY = "mainIndustry";
	public static final String DEPUTY_INDUSTRY = "deputyIndustry";
	public static final String INDUSTRY_CODE = "industryCode";
	public static final String STATUS = "status";

	public TWeixinIndustry findById(java.lang.Integer id) {
		log.debug("getting TWeixinIndustry instance with id: " + id);
		try {
			TWeixinIndustry instance = (TWeixinIndustry) getSession().get(
					"com.vveplat.dao.business.models.TWeixinIndustry", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TWeixinIndustry> findByExample(TWeixinIndustry instance) {
		log.debug("finding TWeixinIndustry instance by example");
		try {
			List<TWeixinIndustry> results = (List<TWeixinIndustry>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TWeixinIndustry")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TWeixinIndustry> findByMainIndustry(Object mainIndustry) {
		return findByProperty(MAIN_INDUSTRY, mainIndustry);
	}

	public List<TWeixinIndustry> findByDeputyIndustry(Object deputyIndustry) {
		return findByProperty(DEPUTY_INDUSTRY, deputyIndustry);
	}

	public List<TWeixinIndustry> findByIndustryCode(Object industryCode) {
		return findByProperty(INDUSTRY_CODE, industryCode);
	}

	public List<TWeixinIndustry> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

}
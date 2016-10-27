package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TMallCategory entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallCategory
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallCategoryDAO extends HibernateGenericDao<TMallCategory, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallCategoryDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String CATEGORY_ID = "categoryId";
	public static final String CATEGORY_PID = "categoryPid";
	public static final String CATEGORY_NAME = "categoryName";
	public static final String CATEGORY_IMG = "categoryImg";
	public static final String STATUS = "status";

	public TMallCategory findById(java.lang.Long id) {
		log.debug("getting TMallCategory instance with id: " + id);
		try {
			TMallCategory instance = (TMallCategory) getSession().get(
					"com.vveplat.dao.business.models.TMallCategory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallCategory> findByExample(TMallCategory instance) {
		log.debug("finding TMallCategory instance by example");
		try {
			List<TMallCategory> results = (List<TMallCategory>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallCategory")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallCategory> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMallCategory> findByCategoryId(Object categoryId) {
		return findByProperty(CATEGORY_ID, categoryId);
	}

	public List<TMallCategory> findByCategoryPid(Object categoryPid) {
		return findByProperty(CATEGORY_PID, categoryPid);
	}

	public List<TMallCategory> findByCategoryName(Object categoryName) {
		return findByProperty(CATEGORY_NAME, categoryName);
	}

	public List<TMallCategory> findByCategoryImg(Object categoryImg) {
		return findByProperty(CATEGORY_IMG, categoryImg);
	}

	public List<TMallCategory> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

}
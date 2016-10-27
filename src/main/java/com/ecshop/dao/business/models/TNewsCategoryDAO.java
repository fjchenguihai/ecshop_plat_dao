package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TNewsCategory entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TNewsCategory
 * @author MyEclipse Persistence Tools
 */
@Component
public class TNewsCategoryDAO extends HibernateGenericDao<TNewsCategory, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TNewsCategoryDAO.class);
	// property constants
	public static final String NEWS_CATEGORY_NAME = "newsCategoryName";

	public TNewsCategory findById(java.lang.Long id) {
		log.debug("getting TNewsCategory instance with id: " + id);
		try {
			TNewsCategory instance = (TNewsCategory) getSession().get(
					"com.vveplat.dao.business.models.TNewsCategory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TNewsCategory> findByExample(TNewsCategory instance) {
		log.debug("finding TNewsCategory instance by example");
		try {
			List<TNewsCategory> results = (List<TNewsCategory>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TNewsCategory")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TNewsCategory> findByNewsCategoryName(Object newsCategoryName) {
		return findByProperty(NEWS_CATEGORY_NAME, newsCategoryName);
	}

}
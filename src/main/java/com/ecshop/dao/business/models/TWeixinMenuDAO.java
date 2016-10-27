package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TWeixinMenu entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TWeixinMenu
 * @author MyEclipse Persistence Tools
 */
@Component
public class TWeixinMenuDAO extends HibernateGenericDao<TWeixinMenu, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TWeixinMenuDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String CAT_NAME = "catName";
	public static final String CAT_TYPE = "catType";
	public static final String KEYWORDS = "keywords";
	public static final String SORT_ORDER = "sortOrder";
	public static final String PARENT_ID = "parentId";

	public TWeixinMenu findById(java.lang.Long id) {
		log.debug("getting TWeixinMenu instance with id: " + id);
		try {
			TWeixinMenu instance = (TWeixinMenu) getSession().get(
					"com.vveplat.dao.business.models.TWeixinMenu", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TWeixinMenu> findByExample(TWeixinMenu instance) {
		log.debug("finding TWeixinMenu instance by example");
		try {
			List<TWeixinMenu> results = (List<TWeixinMenu>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TWeixinMenu")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TWeixinMenu> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TWeixinMenu> findByCatName(Object catName) {
		return findByProperty(CAT_NAME, catName);
	}

	public List<TWeixinMenu> findByCatType(Object catType) {
		return findByProperty(CAT_TYPE, catType);
	}

	public List<TWeixinMenu> findByKeywords(Object keywords) {
		return findByProperty(KEYWORDS, keywords);
	}

	public List<TWeixinMenu> findBySortOrder(Object sortOrder) {
		return findByProperty(SORT_ORDER, sortOrder);
	}

	public List<TWeixinMenu> findByParentId(Object parentId) {
		return findByProperty(PARENT_ID, parentId);
	}

}
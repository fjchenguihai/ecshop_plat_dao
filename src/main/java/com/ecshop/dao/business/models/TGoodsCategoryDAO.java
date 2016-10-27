package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TGoodsCategory entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TGoodsCategory
 * @author MyEclipse Persistence Tools
 */
@Component
public class TGoodsCategoryDAO extends
		HibernateGenericDao<TGoodsCategory, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TGoodsCategoryDAO.class);
	// property constants
	public static final String CATEGORY_PID = "categoryPid";
	public static final String CATEGORY_NAME = "categoryName";
	public static final String CATEGORY_IMG = "categoryImg";
	public static final String STATUS = "status";

	public TGoodsCategory findById(java.lang.Long id) {
		log.debug("getting TGoodsCategory instance with id: " + id);
		try {
			TGoodsCategory instance = (TGoodsCategory) getSession().get(
					"com.vveplat.dao.business.models.TGoodsCategory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TGoodsCategory> findByExample(TGoodsCategory instance) {
		log.debug("finding TGoodsCategory instance by example");
		try {
			List<TGoodsCategory> results = (List<TGoodsCategory>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TGoodsCategory")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TGoodsCategory> findByCategoryPid(Object categoryPid) {
		return findByProperty(CATEGORY_PID, categoryPid);
	}

	public List<TGoodsCategory> findByCategoryName(Object categoryName) {
		return findByProperty(CATEGORY_NAME, categoryName);
	}

	public List<TGoodsCategory> findByCategoryImg(Object categoryImg) {
		return findByProperty(CATEGORY_IMG, categoryImg);
	}

	public List<TGoodsCategory> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

}
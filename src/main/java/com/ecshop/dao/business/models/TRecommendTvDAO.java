package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TRecommendTv entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TRecommendTv
 * @author MyEclipse Persistence Tools
 */
@Component
public class TRecommendTvDAO extends HibernateGenericDao<TRecommendTv, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TRecommendTvDAO.class);
	// property constants
	public static final String TYPE = "type";
	public static final String RECOMMENDED_JSON = "recommendedJson";

	public TRecommendTv findById(java.lang.Long id) {
		log.debug("getting TRecommendTv instance with id: " + id);
		try {
			TRecommendTv instance = (TRecommendTv) getSession().get(
					"com.vveplat.dao.business.models.TRecommendTv", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TRecommendTv> findByExample(TRecommendTv instance) {
		log.debug("finding TRecommendTv instance by example");
		try {
			List<TRecommendTv> results = (List<TRecommendTv>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TRecommendTv")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TRecommendTv> findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List<TRecommendTv> findByRecommendedJson(Object recommendedJson) {
		return findByProperty(RECOMMENDED_JSON, recommendedJson);
	}

}
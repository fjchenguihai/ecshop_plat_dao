package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TGuidePage entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TGuidePage
 * @author MyEclipse Persistence Tools
 */
@Component
public class TGuidePageDAO extends HibernateGenericDao<TGuidePage, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TGuidePageDAO.class);
	// property constants
	public static final String GUIDE_PAGE_IMG = "guidePageImg";

	public TGuidePage findById(java.lang.Long id) {
		log.debug("getting TGuidePage instance with id: " + id);
		try {
			TGuidePage instance = (TGuidePage) getSession().get(
					"com.vveplat.dao.business.models.TGuidePage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TGuidePage> findByExample(TGuidePage instance) {
		log.debug("finding TGuidePage instance by example");
		try {
			List<TGuidePage> results = (List<TGuidePage>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TGuidePage").add(
							create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TGuidePage> findByGuidePageImg(Object guidePageImg) {
		return findByProperty(GUIDE_PAGE_IMG, guidePageImg);
	}

}
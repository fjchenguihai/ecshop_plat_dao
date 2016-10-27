package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TComments entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TComments
 * @author MyEclipse Persistence Tools
 */
@Component
public class TCommentsDAO extends HibernateGenericDao<TComments, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TCommentsDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String USER_ID = "userId";
	public static final String CONTENT = "content";

	public TComments findById(java.lang.Long id) {
		log.debug("getting TComments instance with id: " + id);
		try {
			TComments instance = (TComments) getSession().get(
					"com.vveplat.dao.business.models.TComments", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TComments> findByExample(TComments instance) {
		log.debug("finding TComments instance by example");
		try {
			List<TComments> results = (List<TComments>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TComments")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TComments> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TComments> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TComments> findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

}
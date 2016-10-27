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
 * TMallVisitor entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallVisitor
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallVisitorDAO extends HibernateGenericDao<TMallVisitor, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallVisitorDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String USER_ID = "userId";
	public static final String VISIT_COUNT = "visitCount";

	public TMallVisitor findById(java.lang.Long id) {
		log.debug("getting TMallVisitor instance with id: " + id);
		try {
			TMallVisitor instance = (TMallVisitor) getSession().get(
					"com.vveplat.dao.business.models.TMallVisitor", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallVisitor> findByExample(TMallVisitor instance) {
		log.debug("finding TMallVisitor instance by example");
		try {
			List<TMallVisitor> results = (List<TMallVisitor>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallVisitor")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallVisitor> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMallVisitor> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TMallVisitor> findByVisitCount(Object visitCount) {
		return findByProperty(VISIT_COUNT, visitCount);
	}

}
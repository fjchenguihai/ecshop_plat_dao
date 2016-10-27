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
 * TAppAccess entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TAppAccess
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAppAccessDAO extends HibernateGenericDao<TAppAccess, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TAppAccessDAO.class);
	// property constants
	public static final String ACCESS_NAME = "accessName";
	public static final String APP_ID = "appId";
	public static final String SECRET_KEY = "secretKey";

	public TAppAccess findById(java.lang.Long id) {
		log.debug("getting TAppAccess instance with id: " + id);
		try {
			TAppAccess instance = (TAppAccess) getSession().get(
					"com.vveplat.dao.business.models.TAppAccess", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAppAccess> findByExample(TAppAccess instance) {
		log.debug("finding TAppAccess instance by example");
		try {
			List<TAppAccess> results = (List<TAppAccess>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TAppAccess").add(
							create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAppAccess> findByAccessName(Object accessName) {
		return findByProperty(ACCESS_NAME, accessName);
	}

	public List<TAppAccess> findByAppId(Object appId) {
		return findByProperty(APP_ID, appId);
	}

	public List<TAppAccess> findBySecretKey(Object secretKey) {
		return findByProperty(SECRET_KEY, secretKey);
	}

}
package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TMallHost entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallHost
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallHostDAO extends HibernateGenericDao<TMallHost, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallHostDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String HOST = "host";
	public static final String IS_DEFAULT = "isDefault";

	public TMallHost findById(java.lang.Long id) {
		log.debug("getting TMallHost instance with id: " + id);
		try {
			TMallHost instance = (TMallHost) getSession().get(
					"com.vveplat.dao.business.models.TMallHost", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallHost> findByExample(TMallHost instance) {
		log.debug("finding TMallHost instance by example");
		try {
			List<TMallHost> results = (List<TMallHost>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TMallHost")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallHost> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMallHost> findByHost(Object host) {
		return findByProperty(HOST, host);
	}

	public List<TMallHost> findByIsDefault(Object isDefault) {
		return findByProperty(IS_DEFAULT, isDefault);
	}

}
package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for TSpec
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TSpec
 * @author MyEclipse Persistence Tools
 */
@Component
public class TSpecDAO extends HibernateGenericDao<TSpec, Long> {
	private static final Logger log = LoggerFactory.getLogger(TSpecDAO.class);
	// property constants
	public static final String SPEC_NAME = "specName";
	public static final String SPEC_VALUES = "specValues";
	public static final String IS_COLOR = "isColor";
	public static final String STATUS = "status";

	public TSpec findById(java.lang.Long id) {
		log.debug("getting TSpec instance with id: " + id);
		try {
			TSpec instance = (TSpec) getSession().get(
					"com.vveplat.dao.business.models.TSpec", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TSpec> findByExample(TSpec instance) {
		log.debug("finding TSpec instance by example");
		try {
			List<TSpec> results = (List<TSpec>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TSpec")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TSpec> findBySpecName(Object specName) {
		return findByProperty(SPEC_NAME, specName);
	}

	public List<TSpec> findBySpecValues(Object specValues) {
		return findByProperty(SPEC_VALUES, specValues);
	}

	public List<TSpec> findByIsColor(Object isColor) {
		return findByProperty(IS_COLOR, isColor);
	}

	public List<TSpec> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

}
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
 * TGwtImme entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TGwtImme
 * @author MyEclipse Persistence Tools
 */
@Component
public class TGwtImmeDAO extends HibernateGenericDao<TGwtImme, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TGwtImmeDAO.class);
	// property constants
	public static final String IMME_CODE = "immeCode";

	public TGwtImme findById(java.lang.Long id) {
		log.debug("getting TGwtImme instance with id: " + id);
		try {
			TGwtImme instance = (TGwtImme) getSession().get(
					"com.vveplat.dao.business.models.TGwtImme", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TGwtImme> findByExample(TGwtImme instance) {
		log.debug("finding TGwtImme instance by example");
		try {
			List<TGwtImme> results = (List<TGwtImme>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TGwtImme")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TGwtImme> findByImmeCode(Object immeCode) {
		return findByProperty(IMME_CODE, immeCode);
	}

}
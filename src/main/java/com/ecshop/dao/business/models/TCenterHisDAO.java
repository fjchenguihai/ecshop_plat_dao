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
 * TCenterHis entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TCenterHis
 * @author MyEclipse Persistence Tools
 */
@Component
public class TCenterHisDAO extends HibernateGenericDao<TCenterHis, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TCenterHisDAO.class);
	// property constants
	public static final String CENTER_ID = "centerId";
	public static final String UP_CENTER_ID = "upCenterId";

	public TCenterHis findById(java.lang.Long id) {
		log.debug("getting TCenterHis instance with id: " + id);
		try {
			TCenterHis instance = (TCenterHis) getSession().get(
					"com.vveplat.dao.business.models.TCenterHis", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TCenterHis> findByExample(TCenterHis instance) {
		log.debug("finding TCenterHis instance by example");
		try {
			List<TCenterHis> results = (List<TCenterHis>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TCenterHis")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TCenterHis> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

	public List<TCenterHis> findByUpCenterId(Object upCenterId) {
		return findByProperty(UP_CENTER_ID, upCenterId);
	}

}
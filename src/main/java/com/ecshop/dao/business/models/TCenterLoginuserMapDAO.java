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
 * TCenterLoginuserMap entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TCenterLoginuserMap
 * @author MyEclipse Persistence Tools
 */
@Component
public class TCenterLoginuserMapDAO extends
		HibernateGenericDao<TCenterLoginuserMap, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TCenterLoginuserMapDAO.class);
	// property constants
	public static final String CENTER_ID = "centerId";
	public static final String USER_ID = "userId";

	public TCenterLoginuserMap findById(java.lang.Long id) {
		log.debug("getting TCenterLoginuserMap instance with id: " + id);
		try {
			TCenterLoginuserMap instance = (TCenterLoginuserMap) getSession()
					.get("com.vveplat.dao.business.models.TCenterLoginuserMap",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TCenterLoginuserMap> findByExample(TCenterLoginuserMap instance) {
		log.debug("finding TCenterLoginuserMap instance by example");
		try {
			List<TCenterLoginuserMap> results = (List<TCenterLoginuserMap>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TCenterLoginuserMap")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TCenterLoginuserMap> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

	public List<TCenterLoginuserMap> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

}
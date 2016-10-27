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
 * TUsertype entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TUsertype
 * @author MyEclipse Persistence Tools
 */
@Component
public class TUsertypeDAO extends HibernateGenericDao<TUsertype, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TUsertypeDAO.class);
	// property constants
	public static final String USERTYPE_NAME = "usertypeName";
	public static final String USERTYPE_INTRO = "usertypeIntro";
	public static final String DISABLESTATUS = "disablestatus";
	public static final String DELETESTATUS = "deletestatus";

	public TUsertype findById(java.lang.Long id) {
		log.debug("getting TUsertype instance with id: " + id);
		try {
			TUsertype instance = (TUsertype) getSession().get(
					"com.vveplat.dao.business.models.TUsertype", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TUsertype> findByExample(TUsertype instance) {
		log.debug("finding TUsertype instance by example");
		try {
			List<TUsertype> results = (List<TUsertype>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TUsertype")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TUsertype> findByUsertypeName(Object usertypeName) {
		return findByProperty(USERTYPE_NAME, usertypeName);
	}

	public List<TUsertype> findByUsertypeIntro(Object usertypeIntro) {
		return findByProperty(USERTYPE_INTRO, usertypeIntro);
	}

	public List<TUsertype> findByDisablestatus(Object disablestatus) {
		return findByProperty(DISABLESTATUS, disablestatus);
	}

	public List<TUsertype> findByDeletestatus(Object deletestatus) {
		return findByProperty(DELETESTATUS, deletestatus);
	}

}
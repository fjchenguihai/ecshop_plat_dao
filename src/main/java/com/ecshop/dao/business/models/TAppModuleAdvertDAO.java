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
 * TAppModuleAdvert entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TAppModuleAdvert
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAppModuleAdvertDAO extends
		HibernateGenericDao<TAppModuleAdvert, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TAppModuleAdvertDAO.class);
	// property constants
	public static final String ADVERST_JSON = "adverstJson";
	public static final String SCOPE = "scope";
	public static final String CENTER_ID = "centerId";
	public static final String ORDER_NO = "orderNo";

	public TAppModuleAdvert findById(java.lang.Long id) {
		log.debug("getting TAppModuleAdvert instance with id: " + id);
		try {
			TAppModuleAdvert instance = (TAppModuleAdvert) getSession().get(
					"com.vveplat.dao.business.models.TAppModuleAdvert", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAppModuleAdvert> findByExample(TAppModuleAdvert instance) {
		log.debug("finding TAppModuleAdvert instance by example");
		try {
			List<TAppModuleAdvert> results = (List<TAppModuleAdvert>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TAppModuleAdvert")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAppModuleAdvert> findByAdverstJson(Object adverstJson) {
		return findByProperty(ADVERST_JSON, adverstJson);
	}

	public List<TAppModuleAdvert> findByScope(Object scope) {
		return findByProperty(SCOPE, scope);
	}

	public List<TAppModuleAdvert> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

	public List<TAppModuleAdvert> findByOrderNo(Object orderNo) {
		return findByProperty(ORDER_NO, orderNo);
	}

}
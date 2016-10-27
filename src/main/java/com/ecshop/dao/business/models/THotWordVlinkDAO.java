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
 * THotWordVlink entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.THotWordVlink
 * @author MyEclipse Persistence Tools
 */
@Component
public class THotWordVlinkDAO extends HibernateGenericDao<THotWordVlink, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(THotWordVlinkDAO.class);
	// property constants
	public static final String WORD = "word";
	public static final String SCOPE = "scope";
	public static final String CENTER_ID = "centerId";
	public static final String ORDER_NO = "orderNo";

	public THotWordVlink findById(java.lang.Long id) {
		log.debug("getting THotWordVlink instance with id: " + id);
		try {
			THotWordVlink instance = (THotWordVlink) getSession().get(
					"com.vveplat.dao.business.models.THotWordVlink", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<THotWordVlink> findByExample(THotWordVlink instance) {
		log.debug("finding THotWordVlink instance by example");
		try {
			List<THotWordVlink> results = (List<THotWordVlink>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.THotWordVlink")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<THotWordVlink> findByWord(Object word) {
		return findByProperty(WORD, word);
	}

	public List<THotWordVlink> findByScope(Object scope) {
		return findByProperty(SCOPE, scope);
	}

	public List<THotWordVlink> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

	public List<THotWordVlink> findByOrderNo(Object orderNo) {
		return findByProperty(ORDER_NO, orderNo);
	}

}
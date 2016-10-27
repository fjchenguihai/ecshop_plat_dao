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
 * THotWord entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.THotWord
 * @author MyEclipse Persistence Tools
 */
@Component
public class THotWordDAO extends HibernateGenericDao<THotWord, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(THotWordDAO.class);
	// property constants
	public static final String HOT_WORD = "hotWord";
	public static final String ORDER_NO = "orderNo";

	public THotWord findById(java.lang.Long id) {
		log.debug("getting THotWord instance with id: " + id);
		try {
			THotWord instance = (THotWord) getSession().get(
					"com.vveplat.dao.business.models.THotWord", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<THotWord> findByExample(THotWord instance) {
		log.debug("finding THotWord instance by example");
		try {
			List<THotWord> results = (List<THotWord>) getSession()
					.createCriteria("com.vveplat.dao.business.models.THotWord")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<THotWord> findByHotWord(Object hotWord) {
		return findByProperty(HOT_WORD, hotWord);
	}

	public List<THotWord> findByOrderNo(Object orderNo) {
		return findByProperty(ORDER_NO, orderNo);
	}

}
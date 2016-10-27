package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TLogistics entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TLogistics
 * @author MyEclipse Persistence Tools
 */
@Component
public class TLogisticsDAO extends HibernateGenericDao<TLogistics, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TLogisticsDAO.class);
	// property constants
	public static final String LOGISTICS_NAME = "logisticsName";
	public static final String LOGISTICS_IMG = "logisticsImg";

	public TLogistics findById(java.lang.Long id) {
		log.debug("getting TLogistics instance with id: " + id);
		try {
			TLogistics instance = (TLogistics) getSession().get(
					"com.vveplat.dao.business.models.TLogistics", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TLogistics> findByExample(TLogistics instance) {
		log.debug("finding TLogistics instance by example");
		try {
			List<TLogistics> results = (List<TLogistics>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TLogistics")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TLogistics> findByLogisticsName(Object logisticsName) {
		return findByProperty(LOGISTICS_NAME, logisticsName);
	}

	public List<TLogistics> findByLogisticsImg(Object logisticsImg) {
		return findByProperty(LOGISTICS_IMG, logisticsImg);
	}

}
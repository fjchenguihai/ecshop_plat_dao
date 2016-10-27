package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * VVkeOrderAmount entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VVkeOrderAmount
 * @author MyEclipse Persistence Tools
 */
@Component
public class VVkeOrderAmountDAO extends
		HibernateGenericDao<VVkeOrderAmount, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VVkeOrderAmountDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String AMOUNT = "amount";

	public VVkeOrderAmount findById(java.lang.Long id) {
		log.debug("getting VVkeOrderAmount instance with id: " + id);
		try {
			VVkeOrderAmount instance = (VVkeOrderAmount) getSession().get(
					"com.vveplat.dao.business.models.VVkeOrderAmount", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VVkeOrderAmount> findByExample(VVkeOrderAmount instance) {
		log.debug("finding VVkeOrderAmount instance by example");
		try {
			List<VVkeOrderAmount> results = (List<VVkeOrderAmount>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VVkeOrderAmount")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VVkeOrderAmount> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VVkeOrderAmount> findByAmount(Object amount) {
		return findByProperty(AMOUNT, amount);
	}

}
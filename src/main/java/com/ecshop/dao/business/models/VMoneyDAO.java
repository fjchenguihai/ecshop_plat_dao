package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * VMoney entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VMoney
 * @author MyEclipse Persistence Tools
 */
@Component
public class VMoneyDAO extends HibernateGenericDao<VMoney, Long> {
	private static final Logger log = LoggerFactory.getLogger(VMoneyDAO.class);
	// property constants
	public static final String USE_MONEY = "useMoney";
	public static final String PROMISE_MONEY = "promiseMoney";
	public static final String MALL_NAME = "mallName";
	public static final String MALL_LOGO = "mallLogo";
	public static final String MIN_PROFIT = "minProfit";

	public VMoney findById(java.lang.Long id) {
		log.debug("getting VMoney instance with id: " + id);
		try {
			VMoney instance = (VMoney) getSession().get(
					"com.vveplat.dao.business.models.VMoney", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VMoney> findByExample(VMoney instance) {
		log.debug("finding VMoney instance by example");
		try {
			List<VMoney> results = (List<VMoney>) getSession()
					.createCriteria("com.vveplat.dao.business.models.VMoney")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VMoney> findByUseMoney(Object useMoney) {
		return findByProperty(USE_MONEY, useMoney);
	}

	public List<VMoney> findByPromiseMoney(Object promiseMoney) {
		return findByProperty(PROMISE_MONEY, promiseMoney);
	}

	public List<VMoney> findByMallName(Object mallName) {
		return findByProperty(MALL_NAME, mallName);
	}

	public List<VMoney> findByMallLogo(Object mallLogo) {
		return findByProperty(MALL_LOGO, mallLogo);
	}

	public List<VMoney> findByMinProfit(Object minProfit) {
		return findByProperty(MIN_PROFIT, minProfit);
	}

}
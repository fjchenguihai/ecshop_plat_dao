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
 * VMoneyLog entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VMoneyLog
 * @author MyEclipse Persistence Tools
 */
@Component
public class VMoneyLogDAO extends HibernateGenericDao<VMoneyLog, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VMoneyLogDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String MONEY = "money";
	public static final String REMARK = "remark";
	public static final String ADMIN_ID = "adminId";
	public static final String USERNAME = "username";
	public static final String MALL_NAME = "mallName";
	public static final String MALL_LOGO = "mallLogo";
	public static final String MIN_PROFIT = "minProfit";

	public VMoneyLog findById(java.lang.Long id) {
		log.debug("getting VMoneyLog instance with id: " + id);
		try {
			VMoneyLog instance = (VMoneyLog) getSession().get(
					"com.vveplat.dao.business.models.VMoneyLog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VMoneyLog> findByExample(VMoneyLog instance) {
		log.debug("finding VMoneyLog instance by example");
		try {
			List<VMoneyLog> results = (List<VMoneyLog>) getSession()
					.createCriteria("com.vveplat.dao.business.models.VMoneyLog")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VMoneyLog> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VMoneyLog> findByMoney(Object money) {
		return findByProperty(MONEY, money);
	}

	public List<VMoneyLog> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List<VMoneyLog> findByAdminId(Object adminId) {
		return findByProperty(ADMIN_ID, adminId);
	}

	public List<VMoneyLog> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<VMoneyLog> findByMallName(Object mallName) {
		return findByProperty(MALL_NAME, mallName);
	}

	public List<VMoneyLog> findByMallLogo(Object mallLogo) {
		return findByProperty(MALL_LOGO, mallLogo);
	}

	public List<VMoneyLog> findByMinProfit(Object minProfit) {
		return findByProperty(MIN_PROFIT, minProfit);
	}

}
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
 * VTrade entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VTrade
 * @author MyEclipse Persistence Tools
 */
@Component
public class VTradeDAO extends HibernateGenericDao<VTrade, String> {
	private static final Logger log = LoggerFactory.getLogger(VTradeDAO.class);
	// property constants
	public static final String ORDER_ID = "orderId";
	public static final String ORDER_NUMBER = "orderNumber";
	public static final String AFTER_SALES_ID = "afterSalesId";
	public static final String MALL_ID = "mallId";
	public static final String MONEY = "money";
	public static final String MALL_MONEY = "mallMoney";
	public static final String PROFIT_MONEY = "profitMoney";
	public static final String TYPE = "type";

	public VTrade findById(java.lang.String id) {
		log.debug("getting VTrade instance with id: " + id);
		try {
			VTrade instance = (VTrade) getSession().get(
					"com.vveplat.dao.business.models.VTrade", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VTrade> findByExample(VTrade instance) {
		log.debug("finding VTrade instance by example");
		try {
			List<VTrade> results = (List<VTrade>) getSession()
					.createCriteria("com.vveplat.dao.business.models.VTrade")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VTrade> findByOrderId(Object orderId) {
		return findByProperty(ORDER_ID, orderId);
	}

	public List<VTrade> findByOrderNumber(Object orderNumber) {
		return findByProperty(ORDER_NUMBER, orderNumber);
	}

	public List<VTrade> findByAfterSalesId(Object afterSalesId) {
		return findByProperty(AFTER_SALES_ID, afterSalesId);
	}

	public List<VTrade> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VTrade> findByMoney(Object money) {
		return findByProperty(MONEY, money);
	}

	public List<VTrade> findByMallMoney(Object mallMoney) {
		return findByProperty(MALL_MONEY, mallMoney);
	}

	public List<VTrade> findByProfitMoney(Object profitMoney) {
		return findByProperty(PROFIT_MONEY, profitMoney);
	}

	public List<VTrade> findByType(Object type) {
		return findByProperty(TYPE, type);
	}

}
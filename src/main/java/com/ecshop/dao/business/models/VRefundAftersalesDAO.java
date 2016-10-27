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
 * VRefundAftersales entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VRefundAftersales
 * @author MyEclipse Persistence Tools
 */
@Component
public class VRefundAftersalesDAO extends
		HibernateGenericDao<VRefundAftersales, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VRefundAftersalesDAO.class);
	// property constants
	public static final String GOOD_NUM = "goodNum";
	public static final String AMOUNT = "amount";
	public static final String STATUS_REFUND = "statusRefund";
	public static final String AFTER_SALES_ID = "afterSalesId";
	public static final String GOODS_NAME = "goodsName";
	public static final String USERNAME = "username";
	public static final String STATUS_AFTER_SALES = "statusAfterSales";
	public static final String MALL_NAME = "mallName";

	public VRefundAftersales findById(java.lang.Long id) {
		log.debug("getting VRefundAftersales instance with id: " + id);
		try {
			VRefundAftersales instance = (VRefundAftersales) getSession().get(
					"com.vveplat.dao.business.models.VRefundAftersales", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VRefundAftersales> findByExample(VRefundAftersales instance) {
		log.debug("finding VRefundAftersales instance by example");
		try {
			List<VRefundAftersales> results = (List<VRefundAftersales>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VRefundAftersales")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VRefundAftersales> findByGoodNum(Object goodNum) {
		return findByProperty(GOOD_NUM, goodNum);
	}

	public List<VRefundAftersales> findByAmount(Object amount) {
		return findByProperty(AMOUNT, amount);
	}

	public List<VRefundAftersales> findByStatusRefund(Object statusRefund) {
		return findByProperty(STATUS_REFUND, statusRefund);
	}

	public List<VRefundAftersales> findByAfterSalesId(Object afterSalesId) {
		return findByProperty(AFTER_SALES_ID, afterSalesId);
	}

	public List<VRefundAftersales> findByGoodsName(Object goodsName) {
		return findByProperty(GOODS_NAME, goodsName);
	}

	public List<VRefundAftersales> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<VRefundAftersales> findByStatusAfterSales(
			Object statusAfterSales) {
		return findByProperty(STATUS_AFTER_SALES, statusAfterSales);
	}

	public List<VRefundAftersales> findByMallName(Object mallName) {
		return findByProperty(MALL_NAME, mallName);
	}

}
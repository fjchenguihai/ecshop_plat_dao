package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * VSettlement entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VSettlement
 * @author MyEclipse Persistence Tools
 */
@Component
public class VSettlementDAO extends HibernateGenericDao<VSettlement, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VSettlementDAO.class);
	// property constants
	public static final String AMOUNT_OF_PAYMENT = "amountOfPayment";
	public static final String REFUND_AMOUNT = "refundAmount";
	public static final String ORDER_NUMBER = "orderNumber";
	public static final String REFUND_NUMBER = "refundNumber";
	public static final String MALL_ID = "mallId";
	public static final String POUNDAGE = "poundage";
	public static final String PROFIT_COST = "profitCost";
	public static final String OTHER_FEES = "otherFees";
	public static final String STATUS = "status";
	public static final String MALL_NAME = "mallName";

	public VSettlement findById(java.lang.Long id) {
		log.debug("getting VSettlement instance with id: " + id);
		try {
			VSettlement instance = (VSettlement) getSession().get(
					"com.vveplat.dao.business.models.VSettlement", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VSettlement> findByExample(VSettlement instance) {
		log.debug("finding VSettlement instance by example");
		try {
			List<VSettlement> results = (List<VSettlement>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VSettlement")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VSettlement> findByAmountOfPayment(Object amountOfPayment) {
		return findByProperty(AMOUNT_OF_PAYMENT, amountOfPayment);
	}

	public List<VSettlement> findByRefundAmount(Object refundAmount) {
		return findByProperty(REFUND_AMOUNT, refundAmount);
	}

	public List<VSettlement> findByOrderNumber(Object orderNumber) {
		return findByProperty(ORDER_NUMBER, orderNumber);
	}

	public List<VSettlement> findByRefundNumber(Object refundNumber) {
		return findByProperty(REFUND_NUMBER, refundNumber);
	}

	public List<VSettlement> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VSettlement> findByPoundage(Object poundage) {
		return findByProperty(POUNDAGE, poundage);
	}

	public List<VSettlement> findByProfitCost(Object profitCost) {
		return findByProperty(PROFIT_COST, profitCost);
	}

	public List<VSettlement> findByOtherFees(Object otherFees) {
		return findByProperty(OTHER_FEES, otherFees);
	}

	public List<VSettlement> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<VSettlement> findByMallName(Object mallName) {
		return findByProperty(MALL_NAME, mallName);
	}

}
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
 * TAfterSales entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TAfterSales
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAfterSalesDAO extends HibernateGenericDao<TAfterSales, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TAfterSalesDAO.class);
	// property constants
	public static final String AFTER_SALES_NO = "afterSalesNo";
	public static final String AFTER_SALES_TYPE = "afterSalesType";
	public static final String ORDER_GOODS_ID = "orderGoodsId";
	public static final String ORDER_ID = "orderId";
	public static final String MALL_ID = "mallId";
	public static final String ORDER_NUMBER = "orderNumber";
	public static final String GOOD_ID = "goodId";
	public static final String GOOD_ITEMS_ID = "goodItemsId";
	public static final String GOODS_NAME = "goodsName";
	public static final String GOOD_NUM = "goodNum";
	public static final String GOODS_PIC = "goodsPic";
	public static final String AMOUNT = "amount";
	public static final String USER_ID = "userId";
	public static final String USERNAME = "username";
	public static final String STATUS = "status";
	public static final String REMARK = "remark";
	public static final String IS_CALCULATE_PROFIT = "isCalculateProfit";
	public static final String IMG1 = "img1";
	public static final String IMG2 = "img2";
	public static final String IMG3 = "img3";
	public static final String IMG4 = "img4";
	public static final String MALL_MONEY = "mallMoney";
	public static final String PROFIT_MONEY = "profitMoney";
	public static final String MALL_CHECK_STATUS = "mallCheckStatus";
	public static final String USER_LOGISTICS_NAME = "userLogisticsName";
	public static final String USER_LOGISTICS_NO = "userLogisticsNo";
	public static final String MALL_LOGISTICS_NAME = "mallLogisticsName";
	public static final String MALL_LOGISTICS_NO = "mallLogisticsNo";

	public TAfterSales findById(java.lang.Long id) {
		log.debug("getting TAfterSales instance with id: " + id);
		try {
			TAfterSales instance = (TAfterSales) getSession().get(
					"com.vveplat.dao.business.models.TAfterSales", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAfterSales> findByExample(TAfterSales instance) {
		log.debug("finding TAfterSales instance by example");
		try {
			List<TAfterSales> results = (List<TAfterSales>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TAfterSales")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAfterSales> findByAfterSalesNo(Object afterSalesNo) {
		return findByProperty(AFTER_SALES_NO, afterSalesNo);
	}

	public List<TAfterSales> findByAfterSalesType(Object afterSalesType) {
		return findByProperty(AFTER_SALES_TYPE, afterSalesType);
	}

	public List<TAfterSales> findByOrderGoodsId(Object orderGoodsId) {
		return findByProperty(ORDER_GOODS_ID, orderGoodsId);
	}

	public List<TAfterSales> findByOrderId(Object orderId) {
		return findByProperty(ORDER_ID, orderId);
	}

	public List<TAfterSales> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TAfterSales> findByOrderNumber(Object orderNumber) {
		return findByProperty(ORDER_NUMBER, orderNumber);
	}

	public List<TAfterSales> findByGoodId(Object goodId) {
		return findByProperty(GOOD_ID, goodId);
	}

	public List<TAfterSales> findByGoodItemsId(Object goodItemsId) {
		return findByProperty(GOOD_ITEMS_ID, goodItemsId);
	}

	public List<TAfterSales> findByGoodsName(Object goodsName) {
		return findByProperty(GOODS_NAME, goodsName);
	}

	public List<TAfterSales> findByGoodNum(Object goodNum) {
		return findByProperty(GOOD_NUM, goodNum);
	}

	public List<TAfterSales> findByGoodsPic(Object goodsPic) {
		return findByProperty(GOODS_PIC, goodsPic);
	}

	public List<TAfterSales> findByAmount(Object amount) {
		return findByProperty(AMOUNT, amount);
	}

	public List<TAfterSales> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TAfterSales> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<TAfterSales> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<TAfterSales> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List<TAfterSales> findByIsCalculateProfit(Object isCalculateProfit) {
		return findByProperty(IS_CALCULATE_PROFIT, isCalculateProfit);
	}

	public List<TAfterSales> findByImg1(Object img1) {
		return findByProperty(IMG1, img1);
	}

	public List<TAfterSales> findByImg2(Object img2) {
		return findByProperty(IMG2, img2);
	}

	public List<TAfterSales> findByImg3(Object img3) {
		return findByProperty(IMG3, img3);
	}

	public List<TAfterSales> findByImg4(Object img4) {
		return findByProperty(IMG4, img4);
	}

	public List<TAfterSales> findByMallMoney(Object mallMoney) {
		return findByProperty(MALL_MONEY, mallMoney);
	}

	public List<TAfterSales> findByProfitMoney(Object profitMoney) {
		return findByProperty(PROFIT_MONEY, profitMoney);
	}

	public List<TAfterSales> findByMallCheckStatus(Object mallCheckStatus) {
		return findByProperty(MALL_CHECK_STATUS, mallCheckStatus);
	}

	public List<TAfterSales> findByUserLogisticsName(Object userLogisticsName) {
		return findByProperty(USER_LOGISTICS_NAME, userLogisticsName);
	}

	public List<TAfterSales> findByUserLogisticsNo(Object userLogisticsNo) {
		return findByProperty(USER_LOGISTICS_NO, userLogisticsNo);
	}

	public List<TAfterSales> findByMallLogisticsName(Object mallLogisticsName) {
		return findByProperty(MALL_LOGISTICS_NAME, mallLogisticsName);
	}

	public List<TAfterSales> findByMallLogisticsNo(Object mallLogisticsNo) {
		return findByProperty(MALL_LOGISTICS_NO, mallLogisticsNo);
	}

}
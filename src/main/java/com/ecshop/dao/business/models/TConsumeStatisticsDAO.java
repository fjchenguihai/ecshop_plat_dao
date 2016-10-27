package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TConsumeStatistics entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TConsumeStatistics
 * @author MyEclipse Persistence Tools
 */
@Component
public class TConsumeStatisticsDAO extends
		HibernateGenericDao<TConsumeStatistics, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TConsumeStatisticsDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String MALL_ID = "mallId";
	public static final String GOODS_ID = "goodsId";
	public static final String GOODS_QTY = "goodsQty";
	public static final String AMOUNT = "amount";
	public static final String USED_QTY = "usedQty";
	public static final String USED_AMOUNT = "usedAmount";

	public TConsumeStatistics findById(java.lang.Long id) {
		log.debug("getting TConsumeStatistics instance with id: " + id);
		try {
			TConsumeStatistics instance = (TConsumeStatistics) getSession()
					.get("com.vveplat.dao.business.models.TConsumeStatistics",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TConsumeStatistics> findByExample(TConsumeStatistics instance) {
		log.debug("finding TConsumeStatistics instance by example");
		try {
			List<TConsumeStatistics> results = (List<TConsumeStatistics>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TConsumeStatistics")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TConsumeStatistics> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TConsumeStatistics> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TConsumeStatistics> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TConsumeStatistics> findByGoodsQty(Object goodsQty) {
		return findByProperty(GOODS_QTY, goodsQty);
	}

	public List<TConsumeStatistics> findByAmount(Object amount) {
		return findByProperty(AMOUNT, amount);
	}

	public List<TConsumeStatistics> findByUsedQty(Object usedQty) {
		return findByProperty(USED_QTY, usedQty);
	}

	public List<TConsumeStatistics> findByUsedAmount(Object usedAmount) {
		return findByProperty(USED_AMOUNT, usedAmount);
	}

}
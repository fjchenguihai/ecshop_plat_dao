package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TMarketPlanCondition entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMarketPlanCondition
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMarketPlanConditionDAO extends
		HibernateGenericDao<TMarketPlanCondition, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMarketPlanConditionDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String MARKET_PLAN_ID = "marketPlanId";
	public static final String GOODS_ID = "goodsId";
	public static final String GOOD_QTY = "goodQty";

	public TMarketPlanCondition findById(java.lang.Long id) {
		log.debug("getting TMarketPlanCondition instance with id: " + id);
		try {
			TMarketPlanCondition instance = (TMarketPlanCondition) getSession()
					.get("com.vveplat.dao.business.models.TMarketPlanCondition",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMarketPlanCondition> findByExample(
			TMarketPlanCondition instance) {
		log.debug("finding TMarketPlanCondition instance by example");
		try {
			List<TMarketPlanCondition> results = (List<TMarketPlanCondition>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMarketPlanCondition")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMarketPlanCondition> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMarketPlanCondition> findByMarketPlanId(Object marketPlanId) {
		return findByProperty(MARKET_PLAN_ID, marketPlanId);
	}

	public List<TMarketPlanCondition> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TMarketPlanCondition> findByGoodQty(Object goodQty) {
		return findByProperty(GOOD_QTY, goodQty);
	}

}
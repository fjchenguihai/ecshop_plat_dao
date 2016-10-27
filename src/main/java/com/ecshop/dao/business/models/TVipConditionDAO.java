package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TVipCondition entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TVipCondition
 * @author MyEclipse Persistence Tools
 */
@Component
public class TVipConditionDAO extends HibernateGenericDao<TVipCondition, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TVipConditionDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String USERTYPE_ID = "usertypeId";
	public static final String AMOUNT = "amount";
	public static final String GOODS_ID = "goodsId";
	public static final String GOOD_QTY = "goodQty";
	public static final String RECOMMEND_COUNT = "recommendCount";
	public static final String TEAM_GOODS_LIST = "teamGoodsList";
	public static final String TEAM_GOODS_QTY = "teamGoodsQty";

	public TVipCondition findById(java.lang.Long id) {
		log.debug("getting TVipCondition instance with id: " + id);
		try {
			TVipCondition instance = (TVipCondition) getSession().get(
					"com.vveplat.dao.business.models.TVipCondition", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TVipCondition> findByExample(TVipCondition instance) {
		log.debug("finding TVipCondition instance by example");
		try {
			List<TVipCondition> results = (List<TVipCondition>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TVipCondition")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TVipCondition> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TVipCondition> findByUsertypeId(Object usertypeId) {
		return findByProperty(USERTYPE_ID, usertypeId);
	}

	public List<TVipCondition> findByAmount(Object amount) {
		return findByProperty(AMOUNT, amount);
	}

	public List<TVipCondition> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TVipCondition> findByGoodQty(Object goodQty) {
		return findByProperty(GOOD_QTY, goodQty);
	}

	public List<TVipCondition> findByRecommendCount(Object recommendCount) {
		return findByProperty(RECOMMEND_COUNT, recommendCount);
	}

	public List<TVipCondition> findByTeamGoodsList(Object teamGoodsList) {
		return findByProperty(TEAM_GOODS_LIST, teamGoodsList);
	}

	public List<TVipCondition> findByTeamGoodsQty(Object teamGoodsQty) {
		return findByProperty(TEAM_GOODS_QTY, teamGoodsQty);
	}

}
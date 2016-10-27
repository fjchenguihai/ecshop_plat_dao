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
 * TShoppingCart entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TShoppingCart
 * @author MyEclipse Persistence Tools
 */
@Component
public class TShoppingCartDAO extends HibernateGenericDao<TShoppingCart, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TShoppingCartDAO.class);
	// property constants
	public static final String GOODS_ID = "goodsId";
	public static final String GOODS_ITEMS_ID = "goodsItemsId";
	public static final String MALL_ID = "mallId";
	public static final String STATION_ID = "stationId";
	public static final String USER_ID = "userId";
	public static final String GOODS_NUM = "goodsNum";
	public static final String OPENID = "openid";
	public static final String SOURCE_MALL_ID = "sourceMallId";
	public static final String SOURCE_STATION_ID = "sourceStationId";

	public TShoppingCart findById(java.lang.Long id) {
		log.debug("getting TShoppingCart instance with id: " + id);
		try {
			TShoppingCart instance = (TShoppingCart) getSession().get(
					"com.vveplat.dao.business.models.TShoppingCart", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TShoppingCart> findByExample(TShoppingCart instance) {
		log.debug("finding TShoppingCart instance by example");
		try {
			List<TShoppingCart> results = (List<TShoppingCart>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TShoppingCart")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TShoppingCart> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TShoppingCart> findByGoodsItemsId(Object goodsItemsId) {
		return findByProperty(GOODS_ITEMS_ID, goodsItemsId);
	}

	public List<TShoppingCart> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TShoppingCart> findByStationId(Object stationId) {
		return findByProperty(STATION_ID, stationId);
	}

	public List<TShoppingCart> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TShoppingCart> findByGoodsNum(Object goodsNum) {
		return findByProperty(GOODS_NUM, goodsNum);
	}

	public List<TShoppingCart> findByOpenid(Object openid) {
		return findByProperty(OPENID, openid);
	}

	public List<TShoppingCart> findBySourceMallId(Object sourceMallId) {
		return findByProperty(SOURCE_MALL_ID, sourceMallId);
	}

	public List<TShoppingCart> findBySourceStationId(Object sourceStationId) {
		return findByProperty(SOURCE_STATION_ID, sourceStationId);
	}

}
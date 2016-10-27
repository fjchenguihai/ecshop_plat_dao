package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TDeliveryGoods entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TDeliveryGoods
 * @author MyEclipse Persistence Tools
 */
@Component
public class TDeliveryGoodsDAO extends
		HibernateGenericDao<TDeliveryGoods, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TDeliveryGoodsDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String DELIVERY_ID = "deliveryId";
	public static final String ORDER_ID = "orderId";
	public static final String GOODS_ID = "goodsId";
	public static final String GOODS_ITEMS_ID = "goodsItemsId";
	public static final String GOODS_NAME = "goodsName";
	public static final String GOODS_NUM = "goodsNum";

	public TDeliveryGoods findById(java.lang.Long id) {
		log.debug("getting TDeliveryGoods instance with id: " + id);
		try {
			TDeliveryGoods instance = (TDeliveryGoods) getSession().get(
					"com.vveplat.dao.business.models.TDeliveryGoods", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TDeliveryGoods> findByExample(TDeliveryGoods instance) {
		log.debug("finding TDeliveryGoods instance by example");
		try {
			List<TDeliveryGoods> results = (List<TDeliveryGoods>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TDeliveryGoods")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TDeliveryGoods> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TDeliveryGoods> findByDeliveryId(Object deliveryId) {
		return findByProperty(DELIVERY_ID, deliveryId);
	}

	public List<TDeliveryGoods> findByOrderId(Object orderId) {
		return findByProperty(ORDER_ID, orderId);
	}

	public List<TDeliveryGoods> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TDeliveryGoods> findByGoodsItemsId(Object goodsItemsId) {
		return findByProperty(GOODS_ITEMS_ID, goodsItemsId);
	}

	public List<TDeliveryGoods> findByGoodsName(Object goodsName) {
		return findByProperty(GOODS_NAME, goodsName);
	}

	public List<TDeliveryGoods> findByGoodsNum(Object goodsNum) {
		return findByProperty(GOODS_NUM, goodsNum);
	}

}
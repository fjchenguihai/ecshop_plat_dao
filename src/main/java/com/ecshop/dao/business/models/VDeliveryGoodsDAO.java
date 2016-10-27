package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * VDeliveryGoods entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VDeliveryGoods
 * @author MyEclipse Persistence Tools
 */
@Component
public class VDeliveryGoodsDAO extends
		HibernateGenericDao<VDeliveryGoods, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VDeliveryGoodsDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String DELIVERY_ID = "deliveryId";
	public static final String ORDER_ID = "orderId";
	public static final String GOODS_ID = "goodsId";
	public static final String GOODS_ITEMS_ID = "goodsItemsId";
	public static final String GOODS_NAME = "goodsName";
	public static final String GOODS_NUM = "goodsNum";
	public static final String GOODS_PIC = "goodsPic";
	public static final String SPEC = "spec";

	public VDeliveryGoods findById(java.lang.Long id) {
		log.debug("getting VDeliveryGoods instance with id: " + id);
		try {
			VDeliveryGoods instance = (VDeliveryGoods) getSession().get(
					"com.vveplat.dao.business.models.VDeliveryGoods", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VDeliveryGoods> findByExample(VDeliveryGoods instance) {
		log.debug("finding VDeliveryGoods instance by example");
		try {
			List<VDeliveryGoods> results = (List<VDeliveryGoods>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VDeliveryGoods")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VDeliveryGoods> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VDeliveryGoods> findByDeliveryId(Object deliveryId) {
		return findByProperty(DELIVERY_ID, deliveryId);
	}

	public List<VDeliveryGoods> findByOrderId(Object orderId) {
		return findByProperty(ORDER_ID, orderId);
	}

	public List<VDeliveryGoods> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<VDeliveryGoods> findByGoodsItemsId(Object goodsItemsId) {
		return findByProperty(GOODS_ITEMS_ID, goodsItemsId);
	}

	public List<VDeliveryGoods> findByGoodsName(Object goodsName) {
		return findByProperty(GOODS_NAME, goodsName);
	}

	public List<VDeliveryGoods> findByGoodsNum(Object goodsNum) {
		return findByProperty(GOODS_NUM, goodsNum);
	}

	public List<VDeliveryGoods> findByGoodsPic(Object goodsPic) {
		return findByProperty(GOODS_PIC, goodsPic);
	}

	public List<VDeliveryGoods> findBySpec(Object spec) {
		return findByProperty(SPEC, spec);
	}

}
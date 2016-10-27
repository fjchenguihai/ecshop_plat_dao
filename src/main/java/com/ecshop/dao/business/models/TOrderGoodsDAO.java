package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TOrderGoods entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TOrderGoods
 * @author MyEclipse Persistence Tools
 */
@Component
public class TOrderGoodsDAO extends HibernateGenericDao<TOrderGoods, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TOrderGoodsDAO.class);
	// property constants
	public static final String GOODS_ID = "goodsId";
	public static final String GOODS_ITEMS_ID = "goodsItemsId";
	public static final String ORDER_ID = "orderId";
	public static final String MALL_ID = "mallId";
	public static final String GOODS_NAME = "goodsName";
	public static final String GOODS_NUM = "goodsNum";
	public static final String GOODS_PRICE = "goodsPrice";
	public static final String GOODS_PIC = "goodsPic";
	public static final String AFTER_SALE_ID = "afterSaleId";
	public static final String COMMENT_STATUS = "commentStatus";
	public static final String RETURN_NUM = "returnNum";
	public static final String DELIVERY_NUM = "deliveryNum";
	public static final String GOODS_SPEC = "goodsSpec";

	public TOrderGoods findById(java.lang.Long id) {
		log.debug("getting TOrderGoods instance with id: " + id);
		try {
			TOrderGoods instance = (TOrderGoods) getSession().get(
					"com.vveplat.dao.business.models.TOrderGoods", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TOrderGoods> findByExample(TOrderGoods instance) {
		log.debug("finding TOrderGoods instance by example");
		try {
			List<TOrderGoods> results = (List<TOrderGoods>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TOrderGoods")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TOrderGoods> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TOrderGoods> findByGoodsItemsId(Object goodsItemsId) {
		return findByProperty(GOODS_ITEMS_ID, goodsItemsId);
	}

	public List<TOrderGoods> findByOrderId(Object orderId) {
		return findByProperty(ORDER_ID, orderId);
	}

	public List<TOrderGoods> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TOrderGoods> findByGoodsName(Object goodsName) {
		return findByProperty(GOODS_NAME, goodsName);
	}

	public List<TOrderGoods> findByGoodsNum(Object goodsNum) {
		return findByProperty(GOODS_NUM, goodsNum);
	}

	public List<TOrderGoods> findByGoodsPrice(Object goodsPrice) {
		return findByProperty(GOODS_PRICE, goodsPrice);
	}

	public List<TOrderGoods> findByGoodsPic(Object goodsPic) {
		return findByProperty(GOODS_PIC, goodsPic);
	}

	public List<TOrderGoods> findByAfterSaleId(Object afterSaleId) {
		return findByProperty(AFTER_SALE_ID, afterSaleId);
	}

	public List<TOrderGoods> findByCommentStatus(Object commentStatus) {
		return findByProperty(COMMENT_STATUS, commentStatus);
	}

	public List<TOrderGoods> findByReturnNum(Object returnNum) {
		return findByProperty(RETURN_NUM, returnNum);
	}

	public List<TOrderGoods> findByDeliveryNum(Object deliveryNum) {
		return findByProperty(DELIVERY_NUM, deliveryNum);
	}

	public List<TOrderGoods> findByGoodsSpec(Object goodsSpec) {
		return findByProperty(GOODS_SPEC, goodsSpec);
	}

}
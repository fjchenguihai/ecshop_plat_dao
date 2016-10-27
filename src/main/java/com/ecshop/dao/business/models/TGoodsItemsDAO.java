package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TGoodsItems entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TGoodsItems
 * @author MyEclipse Persistence Tools
 */
@Component
public class TGoodsItemsDAO extends HibernateGenericDao<TGoodsItems, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TGoodsItemsDAO.class);
	// property constants
	public static final String GOODS_ID = "goodsId";
	public static final String ITEM_NO = "itemNo";
	public static final String SPEC = "spec";
	public static final String INVENTORY = "inventory";
	public static final String MARKET_PRICE = "marketPrice";
	public static final String PRICE = "price";
	public static final String STATUS = "status";

	public TGoodsItems findById(java.lang.Long id) {
		log.debug("getting TGoodsItems instance with id: " + id);
		try {
			TGoodsItems instance = (TGoodsItems) getSession().get(
					"com.vveplat.dao.business.models.TGoodsItems", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TGoodsItems> findByExample(TGoodsItems instance) {
		log.debug("finding TGoodsItems instance by example");
		try {
			List<TGoodsItems> results = (List<TGoodsItems>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TGoodsItems")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TGoodsItems> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TGoodsItems> findByItemNo(Object itemNo) {
		return findByProperty(ITEM_NO, itemNo);
	}

	public List<TGoodsItems> findBySpec(Object spec) {
		return findByProperty(SPEC, spec);
	}

	public List<TGoodsItems> findByInventory(Object inventory) {
		return findByProperty(INVENTORY, inventory);
	}

	public List<TGoodsItems> findByMarketPrice(Object marketPrice) {
		return findByProperty(MARKET_PRICE, marketPrice);
	}

	public List<TGoodsItems> findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List<TGoodsItems> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

}
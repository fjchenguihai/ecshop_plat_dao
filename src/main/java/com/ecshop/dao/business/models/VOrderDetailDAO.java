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
 * VOrderDetail entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VOrderDetail
 * @author MyEclipse Persistence Tools
 */
@Component
public class VOrderDetailDAO extends HibernateGenericDao<VOrderDetail, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VOrderDetailDAO.class);
	// property constants
	public static final String GOODS_SPEC = "goodsSpec";
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
	public static final String USER_ID = "userId";
	public static final String STATION_ID = "stationId";
	public static final String MALL_NAME = "mallName";
	public static final String CATEGORY_ID = "categoryId";
	public static final String MALL_GOODS_NAME = "mallGoodsName";
	public static final String PROPERTY_JSON = "propertyJson";
	public static final String SPEC_JSON = "specJson";
	public static final String SALE_PRICE = "salePrice";
	public static final String PROFIT_PERCENT = "profitPercent";
	public static final String GOODS_STATUS = "goodsStatus";
	public static final String GOODS_NO = "goodsNo";
	public static final String PACK_LIST = "packList";
	public static final String AFTER_SALE = "afterSale";
	public static final String IS_FREE_MAIL = "isFreeMail";
	public static final String ITEM_NO = "itemNo";
	public static final String SPEC = "spec";
	public static final String INVENTORY = "inventory";
	public static final String MARKET_PRICE = "marketPrice";
	public static final String PRICE = "price";
	public static final String DELIVERY_GOODS_ID = "deliveryGoodsId";
	public static final String DELIVERY_ID = "deliveryId";
	public static final String AFTER_SALES_TYPE = "afterSalesType";
	public static final String STATUS = "status";
	public static final String FINANCE_AUDIT_STATUS = "financeAuditStatus";
	public static final String AUDIT_REMARK = "auditRemark";
	public static final String DERIVED_STATUS = "derivedStatus";

	public VOrderDetail findById(java.lang.Long id) {
		log.debug("getting VOrderDetail instance with id: " + id);
		try {
			VOrderDetail instance = (VOrderDetail) getSession().get(
					"com.vveplat.dao.business.models.VOrderDetail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VOrderDetail> findByExample(VOrderDetail instance) {
		log.debug("finding VOrderDetail instance by example");
		try {
			List<VOrderDetail> results = (List<VOrderDetail>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VOrderDetail")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VOrderDetail> findByGoodsSpec(Object goodsSpec) {
		return findByProperty(GOODS_SPEC, goodsSpec);
	}
	
	public List<VOrderDetail> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<VOrderDetail> findByGoodsItemsId(Object goodsItemsId) {
		return findByProperty(GOODS_ITEMS_ID, goodsItemsId);
	}

	public List<VOrderDetail> findByOrderId(Object orderId) {
		return findByProperty(ORDER_ID, orderId);
	}

	public List<VOrderDetail> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VOrderDetail> findByGoodsName(Object goodsName) {
		return findByProperty(GOODS_NAME, goodsName);
	}

	public List<VOrderDetail> findByGoodsNum(Object goodsNum) {
		return findByProperty(GOODS_NUM, goodsNum);
	}

	public List<VOrderDetail> findByGoodsPrice(Object goodsPrice) {
		return findByProperty(GOODS_PRICE, goodsPrice);
	}

	public List<VOrderDetail> findByGoodsPic(Object goodsPic) {
		return findByProperty(GOODS_PIC, goodsPic);
	}

	public List<VOrderDetail> findByAfterSaleId(Object afterSaleId) {
		return findByProperty(AFTER_SALE_ID, afterSaleId);
	}

	public List<VOrderDetail> findByCommentStatus(Object commentStatus) {
		return findByProperty(COMMENT_STATUS, commentStatus);
	}

	public List<VOrderDetail> findByReturnNum(Object returnNum) {
		return findByProperty(RETURN_NUM, returnNum);
	}

	public List<VOrderDetail> findByDeliveryNum(Object deliveryNum) {
		return findByProperty(DELIVERY_NUM, deliveryNum);
	}

	public List<VOrderDetail> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<VOrderDetail> findByStationId(Object stationId) {
		return findByProperty(STATION_ID, stationId);
	}

	public List<VOrderDetail> findByMallName(Object mallName) {
		return findByProperty(MALL_NAME, mallName);
	}

	public List<VOrderDetail> findByCategoryId(Object categoryId) {
		return findByProperty(CATEGORY_ID, categoryId);
	}

	public List<VOrderDetail> findByMallGoodsName(Object mallGoodsName) {
		return findByProperty(MALL_GOODS_NAME, mallGoodsName);
	}

	public List<VOrderDetail> findByPropertyJson(Object propertyJson) {
		return findByProperty(PROPERTY_JSON, propertyJson);
	}

	public List<VOrderDetail> findBySpecJson(Object specJson) {
		return findByProperty(SPEC_JSON, specJson);
	}

	public List<VOrderDetail> findBySalePrice(Object salePrice) {
		return findByProperty(SALE_PRICE, salePrice);
	}

	public List<VOrderDetail> findByProfitPercent(Object profitPercent) {
		return findByProperty(PROFIT_PERCENT, profitPercent);
	}

	public List<VOrderDetail> findByGoodsStatus(Object goodsStatus) {
		return findByProperty(GOODS_STATUS, goodsStatus);
	}

	public List<VOrderDetail> findByGoodsNo(Object goodsNo) {
		return findByProperty(GOODS_NO, goodsNo);
	}

	public List<VOrderDetail> findByPackList(Object packList) {
		return findByProperty(PACK_LIST, packList);
	}

	public List<VOrderDetail> findByAfterSale(Object afterSale) {
		return findByProperty(AFTER_SALE, afterSale);
	}

	public List<VOrderDetail> findByIsFreeMail(Object isFreeMail) {
		return findByProperty(IS_FREE_MAIL, isFreeMail);
	}

	public List<VOrderDetail> findByItemNo(Object itemNo) {
		return findByProperty(ITEM_NO, itemNo);
	}

	public List<VOrderDetail> findBySpec(Object spec) {
		return findByProperty(SPEC, spec);
	}

	public List<VOrderDetail> findByInventory(Object inventory) {
		return findByProperty(INVENTORY, inventory);
	}

	public List<VOrderDetail> findByMarketPrice(Object marketPrice) {
		return findByProperty(MARKET_PRICE, marketPrice);
	}

	public List<VOrderDetail> findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List<VOrderDetail> findByDeliveryGoodsId(Object deliveryGoodsId) {
		return findByProperty(DELIVERY_GOODS_ID, deliveryGoodsId);
	}

	public List<VOrderDetail> findByDeliveryId(Object deliveryId) {
		return findByProperty(DELIVERY_ID, deliveryId);
	}

	public List<VOrderDetail> findByAfterSalesType(Object afterSalesType) {
		return findByProperty(AFTER_SALES_TYPE, afterSalesType);
	}

	public List<VOrderDetail> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<VOrderDetail> findByFinanceAuditStatus(Object financeAuditStatus) {
		return findByProperty(FINANCE_AUDIT_STATUS, financeAuditStatus);
	}

	public List<VOrderDetail> findByAuditRemark(Object auditRemark) {
		return findByProperty(AUDIT_REMARK, auditRemark);
	}

	public List<VOrderDetail> findByDerivedStatus(Object derivedStatus) {
		return findByProperty(DERIVED_STATUS, derivedStatus);
	}

}
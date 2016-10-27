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
 * VGoodsProfitDetail entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VGoodsProfitDetail
 * @author MyEclipse Persistence Tools
 */
@Component
public class VGoodsProfitDetailDAO extends
		HibernateGenericDao<VGoodsProfitDetail, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VGoodsProfitDetailDAO.class);
	// property constants
	public static final String GOODS_SPEC = "goodsSpec";
	public static final String ORDER_GOODS_ID = "orderGoodsId";
	public static final String MALL_ID = "mallId";
	public static final String GOODS_ID = "goodsId";
	public static final String GOODS_ITEMS_ID = "goodsItemsId";
	public static final String ORDER_ID = "orderId";
	public static final String GOODSPROFIT_ID = "goodsprofitId";
	public static final String FROM_USER_ID = "fromUserId";
	public static final String VUSER_ID = "vuserId";
	public static final String MUSER_ID = "muserId";
	public static final String DUSER_ID = "duserId";
	public static final String DIRECT_USER_ID = "directUserId";
	public static final String INDIRECT_USER_ID = "indirectUserId";
	public static final String SERVICE_USER_ID = "serviceUserId";
	public static final String OPERATION_USER_ID = "operationUserId";
	public static final String PLATFORM_USER_ID = "platformUserId";
	public static final String MALL_AMOUNT = "mallAmount";
	public static final String VAMOUNT = "vamount";
	public static final String MAMOUNT = "mamount";
	public static final String DAMOUNT = "damount";
	public static final String DIRECT_AMOUNT = "directAmount";
	public static final String INDIRECT_AMOUNT = "indirectAmount";
	public static final String OPERATION_AMOUNT = "operationAmount";
	public static final String SERVICE_AMOUT = "serviceAmout";
	public static final String PLAT_FORM_AMOUNT = "platFormAmount";
	public static final String VUSER_TYPE = "vuserType";
	public static final String MUSER_TYPE = "muserType";
	public static final String CHECK_STATUS = "checkStatus";
	public static final String AFTER_SALE_ID = "afterSaleId";
	public static final String VAMOUNT_RATE = "vamountRate";
	public static final String MAMOUNT_RATE = "mamountRate";
	public static final String DAMOUNT_RATE = "damountRate";
	public static final String DIRECT_AMOUNT_RATE = "directAmountRate";
	public static final String INDIRECT_AMOUNT_RATE = "indirectAmountRate";
	public static final String OPERATION_AMOUNT_RATE = "operationAmountRate";
	public static final String SERVICE_AMOUT_RATE = "serviceAmoutRate";
	public static final String PLAT_FORM_AMOUNT_RATE = "platFormAmountRate";
	public static final String GOODS_NAME = "goodsName";
	public static final String GOODS_NUM = "goodsNum";
	public static final String GOODS_PRICE = "goodsPrice";
	public static final String GOODS_PIC = "goodsPic";
	public static final String MALL_NAME = "mallName";
	public static final String ORDER_NUMBER = "orderNumber";

	public VGoodsProfitDetail findById(java.lang.Long id) {
		log.debug("getting VGoodsProfitDetail instance with id: " + id);
		try {
			VGoodsProfitDetail instance = (VGoodsProfitDetail) getSession()
					.get("com.vveplat.dao.business.models.VGoodsProfitDetail",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VGoodsProfitDetail> findByExample(VGoodsProfitDetail instance) {
		log.debug("finding VGoodsProfitDetail instance by example");
		try {
			List<VGoodsProfitDetail> results = (List<VGoodsProfitDetail>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VGoodsProfitDetail")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VGoodsProfitDetail> findByGoodsSpec(Object goodsSpec) {
		return findByProperty(GOODS_SPEC, goodsSpec);
	}
	
	public List<VGoodsProfitDetail> findByOrderGoodsId(Object orderGoodsId) {
		return findByProperty(ORDER_GOODS_ID, orderGoodsId);
	}

	public List<VGoodsProfitDetail> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VGoodsProfitDetail> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<VGoodsProfitDetail> findByGoodsItemsId(Object goodsItemsId) {
		return findByProperty(GOODS_ITEMS_ID, goodsItemsId);
	}

	public List<VGoodsProfitDetail> findByOrderId(Object orderId) {
		return findByProperty(ORDER_ID, orderId);
	}

	public List<VGoodsProfitDetail> findByGoodsprofitId(Object goodsprofitId) {
		return findByProperty(GOODSPROFIT_ID, goodsprofitId);
	}

	public List<VGoodsProfitDetail> findByFromUserId(Object fromUserId) {
		return findByProperty(FROM_USER_ID, fromUserId);
	}

	public List<VGoodsProfitDetail> findByVuserId(Object vuserId) {
		return findByProperty(VUSER_ID, vuserId);
	}

	public List<VGoodsProfitDetail> findByMuserId(Object muserId) {
		return findByProperty(MUSER_ID, muserId);
	}

	public List<VGoodsProfitDetail> findByDuserId(Object duserId) {
		return findByProperty(DUSER_ID, duserId);
	}

	public List<VGoodsProfitDetail> findByDirectUserId(Object directUserId) {
		return findByProperty(DIRECT_USER_ID, directUserId);
	}

	public List<VGoodsProfitDetail> findByIndirectUserId(Object indirectUserId) {
		return findByProperty(INDIRECT_USER_ID, indirectUserId);
	}

	public List<VGoodsProfitDetail> findByServiceUserId(Object serviceUserId) {
		return findByProperty(SERVICE_USER_ID, serviceUserId);
	}

	public List<VGoodsProfitDetail> findByOperationUserId(Object operationUserId) {
		return findByProperty(OPERATION_USER_ID, operationUserId);
	}

	public List<VGoodsProfitDetail> findByPlatformUserId(Object platformUserId) {
		return findByProperty(PLATFORM_USER_ID, platformUserId);
	}

	public List<VGoodsProfitDetail> findByMallAmount(Object mallAmount) {
		return findByProperty(MALL_AMOUNT, mallAmount);
	}

	public List<VGoodsProfitDetail> findByVamount(Object vamount) {
		return findByProperty(VAMOUNT, vamount);
	}

	public List<VGoodsProfitDetail> findByMamount(Object mamount) {
		return findByProperty(MAMOUNT, mamount);
	}

	public List<VGoodsProfitDetail> findByDamount(Object damount) {
		return findByProperty(DAMOUNT, damount);
	}

	public List<VGoodsProfitDetail> findByDirectAmount(Object directAmount) {
		return findByProperty(DIRECT_AMOUNT, directAmount);
	}

	public List<VGoodsProfitDetail> findByIndirectAmount(Object indirectAmount) {
		return findByProperty(INDIRECT_AMOUNT, indirectAmount);
	}

	public List<VGoodsProfitDetail> findByOperationAmount(Object operationAmount) {
		return findByProperty(OPERATION_AMOUNT, operationAmount);
	}

	public List<VGoodsProfitDetail> findByServiceAmout(Object serviceAmout) {
		return findByProperty(SERVICE_AMOUT, serviceAmout);
	}

	public List<VGoodsProfitDetail> findByPlatFormAmount(Object platFormAmount) {
		return findByProperty(PLAT_FORM_AMOUNT, platFormAmount);
	}

	public List<VGoodsProfitDetail> findByVuserType(Object vuserType) {
		return findByProperty(VUSER_TYPE, vuserType);
	}

	public List<VGoodsProfitDetail> findByMuserType(Object muserType) {
		return findByProperty(MUSER_TYPE, muserType);
	}

	public List<VGoodsProfitDetail> findByCheckStatus(Object checkStatus) {
		return findByProperty(CHECK_STATUS, checkStatus);
	}

	public List<VGoodsProfitDetail> findByAfterSaleId(Object afterSaleId) {
		return findByProperty(AFTER_SALE_ID, afterSaleId);
	}

	public List<VGoodsProfitDetail> findByVamountRate(Object vamountRate) {
		return findByProperty(VAMOUNT_RATE, vamountRate);
	}

	public List<VGoodsProfitDetail> findByMamountRate(Object mamountRate) {
		return findByProperty(MAMOUNT_RATE, mamountRate);
	}

	public List<VGoodsProfitDetail> findByDamountRate(Object damountRate) {
		return findByProperty(DAMOUNT_RATE, damountRate);
	}

	public List<VGoodsProfitDetail> findByDirectAmountRate(
			Object directAmountRate) {
		return findByProperty(DIRECT_AMOUNT_RATE, directAmountRate);
	}

	public List<VGoodsProfitDetail> findByIndirectAmountRate(
			Object indirectAmountRate) {
		return findByProperty(INDIRECT_AMOUNT_RATE, indirectAmountRate);
	}

	public List<VGoodsProfitDetail> findByOperationAmountRate(
			Object operationAmountRate) {
		return findByProperty(OPERATION_AMOUNT_RATE, operationAmountRate);
	}

	public List<VGoodsProfitDetail> findByServiceAmoutRate(
			Object serviceAmoutRate) {
		return findByProperty(SERVICE_AMOUT_RATE, serviceAmoutRate);
	}

	public List<VGoodsProfitDetail> findByPlatFormAmountRate(
			Object platFormAmountRate) {
		return findByProperty(PLAT_FORM_AMOUNT_RATE, platFormAmountRate);
	}

	public List<VGoodsProfitDetail> findByGoodsName(Object goodsName) {
		return findByProperty(GOODS_NAME, goodsName);
	}

	public List<VGoodsProfitDetail> findByGoodsNum(Object goodsNum) {
		return findByProperty(GOODS_NUM, goodsNum);
	}

	public List<VGoodsProfitDetail> findByGoodsPrice(Object goodsPrice) {
		return findByProperty(GOODS_PRICE, goodsPrice);
	}

	public List<VGoodsProfitDetail> findByGoodsPic(Object goodsPic) {
		return findByProperty(GOODS_PIC, goodsPic);
	}

	public List<VGoodsProfitDetail> findByMallName(Object mallName) {
		return findByProperty(MALL_NAME, mallName);
	}

	public List<VGoodsProfitDetail> findByOrderNumber(Object orderNumber) {
		return findByProperty(ORDER_NUMBER, orderNumber);
	}

}
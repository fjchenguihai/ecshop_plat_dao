package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TGoodsProfitDetail entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TGoodsProfitDetail
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TGoodsProfitDetailDAO extends HibernateGenericDao<TGoodsProfitDetail,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TGoodsProfitDetailDAO.class);
		//property constants
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
	public static final String REGION_OPERATION_ID = "regionOperationId";
	public static final String REGION_AMOUNT = "regionAmount";
	public static final String REGION_RATE = "regionRate";



    
   
    
    public TGoodsProfitDetail findById( java.lang.Long id) {
        log.debug("getting TGoodsProfitDetail instance with id: " + id);
        try {
            TGoodsProfitDetail instance = (TGoodsProfitDetail) getSession()
                    .get("com.vveplat.dao.business.models.TGoodsProfitDetail", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TGoodsProfitDetail> findByExample(TGoodsProfitDetail instance) {
        log.debug("finding TGoodsProfitDetail instance by example");
        try {
            List<TGoodsProfitDetail> results = (List<TGoodsProfitDetail>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TGoodsProfitDetail")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TGoodsProfitDetail> findByOrderGoodsId(Object orderGoodsId
	) {
		return findByProperty(ORDER_GOODS_ID, orderGoodsId
		);
	}
	
	public List<TGoodsProfitDetail> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<TGoodsProfitDetail> findByGoodsId(Object goodsId
	) {
		return findByProperty(GOODS_ID, goodsId
		);
	}
	
	public List<TGoodsProfitDetail> findByGoodsItemsId(Object goodsItemsId
	) {
		return findByProperty(GOODS_ITEMS_ID, goodsItemsId
		);
	}
	
	public List<TGoodsProfitDetail> findByOrderId(Object orderId
	) {
		return findByProperty(ORDER_ID, orderId
		);
	}
	
	public List<TGoodsProfitDetail> findByGoodsprofitId(Object goodsprofitId
	) {
		return findByProperty(GOODSPROFIT_ID, goodsprofitId
		);
	}
	
	public List<TGoodsProfitDetail> findByFromUserId(Object fromUserId
	) {
		return findByProperty(FROM_USER_ID, fromUserId
		);
	}
	
	public List<TGoodsProfitDetail> findByVuserId(Object vuserId
	) {
		return findByProperty(VUSER_ID, vuserId
		);
	}
	
	public List<TGoodsProfitDetail> findByMuserId(Object muserId
	) {
		return findByProperty(MUSER_ID, muserId
		);
	}
	
	public List<TGoodsProfitDetail> findByDuserId(Object duserId
	) {
		return findByProperty(DUSER_ID, duserId
		);
	}
	
	public List<TGoodsProfitDetail> findByDirectUserId(Object directUserId
	) {
		return findByProperty(DIRECT_USER_ID, directUserId
		);
	}
	
	public List<TGoodsProfitDetail> findByIndirectUserId(Object indirectUserId
	) {
		return findByProperty(INDIRECT_USER_ID, indirectUserId
		);
	}
	
	public List<TGoodsProfitDetail> findByServiceUserId(Object serviceUserId
	) {
		return findByProperty(SERVICE_USER_ID, serviceUserId
		);
	}
	
	public List<TGoodsProfitDetail> findByOperationUserId(Object operationUserId
	) {
		return findByProperty(OPERATION_USER_ID, operationUserId
		);
	}
	
	public List<TGoodsProfitDetail> findByPlatformUserId(Object platformUserId
	) {
		return findByProperty(PLATFORM_USER_ID, platformUserId
		);
	}
	
	public List<TGoodsProfitDetail> findByMallAmount(Object mallAmount
	) {
		return findByProperty(MALL_AMOUNT, mallAmount
		);
	}
	
	public List<TGoodsProfitDetail> findByVamount(Object vamount
	) {
		return findByProperty(VAMOUNT, vamount
		);
	}
	
	public List<TGoodsProfitDetail> findByMamount(Object mamount
	) {
		return findByProperty(MAMOUNT, mamount
		);
	}
	
	public List<TGoodsProfitDetail> findByDamount(Object damount
	) {
		return findByProperty(DAMOUNT, damount
		);
	}
	
	public List<TGoodsProfitDetail> findByDirectAmount(Object directAmount
	) {
		return findByProperty(DIRECT_AMOUNT, directAmount
		);
	}
	
	public List<TGoodsProfitDetail> findByIndirectAmount(Object indirectAmount
	) {
		return findByProperty(INDIRECT_AMOUNT, indirectAmount
		);
	}
	
	public List<TGoodsProfitDetail> findByOperationAmount(Object operationAmount
	) {
		return findByProperty(OPERATION_AMOUNT, operationAmount
		);
	}
	
	public List<TGoodsProfitDetail> findByServiceAmout(Object serviceAmout
	) {
		return findByProperty(SERVICE_AMOUT, serviceAmout
		);
	}
	
	public List<TGoodsProfitDetail> findByPlatFormAmount(Object platFormAmount
	) {
		return findByProperty(PLAT_FORM_AMOUNT, platFormAmount
		);
	}
	
	public List<TGoodsProfitDetail> findByVuserType(Object vuserType
	) {
		return findByProperty(VUSER_TYPE, vuserType
		);
	}
	
	public List<TGoodsProfitDetail> findByMuserType(Object muserType
	) {
		return findByProperty(MUSER_TYPE, muserType
		);
	}
	
	public List<TGoodsProfitDetail> findByCheckStatus(Object checkStatus
	) {
		return findByProperty(CHECK_STATUS, checkStatus
		);
	}
	
	public List<TGoodsProfitDetail> findByAfterSaleId(Object afterSaleId
	) {
		return findByProperty(AFTER_SALE_ID, afterSaleId
		);
	}
	
	public List<TGoodsProfitDetail> findByVamountRate(Object vamountRate
	) {
		return findByProperty(VAMOUNT_RATE, vamountRate
		);
	}
	
	public List<TGoodsProfitDetail> findByMamountRate(Object mamountRate
	) {
		return findByProperty(MAMOUNT_RATE, mamountRate
		);
	}
	
	public List<TGoodsProfitDetail> findByDamountRate(Object damountRate
	) {
		return findByProperty(DAMOUNT_RATE, damountRate
		);
	}
	
	public List<TGoodsProfitDetail> findByDirectAmountRate(Object directAmountRate
	) {
		return findByProperty(DIRECT_AMOUNT_RATE, directAmountRate
		);
	}
	
	public List<TGoodsProfitDetail> findByIndirectAmountRate(Object indirectAmountRate
	) {
		return findByProperty(INDIRECT_AMOUNT_RATE, indirectAmountRate
		);
	}
	
	public List<TGoodsProfitDetail> findByOperationAmountRate(Object operationAmountRate
	) {
		return findByProperty(OPERATION_AMOUNT_RATE, operationAmountRate
		);
	}
	
	public List<TGoodsProfitDetail> findByServiceAmoutRate(Object serviceAmoutRate
	) {
		return findByProperty(SERVICE_AMOUT_RATE, serviceAmoutRate
		);
	}
	
	public List<TGoodsProfitDetail> findByPlatFormAmountRate(Object platFormAmountRate
	) {
		return findByProperty(PLAT_FORM_AMOUNT_RATE, platFormAmountRate
		);
	}
	
	public List<TGoodsProfitDetail> findByRegionOperationId(Object regionOperationId
	) {
		return findByProperty(REGION_OPERATION_ID, regionOperationId
		);
	}
	
	public List<TGoodsProfitDetail> findByRegionAmount(Object regionAmount
	) {
		return findByProperty(REGION_AMOUNT, regionAmount
		);
	}
	
	public List<TGoodsProfitDetail> findByRegionRate(Object regionRate
	) {
		return findByProperty(REGION_RATE, regionRate
		);
	}
	

    

}
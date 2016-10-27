package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for VSubstationGoods entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.VSubstationGoods
  * @author MyEclipse Persistence Tools 
 */
@Component
public class VSubstationGoodsDAO extends HibernateGenericDao<VSubstationGoods,Long> {
	     private static final Logger log = LoggerFactory.getLogger(VSubstationGoodsDAO.class);
		//property constants
	public static final String MALL_ID = "mallId";
	public static final String CATEGORY_ID = "categoryId";
	public static final String MALL_GOODS_NAME = "mallGoodsName";
	public static final String PROPERTY_JSON = "propertyJson";
	public static final String SPEC_JSON = "specJson";
	public static final String GOODS_PIC = "goodsPic";
	public static final String SALE_PRICE = "salePrice";
	public static final String MARKET_PRICE = "marketPrice";
	public static final String PROFIT_PERCENT = "profitPercent";
	public static final String GOODS_STATUS = "goodsStatus";
	public static final String GOODS_NO = "goodsNo";
	public static final String PACK_LIST = "packList";
	public static final String AFTER_SALE = "afterSale";
	public static final String IS_FREE_MAIL = "isFreeMail";
	public static final String DESCRIPTION = "description";
	public static final String SALES_COUNT = "salesCount";
	public static final String IS_BOUTIQUE = "isBoutique";
	public static final String HIGH_PRAISE = "highPraise";
	public static final String COMMENT_COUNT = "commentCount";
	public static final String IS_TOP = "isTop";
	public static final String IS_VIRTUAL_PRODUCT = "isVirtualProduct";
	public static final String SALE_TYPE = "saleType";
	public static final String ORIGINAL_GOODS_ID = "originalGoodsId";
	public static final String STATION_ID = "stationId";
	public static final String STATION_NAME = "stationName";
	public static final String STATION_TYPE = "stationType";
	public static final String MALL_NAME = "mallName";
	public static final String MALL_TYPE = "mallType";
	public static final String LINKMALL_ID = "linkmallId";
	public static final String LINKMALL_NAME = "linkmallName";
	public static final String LINKMALL_TYPE = "linkmallType";



    
   
    
    public VSubstationGoods findById( java.lang.Long id) {
        log.debug("getting VSubstationGoods instance with id: " + id);
        try {
            VSubstationGoods instance = (VSubstationGoods) getSession()
                    .get("com.vveplat.dao.business.models.VSubstationGoods", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<VSubstationGoods> findByExample(VSubstationGoods instance) {
        log.debug("finding VSubstationGoods instance by example");
        try {
            List<VSubstationGoods> results = (List<VSubstationGoods>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.VSubstationGoods")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<VSubstationGoods> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<VSubstationGoods> findByCategoryId(Object categoryId
	) {
		return findByProperty(CATEGORY_ID, categoryId
		);
	}
	
	public List<VSubstationGoods> findByMallGoodsName(Object mallGoodsName
	) {
		return findByProperty(MALL_GOODS_NAME, mallGoodsName
		);
	}
	
	public List<VSubstationGoods> findByPropertyJson(Object propertyJson
	) {
		return findByProperty(PROPERTY_JSON, propertyJson
		);
	}
	
	public List<VSubstationGoods> findBySpecJson(Object specJson
	) {
		return findByProperty(SPEC_JSON, specJson
		);
	}
	
	public List<VSubstationGoods> findByGoodsPic(Object goodsPic
	) {
		return findByProperty(GOODS_PIC, goodsPic
		);
	}
	
	public List<VSubstationGoods> findBySalePrice(Object salePrice
	) {
		return findByProperty(SALE_PRICE, salePrice
		);
	}
	
	public List<VSubstationGoods> findByMarketPrice(Object marketPrice
	) {
		return findByProperty(MARKET_PRICE, marketPrice
		);
	}
	
	public List<VSubstationGoods> findByProfitPercent(Object profitPercent
	) {
		return findByProperty(PROFIT_PERCENT, profitPercent
		);
	}
	
	public List<VSubstationGoods> findByGoodsStatus(Object goodsStatus
	) {
		return findByProperty(GOODS_STATUS, goodsStatus
		);
	}
	
	public List<VSubstationGoods> findByGoodsNo(Object goodsNo
	) {
		return findByProperty(GOODS_NO, goodsNo
		);
	}
	
	public List<VSubstationGoods> findByPackList(Object packList
	) {
		return findByProperty(PACK_LIST, packList
		);
	}
	
	public List<VSubstationGoods> findByAfterSale(Object afterSale
	) {
		return findByProperty(AFTER_SALE, afterSale
		);
	}
	
	public List<VSubstationGoods> findByIsFreeMail(Object isFreeMail
	) {
		return findByProperty(IS_FREE_MAIL, isFreeMail
		);
	}
	
	public List<VSubstationGoods> findByDescription(Object description
	) {
		return findByProperty(DESCRIPTION, description
		);
	}
	
	public List<VSubstationGoods> findBySalesCount(Object salesCount
	) {
		return findByProperty(SALES_COUNT, salesCount
		);
	}
	
	public List<VSubstationGoods> findByIsBoutique(Object isBoutique
	) {
		return findByProperty(IS_BOUTIQUE, isBoutique
		);
	}
	
	public List<VSubstationGoods> findByHighPraise(Object highPraise
	) {
		return findByProperty(HIGH_PRAISE, highPraise
		);
	}
	
	public List<VSubstationGoods> findByCommentCount(Object commentCount
	) {
		return findByProperty(COMMENT_COUNT, commentCount
		);
	}
	
	public List<VSubstationGoods> findByIsTop(Object isTop
	) {
		return findByProperty(IS_TOP, isTop
		);
	}
	
	public List<VSubstationGoods> findByIsVirtualProduct(Object isVirtualProduct
	) {
		return findByProperty(IS_VIRTUAL_PRODUCT, isVirtualProduct
		);
	}
	
	public List<VSubstationGoods> findBySaleType(Object saleType
	) {
		return findByProperty(SALE_TYPE, saleType
		);
	}
	
	public List<VSubstationGoods> findByOriginalGoodsId(Object originalGoodsId
	) {
		return findByProperty(ORIGINAL_GOODS_ID, originalGoodsId
		);
	}
	
	public List<VSubstationGoods> findByStationId(Object stationId
	) {
		return findByProperty(STATION_ID, stationId
		);
	}
	
	public List<VSubstationGoods> findByStationName(Object stationName
	) {
		return findByProperty(STATION_NAME, stationName
		);
	}
	
	public List<VSubstationGoods> findByStationType(Object stationType
	) {
		return findByProperty(STATION_TYPE, stationType
		);
	}
	
	public List<VSubstationGoods> findByMallName(Object mallName
	) {
		return findByProperty(MALL_NAME, mallName
		);
	}
	
	public List<VSubstationGoods> findByMallType(Object mallType
	) {
		return findByProperty(MALL_TYPE, mallType
		);
	}
	
	public List<VSubstationGoods> findByLinkmallId(Object linkmallId
	) {
		return findByProperty(LINKMALL_ID, linkmallId
		);
	}
	
	public List<VSubstationGoods> findByLinkmallName(Object linkmallName
	) {
		return findByProperty(LINKMALL_NAME, linkmallName
		);
	}
	
	public List<VSubstationGoods> findByLinkmallType(Object linkmallType
	) {
		return findByProperty(LINKMALL_TYPE, linkmallType
		);
	}
	

    

}
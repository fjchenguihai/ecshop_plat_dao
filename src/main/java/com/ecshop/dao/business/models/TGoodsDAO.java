package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TGoods entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TGoods
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TGoodsDAO extends HibernateGenericDao<TGoods,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TGoodsDAO.class);
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



    
   
    
    public TGoods findById( java.lang.Long id) {
        log.debug("getting TGoods instance with id: " + id);
        try {
            TGoods instance = (TGoods) getSession()
                    .get("com.vveplat.dao.business.models.TGoods", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TGoods> findByExample(TGoods instance) {
        log.debug("finding TGoods instance by example");
        try {
            List<TGoods> results = (List<TGoods>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TGoods")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TGoods> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<TGoods> findByCategoryId(Object categoryId
	) {
		return findByProperty(CATEGORY_ID, categoryId
		);
	}
	
	public List<TGoods> findByMallGoodsName(Object mallGoodsName
	) {
		return findByProperty(MALL_GOODS_NAME, mallGoodsName
		);
	}
	
	public List<TGoods> findByPropertyJson(Object propertyJson
	) {
		return findByProperty(PROPERTY_JSON, propertyJson
		);
	}
	
	public List<TGoods> findBySpecJson(Object specJson
	) {
		return findByProperty(SPEC_JSON, specJson
		);
	}
	
	public List<TGoods> findByGoodsPic(Object goodsPic
	) {
		return findByProperty(GOODS_PIC, goodsPic
		);
	}
	
	public List<TGoods> findBySalePrice(Object salePrice
	) {
		return findByProperty(SALE_PRICE, salePrice
		);
	}
	
	public List<TGoods> findByMarketPrice(Object marketPrice
	) {
		return findByProperty(MARKET_PRICE, marketPrice
		);
	}
	
	public List<TGoods> findByProfitPercent(Object profitPercent
	) {
		return findByProperty(PROFIT_PERCENT, profitPercent
		);
	}
	
	public List<TGoods> findByGoodsStatus(Object goodsStatus
	) {
		return findByProperty(GOODS_STATUS, goodsStatus
		);
	}
	
	public List<TGoods> findByGoodsNo(Object goodsNo
	) {
		return findByProperty(GOODS_NO, goodsNo
		);
	}
	
	public List<TGoods> findByPackList(Object packList
	) {
		return findByProperty(PACK_LIST, packList
		);
	}
	
	public List<TGoods> findByAfterSale(Object afterSale
	) {
		return findByProperty(AFTER_SALE, afterSale
		);
	}
	
	public List<TGoods> findByIsFreeMail(Object isFreeMail
	) {
		return findByProperty(IS_FREE_MAIL, isFreeMail
		);
	}
	
	public List<TGoods> findByDescription(Object description
	) {
		return findByProperty(DESCRIPTION, description
		);
	}
	
	public List<TGoods> findBySalesCount(Object salesCount
	) {
		return findByProperty(SALES_COUNT, salesCount
		);
	}
	
	public List<TGoods> findByIsBoutique(Object isBoutique
	) {
		return findByProperty(IS_BOUTIQUE, isBoutique
		);
	}
	
	public List<TGoods> findByHighPraise(Object highPraise
	) {
		return findByProperty(HIGH_PRAISE, highPraise
		);
	}
	
	public List<TGoods> findByCommentCount(Object commentCount
	) {
		return findByProperty(COMMENT_COUNT, commentCount
		);
	}
	
	public List<TGoods> findByIsTop(Object isTop
	) {
		return findByProperty(IS_TOP, isTop
		);
	}
	
	public List<TGoods> findByIsVirtualProduct(Object isVirtualProduct
	) {
		return findByProperty(IS_VIRTUAL_PRODUCT, isVirtualProduct
		);
	}
	
	public List<TGoods> findBySaleType(Object saleType
	) {
		return findByProperty(SALE_TYPE, saleType
		);
	}
	
	public List<TGoods> findByOriginalGoodsId(Object originalGoodsId
	) {
		return findByProperty(ORIGINAL_GOODS_ID, originalGoodsId
		);
	}
	

    

}
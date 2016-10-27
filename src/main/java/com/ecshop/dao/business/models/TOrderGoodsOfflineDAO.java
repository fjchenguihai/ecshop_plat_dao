package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TOrderGoodsOffline entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TOrderGoodsOffline
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TOrderGoodsOfflineDAO extends HibernateGenericDao<TOrderGoodsOffline,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TOrderGoodsOfflineDAO.class);
		//property constants
	public static final String GOODS_ID = "goodsId";
	public static final String GOODS_ITEMS_ID = "goodsItemsId";
	public static final String SPEC = "spec";
	public static final String OFFLINE_ORDER_ID = "offlineOrderId";
	public static final String GOODS_NAME = "goodsName";
	public static final String GOODS_NUM = "goodsNum";
	public static final String GOODS_PRICE = "goodsPrice";
	public static final String GOODS_NET_PRICE = "goodsNetPrice";
	public static final String GOODS_PIC = "goodsPic";
	public static final String BCOMMISSION = "bcommission";
	public static final String MCOMMISSION = "mcommission";
	public static final String DCOMMISSION = "dcommission";
	public static final String DIRECT_COMMISSION = "directCommission";
	public static final String INDIRECT_COMMISSION = "indirectCommission";
	public static final String SERVICE_COMMISSION = "serviceCommission";
	public static final String OPERATION_COMMISSION = "operationCommission";
	public static final String PLATFORM_COMMISSION = "platformCommission";
	public static final String REGION_RATE = "regionRate";



    
   
    
    public TOrderGoodsOffline findById( java.lang.Long id) {
        log.debug("getting TOrderGoodsOffline instance with id: " + id);
        try {
            TOrderGoodsOffline instance = (TOrderGoodsOffline) getSession()
                    .get("com.vveplat.dao.business.models.TOrderGoodsOffline", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TOrderGoodsOffline> findByExample(TOrderGoodsOffline instance) {
        log.debug("finding TOrderGoodsOffline instance by example");
        try {
            List<TOrderGoodsOffline> results = (List<TOrderGoodsOffline>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TOrderGoodsOffline")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TOrderGoodsOffline> findByGoodsId(Object goodsId
	) {
		return findByProperty(GOODS_ID, goodsId
		);
	}
	
	public List<TOrderGoodsOffline> findByGoodsItemsId(Object goodsItemsId
	) {
		return findByProperty(GOODS_ITEMS_ID, goodsItemsId
		);
	}
	
	public List<TOrderGoodsOffline> findBySpec(Object spec
	) {
		return findByProperty(SPEC, spec
		);
	}
	
	public List<TOrderGoodsOffline> findByOfflineOrderId(Object offlineOrderId
	) {
		return findByProperty(OFFLINE_ORDER_ID, offlineOrderId
		);
	}
	
	public List<TOrderGoodsOffline> findByGoodsName(Object goodsName
	) {
		return findByProperty(GOODS_NAME, goodsName
		);
	}
	
	public List<TOrderGoodsOffline> findByGoodsNum(Object goodsNum
	) {
		return findByProperty(GOODS_NUM, goodsNum
		);
	}
	
	public List<TOrderGoodsOffline> findByGoodsPrice(Object goodsPrice
	) {
		return findByProperty(GOODS_PRICE, goodsPrice
		);
	}
	
	public List<TOrderGoodsOffline> findByGoodsNetPrice(Object goodsNetPrice
	) {
		return findByProperty(GOODS_NET_PRICE, goodsNetPrice
		);
	}
	
	public List<TOrderGoodsOffline> findByGoodsPic(Object goodsPic
	) {
		return findByProperty(GOODS_PIC, goodsPic
		);
	}
	
	public List<TOrderGoodsOffline> findByBcommission(Object bcommission
	) {
		return findByProperty(BCOMMISSION, bcommission
		);
	}
	
	public List<TOrderGoodsOffline> findByMcommission(Object mcommission
	) {
		return findByProperty(MCOMMISSION, mcommission
		);
	}
	
	public List<TOrderGoodsOffline> findByDcommission(Object dcommission
	) {
		return findByProperty(DCOMMISSION, dcommission
		);
	}
	
	public List<TOrderGoodsOffline> findByDirectCommission(Object directCommission
	) {
		return findByProperty(DIRECT_COMMISSION, directCommission
		);
	}
	
	public List<TOrderGoodsOffline> findByIndirectCommission(Object indirectCommission
	) {
		return findByProperty(INDIRECT_COMMISSION, indirectCommission
		);
	}
	
	public List<TOrderGoodsOffline> findByServiceCommission(Object serviceCommission
	) {
		return findByProperty(SERVICE_COMMISSION, serviceCommission
		);
	}
	
	public List<TOrderGoodsOffline> findByOperationCommission(Object operationCommission
	) {
		return findByProperty(OPERATION_COMMISSION, operationCommission
		);
	}
	
	public List<TOrderGoodsOffline> findByPlatformCommission(Object platformCommission
	) {
		return findByProperty(PLATFORM_COMMISSION, platformCommission
		);
	}
	
	public List<TOrderGoodsOffline> findByRegionRate(Object regionRate
	) {
		return findByProperty(REGION_RATE, regionRate
		);
	}
	

    

}
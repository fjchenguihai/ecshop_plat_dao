package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TGoodsprofit entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TGoodsprofit
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TGoodsprofitDAO extends HibernateGenericDao<TGoodsprofit,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TGoodsprofitDAO.class);
		//property constants
	public static final String GOODS_ID = "goodsId";
	public static final String MEMBER_COMMISSION = "memberCommission";
	public static final String PLAT_COMMISSION = "platCommission";
	public static final String VCOMMISSION_SHOW = "vcommissionShow";
	public static final String DCOMMISSION_SHOW = "dcommissionShow";
	public static final String VCOMMISSION = "vcommission";
	public static final String BCOMMISSION = "bcommission";
	public static final String MCOMMISSION = "mcommission";
	public static final String DCOMMISSION = "dcommission";
	public static final String DIRECT_COMMISSION = "directCommission";
	public static final String INDIRECT_COMMISSION = "indirectCommission";
	public static final String SERVICE_COMMISSION = "serviceCommission";
	public static final String OPERATION_COMMISSION = "operationCommission";
	public static final String PLATFORM_COMMISSION = "platformCommission";
	public static final String REGION_RATE = "regionRate";



    
   
    
    public TGoodsprofit findById( java.lang.Long id) {
        log.debug("getting TGoodsprofit instance with id: " + id);
        try {
            TGoodsprofit instance = (TGoodsprofit) getSession()
                    .get("com.vveplat.dao.business.models.TGoodsprofit", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TGoodsprofit> findByExample(TGoodsprofit instance) {
        log.debug("finding TGoodsprofit instance by example");
        try {
            List<TGoodsprofit> results = (List<TGoodsprofit>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TGoodsprofit")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TGoodsprofit> findByGoodsId(Object goodsId
	) {
		return findByProperty(GOODS_ID, goodsId
		);
	}
	
	public List<TGoodsprofit> findByMemberCommission(Object memberCommission
	) {
		return findByProperty(MEMBER_COMMISSION, memberCommission
		);
	}
	
	public List<TGoodsprofit> findByPlatCommission(Object platCommission
	) {
		return findByProperty(PLAT_COMMISSION, platCommission
		);
	}
	
	public List<TGoodsprofit> findByVcommissionShow(Object vcommissionShow
	) {
		return findByProperty(VCOMMISSION_SHOW, vcommissionShow
		);
	}
	
	public List<TGoodsprofit> findByDcommissionShow(Object dcommissionShow
	) {
		return findByProperty(DCOMMISSION_SHOW, dcommissionShow
		);
	}
	
	public List<TGoodsprofit> findByVcommission(Object vcommission
	) {
		return findByProperty(VCOMMISSION, vcommission
		);
	}
	
	public List<TGoodsprofit> findByBcommission(Object bcommission
	) {
		return findByProperty(BCOMMISSION, bcommission
		);
	}
	
	public List<TGoodsprofit> findByMcommission(Object mcommission
	) {
		return findByProperty(MCOMMISSION, mcommission
		);
	}
	
	public List<TGoodsprofit> findByDcommission(Object dcommission
	) {
		return findByProperty(DCOMMISSION, dcommission
		);
	}
	
	public List<TGoodsprofit> findByDirectCommission(Object directCommission
	) {
		return findByProperty(DIRECT_COMMISSION, directCommission
		);
	}
	
	public List<TGoodsprofit> findByIndirectCommission(Object indirectCommission
	) {
		return findByProperty(INDIRECT_COMMISSION, indirectCommission
		);
	}
	
	public List<TGoodsprofit> findByServiceCommission(Object serviceCommission
	) {
		return findByProperty(SERVICE_COMMISSION, serviceCommission
		);
	}
	
	public List<TGoodsprofit> findByOperationCommission(Object operationCommission
	) {
		return findByProperty(OPERATION_COMMISSION, operationCommission
		);
	}
	
	public List<TGoodsprofit> findByPlatformCommission(Object platformCommission
	) {
		return findByProperty(PLATFORM_COMMISSION, platformCommission
		);
	}
	
	public List<TGoodsprofit> findByRegionRate(Object regionRate
	) {
		return findByProperty(REGION_RATE, regionRate
		);
	}
	

    

}
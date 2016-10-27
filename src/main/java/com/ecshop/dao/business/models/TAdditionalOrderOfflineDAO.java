package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TAdditionalOrderOffline entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TAdditionalOrderOffline
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TAdditionalOrderOfflineDAO extends HibernateGenericDao<TAdditionalOrderOffline,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TAdditionalOrderOfflineDAO.class);
		//property constants
	public static final String OFFLINE_ORDER_ID = "offlineOrderId";
	public static final String OFFLINE_ORDER_GOODS_ID = "offlineOrderGoodsId";
	public static final String RETURN_NUM = "returnNum";
	public static final String REMARK = "remark";
	public static final String IS_SETTLEMENT = "isSettlement";
	public static final String AUDIT_STATUS = "auditStatus";
	public static final String AUDIT_REMARK = "auditRemark";
	public static final String SOURCE = "source";
	public static final String CRE_USER_ID = "creUserId";



    
   
    
    public TAdditionalOrderOffline findById( java.lang.Long id) {
        log.debug("getting TAdditionalOrderOffline instance with id: " + id);
        try {
            TAdditionalOrderOffline instance = (TAdditionalOrderOffline) getSession()
                    .get("com.vveplat.dao.business.models.TAdditionalOrderOffline", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TAdditionalOrderOffline> findByExample(TAdditionalOrderOffline instance) {
        log.debug("finding TAdditionalOrderOffline instance by example");
        try {
            List<TAdditionalOrderOffline> results = (List<TAdditionalOrderOffline>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TAdditionalOrderOffline")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TAdditionalOrderOffline> findByOfflineOrderId(Object offlineOrderId
	) {
		return findByProperty(OFFLINE_ORDER_ID, offlineOrderId
		);
	}
	
	public List<TAdditionalOrderOffline> findByOfflineOrderGoodsId(Object offlineOrderGoodsId
	) {
		return findByProperty(OFFLINE_ORDER_GOODS_ID, offlineOrderGoodsId
		);
	}
	
	public List<TAdditionalOrderOffline> findByReturnNum(Object returnNum
	) {
		return findByProperty(RETURN_NUM, returnNum
		);
	}
	
	public List<TAdditionalOrderOffline> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	
	public List<TAdditionalOrderOffline> findByIsSettlement(Object isSettlement
	) {
		return findByProperty(IS_SETTLEMENT, isSettlement
		);
	}
	
	public List<TAdditionalOrderOffline> findByAuditStatus(Object auditStatus
	) {
		return findByProperty(AUDIT_STATUS, auditStatus
		);
	}
	
	public List<TAdditionalOrderOffline> findByAuditRemark(Object auditRemark
	) {
		return findByProperty(AUDIT_REMARK, auditRemark
		);
	}
	
	public List<TAdditionalOrderOffline> findBySource(Object source
	) {
		return findByProperty(SOURCE, source
		);
	}
	
	public List<TAdditionalOrderOffline> findByCreUserId(Object creUserId
	) {
		return findByProperty(CRE_USER_ID, creUserId
		);
	}
	

    

}
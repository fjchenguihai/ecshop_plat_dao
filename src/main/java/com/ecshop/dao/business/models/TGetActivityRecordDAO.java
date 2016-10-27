package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TGetActivityRecord entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TGetActivityRecord
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TGetActivityRecordDAO extends HibernateGenericDao<TGetActivityRecord,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TGetActivityRecordDAO.class);
		//property constants
	public static final String RELATION_ID = "relationId";
	public static final String USER_ID = "userId";
	public static final String MALL_ID = "mallId";
	public static final String MARKET_PLAN_ID = "marketPlanId";
	public static final String MARKET_ACTIVITY_ID = "marketActivityId";
	public static final String GET_ACTIVITY_ID = "getActivityId";
	public static final String ORDER_ID = "orderId";
	public static final String GOOD_NAME = "goodName";
	public static final String STATUS = "status";



    
   
    
    public TGetActivityRecord findById( java.lang.Long id) {
        log.debug("getting TGetActivityRecord instance with id: " + id);
        try {
            TGetActivityRecord instance = (TGetActivityRecord) getSession()
                    .get("com.vveplat.dao.business.models.TGetActivityRecord", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TGetActivityRecord> findByExample(TGetActivityRecord instance) {
        log.debug("finding TGetActivityRecord instance by example");
        try {
            List<TGetActivityRecord> results = (List<TGetActivityRecord>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TGetActivityRecord")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TGetActivityRecord> findByRelationId(Object relationId
	) {
		return findByProperty(RELATION_ID, relationId
		);
	}
	
	public List<TGetActivityRecord> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List<TGetActivityRecord> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<TGetActivityRecord> findByMarketPlanId(Object marketPlanId
	) {
		return findByProperty(MARKET_PLAN_ID, marketPlanId
		);
	}
	
	public List<TGetActivityRecord> findByMarketActivityId(Object marketActivityId
	) {
		return findByProperty(MARKET_ACTIVITY_ID, marketActivityId
		);
	}
	
	public List<TGetActivityRecord> findByGetActivityId(Object getActivityId
	) {
		return findByProperty(GET_ACTIVITY_ID, getActivityId
		);
	}
	
	public List<TGetActivityRecord> findByOrderId(Object orderId
	) {
		return findByProperty(ORDER_ID, orderId
		);
	}
	
	public List<TGetActivityRecord> findByGoodName(Object goodName
	) {
		return findByProperty(GOOD_NAME, goodName
		);
	}
	
	public List<TGetActivityRecord> findByStatus(Object status
	) {
		return findByProperty(STATUS, status
		);
	}
	

    

}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;

import static org.hibernate.criterion.Example.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TVBlessingActivityRecord entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TVBlessingActivityRecord
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TVBlessingActivityRecordDAO extends HibernateGenericDao<TVBlessingActivityRecord,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TVBlessingActivityRecordDAO.class);
		//property constants
	public static final String USER_ID = "userId";
	public static final String MALL_ID = "mallId";
	public static final String MARKET_PLAN_ID = "marketPlanId";
	public static final String MARKET_ACTIVITY_ID = "marketActivityId";
	public static final String VBLESSING_ACTIVITY_ID = "vblessingActivityId";
	public static final String ORDER_ID = "orderId";
	public static final String STATUS = "status";
	public static final String BLESSING_INFO_ID = "blessingInfoId";


	
    public int countSqlResult(final String sql, final Object... values) {
		return super.countSqlResult(sql, values);
	}
   
    
    public TVBlessingActivityRecord findById( java.lang.Long id) {
        log.debug("getting TVBlessingActivityRecord instance with id: " + id);
        try {
            TVBlessingActivityRecord instance = (TVBlessingActivityRecord) getSession()
                    .get("com.vveplat.dao.business.models.TVBlessingActivityRecord", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TVBlessingActivityRecord> findByExample(TVBlessingActivityRecord instance) {
        log.debug("finding TVBlessingActivityRecord instance by example");
        try {
            List<TVBlessingActivityRecord> results = (List<TVBlessingActivityRecord>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TVBlessingActivityRecord")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TVBlessingActivityRecord> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List<TVBlessingActivityRecord> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<TVBlessingActivityRecord> findByMarketPlanId(Object marketPlanId
	) {
		return findByProperty(MARKET_PLAN_ID, marketPlanId
		);
	}
	
	public List<TVBlessingActivityRecord> findByMarketActivityId(Object marketActivityId
	) {
		return findByProperty(MARKET_ACTIVITY_ID, marketActivityId
		);
	}
	
	public List<TVBlessingActivityRecord> findByVblessingActivityId(Object vblessingActivityId
	) {
		return findByProperty(VBLESSING_ACTIVITY_ID, vblessingActivityId
		);
	}
	
	public List<TVBlessingActivityRecord> findByOrderId(Object orderId
	) {
		return findByProperty(ORDER_ID, orderId
		);
	}
	
	public List<TVBlessingActivityRecord> findByStatus(Object status
	) {
		return findByProperty(STATUS, status
		);
	}
	
	public List<TVBlessingActivityRecord> findByBlessingInfoId(Object blessingInfoId
	) {
		return findByProperty(BLESSING_INFO_ID, blessingInfoId
		);
	}
	

    

}
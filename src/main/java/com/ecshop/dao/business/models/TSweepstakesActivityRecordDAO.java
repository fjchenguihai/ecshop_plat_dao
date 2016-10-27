package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TSweepstakesActivityRecord entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TSweepstakesActivityRecord
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TSweepstakesActivityRecordDAO extends HibernateGenericDao<TSweepstakesActivityRecord,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TSweepstakesActivityRecordDAO.class);
		//property constants
	public static final String USER_ID = "userId";
	public static final String MALL_ID = "mallId";
	public static final String MARKET_PLAN_ID = "marketPlanId";
	public static final String MARKET_ACTIVITY_ID = "marketActivityId";
	public static final String SWEEPSTAKES_ACTIVITY_ID = "sweepstakesActivityId";
	public static final String SWEEPSTAKES_AWARD_ID = "sweepstakesAwardId";
	public static final String ORDER_ID = "orderId";
	public static final String STATUS = "status";
	public static final String PROVINCE_ID = "provinceId";
	public static final String CITY_ID = "cityId";
	public static final String DISTRICT_ID = "districtId";
	public static final String DELIVERS_ADDRESS = "deliversAddress";
	public static final String ADDRESSEE = "addressee";
	public static final String TELEPHONE = "telephone";



    
   
    
    public TSweepstakesActivityRecord findById( java.lang.Long id) {
        log.debug("getting TSweepstakesActivityRecord instance with id: " + id);
        try {
            TSweepstakesActivityRecord instance = (TSweepstakesActivityRecord) getSession()
                    .get("com.vveplat.dao.business.models.TSweepstakesActivityRecord", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TSweepstakesActivityRecord> findByExample(TSweepstakesActivityRecord instance) {
        log.debug("finding TSweepstakesActivityRecord instance by example");
        try {
            List<TSweepstakesActivityRecord> results = (List<TSweepstakesActivityRecord>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TSweepstakesActivityRecord")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TSweepstakesActivityRecord> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List<TSweepstakesActivityRecord> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<TSweepstakesActivityRecord> findByMarketPlanId(Object marketPlanId
	) {
		return findByProperty(MARKET_PLAN_ID, marketPlanId
		);
	}
	
	public List<TSweepstakesActivityRecord> findByMarketActivityId(Object marketActivityId
	) {
		return findByProperty(MARKET_ACTIVITY_ID, marketActivityId
		);
	}
	
	public List<TSweepstakesActivityRecord> findBySweepstakesActivityId(Object sweepstakesActivityId
	) {
		return findByProperty(SWEEPSTAKES_ACTIVITY_ID, sweepstakesActivityId
		);
	}
	
	public List<TSweepstakesActivityRecord> findBySweepstakesAwardId(Object sweepstakesAwardId
	) {
		return findByProperty(SWEEPSTAKES_AWARD_ID, sweepstakesAwardId
		);
	}
	
	public List<TSweepstakesActivityRecord> findByOrderId(Object orderId
	) {
		return findByProperty(ORDER_ID, orderId
		);
	}
	
	public List<TSweepstakesActivityRecord> findByStatus(Object status
	) {
		return findByProperty(STATUS, status
		);
	}
	
	public List<TSweepstakesActivityRecord> findByProvinceId(Object provinceId
	) {
		return findByProperty(PROVINCE_ID, provinceId
		);
	}
	
	public List<TSweepstakesActivityRecord> findByCityId(Object cityId
	) {
		return findByProperty(CITY_ID, cityId
		);
	}
	
	public List<TSweepstakesActivityRecord> findByDistrictId(Object districtId
	) {
		return findByProperty(DISTRICT_ID, districtId
		);
	}
	
	public List<TSweepstakesActivityRecord> findByDeliversAddress(Object deliversAddress
	) {
		return findByProperty(DELIVERS_ADDRESS, deliversAddress
		);
	}
	
	public List<TSweepstakesActivityRecord> findByAddressee(Object addressee
	) {
		return findByProperty(ADDRESSEE, addressee
		);
	}
	
	public List<TSweepstakesActivityRecord> findByTelephone(Object telephone
	) {
		return findByProperty(TELEPHONE, telephone
		);
	}
	

    

}
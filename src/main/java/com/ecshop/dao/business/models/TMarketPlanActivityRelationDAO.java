package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TMarketPlanActivityRelation entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TMarketPlanActivityRelation
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TMarketPlanActivityRelationDAO extends HibernateGenericDao<TMarketPlanActivityRelation,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TMarketPlanActivityRelationDAO.class);
		//property constants
	public static final String MARKET_PLAN_ID = "marketPlanId";
	public static final String MARKET_ACTIVITY_ID = "marketActivityId";
	public static final String GENERATE_MODE = "generateMode";
	public static final String AMOUNT = "amount";



    
   
    
    public TMarketPlanActivityRelation findById( java.lang.Long id) {
        log.debug("getting TMarketPlanActivityRelation instance with id: " + id);
        try {
            TMarketPlanActivityRelation instance = (TMarketPlanActivityRelation) getSession()
                    .get("com.vveplat.dao.business.models.TMarketPlanActivityRelation", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TMarketPlanActivityRelation> findByExample(TMarketPlanActivityRelation instance) {
        log.debug("finding TMarketPlanActivityRelation instance by example");
        try {
            List<TMarketPlanActivityRelation> results = (List<TMarketPlanActivityRelation>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TMarketPlanActivityRelation")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TMarketPlanActivityRelation> findByMarketPlanId(Object marketPlanId
	) {
		return findByProperty(MARKET_PLAN_ID, marketPlanId
		);
	}
	
	public List<TMarketPlanActivityRelation> findByMarketActivityId(Object marketActivityId
	) {
		return findByProperty(MARKET_ACTIVITY_ID, marketActivityId
		);
	}
	
	public List<TMarketPlanActivityRelation> findByGenerateMode(Object generateMode
	) {
		return findByProperty(GENERATE_MODE, generateMode
		);
	}
	
	public List<TMarketPlanActivityRelation> findByAmount(Object amount
	) {
		return findByProperty(AMOUNT, amount
		);
	}
	

    

}
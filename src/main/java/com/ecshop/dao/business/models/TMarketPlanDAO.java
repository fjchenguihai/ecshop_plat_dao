package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TMarketPlan entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TMarketPlan
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TMarketPlanDAO extends HibernateGenericDao<TMarketPlan,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TMarketPlanDAO.class);
		//property constants
	public static final String MARKET_PLAN_NAME = "marketPlanName";
	public static final String MALL_ID = "mallId";
	public static final String CRE_USER_ID = "creUserId";
	public static final String MARKET_PLAN_PICTURE = "marketPlanPicture";
	public static final String MARKET_PLAN_REMARK = "marketPlanRemark";
	public static final String MARKET_PLAN_RULE_REMARK = "marketPlanRuleRemark";
	public static final String MARKET_PLAN_RULE_DETAIL = "marketPlanRuleDetail";



    
   
    
    public TMarketPlan findById( java.lang.Long id) {
        log.debug("getting TMarketPlan instance with id: " + id);
        try {
            TMarketPlan instance = (TMarketPlan) getSession()
                    .get("com.vveplat.dao.business.models.TMarketPlan", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TMarketPlan> findByExample(TMarketPlan instance) {
        log.debug("finding TMarketPlan instance by example");
        try {
            List<TMarketPlan> results = (List<TMarketPlan>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TMarketPlan")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TMarketPlan> findByMarketPlanName(Object marketPlanName
	) {
		return findByProperty(MARKET_PLAN_NAME, marketPlanName
		);
	}
	
	public List<TMarketPlan> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<TMarketPlan> findByCreUserId(Object creUserId
	) {
		return findByProperty(CRE_USER_ID, creUserId
		);
	}
	
	public List<TMarketPlan> findByMarketPlanPicture(Object marketPlanPicture
	) {
		return findByProperty(MARKET_PLAN_PICTURE, marketPlanPicture
		);
	}
	
	public List<TMarketPlan> findByMarketPlanRemark(Object marketPlanRemark
	) {
		return findByProperty(MARKET_PLAN_REMARK, marketPlanRemark
		);
	}
	
	public List<TMarketPlan> findByMarketPlanRuleRemark(Object marketPlanRuleRemark
	) {
		return findByProperty(MARKET_PLAN_RULE_REMARK, marketPlanRuleRemark
		);
	}
	
	public List<TMarketPlan> findByMarketPlanRuleDetail(Object marketPlanRuleDetail
	) {
		return findByProperty(MARKET_PLAN_RULE_DETAIL, marketPlanRuleDetail
		);
	}
	

    

}
package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TMarketActivitySweepstakes entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TMarketActivitySweepstakes
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TMarketActivitySweepstakesDAO extends HibernateGenericDao<TMarketActivitySweepstakes,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TMarketActivitySweepstakesDAO.class);
		//property constants
	public static final String MARKET_ACTIVITY_ID = "marketActivityId";
	public static final String PROBABILITY = "probability";
	public static final String REMARK = "remark";
	public static final String PICTURE = "picture";



    
   
    
    public TMarketActivitySweepstakes findById( java.lang.Long id) {
        log.debug("getting TMarketActivitySweepstakes instance with id: " + id);
        try {
            TMarketActivitySweepstakes instance = (TMarketActivitySweepstakes) getSession()
                    .get("com.vveplat.dao.business.models.TMarketActivitySweepstakes", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TMarketActivitySweepstakes> findByExample(TMarketActivitySweepstakes instance) {
        log.debug("finding TMarketActivitySweepstakes instance by example");
        try {
            List<TMarketActivitySweepstakes> results = (List<TMarketActivitySweepstakes>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TMarketActivitySweepstakes")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TMarketActivitySweepstakes> findByMarketActivityId(Object marketActivityId
	) {
		return findByProperty(MARKET_ACTIVITY_ID, marketActivityId
		);
	}
	
	public List<TMarketActivitySweepstakes> findByProbability(Object probability
	) {
		return findByProperty(PROBABILITY, probability
		);
	}
	
	public List<TMarketActivitySweepstakes> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	
	public List<TMarketActivitySweepstakes> findByPicture(Object picture
	) {
		return findByProperty(PICTURE, picture
		);
	}
	

    

}
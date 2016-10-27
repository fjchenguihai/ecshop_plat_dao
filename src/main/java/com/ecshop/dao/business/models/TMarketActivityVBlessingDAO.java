package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TMarketActivityVBlessing entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TMarketActivityVBlessing
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TMarketActivityVBlessingDAO extends HibernateGenericDao<TMarketActivityVBlessing,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TMarketActivityVBlessingDAO.class);
		//property constants
	public static final String MARKET_ACTIVITY_ID = "marketActivityId";
	public static final String PICTURE = "picture";
	public static final String REMARK = "remark";



    
   
    
    public TMarketActivityVBlessing findById( java.lang.Long id) {
        log.debug("getting TMarketActivityVBlessing instance with id: " + id);
        try {
            TMarketActivityVBlessing instance = (TMarketActivityVBlessing) getSession()
                    .get("com.vveplat.dao.business.models.TMarketActivityVBlessing", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TMarketActivityVBlessing> findByExample(TMarketActivityVBlessing instance) {
        log.debug("finding TMarketActivityVBlessing instance by example");
        try {
            List<TMarketActivityVBlessing> results = (List<TMarketActivityVBlessing>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TMarketActivityVBlessing")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TMarketActivityVBlessing> findByMarketActivityId(Object marketActivityId
	) {
		return findByProperty(MARKET_ACTIVITY_ID, marketActivityId
		);
	}
	
	public List<TMarketActivityVBlessing> findByPicture(Object picture
	) {
		return findByProperty(PICTURE, picture
		);
	}
	
	public List<TMarketActivityVBlessing> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	

    

}
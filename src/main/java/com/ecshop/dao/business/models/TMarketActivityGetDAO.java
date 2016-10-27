package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TMarketActivityGet entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TMarketActivityGet
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TMarketActivityGetDAO extends HibernateGenericDao<TMarketActivityGet,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TMarketActivityGetDAO.class);
		//property constants
	public static final String MARKET_ACTIVITY_ID = "marketActivityId";
	public static final String GOOD_NAME = "goodName";
	public static final String PRICE = "price";
	public static final String PICTURE = "picture";
	public static final String REMARK = "remark";



    
   
    
    public TMarketActivityGet findById( java.lang.Long id) {
        log.debug("getting TMarketActivityGet instance with id: " + id);
        try {
            TMarketActivityGet instance = (TMarketActivityGet) getSession()
                    .get("com.vveplat.dao.business.models.TMarketActivityGet", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TMarketActivityGet> findByExample(TMarketActivityGet instance) {
        log.debug("finding TMarketActivityGet instance by example");
        try {
            List<TMarketActivityGet> results = (List<TMarketActivityGet>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TMarketActivityGet")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TMarketActivityGet> findByMarketActivityId(Object marketActivityId
	) {
		return findByProperty(MARKET_ACTIVITY_ID, marketActivityId
		);
	}
	
	public List<TMarketActivityGet> findByGoodName(Object goodName
	) {
		return findByProperty(GOOD_NAME, goodName
		);
	}
	
	public List<TMarketActivityGet> findByPrice(Object price
	) {
		return findByProperty(PRICE, price
		);
	}
	
	public List<TMarketActivityGet> findByPicture(Object picture
	) {
		return findByProperty(PICTURE, picture
		);
	}
	
	public List<TMarketActivityGet> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	

    

}
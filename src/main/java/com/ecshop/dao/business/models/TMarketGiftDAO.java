package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TMarketGift entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TMarketGift
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TMarketGiftDAO extends HibernateGenericDao<TMarketGift,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TMarketGiftDAO.class);
		//property constants
	public static final String MALL_ID = "mallId";
	public static final String GIFT_NAME = "giftName";
	public static final String PRICE = "price";
	public static final String PICTRUE = "pictrue";
	public static final String REMARK = "remark";
	public static final String GIFT_UNIT = "giftUnit";



    
   
    
    public TMarketGift findById( java.lang.Long id) {
        log.debug("getting TMarketGift instance with id: " + id);
        try {
            TMarketGift instance = (TMarketGift) getSession()
                    .get("com.vveplat.dao.business.models.TMarketGift", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TMarketGift> findByExample(TMarketGift instance) {
        log.debug("finding TMarketGift instance by example");
        try {
            List<TMarketGift> results = (List<TMarketGift>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TMarketGift")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TMarketGift> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<TMarketGift> findByGiftName(Object giftName
	) {
		return findByProperty(GIFT_NAME, giftName
		);
	}
	
	public List<TMarketGift> findByPrice(Object price
	) {
		return findByProperty(PRICE, price
		);
	}
	
	public List<TMarketGift> findByPictrue(Object pictrue
	) {
		return findByProperty(PICTRUE, pictrue
		);
	}
	
	public List<TMarketGift> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	
	public List<TMarketGift> findByGiftUnit(Object giftUnit
	) {
		return findByProperty(GIFT_UNIT, giftUnit
		);
	}
	

    

}
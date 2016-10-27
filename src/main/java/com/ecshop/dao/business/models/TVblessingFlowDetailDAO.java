package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TVblessingFlowDetail entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TVblessingFlowDetail
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TVblessingFlowDetailDAO extends HibernateGenericDao<TVblessingFlowDetail,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TVblessingFlowDetailDAO.class);
		//property constants
	public static final String PAY_NO = "payNo";
	public static final String FROM_USER_ID = "fromUserId";
	public static final String TO_USER_ID = "toUserId";
	public static final String BLESSING_INFO_ID = "blessingInfoId";
	public static final String REMARK = "remark";
	public static final String MARKET_GIFT_ID = "marketGiftId";
	public static final String AMOUNT = "amount";
	public static final String MONEY = "money";
	public static final String PAY_STAUS = "payStaus";



    
   
    
    public TVblessingFlowDetail findById( java.lang.Long id) {
        log.debug("getting TVblessingFlowDetail instance with id: " + id);
        try {
            TVblessingFlowDetail instance = (TVblessingFlowDetail) getSession()
                    .get("com.vveplat.dao.business.models.TVblessingFlowDetail", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TVblessingFlowDetail> findByExample(TVblessingFlowDetail instance) {
        log.debug("finding TVblessingFlowDetail instance by example");
        try {
            List<TVblessingFlowDetail> results = (List<TVblessingFlowDetail>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TVblessingFlowDetail")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TVblessingFlowDetail> findByPayNo(Object payNo
	) {
		return findByProperty(PAY_NO, payNo
		);
	}
	
	public List<TVblessingFlowDetail> findByFromUserId(Object fromUserId
	) {
		return findByProperty(FROM_USER_ID, fromUserId
		);
	}
	
	public List<TVblessingFlowDetail> findByToUserId(Object toUserId
	) {
		return findByProperty(TO_USER_ID, toUserId
		);
	}
	
	public List<TVblessingFlowDetail> findByBlessingInfoId(Object blessingInfoId
	) {
		return findByProperty(BLESSING_INFO_ID, blessingInfoId
		);
	}
	
	public List<TVblessingFlowDetail> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	
	public List<TVblessingFlowDetail> findByMarketGiftId(Object marketGiftId
	) {
		return findByProperty(MARKET_GIFT_ID, marketGiftId
		);
	}
	
	public List<TVblessingFlowDetail> findByAmount(Object amount
	) {
		return findByProperty(AMOUNT, amount
		);
	}
	
	public List<TVblessingFlowDetail> findByMoney(Object money
	) {
		return findByProperty(MONEY, money
		);
	}
	
	public List<TVblessingFlowDetail> findByPayStaus(Object payStaus
	) {
		return findByProperty(PAY_STAUS, payStaus
		);
	}
	

    

}
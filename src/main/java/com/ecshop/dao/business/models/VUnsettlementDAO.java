package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for VUnsettlement entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.VUnsettlement
  * @author MyEclipse Persistence Tools 
 */
@Component
public class VUnsettlementDAO extends HibernateGenericDao<VUnsettlement,String> {
	     private static final Logger log = LoggerFactory.getLogger(VUnsettlementDAO.class);
		//property constants
	public static final String ORDER_ID = "orderId";
	public static final String ORDER_NUMBER = "orderNumber";
	public static final String AFTER_SALES_ID = "afterSalesId";
	public static final String MALL_ID = "mallId";
	public static final String MALL_NAME = "mallName";
	public static final String MONEY = "money";
	public static final String MALL_MONEY = "mallMoney";
	public static final String PROFIT_MONEY = "profitMoney";
	public static final String MALL_CHECK_STATUS = "mallCheckStatus";
	public static final String TYPE = "type";



    
   
    
    public VUnsettlement findById( java.lang.String id) {
        log.debug("getting VUnsettlement instance with id: " + id);
        try {
            VUnsettlement instance = (VUnsettlement) getSession()
                    .get("com.vveplat.dao.business.models.VUnsettlement", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<VUnsettlement> findByExample(VUnsettlement instance) {
        log.debug("finding VUnsettlement instance by example");
        try {
            List<VUnsettlement> results = (List<VUnsettlement>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.VUnsettlement")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<VUnsettlement> findByOrderId(Object orderId
	) {
		return findByProperty(ORDER_ID, orderId
		);
	}
	
	public List<VUnsettlement> findByOrderNumber(Object orderNumber
	) {
		return findByProperty(ORDER_NUMBER, orderNumber
		);
	}
	
	public List<VUnsettlement> findByAfterSalesId(Object afterSalesId
	) {
		return findByProperty(AFTER_SALES_ID, afterSalesId
		);
	}
	
	public List<VUnsettlement> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<VUnsettlement> findByMallName(Object mallName
	) {
		return findByProperty(MALL_NAME, mallName
		);
	}
	
	public List<VUnsettlement> findByMoney(Object money
	) {
		return findByProperty(MONEY, money
		);
	}
	
	public List<VUnsettlement> findByMallMoney(Object mallMoney
	) {
		return findByProperty(MALL_MONEY, mallMoney
		);
	}
	
	public List<VUnsettlement> findByProfitMoney(Object profitMoney
	) {
		return findByProperty(PROFIT_MONEY, profitMoney
		);
	}
	
	public List<VUnsettlement> findByMallCheckStatus(Object mallCheckStatus
	) {
		return findByProperty(MALL_CHECK_STATUS, mallCheckStatus
		);
	}
	
	public List<VUnsettlement> findByType(Object type
	) {
		return findByProperty(TYPE, type
		);
	}
	

    

}
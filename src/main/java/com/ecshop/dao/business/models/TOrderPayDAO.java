package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TOrderPay entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TOrderPay
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TOrderPayDAO extends HibernateGenericDao<TOrderPay,String> {
	     private static final Logger log = LoggerFactory.getLogger(TOrderPayDAO.class);
		//property constants
	public static final String PAY_ORDERS = "payOrders";
	public static final String PAY_MONEY = "payMoney";
	public static final String PAYSTURS = "paysturs";
	public static final String USER_ID = "userId";
	public static final String AUDIT_STATUS = "auditStatus";



    
   
    
    public TOrderPay findById( java.lang.String id) {
        log.debug("getting TOrderPay instance with id: " + id);
        try {
            TOrderPay instance = (TOrderPay) getSession()
                    .get("com.vveplat.dao.business.models.TOrderPay", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TOrderPay> findByExample(TOrderPay instance) {
        log.debug("finding TOrderPay instance by example");
        try {
            List<TOrderPay> results = (List<TOrderPay>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TOrderPay")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TOrderPay> findByPayOrders(Object payOrders
	) {
		return findByProperty(PAY_ORDERS, payOrders
		);
	}
	
	public List<TOrderPay> findByPayMoney(Object payMoney
	) {
		return findByProperty(PAY_MONEY, payMoney
		);
	}
	
	public List<TOrderPay> findByPaysturs(Object paysturs
	) {
		return findByProperty(PAYSTURS, paysturs
		);
	}
	
	public List<TOrderPay> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List<TOrderPay> findByAuditStatus(Object auditStatus
	) {
		return findByProperty(AUDIT_STATUS, auditStatus
		);
	}
	

    

}
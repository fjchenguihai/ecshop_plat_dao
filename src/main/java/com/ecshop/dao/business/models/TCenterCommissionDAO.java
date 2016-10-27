package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TCenterCommission entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TCenterCommission
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TCenterCommissionDAO extends HibernateGenericDao<TCenterCommission,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TCenterCommissionDAO.class);
		//property constants
	public static final String CENTER_ID = "centerId";
	public static final String COMMISSION_YEAR = "commissionYear";
	public static final String COMMISSION_MONTH = "commissionMonth";
	public static final String TOTAL_MONEY = "totalMoney";
	public static final String IS_PAY_COMMISSION = "isPayCommission";



    
   
    
    public TCenterCommission findById( java.lang.Long id) {
        log.debug("getting TCenterCommission instance with id: " + id);
        try {
            TCenterCommission instance = (TCenterCommission) getSession()
                    .get("com.vveplat.dao.business.models.TCenterCommission", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TCenterCommission> findByExample(TCenterCommission instance) {
        log.debug("finding TCenterCommission instance by example");
        try {
            List<TCenterCommission> results = (List<TCenterCommission>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TCenterCommission")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TCenterCommission> findByCenterId(Object centerId
	) {
		return findByProperty(CENTER_ID, centerId
		);
	}
	
	public List<TCenterCommission> findByCommissionYear(Object commissionYear
	) {
		return findByProperty(COMMISSION_YEAR, commissionYear
		);
	}
	
	public List<TCenterCommission> findByCommissionMonth(Object commissionMonth
	) {
		return findByProperty(COMMISSION_MONTH, commissionMonth
		);
	}
	
	public List<TCenterCommission> findByTotalMoney(Object totalMoney
	) {
		return findByProperty(TOTAL_MONEY, totalMoney
		);
	}
	
	public List<TCenterCommission> findByIsPayCommission(Object isPayCommission
	) {
		return findByProperty(IS_PAY_COMMISSION, isPayCommission
		);
	}
	

    

}
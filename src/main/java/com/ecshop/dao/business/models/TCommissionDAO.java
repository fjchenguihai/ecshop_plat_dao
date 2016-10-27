package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TCommission entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TCommission
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TCommissionDAO extends HibernateGenericDao<TCommission,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TCommissionDAO.class);
		//property constants
	public static final String USER_ID = "userId";
	public static final String COMMISSION_YEAR = "commissionYear";
	public static final String COMMISSION_MONTH = "commissionMonth";
	public static final String TOTAL_MONEY = "totalMoney";
	public static final String VMONEY = "vmoney";
	public static final String MMONEY = "mmoney";
	public static final String DISTRIBUTOR_MONEY = "distributorMoney";
	public static final String DIRECT_MONEY = "directMoney";
	public static final String INDIRECT_MONEY = "indirectMoney";
	public static final String TAXATION = "taxation";
	public static final String IS_PAY_COMMISSION = "isPayCommission";
	public static final String OFFLINE_MONEY = "offlineMoney";



    
   
    
    public TCommission findById( java.lang.Long id) {
        log.debug("getting TCommission instance with id: " + id);
        try {
            TCommission instance = (TCommission) getSession()
                    .get("com.vveplat.dao.business.models.TCommission", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TCommission> findByExample(TCommission instance) {
        log.debug("finding TCommission instance by example");
        try {
            List<TCommission> results = (List<TCommission>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TCommission")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TCommission> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List<TCommission> findByCommissionYear(Object commissionYear
	) {
		return findByProperty(COMMISSION_YEAR, commissionYear
		);
	}
	
	public List<TCommission> findByCommissionMonth(Object commissionMonth
	) {
		return findByProperty(COMMISSION_MONTH, commissionMonth
		);
	}
	
	public List<TCommission> findByTotalMoney(Object totalMoney
	) {
		return findByProperty(TOTAL_MONEY, totalMoney
		);
	}
	
	public List<TCommission> findByVmoney(Object vmoney
	) {
		return findByProperty(VMONEY, vmoney
		);
	}
	
	public List<TCommission> findByMmoney(Object mmoney
	) {
		return findByProperty(MMONEY, mmoney
		);
	}
	
	public List<TCommission> findByDistributorMoney(Object distributorMoney
	) {
		return findByProperty(DISTRIBUTOR_MONEY, distributorMoney
		);
	}
	
	public List<TCommission> findByDirectMoney(Object directMoney
	) {
		return findByProperty(DIRECT_MONEY, directMoney
		);
	}
	
	public List<TCommission> findByIndirectMoney(Object indirectMoney
	) {
		return findByProperty(INDIRECT_MONEY, indirectMoney
		);
	}
	
	public List<TCommission> findByTaxation(Object taxation
	) {
		return findByProperty(TAXATION, taxation
		);
	}
	
	public List<TCommission> findByIsPayCommission(Object isPayCommission
	) {
		return findByProperty(IS_PAY_COMMISSION, isPayCommission
		);
	}
	
	public List<TCommission> findByOfflineMoney(Object offlineMoney
	) {
		return findByProperty(OFFLINE_MONEY, offlineMoney
		);
	}
	

    

}
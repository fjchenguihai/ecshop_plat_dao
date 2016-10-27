package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TMallProfit entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TMallProfit
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TMallProfitDAO extends HibernateGenericDao<TMallProfit,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TMallProfitDAO.class);
		//property constants
	public static final String MALL_ID = "mallId";
	public static final String DIRECT_COMMISSION = "directCommission";
	public static final String INDIRECT_COMMISSION = "indirectCommission";
	public static final String SERVICE_COMMISSION = "serviceCommission";
	public static final String OPERATION_COMMISSION = "operationCommission";
	public static final String PLATFORM_COMMISSION = "platformCommission";
	public static final String REGION_COMMISSION = "regionCommission";



    
   
    
    public TMallProfit findById( java.lang.Long id) {
        log.debug("getting TMallProfit instance with id: " + id);
        try {
            TMallProfit instance = (TMallProfit) getSession()
                    .get("com.vveplat.dao.business.models.TMallProfit", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TMallProfit> findByExample(TMallProfit instance) {
        log.debug("finding TMallProfit instance by example");
        try {
            List<TMallProfit> results = (List<TMallProfit>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TMallProfit")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TMallProfit> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<TMallProfit> findByDirectCommission(Object directCommission
	) {
		return findByProperty(DIRECT_COMMISSION, directCommission
		);
	}
	
	public List<TMallProfit> findByIndirectCommission(Object indirectCommission
	) {
		return findByProperty(INDIRECT_COMMISSION, indirectCommission
		);
	}
	
	public List<TMallProfit> findByServiceCommission(Object serviceCommission
	) {
		return findByProperty(SERVICE_COMMISSION, serviceCommission
		);
	}
	
	public List<TMallProfit> findByOperationCommission(Object operationCommission
	) {
		return findByProperty(OPERATION_COMMISSION, operationCommission
		);
	}
	
	public List<TMallProfit> findByPlatformCommission(Object platformCommission
	) {
		return findByProperty(PLATFORM_COMMISSION, platformCommission
		);
	}
	
	public List<TMallProfit> findByRegionCommission(Object regionCommission
	) {
		return findByProperty(REGION_COMMISSION, regionCommission
		);
	}
	

    

}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TCategoryProfitItem entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TCategoryProfitItem
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TCategoryProfitItemDAO extends HibernateGenericDao<TCategoryProfitItem,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TCategoryProfitItemDAO.class);
		//property constants
	public static final String CATEGORY_ID = "categoryId";
	public static final String MEMBER_COMMISSION = "memberCommission";
	public static final String PLAT_COMMISSION = "platCommission";
	public static final String VCOMMISSION = "vcommission";
	public static final String DCOMMISSION = "dcommission";
	public static final String DIRECT_COMMISSION = "directCommission";
	public static final String INDIRECT_COMMISSION = "indirectCommission";
	public static final String SERVICE_COMMISSION = "serviceCommission";
	public static final String OPERATION_COMMISSION = "operationCommission";
	public static final String PLATFORM_COMMISSION = "platformCommission";
	public static final String REGION_COMMISSION = "regionCommission";



    
   
    
    public TCategoryProfitItem findById( java.lang.Long id) {
        log.debug("getting TCategoryProfitItem instance with id: " + id);
        try {
            TCategoryProfitItem instance = (TCategoryProfitItem) getSession()
                    .get("com.vveplat.dao.business.models.TCategoryProfitItem", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TCategoryProfitItem> findByExample(TCategoryProfitItem instance) {
        log.debug("finding TCategoryProfitItem instance by example");
        try {
            List<TCategoryProfitItem> results = (List<TCategoryProfitItem>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TCategoryProfitItem")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TCategoryProfitItem> findByCategoryId(Object categoryId
	) {
		return findByProperty(CATEGORY_ID, categoryId
		);
	}
	
	public List<TCategoryProfitItem> findByMemberCommission(Object memberCommission
	) {
		return findByProperty(MEMBER_COMMISSION, memberCommission
		);
	}
	
	public List<TCategoryProfitItem> findByPlatCommission(Object platCommission
	) {
		return findByProperty(PLAT_COMMISSION, platCommission
		);
	}
	
	public List<TCategoryProfitItem> findByVcommission(Object vcommission
	) {
		return findByProperty(VCOMMISSION, vcommission
		);
	}
	
	public List<TCategoryProfitItem> findByDcommission(Object dcommission
	) {
		return findByProperty(DCOMMISSION, dcommission
		);
	}
	
	public List<TCategoryProfitItem> findByDirectCommission(Object directCommission
	) {
		return findByProperty(DIRECT_COMMISSION, directCommission
		);
	}
	
	public List<TCategoryProfitItem> findByIndirectCommission(Object indirectCommission
	) {
		return findByProperty(INDIRECT_COMMISSION, indirectCommission
		);
	}
	
	public List<TCategoryProfitItem> findByServiceCommission(Object serviceCommission
	) {
		return findByProperty(SERVICE_COMMISSION, serviceCommission
		);
	}
	
	public List<TCategoryProfitItem> findByOperationCommission(Object operationCommission
	) {
		return findByProperty(OPERATION_COMMISSION, operationCommission
		);
	}
	
	public List<TCategoryProfitItem> findByPlatformCommission(Object platformCommission
	) {
		return findByProperty(PLATFORM_COMMISSION, platformCommission
		);
	}
	
	public List<TCategoryProfitItem> findByRegionCommission(Object regionCommission
	) {
		return findByProperty(REGION_COMMISSION, regionCommission
		);
	}
	

    

}
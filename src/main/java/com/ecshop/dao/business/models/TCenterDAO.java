package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TCenter entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TCenter
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TCenterDAO extends HibernateGenericDao<TCenter,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TCenterDAO.class);
		//property constants
	public static final String UP_CENTER_ID = "upCenterId";
	public static final String CENTER_NAME = "centerName";
	public static final String REMARK = "remark";
	public static final String ADDRESS = "address";
	public static final String POSITION = "position";
	public static final String STATUS = "status";
	public static final String CENTER_BANK_ID = "centerBankId";
	public static final String CENTER_TYPE = "centerType";
	public static final String IS_DEFAULT = "isDefault";



    
   
    
    public TCenter findById( java.lang.Long id) {
        log.debug("getting TCenter instance with id: " + id);
        try {
            TCenter instance = (TCenter) getSession()
                    .get("com.vveplat.dao.business.models.TCenter", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TCenter> findByExample(TCenter instance) {
        log.debug("finding TCenter instance by example");
        try {
            List<TCenter> results = (List<TCenter>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TCenter")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TCenter> findByUpCenterId(Object upCenterId
	) {
		return findByProperty(UP_CENTER_ID, upCenterId
		);
	}
	
	public List<TCenter> findByCenterName(Object centerName
	) {
		return findByProperty(CENTER_NAME, centerName
		);
	}
	
	public List<TCenter> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	
	public List<TCenter> findByAddress(Object address
	) {
		return findByProperty(ADDRESS, address
		);
	}
	
	public List<TCenter> findByPosition(Object position
	) {
		return findByProperty(POSITION, position
		);
	}
	
	public List<TCenter> findByStatus(Object status
	) {
		return findByProperty(STATUS, status
		);
	}
	
	public List<TCenter> findByCenterBankId(Object centerBankId
	) {
		return findByProperty(CENTER_BANK_ID, centerBankId
		);
	}
	
	public List<TCenter> findByCenterType(Object centerType
	) {
		return findByProperty(CENTER_TYPE, centerType
		);
	}
	
	public List<TCenter> findByIsDefault(Object isDefault
	) {
		return findByProperty(IS_DEFAULT, isDefault
		);
	}
	

    

}
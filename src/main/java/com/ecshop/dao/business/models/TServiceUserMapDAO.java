package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TServiceUserMap entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TServiceUserMap
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TServiceUserMapDAO extends HibernateGenericDao<TServiceUserMap,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TServiceUserMapDAO.class);
		//property constants
	public static final String SERVICE_CENTER_ID = "serviceCenterId";
	public static final String USER_ID = "userId";



    
   
    
    public TServiceUserMap findById( java.lang.Long id) {
        log.debug("getting TServiceUserMap instance with id: " + id);
        try {
            TServiceUserMap instance = (TServiceUserMap) getSession()
                    .get("com.vveplat.dao.business.models.TServiceUserMap", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TServiceUserMap> findByExample(TServiceUserMap instance) {
        log.debug("finding TServiceUserMap instance by example");
        try {
            List<TServiceUserMap> results = (List<TServiceUserMap>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TServiceUserMap")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TServiceUserMap> findByServiceCenterId(Object serviceCenterId
	) {
		return findByProperty(SERVICE_CENTER_ID, serviceCenterId
		);
	}
	
	public List<TServiceUserMap> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	

    

}
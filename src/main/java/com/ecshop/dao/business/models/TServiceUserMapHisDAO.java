package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TServiceUserMapHis entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TServiceUserMapHis
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TServiceUserMapHisDAO extends HibernateGenericDao<TServiceUserMapHis,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TServiceUserMapHisDAO.class);
		//property constants
	public static final String SERVICE_CENTER_ID = "serviceCenterId";
	public static final String USER_ID = "userId";



    
   
    
    public TServiceUserMapHis findById( java.lang.Long id) {
        log.debug("getting TServiceUserMapHis instance with id: " + id);
        try {
            TServiceUserMapHis instance = (TServiceUserMapHis) getSession()
                    .get("com.vveplat.dao.business.models.TServiceUserMapHis", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TServiceUserMapHis> findByExample(TServiceUserMapHis instance) {
        log.debug("finding TServiceUserMapHis instance by example");
        try {
            List<TServiceUserMapHis> results = (List<TServiceUserMapHis>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TServiceUserMapHis")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TServiceUserMapHis> findByServiceCenterId(Object serviceCenterId
	) {
		return findByProperty(SERVICE_CENTER_ID, serviceCenterId
		);
	}
	
	public List<TServiceUserMapHis> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	

    

}
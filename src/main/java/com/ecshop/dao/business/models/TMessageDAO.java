package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TMessage entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TMessage
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TMessageDAO extends HibernateGenericDao<TMessage,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TMessageDAO.class);
		//property constants
	public static final String MALL_ID = "mallId";
	public static final String ADMIN_ID = "adminId";
	public static final String STATION_ID = "stationId";
	public static final String TITLE = "title";
	public static final String TYPE = "type";
	public static final String CONTENT = "content";
	public static final String STATUS = "status";
	public static final String USER_TYPE_IDS = "userTypeIds";



    
   
    
    public TMessage findById( java.lang.Long id) {
        log.debug("getting TMessage instance with id: " + id);
        try {
            TMessage instance = (TMessage) getSession()
                    .get("com.vveplat.dao.business.models.TMessage", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TMessage> findByExample(TMessage instance) {
        log.debug("finding TMessage instance by example");
        try {
            List<TMessage> results = (List<TMessage>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TMessage")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TMessage> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<TMessage> findByAdminId(Object adminId
	) {
		return findByProperty(ADMIN_ID, adminId
		);
	}
	
	public List<TMessage> findByStationId(Object stationId
	) {
		return findByProperty(STATION_ID, stationId
		);
	}
	
	public List<TMessage> findByTitle(Object title
	) {
		return findByProperty(TITLE, title
		);
	}
	
	public List<TMessage> findByType(Object type
	) {
		return findByProperty(TYPE, type
		);
	}
	
	public List<TMessage> findByContent(Object content
	) {
		return findByProperty(CONTENT, content
		);
	}
	
	public List<TMessage> findByStatus(Object status
	) {
		return findByProperty(STATUS, status
		);
	}
	
	public List<TMessage> findByUserTypeIds(Object userTypeIds
	) {
		return findByProperty(USER_TYPE_IDS, userTypeIds
		);
	}
	

    

}
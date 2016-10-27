package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TInvitation entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TInvitation
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TInvitationDAO extends HibernateGenericDao<TInvitation,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TInvitationDAO.class);
		//property constants
	public static final String INVITATION_CODE = "invitationCode";
	public static final String MALL_ID = "mallId";
	public static final String USERTYPE_ID = "usertypeId";
	public static final String FROM_USER_ID = "fromUserId";
	public static final String TO_USER_ID = "toUserId";
	public static final String STATUS = "status";
	public static final String SOURCE = "source";



    
   
    
    public TInvitation findById( java.lang.Long id) {
        log.debug("getting TInvitation instance with id: " + id);
        try {
            TInvitation instance = (TInvitation) getSession()
                    .get("com.vveplat.dao.business.models.TInvitation", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TInvitation> findByExample(TInvitation instance) {
        log.debug("finding TInvitation instance by example");
        try {
            List<TInvitation> results = (List<TInvitation>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TInvitation")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TInvitation> findByInvitationCode(Object invitationCode
	) {
		return findByProperty(INVITATION_CODE, invitationCode
		);
	}
	
	public List<TInvitation> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<TInvitation> findByUsertypeId(Object usertypeId
	) {
		return findByProperty(USERTYPE_ID, usertypeId
		);
	}
	
	public List<TInvitation> findByFromUserId(Object fromUserId
	) {
		return findByProperty(FROM_USER_ID, fromUserId
		);
	}
	
	public List<TInvitation> findByToUserId(Object toUserId
	) {
		return findByProperty(TO_USER_ID, toUserId
		);
	}
	
	public List<TInvitation> findByStatus(Object status
	) {
		return findByProperty(STATUS, status
		);
	}
	
	public List<TInvitation> findBySource(Object source
	) {
		return findByProperty(SOURCE, source
		);
	}
	

    

}
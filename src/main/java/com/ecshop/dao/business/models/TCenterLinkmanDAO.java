package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TCenterLinkman entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TCenterLinkman
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TCenterLinkmanDAO extends HibernateGenericDao<TCenterLinkman,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TCenterLinkmanDAO.class);
		//property constants
	public static final String CENTER_ID = "centerId";
	public static final String USER_NAME = "userName";
	public static final String MOBILE = "mobile";
	public static final String EMAIL = "email";



    
   
    
    public TCenterLinkman findById( java.lang.Long id) {
        log.debug("getting TCenterLinkman instance with id: " + id);
        try {
            TCenterLinkman instance = (TCenterLinkman) getSession()
                    .get("com.vveplat.dao.business.models.TCenterLinkman", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TCenterLinkman> findByExample(TCenterLinkman instance) {
        log.debug("finding TCenterLinkman instance by example");
        try {
            List<TCenterLinkman> results = (List<TCenterLinkman>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TCenterLinkman")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TCenterLinkman> findByCenterId(Object centerId
	) {
		return findByProperty(CENTER_ID, centerId
		);
	}
	
	public List<TCenterLinkman> findByUserName(Object userName
	) {
		return findByProperty(USER_NAME, userName
		);
	}
	
	public List<TCenterLinkman> findByMobile(Object mobile
	) {
		return findByProperty(MOBILE, mobile
		);
	}
	
	public List<TCenterLinkman> findByEmail(Object email
	) {
		return findByProperty(EMAIL, email
		);
	}
	

    

}
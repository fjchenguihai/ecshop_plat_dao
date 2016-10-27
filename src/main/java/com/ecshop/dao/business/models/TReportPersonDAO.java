package com.ecshop.dao.business.models;

import java.util.Date;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TReportPerson entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TReportPerson
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TReportPersonDAO extends HibernateGenericDao<TReportPerson,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TReportPersonDAO.class);
		//property constants
	public static final String ATTENTION_INCREMENT = "attentionIncrement";
	public static final String USER_INCREMENT = "userIncrement";
	public static final String VINCREMENT = "vincrement";
	public static final String DINCREMENT = "dincrement";



    
   
    
    public TReportPerson findById( java.lang.Long id) {
        log.debug("getting TReportPerson instance with id: " + id);
        try {
            TReportPerson instance = (TReportPerson) getSession()
                    .get("com.vveplat.dao.business.models.TReportPerson", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TReportPerson> findByExample(TReportPerson instance) {
        log.debug("finding TReportPerson instance by example");
        try {
            List<TReportPerson> results = (List<TReportPerson>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TReportPerson")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TReportPerson> findByAttentionIncrement(Object attentionIncrement
	) {
		return findByProperty(ATTENTION_INCREMENT, attentionIncrement
		);
	}
	
	public List<TReportPerson> findByUserIncrement(Object userIncrement
	) {
		return findByProperty(USER_INCREMENT, userIncrement
		);
	}
	
	public List<TReportPerson> findByVincrement(Object vincrement
	) {
		return findByProperty(VINCREMENT, vincrement
		);
	}
	
	public List<TReportPerson> findByDincrement(Object dincrement
	) {
		return findByProperty(DINCREMENT, dincrement
		);
	}
	

    

}
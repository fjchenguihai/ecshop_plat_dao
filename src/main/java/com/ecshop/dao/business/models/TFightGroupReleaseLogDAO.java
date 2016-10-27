package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TFightGroupReleaseLog entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TFightGroupReleaseLog
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TFightGroupReleaseLogDAO extends HibernateGenericDao<TFightGroupReleaseLog,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TFightGroupReleaseLogDAO.class);
		//property constants
	public static final String GROUP_GOOD_ID = "groupGoodId";
	public static final String APPLY_USER_ID = "applyUserId";
	public static final String AUDIT_USER_ID = "auditUserId";
	public static final String REMARK = "remark";



    
   
    
    public TFightGroupReleaseLog findById( java.lang.Long id) {
        log.debug("getting TFightGroupReleaseLog instance with id: " + id);
        try {
            TFightGroupReleaseLog instance = (TFightGroupReleaseLog) getSession()
                    .get("com.vveplat.dao.business.models.TFightGroupReleaseLog", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TFightGroupReleaseLog> findByExample(TFightGroupReleaseLog instance) {
        log.debug("finding TFightGroupReleaseLog instance by example");
        try {
            List<TFightGroupReleaseLog> results = (List<TFightGroupReleaseLog>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TFightGroupReleaseLog")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TFightGroupReleaseLog> findByGroupGoodId(Object groupGoodId
	) {
		return findByProperty(GROUP_GOOD_ID, groupGoodId
		);
	}
	
	public List<TFightGroupReleaseLog> findByApplyUserId(Object applyUserId
	) {
		return findByProperty(APPLY_USER_ID, applyUserId
		);
	}
	
	public List<TFightGroupReleaseLog> findByAuditUserId(Object auditUserId
	) {
		return findByProperty(AUDIT_USER_ID, auditUserId
		);
	}
	
	public List<TFightGroupReleaseLog> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	

    

}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TPrivilegeReleaseLog entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TPrivilegeReleaseLog
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TPrivilegeReleaseLogDAO extends HibernateGenericDao<TPrivilegeReleaseLog,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TPrivilegeReleaseLogDAO.class);
		//property constants
	public static final String PRIVILEGE_GOOD_EXT_ID = "privilegeGoodExtId";
	public static final String APPLY_USER_ID = "applyUserId";
	public static final String AUDIT_USER_ID = "auditUserId";
	public static final String REMARK = "remark";



    
   
    
    public TPrivilegeReleaseLog findById( java.lang.Long id) {
        log.debug("getting TPrivilegeReleaseLog instance with id: " + id);
        try {
            TPrivilegeReleaseLog instance = (TPrivilegeReleaseLog) getSession()
                    .get("com.vveplat.dao.business.models.TPrivilegeReleaseLog", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TPrivilegeReleaseLog> findByExample(TPrivilegeReleaseLog instance) {
        log.debug("finding TPrivilegeReleaseLog instance by example");
        try {
            List<TPrivilegeReleaseLog> results = (List<TPrivilegeReleaseLog>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TPrivilegeReleaseLog")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TPrivilegeReleaseLog> findByPrivilegeGoodExtId(Object privilegeGoodExtId
	) {
		return findByProperty(PRIVILEGE_GOOD_EXT_ID, privilegeGoodExtId
		);
	}
	
	public List<TPrivilegeReleaseLog> findByApplyUserId(Object applyUserId
	) {
		return findByProperty(APPLY_USER_ID, applyUserId
		);
	}
	
	public List<TPrivilegeReleaseLog> findByAuditUserId(Object auditUserId
	) {
		return findByProperty(AUDIT_USER_ID, auditUserId
		);
	}
	
	public List<TPrivilegeReleaseLog> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	

    

}
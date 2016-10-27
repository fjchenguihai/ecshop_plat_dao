package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TBlessingInfo entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TBlessingInfo
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TBlessingInfoDAO extends HibernateGenericDao<TBlessingInfo,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TBlessingInfoDAO.class);
		//property constants
	public static final String USER_ID = "userId";
	public static final String REAL_NAME = "realName";
	public static final String MOBILE = "mobile";
	public static final String MEMORIAL_NAME = "memorialName";
	public static final String PICTURE1 = "picture1";
	public static final String PICTURE2 = "picture2";
	public static final String PICTURE3 = "picture3";
	public static final String REMARK = "remark";
	public static final String AUDIT_STATUS = "auditStatus";
	public static final String CATEGORY_ID = "categoryId";



    
   
    
    public TBlessingInfo findById( java.lang.Long id) {
        log.debug("getting TBlessingInfo instance with id: " + id);
        try {
            TBlessingInfo instance = (TBlessingInfo) getSession()
                    .get("com.vveplat.dao.business.models.TBlessingInfo", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TBlessingInfo> findByExample(TBlessingInfo instance) {
        log.debug("finding TBlessingInfo instance by example");
        try {
            List<TBlessingInfo> results = (List<TBlessingInfo>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TBlessingInfo")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TBlessingInfo> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List<TBlessingInfo> findByRealName(Object realName
	) {
		return findByProperty(REAL_NAME, realName
		);
	}
	
	public List<TBlessingInfo> findByMobile(Object mobile
	) {
		return findByProperty(MOBILE, mobile
		);
	}
	
	public List<TBlessingInfo> findByMemorialName(Object memorialName
	) {
		return findByProperty(MEMORIAL_NAME, memorialName
		);
	}
	
	public List<TBlessingInfo> findByPicture1(Object picture1
	) {
		return findByProperty(PICTURE1, picture1
		);
	}
	
	public List<TBlessingInfo> findByPicture2(Object picture2
	) {
		return findByProperty(PICTURE2, picture2
		);
	}
	
	public List<TBlessingInfo> findByPicture3(Object picture3
	) {
		return findByProperty(PICTURE3, picture3
		);
	}
	
	public List<TBlessingInfo> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	
	public List<TBlessingInfo> findByAuditStatus(Object auditStatus
	) {
		return findByProperty(AUDIT_STATUS, auditStatus
		);
	}
	
	public List<TBlessingInfo> findByCategoryId(Object categoryId
	) {
		return findByProperty(CATEGORY_ID, categoryId
		);
	}
	

    

}
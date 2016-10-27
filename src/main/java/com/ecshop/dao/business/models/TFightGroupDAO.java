package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TFightGroup entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TFightGroup
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TFightGroupDAO extends HibernateGenericDao<TFightGroup,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TFightGroupDAO.class);
		//property constants
	public static final String GROUP_STATUS = "groupStatus";
	public static final String GROUP_USER_NUM = "groupUserNum";
	public static final String GROUP_GOOD_NUM = "groupGoodNum";
	public static final String REMARK = "remark";



    
   
    
    public TFightGroup findById( java.lang.Long id) {
        log.debug("getting TFightGroup instance with id: " + id);
        try {
            TFightGroup instance = (TFightGroup) getSession()
                    .get("com.vveplat.dao.business.models.TFightGroup", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TFightGroup> findByExample(TFightGroup instance) {
        log.debug("finding TFightGroup instance by example");
        try {
            List<TFightGroup> results = (List<TFightGroup>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TFightGroup")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TFightGroup> findByGroupStatus(Object groupStatus
	) {
		return findByProperty(GROUP_STATUS, groupStatus
		);
	}
	
	public List<TFightGroup> findByGroupUserNum(Object groupUserNum
	) {
		return findByProperty(GROUP_USER_NUM, groupUserNum
		);
	}
	
	public List<TFightGroup> findByGroupGoodNum(Object groupGoodNum
	) {
		return findByProperty(GROUP_GOOD_NUM, groupGoodNum
		);
	}
	
	public List<TFightGroup> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	

    

}
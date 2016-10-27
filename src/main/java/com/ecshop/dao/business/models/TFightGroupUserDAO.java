package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TFightGroupUser entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TFightGroupUser
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TFightGroupUserDAO extends HibernateGenericDao<TFightGroupUser,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TFightGroupUserDAO.class);
		//property constants
	public static final String FIGHT_GROUP_ID = "fightGroupId";
	public static final String USER_ID = "userId";
	public static final String IS_HEAD = "isHead";
	public static final String HEAD_PIC = "headPic";
	public static final String NICKNAME = "nickname";
	public static final String REMARK = "remark";
	public static final String ORDER_ID = "orderId";
	public static final String STATUS = "status";



    
   
    
    public TFightGroupUser findById( java.lang.Long id) {
        log.debug("getting TFightGroupUser instance with id: " + id);
        try {
            TFightGroupUser instance = (TFightGroupUser) getSession()
                    .get("com.vveplat.dao.business.models.TFightGroupUser", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TFightGroupUser> findByExample(TFightGroupUser instance) {
        log.debug("finding TFightGroupUser instance by example");
        try {
            List<TFightGroupUser> results = (List<TFightGroupUser>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TFightGroupUser")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TFightGroupUser> findByFightGroupId(Object fightGroupId
	) {
		return findByProperty(FIGHT_GROUP_ID, fightGroupId
		);
	}
	
	public List<TFightGroupUser> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List<TFightGroupUser> findByIsHead(Object isHead
	) {
		return findByProperty(IS_HEAD, isHead
		);
	}
	
	public List<TFightGroupUser> findByHeadPic(Object headPic
	) {
		return findByProperty(HEAD_PIC, headPic
		);
	}
	
	public List<TFightGroupUser> findByNickname(Object nickname
	) {
		return findByProperty(NICKNAME, nickname
		);
	}
	
	public List<TFightGroupUser> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	
	public List<TFightGroupUser> findByOrderId(Object orderId
	) {
		return findByProperty(ORDER_ID, orderId
		);
	}
	
	public List<TFightGroupUser> findByStatus(Object status
	) {
		return findByProperty(STATUS, status
		);
	}
	

    

}
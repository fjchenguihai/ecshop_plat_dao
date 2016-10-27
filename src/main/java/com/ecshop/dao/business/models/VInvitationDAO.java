package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for VInvitation entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.VInvitation
  * @author MyEclipse Persistence Tools 
 */
@Component
public class VInvitationDAO extends HibernateGenericDao<VInvitation,Long> {
	     private static final Logger log = LoggerFactory.getLogger(VInvitationDAO.class);
		//property constants
	public static final String INVITATION_CODE = "invitationCode";
	public static final String MALL_ID = "mallId";
	public static final String USERTYPE_ID = "usertypeId";
	public static final String FROM_USER_ID = "fromUserId";
	public static final String TO_USER_ID = "toUserId";
	public static final String STATUS = "status";
	public static final String MALL_NAME = "mallName";
	public static final String MALL_NO = "mallNo";
	public static final String MALL_LOGO = "mallLogo";
	public static final String USERTYPE_NAME = "usertypeName";
	public static final String FROM_NICKNAME = "fromNickname";
	public static final String FROM_REAL_NAME = "fromRealName";
	public static final String FROM_PIC = "fromPic";
	public static final String TO_NICKNAME = "toNickname";
	public static final String TO_REAL_NAME = "toRealName";
	public static final String TO_PIC = "toPic";
	public static final String STATUS_DESC = "statusDesc";
	public static final String SOURCE = "source";



    
   
    
    public VInvitation findById( java.lang.Long id) {
        log.debug("getting VInvitation instance with id: " + id);
        try {
            VInvitation instance = (VInvitation) getSession()
                    .get("com.vveplat.dao.business.models.VInvitation", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<VInvitation> findByExample(VInvitation instance) {
        log.debug("finding VInvitation instance by example");
        try {
            List<VInvitation> results = (List<VInvitation>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.VInvitation")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<VInvitation> findByInvitationCode(Object invitationCode
	) {
		return findByProperty(INVITATION_CODE, invitationCode
		);
	}
	
	public List<VInvitation> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<VInvitation> findByUsertypeId(Object usertypeId
	) {
		return findByProperty(USERTYPE_ID, usertypeId
		);
	}
	
	public List<VInvitation> findByFromUserId(Object fromUserId
	) {
		return findByProperty(FROM_USER_ID, fromUserId
		);
	}
	
	public List<VInvitation> findByToUserId(Object toUserId
	) {
		return findByProperty(TO_USER_ID, toUserId
		);
	}
	
	public List<VInvitation> findByStatus(Object status
	) {
		return findByProperty(STATUS, status
		);
	}
	
	public List<VInvitation> findByMallName(Object mallName
	) {
		return findByProperty(MALL_NAME, mallName
		);
	}
	
	public List<VInvitation> findByMallNo(Object mallNo
	) {
		return findByProperty(MALL_NO, mallNo
		);
	}
	
	public List<VInvitation> findByMallLogo(Object mallLogo
	) {
		return findByProperty(MALL_LOGO, mallLogo
		);
	}
	
	public List<VInvitation> findByUsertypeName(Object usertypeName
	) {
		return findByProperty(USERTYPE_NAME, usertypeName
		);
	}
	
	public List<VInvitation> findByFromNickname(Object fromNickname
	) {
		return findByProperty(FROM_NICKNAME, fromNickname
		);
	}
	
	public List<VInvitation> findByFromRealName(Object fromRealName
	) {
		return findByProperty(FROM_REAL_NAME, fromRealName
		);
	}
	
	public List<VInvitation> findByFromPic(Object fromPic
	) {
		return findByProperty(FROM_PIC, fromPic
		);
	}
	
	public List<VInvitation> findByToNickname(Object toNickname
	) {
		return findByProperty(TO_NICKNAME, toNickname
		);
	}
	
	public List<VInvitation> findByToRealName(Object toRealName
	) {
		return findByProperty(TO_REAL_NAME, toRealName
		);
	}
	
	public List<VInvitation> findByToPic(Object toPic
	) {
		return findByProperty(TO_PIC, toPic
		);
	}
	
	public List<VInvitation> findByStatusDesc(Object statusDesc
	) {
		return findByProperty(STATUS_DESC, statusDesc
		);
	}
	
	public List<VInvitation> findBySource(Object source
	) {
		return findByProperty(SOURCE, source
		);
	}
	

    

}
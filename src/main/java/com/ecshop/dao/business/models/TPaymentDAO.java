package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TPayment entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TPayment
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TPaymentDAO extends HibernateGenericDao<TPayment,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TPaymentDAO.class);
		//property constants
	public static final String PAY_NO = "payNo";
	public static final String CHANNEL_TRANS_NO = "channelTransNo";
	public static final String FRONT_BACK_URL = "frontBackUrl";
	public static final String NOTE_URL = "noteUrl";
	public static final String CARD_NO = "cardNo";
	public static final String MALL_ID = "mallId";
	public static final String RESP_CODE = "respCode";
	public static final String RESP_MSG = "respMsg";
	public static final String TRANS_STATUS = "transStatus";
	public static final String TRANS_TYPE = "transType";
	public static final String TRANS_AMOUNT = "transAmount";
	public static final String PAY_CHANNEL_ID = "payChannelId";
	public static final String DETAIL_MSG = "detailMsg";
	public static final String USER_ID = "userId";
	public static final String PAY_AMOUNT = "payAmount";
	public static final String PAY_STATUS = "payStatus";
	public static final String REMARK = "remark";
	public static final String ORDER_PAY_TYPE = "orderPayType";



    
   
    
    public TPayment findById( java.lang.Long id) {
        log.debug("getting TPayment instance with id: " + id);
        try {
            TPayment instance = (TPayment) getSession()
                    .get("com.vveplat.dao.business.models.TPayment", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TPayment> findByExample(TPayment instance) {
        log.debug("finding TPayment instance by example");
        try {
            List<TPayment> results = (List<TPayment>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TPayment")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TPayment> findByPayNo(Object payNo
	) {
		return findByProperty(PAY_NO, payNo
		);
	}
	
	public List<TPayment> findByChannelTransNo(Object channelTransNo
	) {
		return findByProperty(CHANNEL_TRANS_NO, channelTransNo
		);
	}
	
	public List<TPayment> findByFrontBackUrl(Object frontBackUrl
	) {
		return findByProperty(FRONT_BACK_URL, frontBackUrl
		);
	}
	
	public List<TPayment> findByNoteUrl(Object noteUrl
	) {
		return findByProperty(NOTE_URL, noteUrl
		);
	}
	
	public List<TPayment> findByCardNo(Object cardNo
	) {
		return findByProperty(CARD_NO, cardNo
		);
	}
	
	public List<TPayment> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<TPayment> findByRespCode(Object respCode
	) {
		return findByProperty(RESP_CODE, respCode
		);
	}
	
	public List<TPayment> findByRespMsg(Object respMsg
	) {
		return findByProperty(RESP_MSG, respMsg
		);
	}
	
	public List<TPayment> findByTransStatus(Object transStatus
	) {
		return findByProperty(TRANS_STATUS, transStatus
		);
	}
	
	public List<TPayment> findByTransType(Object transType
	) {
		return findByProperty(TRANS_TYPE, transType
		);
	}
	
	public List<TPayment> findByTransAmount(Object transAmount
	) {
		return findByProperty(TRANS_AMOUNT, transAmount
		);
	}
	
	public List<TPayment> findByPayChannelId(Object payChannelId
	) {
		return findByProperty(PAY_CHANNEL_ID, payChannelId
		);
	}
	
	public List<TPayment> findByDetailMsg(Object detailMsg
	) {
		return findByProperty(DETAIL_MSG, detailMsg
		);
	}
	
	public List<TPayment> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List<TPayment> findByPayAmount(Object payAmount
	) {
		return findByProperty(PAY_AMOUNT, payAmount
		);
	}
	
	public List<TPayment> findByPayStatus(Object payStatus
	) {
		return findByProperty(PAY_STATUS, payStatus
		);
	}
	
	public List<TPayment> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	
	public List<TPayment> findByOrderPayType(Object orderPayType
	) {
		return findByProperty(ORDER_PAY_TYPE, orderPayType
		);
	}
	

    

}
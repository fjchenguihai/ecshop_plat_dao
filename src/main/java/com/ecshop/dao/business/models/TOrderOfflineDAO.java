package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TOrderOffline entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TOrderOffline
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TOrderOfflineDAO extends HibernateGenericDao<TOrderOffline,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TOrderOfflineDAO.class);
		//property constants
	public static final String USER_ID = "userId";
	public static final String USERTYPE_ID = "usertypeId";
	public static final String ORDER_NUMBER = "orderNumber";
	public static final String MONEY = "money";
	public static final String RECIEVED_MONEY = "recievedMoney";
	public static final String NEED_PAY_MONEY = "needPayMoney";
	public static final String GOODS_PAYMENT = "goodsPayment";
	public static final String RESIDUAL_PAYMENT = "residualPayment";
	public static final String INVOICE_TITLE = "invoiceTitle";
	public static final String REMARK = "remark";
	public static final String CONSIGNEE_NAME = "consigneeName";
	public static final String CONSIGNEE_MOBILE = "consigneeMobile";
	public static final String CONSIGNEE_ADDRESS = "consigneeAddress";



    
   
    
    public TOrderOffline findById( java.lang.Long id) {
        log.debug("getting TOrderOffline instance with id: " + id);
        try {
            TOrderOffline instance = (TOrderOffline) getSession()
                    .get("com.vveplat.dao.business.models.TOrderOffline", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TOrderOffline> findByExample(TOrderOffline instance) {
        log.debug("finding TOrderOffline instance by example");
        try {
            List<TOrderOffline> results = (List<TOrderOffline>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TOrderOffline")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TOrderOffline> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List<TOrderOffline> findByUsertypeId(Object usertypeId
	) {
		return findByProperty(USERTYPE_ID, usertypeId
		);
	}
	
	public List<TOrderOffline> findByOrderNumber(Object orderNumber
	) {
		return findByProperty(ORDER_NUMBER, orderNumber
		);
	}
	
	public List<TOrderOffline> findByMoney(Object money
	) {
		return findByProperty(MONEY, money
		);
	}
	
	public List<TOrderOffline> findByRecievedMoney(Object recievedMoney
	) {
		return findByProperty(RECIEVED_MONEY, recievedMoney
		);
	}
	
	public List<TOrderOffline> findByNeedPayMoney(Object needPayMoney
	) {
		return findByProperty(NEED_PAY_MONEY, needPayMoney
		);
	}
	
	public List<TOrderOffline> findByGoodsPayment(Object goodsPayment
	) {
		return findByProperty(GOODS_PAYMENT, goodsPayment
		);
	}
	
	public List<TOrderOffline> findByResidualPayment(Object residualPayment
	) {
		return findByProperty(RESIDUAL_PAYMENT, residualPayment
		);
	}
	
	public List<TOrderOffline> findByInvoiceTitle(Object invoiceTitle
	) {
		return findByProperty(INVOICE_TITLE, invoiceTitle
		);
	}
	
	public List<TOrderOffline> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	
	public List<TOrderOffline> findByConsigneeName(Object consigneeName
	) {
		return findByProperty(CONSIGNEE_NAME, consigneeName
		);
	}
	
	public List<TOrderOffline> findByConsigneeMobile(Object consigneeMobile
	) {
		return findByProperty(CONSIGNEE_MOBILE, consigneeMobile
		);
	}
	
	public List<TOrderOffline> findByConsigneeAddress(Object consigneeAddress
	) {
		return findByProperty(CONSIGNEE_ADDRESS, consigneeAddress
		);
	}
	

    

}
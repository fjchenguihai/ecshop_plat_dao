package com.ecshop.dao.business.models;

import java.util.Date;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TReportOrder entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TReportOrder
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TReportOrderDAO extends HibernateGenericDao<TReportOrder,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TReportOrderDAO.class);
		//property constants
	public static final String TOTAL_ORDER_CNT = "totalOrderCnt";
	public static final String PAY_ORDER_CNT = "payOrderCnt";
	public static final String WE8QUANTITY = "we8quantity";
	public static final String WEPICO_QUANTITY = "wepicoQuantity";
	public static final String I12QUANTITY = "i12quantity";
	public static final String WE1QUANTITY = "we1quantity";
	public static final String I18QUANTITY = "i18quantity";
	public static final String I6S_QUANTITY = "i6sQuantity";
	public static final String SUB_TOTAL_ORDER_CNT = "subTotalOrderCnt";
	public static final String SUB_PAY_ORDER_CNT = "subPayOrderCnt";
	public static final String SUB_TOTAL_QUANTITY = "subTotalQuantity";
	public static final String SUB_TOTAL_AMOUNT = "subTotalAmount";



    
   
    
    public TReportOrder findById( java.lang.Long id) {
        log.debug("getting TReportOrder instance with id: " + id);
        try {
            TReportOrder instance = (TReportOrder) getSession()
                    .get("com.vveplat.dao.business.models.TReportOrder", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TReportOrder> findByExample(TReportOrder instance) {
        log.debug("finding TReportOrder instance by example");
        try {
            List<TReportOrder> results = (List<TReportOrder>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TReportOrder")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TReportOrder> findByTotalOrderCnt(Object totalOrderCnt
	) {
		return findByProperty(TOTAL_ORDER_CNT, totalOrderCnt
		);
	}
	
	public List<TReportOrder> findByPayOrderCnt(Object payOrderCnt
	) {
		return findByProperty(PAY_ORDER_CNT, payOrderCnt
		);
	}
	
	public List<TReportOrder> findByWe8quantity(Object we8quantity
	) {
		return findByProperty(WE8QUANTITY, we8quantity
		);
	}
	
	public List<TReportOrder> findByWepicoQuantity(Object wepicoQuantity
	) {
		return findByProperty(WEPICO_QUANTITY, wepicoQuantity
		);
	}
	
	public List<TReportOrder> findByI12quantity(Object i12quantity
	) {
		return findByProperty(I12QUANTITY, i12quantity
		);
	}
	
	public List<TReportOrder> findByWe1quantity(Object we1quantity
	) {
		return findByProperty(WE1QUANTITY, we1quantity
		);
	}
	
	public List<TReportOrder> findByI18quantity(Object i18quantity
	) {
		return findByProperty(I18QUANTITY, i18quantity
		);
	}
	
	public List<TReportOrder> findByI6sQuantity(Object i6sQuantity
	) {
		return findByProperty(I6S_QUANTITY, i6sQuantity
		);
	}
	
	public List<TReportOrder> findBySubTotalOrderCnt(Object subTotalOrderCnt
	) {
		return findByProperty(SUB_TOTAL_ORDER_CNT, subTotalOrderCnt
		);
	}
	
	public List<TReportOrder> findBySubPayOrderCnt(Object subPayOrderCnt
	) {
		return findByProperty(SUB_PAY_ORDER_CNT, subPayOrderCnt
		);
	}
	
	public List<TReportOrder> findBySubTotalQuantity(Object subTotalQuantity
	) {
		return findByProperty(SUB_TOTAL_QUANTITY, subTotalQuantity
		);
	}
	
	public List<TReportOrder> findBySubTotalAmount(Object subTotalAmount
	) {
		return findByProperty(SUB_TOTAL_AMOUNT, subTotalAmount
		);
	}
	

    

}
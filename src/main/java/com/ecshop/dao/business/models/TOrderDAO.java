package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TOrder entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TOrder
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TOrderDAO extends HibernateGenericDao<TOrder,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TOrderDAO.class);
		//property constants
	public static final String USER_ID = "userId";
	public static final String MALL_ID = "mallId";
	public static final String PAY_NO = "payNo";
	public static final String STATION_ID = "stationId";
	public static final String ORDER_NUMBER = "orderNumber";
	public static final String PAY_STATUS = "payStatus";
	public static final String LOGISTICS_STATUS = "logisticsStatus";
	public static final String ORDERSTATUS = "orderstatus";
	public static final String MONEY = "money";
	public static final String FREIGHT = "freight";
	public static final String WANT_LOGISTICS_ID = "wantLogisticsId";
	public static final String PROVINCE_ID = "provinceId";
	public static final String CITY_ID = "cityId";
	public static final String DISTRICT_ID = "districtId";
	public static final String DELIVERS_ADDRESS = "deliversAddress";
	public static final String ADDRESSEE = "addressee";
	public static final String USER_NOTE = "userNote";
	public static final String MALL_NOTE = "mallNote";
	public static final String ZIP_CODE = "zipCode";
	public static final String MOBILE = "mobile";
	public static final String USERTYPE_ID = "usertypeId";
	public static final String PAYMENT_ID = "paymentId";
	public static final String MALL_MONEY = "mallMoney";
	public static final String PROFIT_MONEY = "profitMoney";
	public static final String COUNTER_FEE = "counterFee";
	public static final String IS_CALCULATE_PROFIT = "isCalculateProfit";
	public static final String MALL_CHECK_STATUS = "mallCheckStatus";
	public static final String SOURCE_MALL_ID = "sourceMallId";
	public static final String SOURCE_STATION_ID = "sourceStationId";
	public static final String IS_CUMULATIVE = "isCumulative";
	public static final String FINANCE_AUDIT_STATUS = "financeAuditStatus";
	public static final String AUDIT_REMARK = "auditRemark";
	public static final String DERIVED_STATUS = "derivedStatus";
	public static final String INVOICE_TITLE = "invoiceTitle";
	public static final String NEED_INVOICE_FLAG = "needInvoiceFlag";
	public static final String INVOICE_STATUS = "invoiceStatus";
	public static final String MARKET_PLAN_STATUS = "marketPlanStatus";
	public static final String DELIVERY_TYPE = "deliveryType";
	public static final String ORDER_TYPE = "orderType";
	public static final String GROUP_ID = "groupId";
	public static final String CENTER_ID = "centerId";



    
   
    
    public TOrder findById( java.lang.Long id) {
        log.debug("getting TOrder instance with id: " + id);
        try {
            TOrder instance = (TOrder) getSession()
                    .get("com.vveplat.dao.business.models.TOrder", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TOrder> findByExample(TOrder instance) {
        log.debug("finding TOrder instance by example");
        try {
            List<TOrder> results = (List<TOrder>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TOrder")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TOrder> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List<TOrder> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<TOrder> findByPayNo(Object payNo
	) {
		return findByProperty(PAY_NO, payNo
		);
	}
	
	public List<TOrder> findByStationId(Object stationId
	) {
		return findByProperty(STATION_ID, stationId
		);
	}
	
	public List<TOrder> findByOrderNumber(Object orderNumber
	) {
		return findByProperty(ORDER_NUMBER, orderNumber
		);
	}
	
	public List<TOrder> findByPayStatus(Object payStatus
	) {
		return findByProperty(PAY_STATUS, payStatus
		);
	}
	
	public List<TOrder> findByLogisticsStatus(Object logisticsStatus
	) {
		return findByProperty(LOGISTICS_STATUS, logisticsStatus
		);
	}
	
	public List<TOrder> findByOrderstatus(Object orderstatus
	) {
		return findByProperty(ORDERSTATUS, orderstatus
		);
	}
	
	public List<TOrder> findByMoney(Object money
	) {
		return findByProperty(MONEY, money
		);
	}
	
	public List<TOrder> findByFreight(Object freight
	) {
		return findByProperty(FREIGHT, freight
		);
	}
	
	public List<TOrder> findByWantLogisticsId(Object wantLogisticsId
	) {
		return findByProperty(WANT_LOGISTICS_ID, wantLogisticsId
		);
	}
	
	public List<TOrder> findByProvinceId(Object provinceId
	) {
		return findByProperty(PROVINCE_ID, provinceId
		);
	}
	
	public List<TOrder> findByCityId(Object cityId
	) {
		return findByProperty(CITY_ID, cityId
		);
	}
	
	public List<TOrder> findByDistrictId(Object districtId
	) {
		return findByProperty(DISTRICT_ID, districtId
		);
	}
	
	public List<TOrder> findByDeliversAddress(Object deliversAddress
	) {
		return findByProperty(DELIVERS_ADDRESS, deliversAddress
		);
	}
	
	public List<TOrder> findByAddressee(Object addressee
	) {
		return findByProperty(ADDRESSEE, addressee
		);
	}
	
	public List<TOrder> findByUserNote(Object userNote
	) {
		return findByProperty(USER_NOTE, userNote
		);
	}
	
	public List<TOrder> findByMallNote(Object mallNote
	) {
		return findByProperty(MALL_NOTE, mallNote
		);
	}
	
	public List<TOrder> findByZipCode(Object zipCode
	) {
		return findByProperty(ZIP_CODE, zipCode
		);
	}
	
	public List<TOrder> findByMobile(Object mobile
	) {
		return findByProperty(MOBILE, mobile
		);
	}
	
	public List<TOrder> findByUsertypeId(Object usertypeId
	) {
		return findByProperty(USERTYPE_ID, usertypeId
		);
	}
	
	public List<TOrder> findByPaymentId(Object paymentId
	) {
		return findByProperty(PAYMENT_ID, paymentId
		);
	}
	
	public List<TOrder> findByMallMoney(Object mallMoney
	) {
		return findByProperty(MALL_MONEY, mallMoney
		);
	}
	
	public List<TOrder> findByProfitMoney(Object profitMoney
	) {
		return findByProperty(PROFIT_MONEY, profitMoney
		);
	}
	
	public List<TOrder> findByCounterFee(Object counterFee
	) {
		return findByProperty(COUNTER_FEE, counterFee
		);
	}
	
	public List<TOrder> findByIsCalculateProfit(Object isCalculateProfit
	) {
		return findByProperty(IS_CALCULATE_PROFIT, isCalculateProfit
		);
	}
	
	public List<TOrder> findByMallCheckStatus(Object mallCheckStatus
	) {
		return findByProperty(MALL_CHECK_STATUS, mallCheckStatus
		);
	}
	
	public List<TOrder> findBySourceMallId(Object sourceMallId
	) {
		return findByProperty(SOURCE_MALL_ID, sourceMallId
		);
	}
	
	public List<TOrder> findBySourceStationId(Object sourceStationId
	) {
		return findByProperty(SOURCE_STATION_ID, sourceStationId
		);
	}
	
	public List<TOrder> findByIsCumulative(Object isCumulative
	) {
		return findByProperty(IS_CUMULATIVE, isCumulative
		);
	}
	
	public List<TOrder> findByFinanceAuditStatus(Object financeAuditStatus
	) {
		return findByProperty(FINANCE_AUDIT_STATUS, financeAuditStatus
		);
	}
	
	public List<TOrder> findByAuditRemark(Object auditRemark
	) {
		return findByProperty(AUDIT_REMARK, auditRemark
		);
	}
	
	public List<TOrder> findByDerivedStatus(Object derivedStatus
	) {
		return findByProperty(DERIVED_STATUS, derivedStatus
		);
	}
	
	public List<TOrder> findByInvoiceTitle(Object invoiceTitle
	) {
		return findByProperty(INVOICE_TITLE, invoiceTitle
		);
	}
	
	public List<TOrder> findByNeedInvoiceFlag(Object needInvoiceFlag
	) {
		return findByProperty(NEED_INVOICE_FLAG, needInvoiceFlag
		);
	}
	
	public List<TOrder> findByInvoiceStatus(Object invoiceStatus
	) {
		return findByProperty(INVOICE_STATUS, invoiceStatus
		);
	}
	
	public List<TOrder> findByMarketPlanStatus(Object marketPlanStatus
	) {
		return findByProperty(MARKET_PLAN_STATUS, marketPlanStatus
		);
	}
	
	public List<TOrder> findByDeliveryType(Object deliveryType
	) {
		return findByProperty(DELIVERY_TYPE, deliveryType
		);
	}
	
	public List<TOrder> findByOrderType(Object orderType
	) {
		return findByProperty(ORDER_TYPE, orderType
		);
	}
	
	public List<TOrder> findByGroupId(Object groupId
	) {
		return findByProperty(GROUP_ID, groupId
		);
	}
	
	public List<TOrder> findByCenterId(Object centerId
	) {
		return findByProperty(CENTER_ID, centerId
		);
	}
    

}
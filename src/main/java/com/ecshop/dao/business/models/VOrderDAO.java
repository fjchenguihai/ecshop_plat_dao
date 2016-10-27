package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for VOrder entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.VOrder
  * @author MyEclipse Persistence Tools 
 */
@Component
public class VOrderDAO extends HibernateGenericDao<VOrder,Long> {
	     private static final Logger log = LoggerFactory.getLogger(VOrderDAO.class);
		//property constants
	public static final String USER_ID = "userId";
	public static final String MALL_ID = "mallId";
	public static final String BUYER_MOBILE = "buyerMobile";
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
	public static final String USERNAME = "username";
	public static final String NICKNAME = "nickname";
	public static final String REAL_NAME = "realName";
	public static final String MALL_NAME = "mallName";
	public static final String STATION_NAME = "stationName";
	public static final String SOURCE_MALL_NAME = "sourceMallName";
	public static final String SOURCE_STATION_NAME = "sourceStationName";
	public static final String PROVINCE_NAME = "provinceName";
	public static final String CITY_NAME = "cityName";
	public static final String DISTRICT_NAME = "districtName";
	public static final String ORDER_DESC = "orderDesc";
	public static final String PAY_DESC = "payDesc";
	public static final String LOGISTICS_DESC = "logisticsDesc";
	public static final String WANT_LOGISTICS_NAME = "wantLogisticsName";
	public static final String FINANCE_AUDIT_STATUS = "financeAuditStatus";
	public static final String AUDIT_REMARK = "auditRemark";
	public static final String DERIVED_STATUS = "derivedStatus";
	public static final String INVOICE_TITLE = "invoiceTitle";
	public static final String NEED_INVOICE_FLAG = "needInvoiceFlag";
	public static final String INVOICE_STATUS = "invoiceStatus";
	public static final String DELIVERY_TYPE = "deliveryType";
	public static final String ORDER_TYPE = "orderType";
	public static final String FIGHT_GROUP_ID = "fightGroupId";
	public static final String GROUP_GOOD_NUM = "groupGoodNum";
	public static final String GROUP_STATUS = "groupStatus";
	public static final String GROUP_USER_NUM = "groupUserNum";
	public static final String REMARK = "remark";



    
   
    
    public VOrder findById( java.lang.Long id) {
        log.debug("getting VOrder instance with id: " + id);
        try {
            VOrder instance = (VOrder) getSession()
                    .get("com.vveplat.dao.business.models.VOrder", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<VOrder> findByExample(VOrder instance) {
        log.debug("finding VOrder instance by example");
        try {
            List<VOrder> results = (List<VOrder>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.VOrder")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<VOrder> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List<VOrder> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<VOrder> findByBuyerMobile(Object buyerMobile
	) {
		return findByProperty(BUYER_MOBILE, buyerMobile
		);
	}
	
	public List<VOrder> findByPayNo(Object payNo
	) {
		return findByProperty(PAY_NO, payNo
		);
	}
	
	public List<VOrder> findByStationId(Object stationId
	) {
		return findByProperty(STATION_ID, stationId
		);
	}
	
	public List<VOrder> findByOrderNumber(Object orderNumber
	) {
		return findByProperty(ORDER_NUMBER, orderNumber
		);
	}
	
	public List<VOrder> findByPayStatus(Object payStatus
	) {
		return findByProperty(PAY_STATUS, payStatus
		);
	}
	
	public List<VOrder> findByLogisticsStatus(Object logisticsStatus
	) {
		return findByProperty(LOGISTICS_STATUS, logisticsStatus
		);
	}
	
	public List<VOrder> findByOrderstatus(Object orderstatus
	) {
		return findByProperty(ORDERSTATUS, orderstatus
		);
	}
	
	public List<VOrder> findByMoney(Object money
	) {
		return findByProperty(MONEY, money
		);
	}
	
	public List<VOrder> findByFreight(Object freight
	) {
		return findByProperty(FREIGHT, freight
		);
	}
	
	public List<VOrder> findByWantLogisticsId(Object wantLogisticsId
	) {
		return findByProperty(WANT_LOGISTICS_ID, wantLogisticsId
		);
	}
	
	public List<VOrder> findByProvinceId(Object provinceId
	) {
		return findByProperty(PROVINCE_ID, provinceId
		);
	}
	
	public List<VOrder> findByCityId(Object cityId
	) {
		return findByProperty(CITY_ID, cityId
		);
	}
	
	public List<VOrder> findByDistrictId(Object districtId
	) {
		return findByProperty(DISTRICT_ID, districtId
		);
	}
	
	public List<VOrder> findByDeliversAddress(Object deliversAddress
	) {
		return findByProperty(DELIVERS_ADDRESS, deliversAddress
		);
	}
	
	public List<VOrder> findByAddressee(Object addressee
	) {
		return findByProperty(ADDRESSEE, addressee
		);
	}
	
	public List<VOrder> findByUserNote(Object userNote
	) {
		return findByProperty(USER_NOTE, userNote
		);
	}
	
	public List<VOrder> findByMallNote(Object mallNote
	) {
		return findByProperty(MALL_NOTE, mallNote
		);
	}
	
	public List<VOrder> findByZipCode(Object zipCode
	) {
		return findByProperty(ZIP_CODE, zipCode
		);
	}
	
	public List<VOrder> findByMobile(Object mobile
	) {
		return findByProperty(MOBILE, mobile
		);
	}
	
	public List<VOrder> findByUsertypeId(Object usertypeId
	) {
		return findByProperty(USERTYPE_ID, usertypeId
		);
	}
	
	public List<VOrder> findByPaymentId(Object paymentId
	) {
		return findByProperty(PAYMENT_ID, paymentId
		);
	}
	
	public List<VOrder> findByMallMoney(Object mallMoney
	) {
		return findByProperty(MALL_MONEY, mallMoney
		);
	}
	
	public List<VOrder> findByProfitMoney(Object profitMoney
	) {
		return findByProperty(PROFIT_MONEY, profitMoney
		);
	}
	
	public List<VOrder> findByCounterFee(Object counterFee
	) {
		return findByProperty(COUNTER_FEE, counterFee
		);
	}
	
	public List<VOrder> findByIsCalculateProfit(Object isCalculateProfit
	) {
		return findByProperty(IS_CALCULATE_PROFIT, isCalculateProfit
		);
	}
	
	public List<VOrder> findByMallCheckStatus(Object mallCheckStatus
	) {
		return findByProperty(MALL_CHECK_STATUS, mallCheckStatus
		);
	}
	
	public List<VOrder> findBySourceMallId(Object sourceMallId
	) {
		return findByProperty(SOURCE_MALL_ID, sourceMallId
		);
	}
	
	public List<VOrder> findBySourceStationId(Object sourceStationId
	) {
		return findByProperty(SOURCE_STATION_ID, sourceStationId
		);
	}
	
	public List<VOrder> findByIsCumulative(Object isCumulative
	) {
		return findByProperty(IS_CUMULATIVE, isCumulative
		);
	}
	
	public List<VOrder> findByUsername(Object username
	) {
		return findByProperty(USERNAME, username
		);
	}
	
	public List<VOrder> findByNickname(Object nickname
	) {
		return findByProperty(NICKNAME, nickname
		);
	}
	
	public List<VOrder> findByRealName(Object realName
	) {
		return findByProperty(REAL_NAME, realName
		);
	}
	
	public List<VOrder> findByMallName(Object mallName
	) {
		return findByProperty(MALL_NAME, mallName
		);
	}
	
	public List<VOrder> findByStationName(Object stationName
	) {
		return findByProperty(STATION_NAME, stationName
		);
	}
	
	public List<VOrder> findBySourceMallName(Object sourceMallName
	) {
		return findByProperty(SOURCE_MALL_NAME, sourceMallName
		);
	}
	
	public List<VOrder> findBySourceStationName(Object sourceStationName
	) {
		return findByProperty(SOURCE_STATION_NAME, sourceStationName
		);
	}
	
	public List<VOrder> findByProvinceName(Object provinceName
	) {
		return findByProperty(PROVINCE_NAME, provinceName
		);
	}
	
	public List<VOrder> findByCityName(Object cityName
	) {
		return findByProperty(CITY_NAME, cityName
		);
	}
	
	public List<VOrder> findByDistrictName(Object districtName
	) {
		return findByProperty(DISTRICT_NAME, districtName
		);
	}
	
	public List<VOrder> findByOrderDesc(Object orderDesc
	) {
		return findByProperty(ORDER_DESC, orderDesc
		);
	}
	
	public List<VOrder> findByPayDesc(Object payDesc
	) {
		return findByProperty(PAY_DESC, payDesc
		);
	}
	
	public List<VOrder> findByLogisticsDesc(Object logisticsDesc
	) {
		return findByProperty(LOGISTICS_DESC, logisticsDesc
		);
	}
	
	public List<VOrder> findByWantLogisticsName(Object wantLogisticsName
	) {
		return findByProperty(WANT_LOGISTICS_NAME, wantLogisticsName
		);
	}
	
	public List<VOrder> findByFinanceAuditStatus(Object financeAuditStatus
	) {
		return findByProperty(FINANCE_AUDIT_STATUS, financeAuditStatus
		);
	}
	
	public List<VOrder> findByAuditRemark(Object auditRemark
	) {
		return findByProperty(AUDIT_REMARK, auditRemark
		);
	}
	
	public List<VOrder> findByDerivedStatus(Object derivedStatus
	) {
		return findByProperty(DERIVED_STATUS, derivedStatus
		);
	}
	
	public List<VOrder> findByInvoiceTitle(Object invoiceTitle
	) {
		return findByProperty(INVOICE_TITLE, invoiceTitle
		);
	}
	
	public List<VOrder> findByNeedInvoiceFlag(Object needInvoiceFlag
	) {
		return findByProperty(NEED_INVOICE_FLAG, needInvoiceFlag
		);
	}
	
	public List<VOrder> findByInvoiceStatus(Object invoiceStatus
	) {
		return findByProperty(INVOICE_STATUS, invoiceStatus
		);
	}
	
	public List<VOrder> findByDeliveryType(Object deliveryType
	) {
		return findByProperty(DELIVERY_TYPE, deliveryType
		);
	}
	
	public List<VOrder> findByOrderType(Object orderType
	) {
		return findByProperty(ORDER_TYPE, orderType
		);
	}
	
	public List<VOrder> findByFightGroupId(Object fightGroupId
	) {
		return findByProperty(FIGHT_GROUP_ID, fightGroupId
		);
	}
	
	public List<VOrder> findByGroupGoodNum(Object groupGoodNum
	) {
		return findByProperty(GROUP_GOOD_NUM, groupGoodNum
		);
	}
	
	public List<VOrder> findByGroupStatus(Object groupStatus
	) {
		return findByProperty(GROUP_STATUS, groupStatus
		);
	}
	
	public List<VOrder> findByGroupUserNum(Object groupUserNum
	) {
		return findByProperty(GROUP_USER_NUM, groupUserNum
		);
	}
	
	public List<VOrder> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	

    

}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * VDelivery entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VDelivery
 * @author MyEclipse Persistence Tools
 */
@Component
public class VDeliveryDAO extends HibernateGenericDao<VDelivery, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VDeliveryDAO.class);
	// property constants
	public static final String DELIVERY_NO = "deliveryNo";
	public static final String LOGISTICS_ID = "logisticsId";
	public static final String LOGISTICS_NAME = "logisticsName";
	public static final String LOGISTICS_NO = "logisticsNo";
	public static final String STATUS = "status";
	public static final String REMARK = "remark";
	public static final String ORDER_ID = "orderId";
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
	public static final String PROVINCE_NAME = "provinceName";
	public static final String CITY_NAME = "cityName";
	public static final String DISTRICT_NAME = "districtName";
	public static final String USERNAME = "username";
	public static final String REAL_NAME = "realName";
	public static final String STATION_NAME = "stationName";
	public static final String LOGISTICS_DESC = "logisticsDesc";
	public static final String LOGISTICS_IMG = "logisticsImg";

	public VDelivery findById(java.lang.Long id) {
		log.debug("getting VDelivery instance with id: " + id);
		try {
			VDelivery instance = (VDelivery) getSession().get(
					"com.vveplat.dao.business.models.VDelivery", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VDelivery> findByExample(VDelivery instance) {
		log.debug("finding VDelivery instance by example");
		try {
			List<VDelivery> results = (List<VDelivery>) getSession()
					.createCriteria("com.vveplat.dao.business.models.VDelivery")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VDelivery> findByDeliveryNo(Object deliveryNo) {
		return findByProperty(DELIVERY_NO, deliveryNo);
	}

	public List<VDelivery> findByLogisticsId(Object logisticsId) {
		return findByProperty(LOGISTICS_ID, logisticsId);
	}

	public List<VDelivery> findByLogisticsName(Object logisticsName) {
		return findByProperty(LOGISTICS_NAME, logisticsName);
	}

	public List<VDelivery> findByLogisticsNo(Object logisticsNo) {
		return findByProperty(LOGISTICS_NO, logisticsNo);
	}

	public List<VDelivery> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<VDelivery> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List<VDelivery> findByOrderId(Object orderId) {
		return findByProperty(ORDER_ID, orderId);
	}

	public List<VDelivery> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<VDelivery> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VDelivery> findByPayNo(Object payNo) {
		return findByProperty(PAY_NO, payNo);
	}

	public List<VDelivery> findByStationId(Object stationId) {
		return findByProperty(STATION_ID, stationId);
	}

	public List<VDelivery> findByOrderNumber(Object orderNumber) {
		return findByProperty(ORDER_NUMBER, orderNumber);
	}

	public List<VDelivery> findByPayStatus(Object payStatus) {
		return findByProperty(PAY_STATUS, payStatus);
	}

	public List<VDelivery> findByLogisticsStatus(Object logisticsStatus) {
		return findByProperty(LOGISTICS_STATUS, logisticsStatus);
	}

	public List<VDelivery> findByOrderstatus(Object orderstatus) {
		return findByProperty(ORDERSTATUS, orderstatus);
	}

	public List<VDelivery> findByMoney(Object money) {
		return findByProperty(MONEY, money);
	}

	public List<VDelivery> findByFreight(Object freight) {
		return findByProperty(FREIGHT, freight);
	}

	public List<VDelivery> findByWantLogisticsId(Object wantLogisticsId) {
		return findByProperty(WANT_LOGISTICS_ID, wantLogisticsId);
	}

	public List<VDelivery> findByProvinceId(Object provinceId) {
		return findByProperty(PROVINCE_ID, provinceId);
	}

	public List<VDelivery> findByCityId(Object cityId) {
		return findByProperty(CITY_ID, cityId);
	}

	public List<VDelivery> findByDistrictId(Object districtId) {
		return findByProperty(DISTRICT_ID, districtId);
	}

	public List<VDelivery> findByDeliversAddress(Object deliversAddress) {
		return findByProperty(DELIVERS_ADDRESS, deliversAddress);
	}

	public List<VDelivery> findByAddressee(Object addressee) {
		return findByProperty(ADDRESSEE, addressee);
	}

	public List<VDelivery> findByUserNote(Object userNote) {
		return findByProperty(USER_NOTE, userNote);
	}

	public List<VDelivery> findByMallNote(Object mallNote) {
		return findByProperty(MALL_NOTE, mallNote);
	}

	public List<VDelivery> findByZipCode(Object zipCode) {
		return findByProperty(ZIP_CODE, zipCode);
	}

	public List<VDelivery> findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List<VDelivery> findByUsertypeId(Object usertypeId) {
		return findByProperty(USERTYPE_ID, usertypeId);
	}

	public List<VDelivery> findByPaymentId(Object paymentId) {
		return findByProperty(PAYMENT_ID, paymentId);
	}

	public List<VDelivery> findByMallMoney(Object mallMoney) {
		return findByProperty(MALL_MONEY, mallMoney);
	}

	public List<VDelivery> findByProfitMoney(Object profitMoney) {
		return findByProperty(PROFIT_MONEY, profitMoney);
	}

	public List<VDelivery> findByCounterFee(Object counterFee) {
		return findByProperty(COUNTER_FEE, counterFee);
	}

	public List<VDelivery> findByIsCalculateProfit(Object isCalculateProfit) {
		return findByProperty(IS_CALCULATE_PROFIT, isCalculateProfit);
	}

	public List<VDelivery> findByMallCheckStatus(Object mallCheckStatus) {
		return findByProperty(MALL_CHECK_STATUS, mallCheckStatus);
	}

	public List<VDelivery> findBySourceMallId(Object sourceMallId) {
		return findByProperty(SOURCE_MALL_ID, sourceMallId);
	}

	public List<VDelivery> findBySourceStationId(Object sourceStationId) {
		return findByProperty(SOURCE_STATION_ID, sourceStationId);
	}

	public List<VDelivery> findByIsCumulative(Object isCumulative) {
		return findByProperty(IS_CUMULATIVE, isCumulative);
	}

	public List<VDelivery> findByProvinceName(Object provinceName) {
		return findByProperty(PROVINCE_NAME, provinceName);
	}

	public List<VDelivery> findByCityName(Object cityName) {
		return findByProperty(CITY_NAME, cityName);
	}

	public List<VDelivery> findByDistrictName(Object districtName) {
		return findByProperty(DISTRICT_NAME, districtName);
	}

	public List<VDelivery> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<VDelivery> findByRealName(Object realName) {
		return findByProperty(REAL_NAME, realName);
	}

	public List<VDelivery> findByStationName(Object stationName) {
		return findByProperty(STATION_NAME, stationName);
	}

	public List<VDelivery> findByLogisticsDesc(Object logisticsDesc) {
		return findByProperty(LOGISTICS_DESC, logisticsDesc);
	}

	public List<VDelivery> findByLogisticsImg(Object logisticsImg) {
		return findByProperty(LOGISTICS_IMG, logisticsImg);
	}

}
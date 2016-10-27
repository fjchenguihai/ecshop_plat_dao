package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for VMall
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VMall
 * @author MyEclipse Persistence Tools
 */
@Component
public class VMallDAO extends HibernateGenericDao<VMall, Long> {
	private static final Logger log = LoggerFactory.getLogger(VMallDAO.class);
	// property constants
	public static final String INDUSTRY_ID = "industryId";
	public static final String INDUSTRY_ID2 = "industryId2";
	public static final String USER_ID = "userId";
	public static final String MALL_NO = "mallNo";
	public static final String MALL_TYPE = "mallType";
	public static final String MALL_NAME = "mallName";
	public static final String MALL_LOGO = "mallLogo";
	public static final String MALL_LINK = "mallLink";
	public static final String MALL_INTRO = "mallIntro";
	public static final String QRCODE = "qrcode";
	public static final String EXAMINESTATUS = "examinestatus";
	public static final String EXAMINE_CAUSE = "examineCause";
	public static final String EXAMINE_ADMIN_ID = "examineAdminId";
	public static final String DELETESTATUS = "deletestatus";
	public static final String WEIXIN_APPID = "weixinAppid";
	public static final String WEIXIN_APPKEY = "weixinAppkey";
	public static final String WEIXIN_APPSECRET = "weixinAppsecret";
	public static final String PROVINCE_ID = "provinceId";
	public static final String DISTRICT_ID = "districtId";
	public static final String DETAIL_ADDRESS = "detailAddress";
	public static final String ZIP_CODE = "zipCode";
	public static final String CITY_ID = "cityId";
	public static final String MIN_PROFIT = "minProfit";
	public static final String MALL_IMAGE = "mallImage";
	public static final String MALL_IMAGE_DESC = "mallImageDesc";
	public static final String SERVICE_CENTER = "serviceCenter";
	public static final String DEFAULT_FREIGHT = "defaultFreight";
	public static final String INDUSTRY_NAME = "industryName";
	public static final String PROVINCE_NAME = "provinceName";
	public static final String CITY_NAME = "cityName";
	public static final String DISTRICT_NAME = "districtName";
	public static final String USERNAME = "username";
	public static final String REAL_NAME = "realName";
	public static final String MOBILE = "mobile";
	public static final String STATION_ID = "stationId";
	public static final String STATION_NAME = "stationName";
	public static final String ADMIN_ID = "adminId";
	public static final String ACCOUNT = "account";
	public static final String USE_MONEY = "useMoney";
	public static final String PROMISE_MONEY = "promiseMoney";
	public static final String HOST_ID = "hostId";
	public static final String HOST = "host";

	public VMall findById(java.lang.Long id) {
		log.debug("getting VMall instance with id: " + id);
		try {
			VMall instance = (VMall) getSession().get(
					"com.vveplat.dao.business.models.VMall", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VMall> findByExample(VMall instance) {
		log.debug("finding VMall instance by example");
		try {
			List<VMall> results = (List<VMall>) getSession()
					.createCriteria("com.vveplat.dao.business.models.VMall")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VMall> findByIndustryId(Object industryId) {
		return findByProperty(INDUSTRY_ID, industryId);
	}

	public List<VMall> findByIndustryId2(Object industryId2) {
		return findByProperty(INDUSTRY_ID2, industryId2);
	}

	public List<VMall> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<VMall> findByMallNo(Object mallNo) {
		return findByProperty(MALL_NO, mallNo);
	}

	public List<VMall> findByMallType(Object mallType) {
		return findByProperty(MALL_TYPE, mallType);
	}

	public List<VMall> findByMallName(Object mallName) {
		return findByProperty(MALL_NAME, mallName);
	}

	public List<VMall> findByMallLogo(Object mallLogo) {
		return findByProperty(MALL_LOGO, mallLogo);
	}

	public List<VMall> findByMallLink(Object mallLink) {
		return findByProperty(MALL_LINK, mallLink);
	}

	public List<VMall> findByMallIntro(Object mallIntro) {
		return findByProperty(MALL_INTRO, mallIntro);
	}

	public List<VMall> findByQrcode(Object qrcode) {
		return findByProperty(QRCODE, qrcode);
	}

	public List<VMall> findByExaminestatus(Object examinestatus) {
		return findByProperty(EXAMINESTATUS, examinestatus);
	}

	public List<VMall> findByExamineCause(Object examineCause) {
		return findByProperty(EXAMINE_CAUSE, examineCause);
	}

	public List<VMall> findByExamineAdminId(Object examineAdminId) {
		return findByProperty(EXAMINE_ADMIN_ID, examineAdminId);
	}

	public List<VMall> findByDeletestatus(Object deletestatus) {
		return findByProperty(DELETESTATUS, deletestatus);
	}

	public List<VMall> findByWeixinAppid(Object weixinAppid) {
		return findByProperty(WEIXIN_APPID, weixinAppid);
	}

	public List<VMall> findByWeixinAppkey(Object weixinAppkey) {
		return findByProperty(WEIXIN_APPKEY, weixinAppkey);
	}

	public List<VMall> findByWeixinAppsecret(Object weixinAppsecret) {
		return findByProperty(WEIXIN_APPSECRET, weixinAppsecret);
	}

	public List<VMall> findByProvinceId(Object provinceId) {
		return findByProperty(PROVINCE_ID, provinceId);
	}

	public List<VMall> findByDistrictId(Object districtId) {
		return findByProperty(DISTRICT_ID, districtId);
	}

	public List<VMall> findByDetailAddress(Object detailAddress) {
		return findByProperty(DETAIL_ADDRESS, detailAddress);
	}

	public List<VMall> findByZipCode(Object zipCode) {
		return findByProperty(ZIP_CODE, zipCode);
	}

	public List<VMall> findByCityId(Object cityId) {
		return findByProperty(CITY_ID, cityId);
	}

	public List<VMall> findByMinProfit(Object minProfit) {
		return findByProperty(MIN_PROFIT, minProfit);
	}

	public List<VMall> findByMallImage(Object mallImage) {
		return findByProperty(MALL_IMAGE, mallImage);
	}

	public List<VMall> findByMallImageDesc(Object mallImageDesc) {
		return findByProperty(MALL_IMAGE_DESC, mallImageDesc);
	}

	public List<VMall> findByServiceCenter(Object serviceCenter) {
		return findByProperty(SERVICE_CENTER, serviceCenter);
	}

	public List<VMall> findByDefaultFreight(Object defaultFreight) {
		return findByProperty(DEFAULT_FREIGHT, defaultFreight);
	}

	public List<VMall> findByIndustryName(Object industryName) {
		return findByProperty(INDUSTRY_NAME, industryName);
	}

	public List<VMall> findByProvinceName(Object provinceName) {
		return findByProperty(PROVINCE_NAME, provinceName);
	}

	public List<VMall> findByCityName(Object cityName) {
		return findByProperty(CITY_NAME, cityName);
	}

	public List<VMall> findByDistrictName(Object districtName) {
		return findByProperty(DISTRICT_NAME, districtName);
	}

	public List<VMall> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<VMall> findByRealName(Object realName) {
		return findByProperty(REAL_NAME, realName);
	}

	public List<VMall> findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List<VMall> findByStationId(Object stationId) {
		return findByProperty(STATION_ID, stationId);
	}

	public List<VMall> findByStationName(Object stationName) {
		return findByProperty(STATION_NAME, stationName);
	}

	public List<VMall> findByAdminId(Object adminId) {
		return findByProperty(ADMIN_ID, adminId);
	}

	public List<VMall> findByAccount(Object account) {
		return findByProperty(ACCOUNT, account);
	}

	public List<VMall> findByUseMoney(Object useMoney) {
		return findByProperty(USE_MONEY, useMoney);
	}

	public List<VMall> findByPromiseMoney(Object promiseMoney) {
		return findByProperty(PROMISE_MONEY, promiseMoney);
	}

	public List<VMall> findByHostId(Object hostId) {
		return findByProperty(HOST_ID, hostId);
	}

	public List<VMall> findByHost(Object host) {
		return findByProperty(HOST, host);
	}

}
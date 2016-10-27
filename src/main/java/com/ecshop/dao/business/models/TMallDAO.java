package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TMall entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TMall
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TMallDAO extends HibernateGenericDao<TMall,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TMallDAO.class);
		//property constants
	public static final String INDUSTRY_ID = "industryId";
	public static final String INDUSTRY_ID2 = "industryId2";
	public static final String USER_ID = "userId";
	public static final String MALL_NO = "mallNo";
	public static final String MALL_TYPE = "mallType";
	public static final String OPERATION_TYPE = "operationType";
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
	public static final String SELF_DELIVERY = "selfDelivery";
	public static final String IS_USING_CUSTOM_WE_CHAT_PAY_ACCOUNT = "isUsingCustomWeChatPayAccount";



    
   
    
    public TMall findById( java.lang.Long id) {
        log.debug("getting TMall instance with id: " + id);
        try {
            TMall instance = (TMall) getSession()
                    .get("com.vveplat.dao.business.models.TMall", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TMall> findByExample(TMall instance) {
        log.debug("finding TMall instance by example");
        try {
            List<TMall> results = (List<TMall>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TMall")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TMall> findByIndustryId(Object industryId
	) {
		return findByProperty(INDUSTRY_ID, industryId
		);
	}
	
	public List<TMall> findByIndustryId2(Object industryId2
	) {
		return findByProperty(INDUSTRY_ID2, industryId2
		);
	}
	
	public List<TMall> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List<TMall> findByMallNo(Object mallNo
	) {
		return findByProperty(MALL_NO, mallNo
		);
	}
	
	public List<TMall> findByMallType(Object mallType
	) {
		return findByProperty(MALL_TYPE, mallType
		);
	}
	
	public List<TMall> findByOperationType(Object operationType
	) {
		return findByProperty(OPERATION_TYPE, operationType
		);
	}
	
	public List<TMall> findByMallName(Object mallName
	) {
		return findByProperty(MALL_NAME, mallName
		);
	}
	
	public List<TMall> findByMallLogo(Object mallLogo
	) {
		return findByProperty(MALL_LOGO, mallLogo
		);
	}
	
	public List<TMall> findByMallLink(Object mallLink
	) {
		return findByProperty(MALL_LINK, mallLink
		);
	}
	
	public List<TMall> findByMallIntro(Object mallIntro
	) {
		return findByProperty(MALL_INTRO, mallIntro
		);
	}
	
	public List<TMall> findByQrcode(Object qrcode
	) {
		return findByProperty(QRCODE, qrcode
		);
	}
	
	public List<TMall> findByExaminestatus(Object examinestatus
	) {
		return findByProperty(EXAMINESTATUS, examinestatus
		);
	}
	
	public List<TMall> findByExamineCause(Object examineCause
	) {
		return findByProperty(EXAMINE_CAUSE, examineCause
		);
	}
	
	public List<TMall> findByExamineAdminId(Object examineAdminId
	) {
		return findByProperty(EXAMINE_ADMIN_ID, examineAdminId
		);
	}
	
	public List<TMall> findByDeletestatus(Object deletestatus
	) {
		return findByProperty(DELETESTATUS, deletestatus
		);
	}
	
	public List<TMall> findByWeixinAppid(Object weixinAppid
	) {
		return findByProperty(WEIXIN_APPID, weixinAppid
		);
	}
	
	public List<TMall> findByWeixinAppkey(Object weixinAppkey
	) {
		return findByProperty(WEIXIN_APPKEY, weixinAppkey
		);
	}
	
	public List<TMall> findByWeixinAppsecret(Object weixinAppsecret
	) {
		return findByProperty(WEIXIN_APPSECRET, weixinAppsecret
		);
	}
	
	public List<TMall> findByProvinceId(Object provinceId
	) {
		return findByProperty(PROVINCE_ID, provinceId
		);
	}
	
	public List<TMall> findByDistrictId(Object districtId
	) {
		return findByProperty(DISTRICT_ID, districtId
		);
	}
	
	public List<TMall> findByDetailAddress(Object detailAddress
	) {
		return findByProperty(DETAIL_ADDRESS, detailAddress
		);
	}
	
	public List<TMall> findByZipCode(Object zipCode
	) {
		return findByProperty(ZIP_CODE, zipCode
		);
	}
	
	public List<TMall> findByCityId(Object cityId
	) {
		return findByProperty(CITY_ID, cityId
		);
	}
	
	public List<TMall> findByMinProfit(Object minProfit
	) {
		return findByProperty(MIN_PROFIT, minProfit
		);
	}
	
	public List<TMall> findByMallImage(Object mallImage
	) {
		return findByProperty(MALL_IMAGE, mallImage
		);
	}
	
	public List<TMall> findByMallImageDesc(Object mallImageDesc
	) {
		return findByProperty(MALL_IMAGE_DESC, mallImageDesc
		);
	}
	
	public List<TMall> findByServiceCenter(Object serviceCenter
	) {
		return findByProperty(SERVICE_CENTER, serviceCenter
		);
	}
	
	public List<TMall> findByDefaultFreight(Object defaultFreight
	) {
		return findByProperty(DEFAULT_FREIGHT, defaultFreight
		);
	}
	
	public List<TMall> findBySelfDelivery(Object selfDelivery
	) {
		return findByProperty(SELF_DELIVERY, selfDelivery
		);
	}
	
	public List<TMall> findByIsUsingCustomWeChatPayAccount(Object isUsingCustomWeChatPayAccount
	) {
		return findByProperty(IS_USING_CUSTOM_WE_CHAT_PAY_ACCOUNT, isUsingCustomWeChatPayAccount
		);
	}
	

    

}
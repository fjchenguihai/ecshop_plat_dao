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
 * TWeixinUser entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TWeixinUser
 * @author MyEclipse Persistence Tools
 */
@Component
public class TWeixinUserDAO extends HibernateGenericDao<TWeixinUser, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TWeixinUserDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String USER_ID = "userId";
	public static final String REFERRER_USER_ID = "referrerUserId";
	public static final String SOURCE_USER_ID = "sourceUserId";
	public static final String SUBSCRIBE = "subscribe";
	public static final String OPENID = "openid";
	public static final String VE_OPEN_ID = "veOpenId";
	public static final String OLD_UNIONID = "oldUnionid";
	public static final String NICKNAME = "nickname";
	public static final String SEX = "sex";
	public static final String CITY = "city";
	public static final String PROVINCE = "province";
	public static final String COUNTRY = "country";
	public static final String LANGUAGE = "language";
	public static final String HEADIMGURL = "headimgurl";
	public static final String REMARK = "remark";
	public static final String PLAT_TYPE = "platType";
	public static final String APP_ID = "appId";
	public static final String PLAT_UNIONID = "platUnionid";

	public TWeixinUser findById(java.lang.Long id) {
		log.debug("getting TWeixinUser instance with id: " + id);
		try {
			TWeixinUser instance = (TWeixinUser) getSession().get(
					"com.vveplat.dao.business.models.TWeixinUser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TWeixinUser> findByExample(TWeixinUser instance) {
		log.debug("finding TWeixinUser instance by example");
		try {
			List<TWeixinUser> results = (List<TWeixinUser>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TWeixinUser").add(
							create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TWeixinUser> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TWeixinUser> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TWeixinUser> findByReferrerUserId(Object referrerUserId) {
		return findByProperty(REFERRER_USER_ID, referrerUserId);
	}

	public List<TWeixinUser> findBySourceUserId(Object sourceUserId) {
		return findByProperty(SOURCE_USER_ID, sourceUserId);
	}

	public List<TWeixinUser> findBySubscribe(Object subscribe) {
		return findByProperty(SUBSCRIBE, subscribe);
	}

	public List<TWeixinUser> findByOpenid(Object openid) {
		return findByProperty(OPENID, openid);
	}

	public List<TWeixinUser> findByVeOpenId(Object veOpenId) {
		return findByProperty(VE_OPEN_ID, veOpenId);
	}

	public List<TWeixinUser> findByOldUnionid(Object oldUnionid) {
		return findByProperty(OLD_UNIONID, oldUnionid);
	}

	public List<TWeixinUser> findByNickname(Object nickname) {
		return findByProperty(NICKNAME, nickname);
	}

	public List<TWeixinUser> findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List<TWeixinUser> findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List<TWeixinUser> findByProvince(Object province) {
		return findByProperty(PROVINCE, province);
	}

	public List<TWeixinUser> findByCountry(Object country) {
		return findByProperty(COUNTRY, country);
	}

	public List<TWeixinUser> findByLanguage(Object language) {
		return findByProperty(LANGUAGE, language);
	}

	public List<TWeixinUser> findByHeadimgurl(Object headimgurl) {
		return findByProperty(HEADIMGURL, headimgurl);
	}

	public List<TWeixinUser> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List<TWeixinUser> findByPlatType(Object platType) {
		return findByProperty(PLAT_TYPE, platType);
	}

	public List<TWeixinUser> findByAppId(Object appId) {
		return findByProperty(APP_ID, appId);
	}

	public List<TWeixinUser> findByPlatUnionid(Object platUnionid) {
		return findByProperty(PLAT_UNIONID, platUnionid);
	}

}
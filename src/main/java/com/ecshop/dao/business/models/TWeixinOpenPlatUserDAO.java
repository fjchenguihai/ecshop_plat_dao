package com.ecshop.dao.business.models;

import java.util.Date;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TWeixinOpenPlatUser entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TWeixinOpenPlatUser
 * @author MyEclipse Persistence Tools
 */
@Component
public class TWeixinOpenPlatUserDAO extends
		HibernateGenericDao<TWeixinOpenPlatUser, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TWeixinOpenPlatUserDAO.class);
	// property constants
	public static final String PLAT_UNIONID = "platUnionid";
	public static final String USER_ID = "userId";
	public static final String REFERRER_USER_ID = "referrerUserId";
	public static final String REFERRER_SOURCE_TYPE = "referrerSourceType";
	public static final String REFERRER_SOURCE_APP_ID = "referrerSourceAppId";

	public TWeixinOpenPlatUser findById(java.lang.Long id) {
		log.debug("getting TWeixinOpenPlatUser instance with id: " + id);
		try {
			TWeixinOpenPlatUser instance = (TWeixinOpenPlatUser) getSession()
					.get("com.vveplat.dao.business.models.TWeixinOpenPlatUser",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TWeixinOpenPlatUser> findByExample(TWeixinOpenPlatUser instance) {
		log.debug("finding TWeixinOpenPlatUser instance by example");
		try {
			List<TWeixinOpenPlatUser> results = (List<TWeixinOpenPlatUser>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TWeixinOpenPlatUser")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TWeixinOpenPlatUser> findByPlatUnionid(Object platUnionid) {
		return findByProperty(PLAT_UNIONID, platUnionid);
	}

	public List<TWeixinOpenPlatUser> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TWeixinOpenPlatUser> findByReferrerUserId(Object referrerUserId) {
		return findByProperty(REFERRER_USER_ID, referrerUserId);
	}

	public List<TWeixinOpenPlatUser> findByReferrerSourceType(
			Object referrerSourceType) {
		return findByProperty(REFERRER_SOURCE_TYPE, referrerSourceType);
	}

	public List<TWeixinOpenPlatUser> findByReferrerSourceAppId(
			Object referrerSourceAppId) {
		return findByProperty(REFERRER_SOURCE_APP_ID, referrerSourceAppId);
	}

}
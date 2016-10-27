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
 * TShareLinkAccessLog entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TShareLinkAccessLog
 * @author MyEclipse Persistence Tools
 */
@Component
public class TShareLinkAccessLogDAO extends
		HibernateGenericDao<TShareLinkAccessLog, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TShareLinkAccessLogDAO.class);
	// property constants
	public static final String LINK_ID = "linkId";
	public static final String APP_ID = "appId";
	public static final String OWNER_ID = "ownerId";
	public static final String SEX = "sex";
	public static final String CITY = "city";
	public static final String PROVINCE = "province";
	public static final String COUNTRY = "country";
	public static final String VISITOR_ID = "visitorId";
	public static final String OPEN_ID = "openId";
	public static final String NICKNAME = "nickname";
	public static final String IP_ADDRESS = "ipAddress";

	public TShareLinkAccessLog findById(java.lang.Long id) {
		log.debug("getting TShareLinkAccessLog instance with id: " + id);
		try {
			TShareLinkAccessLog instance = (TShareLinkAccessLog) getSession()
					.get("com.vveplat.dao.business.models.TShareLinkAccessLog",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TShareLinkAccessLog> findByExample(TShareLinkAccessLog instance) {
		log.debug("finding TShareLinkAccessLog instance by example");
		try {
			List<TShareLinkAccessLog> results = (List<TShareLinkAccessLog>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TShareLinkAccessLog")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TShareLinkAccessLog> findByLinkId(Object linkId) {
		return findByProperty(LINK_ID, linkId);
	}

	public List<TShareLinkAccessLog> findByAppId(Object appId) {
		return findByProperty(APP_ID, appId);
	}

	public List<TShareLinkAccessLog> findByOwnerId(Object ownerId) {
		return findByProperty(OWNER_ID, ownerId);
	}

	public List<TShareLinkAccessLog> findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List<TShareLinkAccessLog> findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List<TShareLinkAccessLog> findByProvince(Object province) {
		return findByProperty(PROVINCE, province);
	}

	public List<TShareLinkAccessLog> findByCountry(Object country) {
		return findByProperty(COUNTRY, country);
	}

	public List<TShareLinkAccessLog> findByVisitorId(Object visitorId) {
		return findByProperty(VISITOR_ID, visitorId);
	}

	public List<TShareLinkAccessLog> findByOpenId(Object openId) {
		return findByProperty(OPEN_ID, openId);
	}

	public List<TShareLinkAccessLog> findByNickname(Object nickname) {
		return findByProperty(NICKNAME, nickname);
	}

	public List<TShareLinkAccessLog> findByIpAddress(Object ipAddress) {
		return findByProperty(IP_ADDRESS, ipAddress);
	}

}
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
 * TAccessToken entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TAccessToken
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAccessTokenDAO extends HibernateGenericDao<TAccessToken, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TAccessTokenDAO.class);
	// property constants
	public static final String APPID = "appid";
	public static final String TOKEN = "token";
	public static final String REFRESH_TOKEN = "refreshToken";
	public static final String TYPE = "type";
	public static final String USER_NAME = "userName";
	public static final String TICKET = "ticket";

	public TAccessToken findById(java.lang.Long id) {
		log.debug("getting TAccessToken instance with id: " + id);
		try {
			TAccessToken instance = (TAccessToken) getSession().get(
					"com.vveplat.dao.business.models.TAccessToken", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAccessToken> findByExample(TAccessToken instance) {
		log.debug("finding TAccessToken instance by example");
		try {
			List<TAccessToken> results = (List<TAccessToken>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TAccessToken")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAccessToken> findByAppid(Object appid) {
		return findByProperty(APPID, appid);
	}

	public List<TAccessToken> findByToken(Object token) {
		return findByProperty(TOKEN, token);
	}

	public List<TAccessToken> findByRefreshToken(Object refreshToken) {
		return findByProperty(REFRESH_TOKEN, refreshToken);
	}

	public List<TAccessToken> findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List<TAccessToken> findByUserName(Object userName) {
		return findByProperty(USER_NAME, userName);
	}

	public List<TAccessToken> findByTicket(Object ticket) {
		return findByProperty(TICKET, ticket);
	}

}
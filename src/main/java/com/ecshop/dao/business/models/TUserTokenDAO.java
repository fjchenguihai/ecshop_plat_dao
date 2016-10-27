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
 * TUserToken entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TUserToken
 * @author MyEclipse Persistence Tools
 */
@Component
public class TUserTokenDAO extends HibernateGenericDao<TUserToken, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TUserTokenDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String TOKEN = "token";
	public static final String TYPE_ID = "typeId";
	public static final String REMARK = "remark";

	public TUserToken findById(java.lang.Long id) {
		log.debug("getting TUserToken instance with id: " + id);
		try {
			TUserToken instance = (TUserToken) getSession().get(
					"com.vveplat.dao.business.models.TUserToken", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TUserToken> findByExample(TUserToken instance) {
		log.debug("finding TUserToken instance by example");
		try {
			List<TUserToken> results = (List<TUserToken>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TUserToken")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TUserToken> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TUserToken> findByToken(Object token) {
		return findByProperty(TOKEN, token);
	}

	public List<TUserToken> findByTypeId(Object typeId) {
		return findByProperty(TYPE_ID, typeId);
	}

	public List<TUserToken> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

}
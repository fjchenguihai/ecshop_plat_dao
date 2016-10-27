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
 * TUserRelation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TUserRelation
 * @author MyEclipse Persistence Tools
 */
@Component
public class TUserRelationDAO extends HibernateGenericDao<TUserRelation, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TUserRelationDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String UP_USER_ID = "upUserId";
	public static final String USERTYPE_ID = "usertypeId";
	public static final String REMARK = "remark";

	public TUserRelation findById(java.lang.Long id) {
		log.debug("getting TUserRelation instance with id: " + id);
		try {
			TUserRelation instance = (TUserRelation) getSession().get(
					"com.vveplat.dao.business.models.TUserRelation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TUserRelation> findByExample(TUserRelation instance) {
		log.debug("finding TUserRelation instance by example");
		try {
			List<TUserRelation> results = (List<TUserRelation>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TUserRelation")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TUserRelation> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TUserRelation> findByUpUserId(Object upUserId) {
		return findByProperty(UP_USER_ID, upUserId);
	}

	public List<TUserRelation> findByUsertypeId(Object usertypeId) {
		return findByProperty(USERTYPE_ID, usertypeId);
	}

	public List<TUserRelation> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

}
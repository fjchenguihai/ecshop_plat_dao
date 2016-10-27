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
 * VUserRelation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VUserRelation
 * @author MyEclipse Persistence Tools
 */
@Component
public class VUserRelationDAO extends HibernateGenericDao<VUserRelation, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VUserRelationDAO.class);
	// property constants 
	public static final String USER_ID = "userId";
	public static final String UP_USER_ID = "upUserId"; 
	public static final String USERTYPE_ID = "usertypeId"; 
	public static final String REMARK = "remark";
	public static final String USERNAME = "username"; 
	public static final String HEAD_PIC = "headPic";
	public static final String NICKNAME = "nickname";
	public static final String REAL_NAME = "realName";
	public static final String UPUSERNAME = "upusername";
	public static final String USERTYPE_NAME = "usertypeName";
	public static final String TEAMLEVEL = "teamlevel";
	public static final String MOBILE = "mobile";
	public static final String UPMOBILE = "upMobile";

	public VUserRelation findById(java.lang.Long id) {
		log.debug("getting VUserRelation instance with id: " + id);
		try {
			VUserRelation instance = (VUserRelation) getSession().get(
					"com.vveplat.dao.business.models.VUserRelation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VUserRelation> findByExample(VUserRelation instance) {
		log.debug("finding VUserRelation instance by example");
		try {
			List<VUserRelation> results = (List<VUserRelation>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VUserRelation")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VUserRelation> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<VUserRelation> findByUpUserId(Object upUserId) {
		return findByProperty(UP_USER_ID, upUserId);
	}

	public List<VUserRelation> findByUsertypeId(Object usertypeId) {
		return findByProperty(USERTYPE_ID, usertypeId);
	}

	public List<VUserRelation> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List<VUserRelation> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<VUserRelation> findByHeadPic(Object headPic) {
		return findByProperty(HEAD_PIC, headPic);
	}

	public List<VUserRelation> findByNickname(Object nickname) {
		return findByProperty(NICKNAME, nickname);
	}

	public List<VUserRelation> findByRealName(Object realName) {
		return findByProperty(REAL_NAME, realName);
	}

	public List<VUserRelation> findByUpusername(Object upusername) {
		return findByProperty(UPUSERNAME, upusername);
	}

	public List<VUserRelation> findByUsertypeName(Object usertypeName) {
		return findByProperty(USERTYPE_NAME, usertypeName);
	}

	public List<VUserRelation> findByTeamlevel(Object teamlevel) {
		return findByProperty(TEAMLEVEL, teamlevel);
	}
	
	public List<VUserRelation> findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}
	
	public List<VUserRelation> findByUpMobile(Object upMobile) {
		return findByProperty(UPMOBILE, upMobile);
	}

}
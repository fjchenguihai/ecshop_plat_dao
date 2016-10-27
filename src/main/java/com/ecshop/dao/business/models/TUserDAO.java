package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for TUser
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TUser
 * @author MyEclipse Persistence Tools
 */
@Component
public class TUserDAO extends HibernateGenericDao<TUser, Long> {
	private static final Logger log = LoggerFactory.getLogger(TUserDAO.class);
	// property constants
	public static final String USERTYPE_ID = "usertypeId";
	public static final String USERNAME = "username";
	public static final String REAL_NAME = "realName";
	public static final String ADDRESS = "address";
	public static final String MOBILE = "mobile";
	public static final String SEX = "sex";
	public static final String TELEPHONE = "telephone";
	public static final String EMAIL = "email";
	public static final String DELETESTATUS = "deletestatus";
	public static final String NICKNAME = "nickname";
	public static final String USER_SOURCE = "userSource";
	public static final String PASSWORD = "password";
	public static final String AREACODE = "areacode";
	public static final String HEAD_PIC = "headPic";
	public static final String REFEREE_USER_ID = "refereeUserId";
	public static final String CARD_TYPE = "cardType";
	public static final String IDCARD_PIC = "idcardPic";
	public static final String IDCARD_BACK_PIC = "idcardBackPic";
	public static final String IDCARD = "idcard";

	public TUser findById(java.lang.Long id) {
		log.debug("getting TUser instance with id: " + id);
		try {
			TUser instance = (TUser) getSession().get(
					"com.vveplat.dao.business.models.TUser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TUser> findByExample(TUser instance) {
		log.debug("finding TUser instance by example");
		try {
			List<TUser> results = (List<TUser>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TUser")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TUser> findByUsertypeId(Object usertypeId) {
		return findByProperty(USERTYPE_ID, usertypeId);
	}

	public List<TUser> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<TUser> findByRealName(Object realName) {
		return findByProperty(REAL_NAME, realName);
	}

	public List<TUser> findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List<TUser> findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List<TUser> findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List<TUser> findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	public List<TUser> findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List<TUser> findByDeletestatus(Object deletestatus) {
		return findByProperty(DELETESTATUS, deletestatus);
	}

	public List<TUser> findByNickname(Object nickname) {
		return findByProperty(NICKNAME, nickname);
	}

	public List<TUser> findByUserSource(Object userSource) {
		return findByProperty(USER_SOURCE, userSource);
	}

	public List<TUser> findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List<TUser> findByAreacode(Object areacode) {
		return findByProperty(AREACODE, areacode);
	}

	public List<TUser> findByHeadPic(Object headPic) {
		return findByProperty(HEAD_PIC, headPic);
	}

	public List<TUser> findByRefereeUserId(Object refereeUserId) {
		return findByProperty(REFEREE_USER_ID, refereeUserId);
	}

	public List<TUser> findByCardType(Object cardType) {
		return findByProperty(CARD_TYPE, cardType);
	}

	public List<TUser> findByIdcardPic(Object idcardPic) {
		return findByProperty(IDCARD_PIC, idcardPic);
	}

	public List<TUser> findByIdcardBackPic(Object idcardBackPic) {
		return findByProperty(IDCARD_BACK_PIC, idcardBackPic);
	}

	public List<TUser> findByIdcard(Object idcard) {
		return findByProperty(IDCARD, idcard);
	}

}
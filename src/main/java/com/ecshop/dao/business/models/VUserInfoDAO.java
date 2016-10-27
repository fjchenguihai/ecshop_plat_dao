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
 * VUserInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VUserInfo
 * @author MyEclipse Persistence Tools
 */
@Component
public class VUserInfoDAO extends HibernateGenericDao<VUserInfo, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VUserInfoDAO.class);
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
	public static final String USER_RELATION_ID = "userRelationId";
	public static final String UP_USER_ID = "upUserId";
	public static final String HISTYPEID = "histypeid";
	public static final String HISTYPENAME = "histypename";
	public static final String USERTYPENAME = "usertypename";

	public VUserInfo findById(java.lang.Long id) {
		log.debug("getting VUserInfo instance with id: " + id);
		try {
			VUserInfo instance = (VUserInfo) getSession().get(
					"com.vveplat.dao.business.models.VUserInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VUserInfo> findByExample(VUserInfo instance) {
		log.debug("finding VUserInfo instance by example");
		try {
			List<VUserInfo> results = (List<VUserInfo>) getSession()
					.createCriteria("com.vveplat.dao.business.models.VUserInfo")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VUserInfo> findByUsertypeId(Object usertypeId) {
		return findByProperty(USERTYPE_ID, usertypeId);
	}

	public List<VUserInfo> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<VUserInfo> findByRealName(Object realName) {
		return findByProperty(REAL_NAME, realName);
	}

	public List<VUserInfo> findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List<VUserInfo> findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List<VUserInfo> findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List<VUserInfo> findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	public List<VUserInfo> findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List<VUserInfo> findByDeletestatus(Object deletestatus) {
		return findByProperty(DELETESTATUS, deletestatus);
	}

	public List<VUserInfo> findByNickname(Object nickname) {
		return findByProperty(NICKNAME, nickname);
	}

	public List<VUserInfo> findByUserSource(Object userSource) {
		return findByProperty(USER_SOURCE, userSource);
	}

	public List<VUserInfo> findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List<VUserInfo> findByAreacode(Object areacode) {
		return findByProperty(AREACODE, areacode);
	}

	public List<VUserInfo> findByHeadPic(Object headPic) {
		return findByProperty(HEAD_PIC, headPic);
	}

	public List<VUserInfo> findByRefereeUserId(Object refereeUserId) {
		return findByProperty(REFEREE_USER_ID, refereeUserId);
	}

	public List<VUserInfo> findByCardType(Object cardType) {
		return findByProperty(CARD_TYPE, cardType);
	}

	public List<VUserInfo> findByIdcardPic(Object idcardPic) {
		return findByProperty(IDCARD_PIC, idcardPic);
	}

	public List<VUserInfo> findByIdcardBackPic(Object idcardBackPic) {
		return findByProperty(IDCARD_BACK_PIC, idcardBackPic);
	}

	public List<VUserInfo> findByIdcard(Object idcard) {
		return findByProperty(IDCARD, idcard);
	}

	public List<VUserInfo> findByUserRelationId(Object userRelationId) {
		return findByProperty(USER_RELATION_ID, userRelationId);
	}

	public List<VUserInfo> findByUpUserId(Object upUserId) {
		return findByProperty(UP_USER_ID, upUserId);
	}

	public List<VUserInfo> findByHistypeid(Object histypeid) {
		return findByProperty(HISTYPEID, histypeid);
	}

	public List<VUserInfo> findByHistypename(Object histypename) {
		return findByProperty(HISTYPENAME, histypename);
	}

	public List<VUserInfo> findByUsertypename(Object usertypename) {
		return findByProperty(USERTYPENAME, usertypename);
	}

}
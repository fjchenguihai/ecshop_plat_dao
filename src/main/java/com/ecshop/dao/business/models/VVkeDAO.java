package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for VVke
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VVke
 * @author MyEclipse Persistence Tools
 */
@Component
public class VVkeDAO extends HibernateGenericDao<VVke, Long> {
	private static final Logger log = LoggerFactory.getLogger(VVkeDAO.class);
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

	public VVke findById(java.lang.Long id) {
		log.debug("getting VVke instance with id: " + id);
		try {
			VVke instance = (VVke) getSession().get(
					"com.vveplat.dao.business.models.VVke", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VVke> findByExample(VVke instance) {
		log.debug("finding VVke instance by example");
		try {
			List<VVke> results = (List<VVke>) getSession()
					.createCriteria("com.vveplat.dao.business.models.VVke")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VVke> findByUsertypeId(Object usertypeId) {
		return findByProperty(USERTYPE_ID, usertypeId);
	}

	public List<VVke> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<VVke> findByRealName(Object realName) {
		return findByProperty(REAL_NAME, realName);
	}

	public List<VVke> findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List<VVke> findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List<VVke> findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List<VVke> findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	public List<VVke> findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List<VVke> findByDeletestatus(Object deletestatus) {
		return findByProperty(DELETESTATUS, deletestatus);
	}

	public List<VVke> findByNickname(Object nickname) {
		return findByProperty(NICKNAME, nickname);
	}

	public List<VVke> findByUserSource(Object userSource) {
		return findByProperty(USER_SOURCE, userSource);
	}

	public List<VVke> findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List<VVke> findByAreacode(Object areacode) {
		return findByProperty(AREACODE, areacode);
	}

	public List<VVke> findByHeadPic(Object headPic) {
		return findByProperty(HEAD_PIC, headPic);
	}

	public List<VVke> findByRefereeUserId(Object refereeUserId) {
		return findByProperty(REFEREE_USER_ID, refereeUserId);
	}

	public List<VVke> findByCardType(Object cardType) {
		return findByProperty(CARD_TYPE, cardType);
	}

	public List<VVke> findByIdcardPic(Object idcardPic) {
		return findByProperty(IDCARD_PIC, idcardPic);
	}

	public List<VVke> findByIdcardBackPic(Object idcardBackPic) {
		return findByProperty(IDCARD_BACK_PIC, idcardBackPic);
	}

	public List<VVke> findByIdcard(Object idcard) {
		return findByProperty(IDCARD, idcard);
	}

}
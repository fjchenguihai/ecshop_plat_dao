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
 * TVipApply entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TVipApply
 * @author MyEclipse Persistence Tools
 */
@Component
public class TVipApplyDAO extends HibernateGenericDao<TVipApply, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TVipApplyDAO.class);
	// property constants
	public static final String APPLY_TYPE = "applyType";
	public static final String USER_ID = "userId";
	public static final String MALL_ID = "mallId";
	public static final String USERTYPE_ID = "usertypeId";
	public static final String AUTHENTICATIONSTATUS = "authenticationstatus";
	public static final String INVITATION_CODE = "invitationCode";
	public static final String VVESTRINGCODE = "vvestringcode";
	public static final String EXAMINE_REASON = "examineReason";
	public static final String CARD_TYPE = "cardType";
	public static final String PIC_URL = "picUrl";
	public static final String IDCARD = "idcard";
	public static final String BANK = "bank";
	public static final String OPEN_BANK = "openBank";
	public static final String BANK_CARD = "bankCard";
	public static final String REAL_NAME = "realName";
	public static final String PROVINCE_ID = "provinceId";
	public static final String CITY_ID = "cityId";
	public static final String DISTRICT_ID = "districtId";

	public TVipApply findById(java.lang.Long id) {
		log.debug("getting TVipApply instance with id: " + id);
		try {
			TVipApply instance = (TVipApply) getSession().get(
					"com.vveplat.dao.business.models.TVipApply", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TVipApply> findByExample(TVipApply instance) {
		log.debug("finding TVipApply instance by example");
		try {
			List<TVipApply> results = (List<TVipApply>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TVipApply")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TVipApply> findByApplyType(Object applyType) {
		return findByProperty(APPLY_TYPE, applyType);
	}

	public List<TVipApply> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TVipApply> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TVipApply> findByUsertypeId(Object usertypeId) {
		return findByProperty(USERTYPE_ID, usertypeId);
	}

	public List<TVipApply> findByAuthenticationstatus(
			Object authenticationstatus) {
		return findByProperty(AUTHENTICATIONSTATUS, authenticationstatus);
	}

	public List<TVipApply> findByInvitationCode(Object invitationCode) {
		return findByProperty(INVITATION_CODE, invitationCode);
	}

	public List<TVipApply> findByVvestringcode(Object vvestringcode) {
		return findByProperty(VVESTRINGCODE, vvestringcode);
	}

	public List<TVipApply> findByExamineReason(Object examineReason) {
		return findByProperty(EXAMINE_REASON, examineReason);
	}

	public List<TVipApply> findByCardType(Object cardType) {
		return findByProperty(CARD_TYPE, cardType);
	}

	public List<TVipApply> findByPicUrl(Object picUrl) {
		return findByProperty(PIC_URL, picUrl);
	}

	public List<TVipApply> findByIdcard(Object idcard) {
		return findByProperty(IDCARD, idcard);
	}

	public List<TVipApply> findByBank(Object bank) {
		return findByProperty(BANK, bank);
	}

	public List<TVipApply> findByOpenBank(Object openBank) {
		return findByProperty(OPEN_BANK, openBank);
	}

	public List<TVipApply> findByBankCard(Object bankCard) {
		return findByProperty(BANK_CARD, bankCard);
	}

	public List<TVipApply> findByRealName(Object realName) {
		return findByProperty(REAL_NAME, realName);
	}

	public List<TVipApply> findByProvinceId(Object provinceId) {
		return findByProperty(PROVINCE_ID, provinceId);
	}

	public List<TVipApply> findByCityId(Object cityId) {
		return findByProperty(CITY_ID, cityId);
	}

	public List<TVipApply> findByDistrictId(Object districtId) {
		return findByProperty(DISTRICT_ID, districtId);
	}

}
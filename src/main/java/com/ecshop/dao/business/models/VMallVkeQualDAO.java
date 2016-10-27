package com.ecshop.dao.business.models;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * VMallVkeQual entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VMallVkeQual
 * @author MyEclipse Persistence Tools
 */
@Component
public class VMallVkeQualDAO extends HibernateGenericDao<VMallVkeQual, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VMallVkeQualDAO.class);
	// property constants
	public static final String USERTYPE_ID = "usertypeId";
	public static final String REAL_NAME = "realName";
	public static final String MOBILE = "mobile";
	public static final String NICKNAME = "nickname";
	public static final String HEAD_PIC = "headPic";
	public static final String INVITATION_CODE = "invitationCode";
	public static final String STATUS = "status";
	public static final String MALL_DEALERS_ID = "mallDealersId";
	public static final String MALL_ID = "mallId";
	public static final String AMOUNT = "amount";
	public static final String AMOUNT_QUAL = "amountQual";

	public VMallVkeQual findById(java.lang.Long id) {
		log.debug("getting VMallVkeQual instance with id: " + id);
		try {
			VMallVkeQual instance = (VMallVkeQual) getSession().get(
					"com.vveplat.dao.business.models.VMallVkeQual", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VMallVkeQual> findByExample(VMallVkeQual instance) {
		log.debug("finding VMallVkeQual instance by example");
		try {
			List<VMallVkeQual> results = (List<VMallVkeQual>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VMallVkeQual")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VMallVkeQual> findByUsertypeId(Object usertypeId) {
		return findByProperty(USERTYPE_ID, usertypeId);
	}

	public List<VMallVkeQual> findByRealName(Object realName) {
		return findByProperty(REAL_NAME, realName);
	}

	public List<VMallVkeQual> findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List<VMallVkeQual> findByNickname(Object nickname) {
		return findByProperty(NICKNAME, nickname);
	}

	public List<VMallVkeQual> findByHeadPic(Object headPic) {
		return findByProperty(HEAD_PIC, headPic);
	}

	public List<VMallVkeQual> findByInvitationCode(Object invitationCode) {
		return findByProperty(INVITATION_CODE, invitationCode);
	}

	public List<VMallVkeQual> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<VMallVkeQual> findByMallDealersId(Object mallDealersId) {
		return findByProperty(MALL_DEALERS_ID, mallDealersId);
	}

	public List<VMallVkeQual> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VMallVkeQual> findByAmount(Object amount) {
		return findByProperty(AMOUNT, amount);
	}

	public List<VMallVkeQual> findByAmountQual(Object amountQual) {
		return findByProperty(AMOUNT_QUAL, amountQual);
	}

}
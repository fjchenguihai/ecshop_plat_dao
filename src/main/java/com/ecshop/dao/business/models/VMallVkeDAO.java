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
 * VMallVke entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VMallVke
 * @author MyEclipse Persistence Tools
 */
@Component
public class VMallVkeDAO extends HibernateGenericDao<VMallVke, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VMallVkeDAO.class);
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

	public VMallVke findById(java.lang.Long id) {
		log.debug("getting VMallVke instance with id: " + id);
		try {
			VMallVke instance = (VMallVke) getSession().get(
					"com.vveplat.dao.business.models.VMallVke", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VMallVke> findByExample(VMallVke instance) {
		log.debug("finding VMallVke instance by example");
		try {
			List<VMallVke> results = (List<VMallVke>) getSession()
					.createCriteria("com.vveplat.dao.business.models.VMallVke")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VMallVke> findByUsertypeId(Object usertypeId) {
		return findByProperty(USERTYPE_ID, usertypeId);
	}

	public List<VMallVke> findByRealName(Object realName) {
		return findByProperty(REAL_NAME, realName);
	}

	public List<VMallVke> findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List<VMallVke> findByNickname(Object nickname) {
		return findByProperty(NICKNAME, nickname);
	}

	public List<VMallVke> findByHeadPic(Object headPic) {
		return findByProperty(HEAD_PIC, headPic);
	}

	public List<VMallVke> findByInvitationCode(Object invitationCode) {
		return findByProperty(INVITATION_CODE, invitationCode);
	}

	public List<VMallVke> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<VMallVke> findByMallDealersId(Object mallDealersId) {
		return findByProperty(MALL_DEALERS_ID, mallDealersId);
	}

	public List<VMallVke> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VMallVke> findByAmount(Object amount) {
		return findByProperty(AMOUNT, amount);
	}

}
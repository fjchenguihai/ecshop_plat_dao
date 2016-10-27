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
 * TMallChecker entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallChecker
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallCheckerDAO extends HibernateGenericDao<TMallChecker, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallCheckerDAO.class);
	// property constants
	public static final String WEIXIN_OPEN_ID = "weixinOpenId";
	public static final String MALL_ID = "mallId";
	public static final String STATUS = "status";
	public static final String NICK_NAME = "nickName";
	public static final String HEADIMGURL = "headimgurl";
	public static final String REMARK = "remark";

	public TMallChecker findById(java.lang.Long id) {
		log.debug("getting TMallChecker instance with id: " + id);
		try {
			TMallChecker instance = (TMallChecker) getSession().get(
					"com.vveplat.dao.business.models.TMallChecker", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallChecker> findByExample(TMallChecker instance) {
		log.debug("finding TMallChecker instance by example");
		try {
			List<TMallChecker> results = (List<TMallChecker>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallChecker")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallChecker> findByWeixinOpenId(Object weixinOpenId) {
		return findByProperty(WEIXIN_OPEN_ID, weixinOpenId);
	}

	public List<TMallChecker> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMallChecker> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<TMallChecker> findByNickName(Object nickName) {
		return findByProperty(NICK_NAME, nickName);
	}

	public List<TMallChecker> findByHeadimgurl(Object headimgurl) {
		return findByProperty(HEADIMGURL, headimgurl);
	}

	public List<TMallChecker> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

}
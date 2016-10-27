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
 * TCheckLog entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TCheckLog
 * @author MyEclipse Persistence Tools
 */
@Component
public class TCheckLogDAO extends HibernateGenericDao<TCheckLog, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TCheckLogDAO.class);
	// property constants
	public static final String WEIXIN_OPEN_ID = "weixinOpenId";
	public static final String MALL_ID = "mallId";
	public static final String ORDER_ID = "orderId";
	public static final String NICK_NAME = "nickName";
	public static final String HEADIMGURL = "headimgurl";
	public static final String REMARK = "remark";

	public TCheckLog findById(java.lang.Long id) {
		log.debug("getting TCheckLog instance with id: " + id);
		try {
			TCheckLog instance = (TCheckLog) getSession().get(
					"com.vveplat.dao.business.models.TCheckLog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TCheckLog> findByExample(TCheckLog instance) {
		log.debug("finding TCheckLog instance by example");
		try {
			List<TCheckLog> results = (List<TCheckLog>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TCheckLog")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TCheckLog> findByWeixinOpenId(Object weixinOpenId) {
		return findByProperty(WEIXIN_OPEN_ID, weixinOpenId);
	}

	public List<TCheckLog> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TCheckLog> findByOrderId(Object orderId) {
		return findByProperty(ORDER_ID, orderId);
	}

	public List<TCheckLog> findByNickName(Object nickName) {
		return findByProperty(NICK_NAME, nickName);
	}

	public List<TCheckLog> findByHeadimgurl(Object headimgurl) {
		return findByProperty(HEADIMGURL, headimgurl);
	}

	public List<TCheckLog> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

}
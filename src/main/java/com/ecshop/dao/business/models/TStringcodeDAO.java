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
 * TStringcode entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TStringcode
 * @author MyEclipse Persistence Tools
 */
@Component
public class TStringcodeDAO extends HibernateGenericDao<TStringcode, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TStringcodeDAO.class);
	// property constants
	public static final String STRINGCODE = "stringcode";
	public static final String STATUS = "status";
	public static final String ORDER_TYPE = "orderType";
	public static final String ORDER_ID = "orderId";
	public static final String ORDER_GOODS_ID = "orderGoodsId";
	public static final String ORDER_NO = "orderNo";
	public static final String USER_ID = "userId";
	public static final String USETYPE = "usetype";

	public TStringcode findById(java.lang.Long id) {
		log.debug("getting TStringcode instance with id: " + id);
		try {
			TStringcode instance = (TStringcode) getSession().get(
					"com.vveplat.dao.business.models.TStringcode", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TStringcode> findByExample(TStringcode instance) {
		log.debug("finding TStringcode instance by example");
		try {
			List<TStringcode> results = (List<TStringcode>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TStringcode")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TStringcode> findByStringcode(Object stringcode) {
		return findByProperty(STRINGCODE, stringcode);
	}

	public List<TStringcode> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<TStringcode> findByOrderType(Object orderType) {
		return findByProperty(ORDER_TYPE, orderType);
	}

	public List<TStringcode> findByOrderId(Object orderId) {
		return findByProperty(ORDER_ID, orderId);
	}

	public List<TStringcode> findByOrderGoodsId(Object orderGoodsId) {
		return findByProperty(ORDER_GOODS_ID, orderGoodsId);
	}

	public List<TStringcode> findByOrderNo(Object orderNo) {
		return findByProperty(ORDER_NO, orderNo);
	}

	public List<TStringcode> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TStringcode> findByUsetype(Object usetype) {
		return findByProperty(USETYPE, usetype);
	}

}
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
 * TAdditionalOrderOfflineDetail entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.ecshop.dao.business.models.TAdditionalOrderOfflineDetail
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAdditionalOrderOfflineDetailDAO extends
		HibernateGenericDao<TAdditionalOrderOfflineDetail, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TAdditionalOrderOfflineDetailDAO.class);
	// property constants
	public static final String ADD_ORDER_OFFLINE_ID = "addOrderOfflineId";
	public static final String USER_ID = "userId";
	public static final String USER_TYPE_ID = "userTypeId";
	public static final String CENTER_ID = "centerId";
	public static final String OFFLINE_ORDER_ID = "offlineOrderId";
	public static final String OFFLINE_ORDER_GOODS_ID = "offlineOrderGoodsId";
	public static final String AMOUNT = "amount";

	public TAdditionalOrderOfflineDetail findById(java.lang.Long id) {
		log.debug("getting TAdditionalOrderOfflineDetail instance with id: "
				+ id);
		try {
			TAdditionalOrderOfflineDetail instance = (TAdditionalOrderOfflineDetail) getSession()
					.get("com.vveplat.dao.business.models.TAdditionalOrderOfflineDetail",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAdditionalOrderOfflineDetail> findByExample(
			TAdditionalOrderOfflineDetail instance) {
		log.debug("finding TAdditionalOrderOfflineDetail instance by example");
		try {
			List<TAdditionalOrderOfflineDetail> results = (List<TAdditionalOrderOfflineDetail>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TAdditionalOrderOfflineDetail")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAdditionalOrderOfflineDetail> findByAddOrderOfflineId(
			Object addOrderOfflineId) {
		return findByProperty(ADD_ORDER_OFFLINE_ID, addOrderOfflineId);
	}

	public List<TAdditionalOrderOfflineDetail> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TAdditionalOrderOfflineDetail> findByUserTypeId(
			Object userTypeId) {
		return findByProperty(USER_TYPE_ID, userTypeId);
	}

	public List<TAdditionalOrderOfflineDetail> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

	public List<TAdditionalOrderOfflineDetail> findByOfflineOrderId(
			Object offlineOrderId) {
		return findByProperty(OFFLINE_ORDER_ID, offlineOrderId);
	}

	public List<TAdditionalOrderOfflineDetail> findByOfflineOrderGoodsId(
			Object offlineOrderGoodsId) {
		return findByProperty(OFFLINE_ORDER_GOODS_ID, offlineOrderGoodsId);
	}

	public List<TAdditionalOrderOfflineDetail> findByAmount(Object amount) {
		return findByProperty(AMOUNT, amount);
	}

}
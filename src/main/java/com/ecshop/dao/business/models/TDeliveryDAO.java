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
 * TDelivery entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TDelivery
 * @author MyEclipse Persistence Tools
 */
@Component
public class TDeliveryDAO extends HibernateGenericDao<TDelivery, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TDeliveryDAO.class);
	// property constants
	public static final String DELIVERY_NO = "deliveryNo";
	public static final String ORDER_ID = "orderId";
	public static final String LOGISTICS_ID = "logisticsId";
	public static final String DELIVERY_ADDR_ID = "deliveryAddrId";
	public static final String LOGISTICS_NAME = "logisticsName";
	public static final String LOGISTICS_NO = "logisticsNo";
	public static final String STATUS = "status";
	public static final String REMARK = "remark";

	public TDelivery findById(java.lang.Long id) {
		log.debug("getting TDelivery instance with id: " + id);
		try {
			TDelivery instance = (TDelivery) getSession().get(
					"com.vveplat.dao.business.models.TDelivery", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TDelivery> findByExample(TDelivery instance) {
		log.debug("finding TDelivery instance by example");
		try {
			List<TDelivery> results = (List<TDelivery>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TDelivery")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TDelivery> findByDeliveryNo(Object deliveryNo) {
		return findByProperty(DELIVERY_NO, deliveryNo);
	}

	public List<TDelivery> findByOrderId(Object orderId) {
		return findByProperty(ORDER_ID, orderId);
	}

	public List<TDelivery> findByLogisticsId(Object logisticsId) {
		return findByProperty(LOGISTICS_ID, logisticsId);
	}

	public List<TDelivery> findByDeliveryAddrId(Object deliveryAddrId) {
		return findByProperty(DELIVERY_ADDR_ID, deliveryAddrId);
	}

	public List<TDelivery> findByLogisticsName(Object logisticsName) {
		return findByProperty(LOGISTICS_NAME, logisticsName);
	}

	public List<TDelivery> findByLogisticsNo(Object logisticsNo) {
		return findByProperty(LOGISTICS_NO, logisticsNo);
	}

	public List<TDelivery> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<TDelivery> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

}
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
 * TPayChannel entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TPayChannel
 * @author MyEclipse Persistence Tools
 */
@Component
public class TPayChannelDAO extends HibernateGenericDao<TPayChannel, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TPayChannelDAO.class);
	// property constants
	public static final String PAYMENT_TYPE_NAME = "paymentTypeName";
	public static final String CHANNEL_CODE = "channelCode";
	public static final String PAYMENT_TYPE_FEE = "paymentTypeFee";
	public static final String STATUS = "status";
	public static final String PAYMENT_TYPE_PIC = "paymentTypePic";
	public static final String PAYMENT_TYPE_URL = "paymentTypeUrl";

	public TPayChannel findById(java.lang.Long id) {
		log.debug("getting TPayChannel instance with id: " + id);
		try {
			TPayChannel instance = (TPayChannel) getSession().get(
					"com.vveplat.dao.business.models.TPayChannel", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TPayChannel> findByExample(TPayChannel instance) {
		log.debug("finding TPayChannel instance by example");
		try {
			List<TPayChannel> results = (List<TPayChannel>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TPayChannel")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TPayChannel> findByPaymentTypeName(Object paymentTypeName) {
		return findByProperty(PAYMENT_TYPE_NAME, paymentTypeName);
	}

	public List<TPayChannel> findByChannelCode(Object channelCode) {
		return findByProperty(CHANNEL_CODE, channelCode);
	}

	public List<TPayChannel> findByPaymentTypeFee(Object paymentTypeFee) {
		return findByProperty(PAYMENT_TYPE_FEE, paymentTypeFee);
	}

	public List<TPayChannel> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<TPayChannel> findByPaymentTypePic(Object paymentTypePic) {
		return findByProperty(PAYMENT_TYPE_PIC, paymentTypePic);
	}

	public List<TPayChannel> findByPaymentTypeUrl(Object paymentTypeUrl) {
		return findByProperty(PAYMENT_TYPE_URL, paymentTypeUrl);
	}

}
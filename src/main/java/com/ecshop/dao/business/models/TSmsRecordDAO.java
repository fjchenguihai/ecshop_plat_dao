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
 * TSmsRecord entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TSmsRecord
 * @author MyEclipse Persistence Tools
 */
@Component
public class TSmsRecordDAO extends HibernateGenericDao<TSmsRecord, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TSmsRecordDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String MOBILE = "mobile";
	public static final String CONTENT = "content";
	public static final String PURPOSE = "purpose";
	public static final String DELIVERY_TYPE = "deliveryType";
	public static final String DELIVERYSTATUS = "deliverystatus";
	public static final String CAPTCHAS = "captchas";
	public static final String CAPTCHAS_STATUS = "captchasStatus";

	public TSmsRecord findById(java.lang.Long id) {
		log.debug("getting TSmsRecord instance with id: " + id);
		try {
			TSmsRecord instance = (TSmsRecord) getSession().get(
					"com.vveplat.dao.business.models.TSmsRecord", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TSmsRecord> findByExample(TSmsRecord instance) {
		log.debug("finding TSmsRecord instance by example");
		try {
			List<TSmsRecord> results = (List<TSmsRecord>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TSmsRecord")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TSmsRecord> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TSmsRecord> findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List<TSmsRecord> findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List<TSmsRecord> findByPurpose(Object purpose) {
		return findByProperty(PURPOSE, purpose);
	}

	public List<TSmsRecord> findByDeliveryType(Object deliveryType) {
		return findByProperty(DELIVERY_TYPE, deliveryType);
	}

	public List<TSmsRecord> findByDeliverystatus(Object deliverystatus) {
		return findByProperty(DELIVERYSTATUS, deliverystatus);
	}

	public List<TSmsRecord> findByCaptchas(Object captchas) {
		return findByProperty(CAPTCHAS, captchas);
	}

	public List<TSmsRecord> findByCaptchasStatus(Object captchasStatus) {
		return findByProperty(CAPTCHAS_STATUS, captchasStatus);
	}

}
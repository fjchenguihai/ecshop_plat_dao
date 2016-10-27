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
 * TTemplateMessageInstance entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.ecshop.dao.business.models.TTemplateMessageInstance
 * @author MyEclipse Persistence Tools
 */
@Component
public class TTemplateMessageInstanceDAO extends
		HibernateGenericDao<TTemplateMessageInstance, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TTemplateMessageInstanceDAO.class);
	// property constants
	public static final String TEMPLATE_NO = "templateNo";
	public static final String TEMPLATE_ID = "templateId";
	public static final String TEMPLATE_KEY = "templateKey";
	public static final String MALL_ID = "mallId";

	public TTemplateMessageInstance findById(java.lang.Long id) {
		log.debug("getting TTemplateMessageInstance instance with id: " + id);
		try {
			TTemplateMessageInstance instance = (TTemplateMessageInstance) getSession()
					.get("com.vveplat.dao.business.models.TTemplateMessageInstance",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TTemplateMessageInstance> findByExample(
			TTemplateMessageInstance instance) {
		log.debug("finding TTemplateMessageInstance instance by example");
		try {
			List<TTemplateMessageInstance> results = (List<TTemplateMessageInstance>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TTemplateMessageInstance")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TTemplateMessageInstance> findByTemplateNo(Object templateNo) {
		return findByProperty(TEMPLATE_NO, templateNo);
	}

	public List<TTemplateMessageInstance> findByTemplateId(Object templateId) {
		return findByProperty(TEMPLATE_ID, templateId);
	}

	public List<TTemplateMessageInstance> findByTemplateKey(Object templateKey) {
		return findByProperty(TEMPLATE_KEY, templateKey);
	}

	public List<TTemplateMessageInstance> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

}
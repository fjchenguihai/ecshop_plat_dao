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
 * TTemplateMessage entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TTemplateMessage
 * @author MyEclipse Persistence Tools
 */
@Component
public class TTemplateMessageDAO extends
		HibernateGenericDao<TTemplateMessage, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TTemplateMessageDAO.class);
	// property constants
	public static final String TEMPLATE_NO = "templateNo";
	public static final String TEMPLATE_TITLE = "templateTitle";
	public static final String PRIMARY_INDUSTRY = "primaryIndustry";
	public static final String SECOND_INDUSTRY = "secondIndustry";
	public static final String DETAIL_CONTENT = "detailContent";
	public static final String CONTENT_SAMPLE = "contentSample";
	public static final String GLOBAL_FLAG = "globalFlag";
	public static final String TEMPLATE_KEY = "templateKey";
	public static final String MALL_ID = "mallId";
	public static final String PLAT_TYPE = "platType";
	public static final String TEMPLATE_STATUS = "templateStatus";

	public TTemplateMessage findById(java.lang.Long id) {
		log.debug("getting TTemplateMessage instance with id: " + id);
		try {
			TTemplateMessage instance = (TTemplateMessage) getSession().get(
					"com.vveplat.dao.business.models.TTemplateMessage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TTemplateMessage> findByExample(TTemplateMessage instance) {
		log.debug("finding TTemplateMessage instance by example");
		try {
			List<TTemplateMessage> results = (List<TTemplateMessage>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TTemplateMessage")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TTemplateMessage> findByTemplateNo(Object templateNo) {
		return findByProperty(TEMPLATE_NO, templateNo);
	}

	public List<TTemplateMessage> findByTemplateTitle(Object templateTitle) {
		return findByProperty(TEMPLATE_TITLE, templateTitle);
	}

	public List<TTemplateMessage> findByPrimaryIndustry(Object primaryIndustry) {
		return findByProperty(PRIMARY_INDUSTRY, primaryIndustry);
	}

	public List<TTemplateMessage> findBySecondIndustry(Object secondIndustry) {
		return findByProperty(SECOND_INDUSTRY, secondIndustry);
	}

	public List<TTemplateMessage> findByDetailContent(Object detailContent) {
		return findByProperty(DETAIL_CONTENT, detailContent);
	}

	public List<TTemplateMessage> findByContentSample(Object contentSample) {
		return findByProperty(CONTENT_SAMPLE, contentSample);
	}

	public List<TTemplateMessage> findByGlobalFlag(Object globalFlag) {
		return findByProperty(GLOBAL_FLAG, globalFlag);
	}

	public List<TTemplateMessage> findByTemplateKey(Object templateKey) {
		return findByProperty(TEMPLATE_KEY, templateKey);
	}

	public List<TTemplateMessage> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TTemplateMessage> findByPlatType(Object platType) {
		return findByProperty(PLAT_TYPE, platType);
	}

	public List<TTemplateMessage> findByTemplateStatus(Object templateStatus) {
		return findByProperty(TEMPLATE_STATUS, templateStatus);
	}

}
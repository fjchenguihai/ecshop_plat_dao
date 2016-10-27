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
 * TMallWeixinKeywordReplyRule entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.ecshop.dao.business.models.TMallWeixinKeywordReplyRule
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallWeixinKeywordReplyRuleDAO extends
		HibernateGenericDao<TMallWeixinKeywordReplyRule, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallWeixinKeywordReplyRuleDAO.class);
	// property constants
	public static final String RULE_NAME = "ruleName";
	public static final String MALL_ID = "mallId";
	public static final String KEY_STR = "keyStr";
	public static final String MATCH_TYPE = "matchType";
	public static final String REPLY_CONTENT = "replyContent";
	public static final String REPLY_CONTENT_TYPE = "replyContentType";
	public static final String WEIXIN_ORIGINAL_ID = "weixinOriginalId";
	public static final String DEPLOY_STATUS = "deployStatus";
	public static final String DELETE_STATUS = "deleteStatus";
	public static final String CRE_USER_ID = "creUserId";

	public TMallWeixinKeywordReplyRule findById(java.lang.Long id) {
		log.debug("getting TMallWeixinKeywordReplyRule instance with id: " + id);
		try {
			TMallWeixinKeywordReplyRule instance = (TMallWeixinKeywordReplyRule) getSession()
					.get("com.vveplat.dao.business.models.TMallWeixinKeywordReplyRule",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallWeixinKeywordReplyRule> findByExample(
			TMallWeixinKeywordReplyRule instance) {
		log.debug("finding TMallWeixinKeywordReplyRule instance by example");
		try {
			List<TMallWeixinKeywordReplyRule> results = (List<TMallWeixinKeywordReplyRule>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallWeixinKeywordReplyRule")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallWeixinKeywordReplyRule> findByRuleName(Object ruleName) {
		return findByProperty(RULE_NAME, ruleName);
	}

	public List<TMallWeixinKeywordReplyRule> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMallWeixinKeywordReplyRule> findByKeyStr(Object keyStr) {
		return findByProperty(KEY_STR, keyStr);
	}

	public List<TMallWeixinKeywordReplyRule> findByMatchType(Object matchType) {
		return findByProperty(MATCH_TYPE, matchType);
	}

	public List<TMallWeixinKeywordReplyRule> findByReplyContent(
			Object replyContent) {
		return findByProperty(REPLY_CONTENT, replyContent);
	}

	public List<TMallWeixinKeywordReplyRule> findByReplyContentType(
			Object replyContentType) {
		return findByProperty(REPLY_CONTENT_TYPE, replyContentType);
	}

	public List<TMallWeixinKeywordReplyRule> findByWeixinOriginalId(
			Object weixinOriginalId) {
		return findByProperty(WEIXIN_ORIGINAL_ID, weixinOriginalId);
	}

	public List<TMallWeixinKeywordReplyRule> findByDeployStatus(
			Object deployStatus) {
		return findByProperty(DEPLOY_STATUS, deployStatus);
	}

	public List<TMallWeixinKeywordReplyRule> findByDeleteStatus(
			Object deleteStatus) {
		return findByProperty(DELETE_STATUS, deleteStatus);
	}

	public List<TMallWeixinKeywordReplyRule> findByCreUserId(Object creUserId) {
		return findByProperty(CRE_USER_ID, creUserId);
	}

}
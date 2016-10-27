package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCorpRecommend entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TCorpRecommend
 * @author MyEclipse Persistence Tools
 */
@Component
public class TCorpRecommendDAO extends
		HibernateGenericDao<TCorpRecommend, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TCorpRecommendDAO.class);
	// property constants
	public static final String CORP_INFO = "corpInfo";
	public static final String BOSS_NAME = "bossName";
	public static final String BOSS_MOBILE = "bossMobile";
	public static final String OPERATE_PROD = "operateProd";
	public static final String OPERATE_MODE = "operateMode";
	public static final String RECOMMEND_USER = "recommendUser";
	public static final String RECOMMEND_MOBILE = "recommendMobile";
	public static final String RELATIONSHIP = "relationship";
	public static final String COMM_MODE = "commMode";
	public static final String JUDGMENT = "judgment";
	public static final String REMARK = "remark";

	public TCorpRecommend findById(java.lang.Long id) {
		log.debug("getting TCorpRecommend instance with id: " + id);
		try {
			TCorpRecommend instance = (TCorpRecommend) getSession().get(
					"com.vveplat.dao.business.models.TCorpRecommend", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TCorpRecommend> findByExample(TCorpRecommend instance) {
		log.debug("finding TCorpRecommend instance by example");
		try {
			List<TCorpRecommend> results = (List<TCorpRecommend>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TCorpRecommend")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TCorpRecommend> findByCorpInfo(Object corpInfo) {
		return findByProperty(CORP_INFO, corpInfo);
	}

	public List<TCorpRecommend> findByBossName(Object bossName) {
		return findByProperty(BOSS_NAME, bossName);
	}

	public List<TCorpRecommend> findByBossMobile(Object bossMobile) {
		return findByProperty(BOSS_MOBILE, bossMobile);
	}

	public List<TCorpRecommend> findByOperateProd(Object operateProd) {
		return findByProperty(OPERATE_PROD, operateProd);
	}

	public List<TCorpRecommend> findByOperateMode(Object operateMode) {
		return findByProperty(OPERATE_MODE, operateMode);
	}

	public List<TCorpRecommend> findByRecommendUser(Object recommendUser) {
		return findByProperty(RECOMMEND_USER, recommendUser);
	}

	public List<TCorpRecommend> findByRecommendMobile(Object recommendMobile) {
		return findByProperty(RECOMMEND_MOBILE, recommendMobile);
	}

	public List<TCorpRecommend> findByRelationship(Object relationship) {
		return findByProperty(RELATIONSHIP, relationship);
	}

	public List<TCorpRecommend> findByCommMode(Object commMode) {
		return findByProperty(COMM_MODE, commMode);
	}

	public List<TCorpRecommend> findByJudgment(Object judgment) {
		return findByProperty(JUDGMENT, judgment);
	}

	public List<TCorpRecommend> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

}
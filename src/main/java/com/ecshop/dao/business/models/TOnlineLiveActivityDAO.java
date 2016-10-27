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
 * TOnlineLiveActivity entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TOnlineLiveActivity
 * @author MyEclipse Persistence Tools
 */
@Component
public class TOnlineLiveActivityDAO extends
		HibernateGenericDao<TOnlineLiveActivity, String> {
	private static final Logger log = LoggerFactory
			.getLogger(TOnlineLiveActivityDAO.class);
	// property constants
	public static final String ACTIVITY_NAME = "activityName";
	public static final String START_TIME = "startTime";
	public static final String END_TIME = "endTime";
	public static final String COVER_IMG_URL = "coverImgUrl";
	public static final String DESCRIPTION = "description";
	public static final String CODE_RATE_TYPES = "codeRateTypes";
	public static final String ACTIVITY_CATEGORY = "activityCategory";
	public static final String LIVE_NUM = "liveNum";
	public static final String NEED_RECORD = "needRecord";
	public static final String NEED_TIME_SHIFT = "needTimeShift";
	public static final String NEED_FULL_VIEW = "needFullView";
	public static final String PLAY_MODE = "playMode";

	public TOnlineLiveActivity findById(java.lang.String id) {
		log.debug("getting TOnlineLiveActivity instance with id: " + id);
		try {
			TOnlineLiveActivity instance = (TOnlineLiveActivity) getSession()
					.get("com.vveplat.dao.business.models.TOnlineLiveActivity",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TOnlineLiveActivity> findByExample(TOnlineLiveActivity instance) {
		log.debug("finding TOnlineLiveActivity instance by example");
		try {
			List<TOnlineLiveActivity> results = (List<TOnlineLiveActivity>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TOnlineLiveActivity")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TOnlineLiveActivity> findByActivityName(Object activityName) {
		return findByProperty(ACTIVITY_NAME, activityName);
	}

	public List<TOnlineLiveActivity> findByStartTime(Object startTime) {
		return findByProperty(START_TIME, startTime);
	}

	public List<TOnlineLiveActivity> findByEndTime(Object endTime) {
		return findByProperty(END_TIME, endTime);
	}

	public List<TOnlineLiveActivity> findByCoverImgUrl(Object coverImgUrl) {
		return findByProperty(COVER_IMG_URL, coverImgUrl);
	}

	public List<TOnlineLiveActivity> findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List<TOnlineLiveActivity> findByCodeRateTypes(Object codeRateTypes) {
		return findByProperty(CODE_RATE_TYPES, codeRateTypes);
	}

	public List<TOnlineLiveActivity> findByActivityCategory(
			Object activityCategory) {
		return findByProperty(ACTIVITY_CATEGORY, activityCategory);
	}

	public List<TOnlineLiveActivity> findByLiveNum(Object liveNum) {
		return findByProperty(LIVE_NUM, liveNum);
	}

	public List<TOnlineLiveActivity> findByNeedRecord(Object needRecord) {
		return findByProperty(NEED_RECORD, needRecord);
	}

	public List<TOnlineLiveActivity> findByNeedTimeShift(Object needTimeShift) {
		return findByProperty(NEED_TIME_SHIFT, needTimeShift);
	}

	public List<TOnlineLiveActivity> findByNeedFullView(Object needFullView) {
		return findByProperty(NEED_FULL_VIEW, needFullView);
	}

	public List<TOnlineLiveActivity> findByPlayMode(Object playMode) {
		return findByProperty(PLAY_MODE, playMode);
	}

}
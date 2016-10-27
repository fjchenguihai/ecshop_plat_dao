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
 * TAppBanner entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TAppBanner
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAppBannerDAO extends HibernateGenericDao<TAppBanner, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TAppBannerDAO.class);
	// property constants
	public static final String BANNERT_TYPE = "bannertType";
	public static final String TARGET_ID = "targetId";
	public static final String TARGET_NAME = "targetName";
	public static final String BANNER_IMG = "bannerImg";
	public static final String SCOPE = "scope";
	public static final String CENTER_ID = "centerId";
	public static final String STATION_ID = "stationId";
	public static final String ORDER_NO = "orderNo";

	public TAppBanner findById(java.lang.Long id) {
		log.debug("getting TAppBanner instance with id: " + id);
		try {
			TAppBanner instance = (TAppBanner) getSession().get(
					"com.vveplat.dao.business.models.TAppBanner", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAppBanner> findByExample(TAppBanner instance) {
		log.debug("finding TAppBanner instance by example");
		try {
			List<TAppBanner> results = (List<TAppBanner>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TAppBanner").add(
							create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAppBanner> findByBannertType(Object bannertType) {
		return findByProperty(BANNERT_TYPE, bannertType);
	}

	public List<TAppBanner> findByTargetId(Object targetId) {
		return findByProperty(TARGET_ID, targetId);
	}

	public List<TAppBanner> findByTargetName(Object targetName) {
		return findByProperty(TARGET_NAME, targetName);
	}

	public List<TAppBanner> findByBannerImg(Object bannerImg) {
		return findByProperty(BANNER_IMG, bannerImg);
	}

	public List<TAppBanner> findByScope(Object scope) {
		return findByProperty(SCOPE, scope);
	}

	public List<TAppBanner> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

	public List<TAppBanner> findByStationId(Object stationId) {
		return findByProperty(STATION_ID, stationId);
	}

	public List<TAppBanner> findByOrderNo(Object orderNo) {
		return findByProperty(ORDER_NO, orderNo);
	}

}
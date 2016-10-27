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
 * TAppVersionInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TAppVersionInfo
 * @author MyEclipse Persistence Tools
 */
@Component
public class TAppVersionInfoDAO extends
		HibernateGenericDao<TAppVersionInfo, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TAppVersionInfoDAO.class);
	// property constants
	public static final String APP_NAME = "appName";
	public static final String APP_TYPE = "appType";
	public static final String APP_VERSION_CODE = "appVersionCode";
	public static final String IS_FORCE = "isForce";
	public static final String URL = "url";
	public static final String MEMO = "memo";
	public static final String UP_APP_VERSION_ID = "upAppVersionId";

	public TAppVersionInfo findById(java.lang.Long id) {
		log.debug("getting TAppVersionInfo instance with id: " + id);
		try {
			TAppVersionInfo instance = (TAppVersionInfo) getSession().get(
					"com.vveplat.dao.business.models.TAppVersionInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TAppVersionInfo> findByExample(TAppVersionInfo instance) {
		log.debug("finding TAppVersionInfo instance by example");
		try {
			List<TAppVersionInfo> results = (List<TAppVersionInfo>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TAppVersionInfo")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TAppVersionInfo> findByAppName(Object appName) {
		return findByProperty(APP_NAME, appName);
	}

	public List<TAppVersionInfo> findByAppType(Object appType) {
		return findByProperty(APP_TYPE, appType);
	}

	public List<TAppVersionInfo> findByAppVersionCode(Object appVersionCode) {
		return findByProperty(APP_VERSION_CODE, appVersionCode);
	}

	public List<TAppVersionInfo> findByIsForce(Object isForce) {
		return findByProperty(IS_FORCE, isForce);
	}

	public List<TAppVersionInfo> findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List<TAppVersionInfo> findByMemo(Object memo) {
		return findByProperty(MEMO, memo);
	}

	public List<TAppVersionInfo> findByUpAppVersionId(Object upAppVersionId) {
		return findByProperty(UP_APP_VERSION_ID, upAppVersionId);
	}

}
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
 * TWeixinqrcode entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TWeixinqrcode
 * @author MyEclipse Persistence Tools
 */
@Component
public class TWeixinqrcodeDAO extends HibernateGenericDao<TWeixinqrcode, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TWeixinqrcodeDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String USER_ID = "userId";
	public static final String USER_NAME = "userName";
	public static final String SCAN_COUNTS = "scanCounts";
	public static final String SCENE_STR = "sceneStr";
	public static final String QRTYPE = "qrtype";
	public static final String QRURL = "qrurl";
	public static final String ZYQRURL = "zyqrurl";
	public static final String SCENE_ID = "sceneId";
	public static final String APPID = "appid";

	public TWeixinqrcode findById(java.lang.Long id) {
		log.debug("getting TWeixinqrcode instance with id: " + id);
		try {
			TWeixinqrcode instance = (TWeixinqrcode) getSession().get(
					"com.vveplat.dao.business.models.TWeixinqrcode", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TWeixinqrcode> findByExample(TWeixinqrcode instance) {
		log.debug("finding TWeixinqrcode instance by example");
		try {
			List<TWeixinqrcode> results = (List<TWeixinqrcode>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TWeixinqrcode")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TWeixinqrcode> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TWeixinqrcode> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TWeixinqrcode> findByUserName(Object userName) {
		return findByProperty(USER_NAME, userName);
	}

	public List<TWeixinqrcode> findByScanCounts(Object scanCounts) {
		return findByProperty(SCAN_COUNTS, scanCounts);
	}

	public List<TWeixinqrcode> findBySceneStr(Object sceneStr) {
		return findByProperty(SCENE_STR, sceneStr);
	}

	public List<TWeixinqrcode> findByQrtype(Object qrtype) {
		return findByProperty(QRTYPE, qrtype);
	}

	public List<TWeixinqrcode> findByQrurl(Object qrurl) {
		return findByProperty(QRURL, qrurl);
	}

	public List<TWeixinqrcode> findByZyqrurl(Object zyqrurl) {
		return findByProperty(ZYQRURL, zyqrurl);
	}

	public List<TWeixinqrcode> findBySceneId(Object sceneId) {
		return findByProperty(SCENE_ID, sceneId);
	}

	public List<TWeixinqrcode> findByAppid(Object appid) {
		return findByProperty(APPID, appid);
	}

}
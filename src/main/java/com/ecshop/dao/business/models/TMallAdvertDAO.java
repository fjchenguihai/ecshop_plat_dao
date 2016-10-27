package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TMallAdvert entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TMallAdvert
 * @author MyEclipse Persistence Tools
 */
@Component
public class TMallAdvertDAO extends HibernateGenericDao<TMallAdvert, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TMallAdvertDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String STATION_ID = "stationId";
	public static final String ADVERT_PAGE = "advertPage";
	public static final String ADVERT_JSON = "advertJson";

	public TMallAdvert findById(java.lang.Long id) {
		log.debug("getting TMallAdvert instance with id: " + id);
		try {
			TMallAdvert instance = (TMallAdvert) getSession().get(
					"com.vveplat.dao.business.models.TMallAdvert", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TMallAdvert> findByExample(TMallAdvert instance) {
		log.debug("finding TMallAdvert instance by example");
		try {
			List<TMallAdvert> results = (List<TMallAdvert>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TMallAdvert")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TMallAdvert> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TMallAdvert> findByStationId(Object stationId) {
		return findByProperty(STATION_ID, stationId);
	}

	public List<TMallAdvert> findByAdvertPage(Object advertPage) {
		return findByProperty(ADVERT_PAGE, advertPage);
	}

	public List<TMallAdvert> findByAdvertJson(Object advertJson) {
		return findByProperty(ADVERT_JSON, advertJson);
	}

}
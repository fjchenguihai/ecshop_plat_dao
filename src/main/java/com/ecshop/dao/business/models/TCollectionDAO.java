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
 * TCollection entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TCollection
 * @author MyEclipse Persistence Tools
 */
@Component
public class TCollectionDAO extends HibernateGenericDao<TCollection, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TCollectionDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String STATION_ID = "stationId";
	public static final String USER_ID = "userId";
	public static final String GOODS_ID = "goodsId";
	public static final String CENTER_ID = "centerId";

	public TCollection findById(java.lang.Long id) {
		log.debug("getting TCollection instance with id: " + id);
		try {
			TCollection instance = (TCollection) getSession().get(
					"com.vveplat.dao.business.models.TCollection", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TCollection> findByExample(TCollection instance) {
		log.debug("finding TCollection instance by example");
		try {
			List<TCollection> results = (List<TCollection>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TCollection").add(
							create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TCollection> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TCollection> findByStationId(Object stationId) {
		return findByProperty(STATION_ID, stationId);
	}

	public List<TCollection> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TCollection> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TCollection> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

}
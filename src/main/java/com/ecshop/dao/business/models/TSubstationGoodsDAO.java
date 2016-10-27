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
 * TSubstationGoods entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TSubstationGoods
 * @author MyEclipse Persistence Tools
 */
@Component
public class TSubstationGoodsDAO extends
		HibernateGenericDao<TSubstationGoods, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TSubstationGoodsDAO.class);
	// property constants
	public static final String STATION_ID = "stationId";
	public static final String GOODS_ID = "goodsId";
	public static final String MALL_ID = "mallId";

	public TSubstationGoods findById(java.lang.Long id) {
		log.debug("getting TSubstationGoods instance with id: " + id);
		try {
			TSubstationGoods instance = (TSubstationGoods) getSession().get(
					"com.vveplat.dao.business.models.TSubstationGoods", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TSubstationGoods> findByExample(TSubstationGoods instance) {
		log.debug("finding TSubstationGoods instance by example");
		try {
			List<TSubstationGoods> results = (List<TSubstationGoods>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TSubstationGoods")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TSubstationGoods> findByStationId(Object stationId) {
		return findByProperty(STATION_ID, stationId);
	}

	public List<TSubstationGoods> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TSubstationGoods> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

}
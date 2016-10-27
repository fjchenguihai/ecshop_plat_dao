package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TGoodsFreight entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TGoodsFreight
 * @author MyEclipse Persistence Tools
 */
@Component
public class TGoodsFreightDAO extends HibernateGenericDao<TGoodsFreight, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TGoodsFreightDAO.class);
	// property constants
	public static final String GOODS_ID = "goodsId";
	public static final String TYPE = "type";
	public static final String ADD_FREIGHT = "addFreight";
	public static final String REGION_ID = "regionId";
	public static final String REGION_NAME = "regionName";

	public TGoodsFreight findById(java.lang.Long id) {
		log.debug("getting TGoodsFreight instance with id: " + id);
		try {
			TGoodsFreight instance = (TGoodsFreight) getSession().get(
					"com.vveplat.dao.business.models.TGoodsFreight", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TGoodsFreight> findByExample(TGoodsFreight instance) {
		log.debug("finding TGoodsFreight instance by example");
		try {
			List<TGoodsFreight> results = (List<TGoodsFreight>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TGoodsFreight")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TGoodsFreight> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TGoodsFreight> findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List<TGoodsFreight> findByAddFreight(Object addFreight) {
		return findByProperty(ADD_FREIGHT, addFreight);
	}

	public List<TGoodsFreight> findByRegionId(Object regionId) {
		return findByProperty(REGION_ID, regionId);
	}

	public List<TGoodsFreight> findByRegionName(Object regionName) {
		return findByProperty(REGION_NAME, regionName);
	}

}
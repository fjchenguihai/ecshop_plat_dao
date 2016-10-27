package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TFightGroupGoods entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TFightGroupGoods
 * @author MyEclipse Persistence Tools
 */
@Component
public class TFightGroupGoodsDAO extends
		HibernateGenericDao<TFightGroupGoods, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TFightGroupGoodsDAO.class);
	// property constants
	public static final String FIGHT_GROUP_ID = "fightGroupId";
	public static final String GOODS_ID = "goodsId";

	public TFightGroupGoods findById(java.lang.Long id) {
		log.debug("getting TFightGroupGoods instance with id: " + id);
		try {
			TFightGroupGoods instance = (TFightGroupGoods) getSession().get(
					"com.vveplat.dao.business.models.TFightGroupGoods", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TFightGroupGoods> findByExample(TFightGroupGoods instance) {
		log.debug("finding TFightGroupGoods instance by example");
		try {
			List<TFightGroupGoods> results = (List<TFightGroupGoods>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TFightGroupGoods")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TFightGroupGoods> findByFightGroupId(Object fightGroupId) {
		return findByProperty(FIGHT_GROUP_ID, fightGroupId);
	}

	public List<TFightGroupGoods> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

}
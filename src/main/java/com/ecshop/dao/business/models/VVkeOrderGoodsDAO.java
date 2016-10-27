package com.ecshop.dao.business.models;

import java.math.BigDecimal;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * VVkeOrderGoods entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VVkeOrderGoods
 * @author MyEclipse Persistence Tools
 */
@Component
public class VVkeOrderGoodsDAO extends
		HibernateGenericDao<VVkeOrderGoods, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VVkeOrderGoodsDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String GOODS_ID = "goodsId";
	public static final String GOODS_NAME = "goodsName";

	public VVkeOrderGoods findById(java.lang.Long id) {
		log.debug("getting VVkeOrderGoods instance with id: " + id);
		try {
			VVkeOrderGoods instance = (VVkeOrderGoods) getSession().get(
					"com.vveplat.dao.business.models.VVkeOrderGoods", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VVkeOrderGoods> findByExample(VVkeOrderGoods instance) {
		log.debug("finding VVkeOrderGoods instance by example");
		try {
			List<VVkeOrderGoods> results = (List<VVkeOrderGoods>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VVkeOrderGoods")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VVkeOrderGoods> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VVkeOrderGoods> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<VVkeOrderGoods> findByGoodsName(Object goodsName) {
		return findByProperty(GOODS_NAME, goodsName);
	}

}
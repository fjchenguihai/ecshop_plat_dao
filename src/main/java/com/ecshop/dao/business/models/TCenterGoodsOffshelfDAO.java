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
 * TCenterGoodsOffshelf entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TCenterGoodsOffshelf
 * @author MyEclipse Persistence Tools
 */
@Component
public class TCenterGoodsOffshelfDAO extends
		HibernateGenericDao<TCenterGoodsOffshelf, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TCenterGoodsOffshelfDAO.class);
	// property constants
	public static final String CENTER_ID = "centerId";
	public static final String MALL_ID = "mallId";
	public static final String GOODS_ID = "goodsId";

	public TCenterGoodsOffshelf findById(java.lang.Long id) {
		log.debug("getting TCenterGoodsOffshelf instance with id: " + id);
		try {
			TCenterGoodsOffshelf instance = (TCenterGoodsOffshelf) getSession()
					.get(
							"com.vveplat.dao.business.models.TCenterGoodsOffshelf",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TCenterGoodsOffshelf> findByExample(
			TCenterGoodsOffshelf instance) {
		log.debug("finding TCenterGoodsOffshelf instance by example");
		try {
			List<TCenterGoodsOffshelf> results = (List<TCenterGoodsOffshelf>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TCenterGoodsOffshelf")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TCenterGoodsOffshelf> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

	public List<TCenterGoodsOffshelf> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TCenterGoodsOffshelf> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

}
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
 * TCenterGoodsTop entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TCenterGoodsTop
 * @author MyEclipse Persistence Tools
 */
@Component
public class TCenterGoodsTopDAO extends
		HibernateGenericDao<TCenterGoodsTop, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TCenterGoodsTopDAO.class);
	// property constants
	public static final String CENTER_ID = "centerId";
	public static final String MALL_ID = "mallId";
	public static final String GOODS_ID = "goodsId";

	public TCenterGoodsTop findById(java.lang.Long id) {
		log.debug("getting TCenterGoodsTop instance with id: " + id);
		try {
			TCenterGoodsTop instance = (TCenterGoodsTop) getSession().get(
					"com.vveplat.dao.business.models.TCenterGoodsTop", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TCenterGoodsTop> findByExample(TCenterGoodsTop instance) {
		log.debug("finding TCenterGoodsTop instance by example");
		try {
			List<TCenterGoodsTop> results = (List<TCenterGoodsTop>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TCenterGoodsTop")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TCenterGoodsTop> findByCenterId(Object centerId) {
		return findByProperty(CENTER_ID, centerId);
	}

	public List<TCenterGoodsTop> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TCenterGoodsTop> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

}
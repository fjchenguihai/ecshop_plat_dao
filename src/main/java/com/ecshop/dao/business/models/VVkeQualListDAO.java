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
 * VVkeQualList entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VVkeQualList
 * @author MyEclipse Persistence Tools
 */
@Component
public class VVkeQualListDAO extends HibernateGenericDao<VVkeQualList, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VVkeQualListDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String GOODS_ID = "goodsId";
	public static final String GOODS_NAME = "goodsName";
	public static final String COND_QTY = "condQty";

	public VVkeQualList findById(java.lang.Long id) {
		log.debug("getting VVkeQualList instance with id: " + id);
		try {
			VVkeQualList instance = (VVkeQualList) getSession().get(
					"com.vveplat.dao.business.models.VVkeQualList", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VVkeQualList> findByExample(VVkeQualList instance) {
		log.debug("finding VVkeQualList instance by example");
		try {
			List<VVkeQualList> results = (List<VVkeQualList>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VVkeQualList")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VVkeQualList> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<VVkeQualList> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<VVkeQualList> findByGoodsName(Object goodsName) {
		return findByProperty(GOODS_NAME, goodsName);
	}

	public List<VVkeQualList> findByCondQty(Object condQty) {
		return findByProperty(COND_QTY, condQty);
	}

}
package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TGoodsSpec entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TGoodsSpec
 * @author MyEclipse Persistence Tools
 */
@Component
public class TGoodsSpecDAO extends HibernateGenericDao<TGoodsSpec, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TGoodsSpecDAO.class);
	// property constants
	public static final String SPEC_ID = "specId";
	public static final String SPEC_NAME = "specName";
	public static final String GOODS_ID = "goodsId";
	public static final String SPEC_VALUE = "specValue";
	public static final String DEFAULT_SPEC_VALUE = "defaultSpecValue";

	public TGoodsSpec findById(java.lang.Long id) {
		log.debug("getting TGoodsSpec instance with id: " + id);
		try {
			TGoodsSpec instance = (TGoodsSpec) getSession().get(
					"com.vveplat.dao.business.models.TGoodsSpec", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TGoodsSpec> findByExample(TGoodsSpec instance) {
		log.debug("finding TGoodsSpec instance by example");
		try {
			List<TGoodsSpec> results = (List<TGoodsSpec>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TGoodsSpec")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TGoodsSpec> findBySpecId(Object specId) {
		return findByProperty(SPEC_ID, specId);
	}

	public List<TGoodsSpec> findBySpecName(Object specName) {
		return findByProperty(SPEC_NAME, specName);
	}

	public List<TGoodsSpec> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TGoodsSpec> findBySpecValue(Object specValue) {
		return findByProperty(SPEC_VALUE, specValue);
	}

	public List<TGoodsSpec> findByDefaultSpecValue(Object defaultSpecValue) {
		return findByProperty(DEFAULT_SPEC_VALUE, defaultSpecValue);
	}

}
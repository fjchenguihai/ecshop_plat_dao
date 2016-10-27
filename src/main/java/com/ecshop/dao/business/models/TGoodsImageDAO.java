package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TGoodsImage entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TGoodsImage
 * @author MyEclipse Persistence Tools
 */
@Component
public class TGoodsImageDAO extends HibernateGenericDao<TGoodsImage, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TGoodsImageDAO.class);
	// property constants
	public static final String GOODS_ID = "goodsId";
	public static final String SRC = "src";
	public static final String ALT = "alt";

	public TGoodsImage findById(java.lang.Long id) {
		log.debug("getting TGoodsImage instance with id: " + id);
		try {
			TGoodsImage instance = (TGoodsImage) getSession().get(
					"com.vveplat.dao.business.models.TGoodsImage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TGoodsImage> findByExample(TGoodsImage instance) {
		log.debug("finding TGoodsImage instance by example");
		try {
			List<TGoodsImage> results = (List<TGoodsImage>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TGoodsImage")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TGoodsImage> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TGoodsImage> findBySrc(Object src) {
		return findByProperty(SRC, src);
	}

	public List<TGoodsImage> findByAlt(Object alt) {
		return findByProperty(ALT, alt);
	}

}
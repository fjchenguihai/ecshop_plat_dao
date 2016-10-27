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
 * TGoodsComments entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TGoodsComments
 * @author MyEclipse Persistence Tools
 */
@Component
public class TGoodsCommentsDAO extends
		HibernateGenericDao<TGoodsComments, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TGoodsCommentsDAO.class);
	// property constants
	public static final String GOODS_ID = "goodsId";
	public static final String GOODS_ITEMS_ID = "goodsItemsId";
	public static final String USER_ID = "userId";
	public static final String MALL_ID = "mallId";
	public static final String SCORE = "score";
	public static final String CONTENT = "content";
	public static final String IMAGE1 = "image1";
	public static final String IMAGE2 = "image2";
	public static final String IMAGE3 = "image3";

	public TGoodsComments findById(java.lang.Long id) {
		log.debug("getting TGoodsComments instance with id: " + id);
		try {
			TGoodsComments instance = (TGoodsComments) getSession().get(
					"com.vveplat.dao.business.models.TGoodsComments", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TGoodsComments> findByExample(TGoodsComments instance) {
		log.debug("finding TGoodsComments instance by example");
		try {
			List<TGoodsComments> results = (List<TGoodsComments>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TGoodsComments")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TGoodsComments> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TGoodsComments> findByGoodsItemsId(Object goodsItemsId) {
		return findByProperty(GOODS_ITEMS_ID, goodsItemsId);
	}

	public List<TGoodsComments> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<TGoodsComments> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TGoodsComments> findByScore(Object score) {
		return findByProperty(SCORE, score);
	}

	public List<TGoodsComments> findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List<TGoodsComments> findByImage1(Object image1) {
		return findByProperty(IMAGE1, image1);
	}

	public List<TGoodsComments> findByImage2(Object image2) {
		return findByProperty(IMAGE2, image2);
	}

	public List<TGoodsComments> findByImage3(Object image3) {
		return findByProperty(IMAGE3, image3);
	}

}
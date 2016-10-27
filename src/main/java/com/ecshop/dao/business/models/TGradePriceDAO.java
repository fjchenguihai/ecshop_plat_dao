package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TGradePrice entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TGradePrice
 * @author MyEclipse Persistence Tools
 */
@Component
public class TGradePriceDAO extends HibernateGenericDao<TGradePrice, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TGradePriceDAO.class);
	// property constants
	public static final String GOODS_ID = "goodsId";
	public static final String GOODS_ITEMS_ID = "goodsItemsId";
	public static final String USER_GRADE = "userGrade";
	public static final String PRICE = "price";

	public TGradePrice findById(java.lang.Long id) {
		log.debug("getting TGradePrice instance with id: " + id);
		try {
			TGradePrice instance = (TGradePrice) getSession().get(
					"com.vveplat.dao.business.models.TGradePrice", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TGradePrice> findByExample(TGradePrice instance) {
		log.debug("finding TGradePrice instance by example");
		try {
			List<TGradePrice> results = (List<TGradePrice>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TGradePrice")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TGradePrice> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TGradePrice> findByGoodsItemsId(Object goodsItemsId) {
		return findByProperty(GOODS_ITEMS_ID, goodsItemsId);
	}

	public List<TGradePrice> findByUserGrade(Object userGrade) {
		return findByProperty(USER_GRADE, userGrade);
	}

	public List<TGradePrice> findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

}
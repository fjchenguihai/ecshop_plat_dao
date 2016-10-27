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
 * TRefund entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TRefund
 * @author MyEclipse Persistence Tools
 */
@Component
public class TRefundDAO extends HibernateGenericDao<TRefund, Long> {
	private static final Logger log = LoggerFactory.getLogger(TRefundDAO.class);
	// property constants
	public static final String GOOD_ID = "goodId";
	public static final String GOODS_ITEM_ID = "goodsItemId";
	public static final String ORDER_ID = "orderId";
	public static final String GOOD_NUM = "goodNum";
	public static final String AMOUNT = "amount";
	public static final String STATUS = "status";
	public static final String REMARK = "remark";
	public static final String AFTER_SALE_ID = "afterSaleId";

	public TRefund findById(java.lang.Long id) {
		log.debug("getting TRefund instance with id: " + id);
		try {
			TRefund instance = (TRefund) getSession().get(
					"com.vveplat.dao.business.models.TRefund", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TRefund> findByExample(TRefund instance) {
		log.debug("finding TRefund instance by example");
		try {
			List<TRefund> results = (List<TRefund>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TRefund")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TRefund> findByGoodId(Object goodId) {
		return findByProperty(GOOD_ID, goodId);
	}

	public List<TRefund> findByGoodsItemId(Object goodsItemId) {
		return findByProperty(GOODS_ITEM_ID, goodsItemId);
	}

	public List<TRefund> findByOrderId(Object orderId) {
		return findByProperty(ORDER_ID, orderId);
	}

	public List<TRefund> findByGoodNum(Object goodNum) {
		return findByProperty(GOOD_NUM, goodNum);
	}

	public List<TRefund> findByAmount(Object amount) {
		return findByProperty(AMOUNT, amount);
	}

	public List<TRefund> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<TRefund> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List<TRefund> findByAfterSaleId(Object afterSaleId) {
		return findByProperty(AFTER_SALE_ID, afterSaleId);
	}

}
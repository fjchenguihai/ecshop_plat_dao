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
 * VVkeOrder entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VVkeOrder
 * @author MyEclipse Persistence Tools
 */
@Component
public class VVkeOrderDAO extends HibernateGenericDao<VVkeOrder, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VVkeOrderDAO.class);
	// property constants
	public static final String MALLID = "mallid";
	public static final String GOODSID = "goodsid";
	public static final String GOODSNAME = "goodsname";
	public static final String AMOUNT = "amount";

	public VVkeOrder findById(java.lang.Long id) {
		log.debug("getting VVkeOrder instance with id: " + id);
		try {
			VVkeOrder instance = (VVkeOrder) getSession().get(
					"com.vveplat.dao.business.models.VVkeOrder", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VVkeOrder> findByExample(VVkeOrder instance) {
		log.debug("finding VVkeOrder instance by example");
		try {
			List<VVkeOrder> results = (List<VVkeOrder>) getSession()
					.createCriteria("com.vveplat.dao.business.models.VVkeOrder")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VVkeOrder> findByMallid(Object mallid) {
		return findByProperty(MALLID, mallid);
	}

	public List<VVkeOrder> findByGoodsid(Object goodsid) {
		return findByProperty(GOODSID, goodsid);
	}

	public List<VVkeOrder> findByGoodsname(Object goodsname) {
		return findByProperty(GOODSNAME, goodsname);
	}

	public List<VVkeOrder> findByAmount(Object amount) {
		return findByProperty(AMOUNT, amount);
	}

}
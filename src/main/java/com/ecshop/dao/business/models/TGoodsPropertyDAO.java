package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TGoodsProperty entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TGoodsProperty
 * @author MyEclipse Persistence Tools
 */
@Component
public class TGoodsPropertyDAO extends
		HibernateGenericDao<TGoodsProperty, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TGoodsPropertyDAO.class);
	// property constants
	public static final String GOODS_ID = "goodsId";
	public static final String PROPERTY_ID = "propertyId";
	public static final String PROPERTY_NAME = "propertyName";
	public static final String PROPERTY_VALUE = "propertyValue";

	public TGoodsProperty findById(java.lang.Long id) {
		log.debug("getting TGoodsProperty instance with id: " + id);
		try {
			TGoodsProperty instance = (TGoodsProperty) getSession().get(
					"com.vveplat.dao.business.models.TGoodsProperty", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TGoodsProperty> findByExample(TGoodsProperty instance) {
		log.debug("finding TGoodsProperty instance by example");
		try {
			List<TGoodsProperty> results = (List<TGoodsProperty>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TGoodsProperty")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TGoodsProperty> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TGoodsProperty> findByPropertyId(Object propertyId) {
		return findByProperty(PROPERTY_ID, propertyId);
	}

	public List<TGoodsProperty> findByPropertyName(Object propertyName) {
		return findByProperty(PROPERTY_NAME, propertyName);
	}

	public List<TGoodsProperty> findByPropertyValue(Object propertyValue) {
		return findByProperty(PROPERTY_VALUE, propertyValue);
	}

}
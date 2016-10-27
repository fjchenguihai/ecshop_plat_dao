package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TProperty entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TProperty
 * @author MyEclipse Persistence Tools
 */
@Component
public class TPropertyDAO extends HibernateGenericDao<TProperty, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TPropertyDAO.class);
	// property constants
	public static final String PROPERTY_NAME = "propertyName";
	public static final String SELECT_TYPE = "selectType";
	public static final String SELECT_VALUE = "selectValue";
	public static final String IS_NOT_NULL = "isNotNull";
	public static final String PROPERTY_TYPE = "propertyType";

	public TProperty findById(java.lang.Long id) {
		log.debug("getting TProperty instance with id: " + id);
		try {
			TProperty instance = (TProperty) getSession().get(
					"com.vveplat.dao.business.models.TProperty", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TProperty> findByExample(TProperty instance) {
		log.debug("finding TProperty instance by example");
		try {
			List<TProperty> results = (List<TProperty>) getSession()
					.createCriteria("com.vveplat.dao.business.models.TProperty")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TProperty> findByPropertyName(Object propertyName) {
		return findByProperty(PROPERTY_NAME, propertyName);
	}

	public List<TProperty> findBySelectType(Object selectType) {
		return findByProperty(SELECT_TYPE, selectType);
	}

	public List<TProperty> findBySelectValue(Object selectValue) {
		return findByProperty(SELECT_VALUE, selectValue);
	}

	public List<TProperty> findByIsNotNull(Object isNotNull) {
		return findByProperty(IS_NOT_NULL, isNotNull);
	}

	public List<TProperty> findByPropertyType(Object propertyType) {
		return findByProperty(PROPERTY_TYPE, propertyType);
	}

}
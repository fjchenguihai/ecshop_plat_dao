package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * VCategoryProperty entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.VCategoryProperty
 * @author MyEclipse Persistence Tools
 */
@Component
public class VCategoryPropertyDAO extends
		HibernateGenericDao<VCategoryProperty, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(VCategoryPropertyDAO.class);
	// property constants
	public static final String CATEGORY_ID = "categoryId";
	public static final String CATEGORY_PID = "categoryPid";
	public static final String CATEGORY_NAME = "categoryName";
	public static final String CATEGORY_IMG = "categoryImg";
	public static final String STATUS = "status";
	public static final String PROPERTY_ID = "propertyId";
	public static final String PROPERTY_NAME = "propertyName";
	public static final String SELECT_TYPE = "selectType";
	public static final String SELECT_VALUE = "selectValue";
	public static final String IS_NOT_NULL = "isNotNull";
	public static final String PROPERTY_TYPE = "propertyType";

	public VCategoryProperty findById(java.lang.Long id) {
		log.debug("getting VCategoryProperty instance with id: " + id);
		try {
			VCategoryProperty instance = (VCategoryProperty) getSession().get(
					"com.vveplat.dao.business.models.VCategoryProperty", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<VCategoryProperty> findByExample(VCategoryProperty instance) {
		log.debug("finding VCategoryProperty instance by example");
		try {
			List<VCategoryProperty> results = (List<VCategoryProperty>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.VCategoryProperty")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<VCategoryProperty> findByCategoryId(Object categoryId) {
		return findByProperty(CATEGORY_ID, categoryId);
	}

	public List<VCategoryProperty> findByCategoryPid(Object categoryPid) {
		return findByProperty(CATEGORY_PID, categoryPid);
	}

	public List<VCategoryProperty> findByCategoryName(Object categoryName) {
		return findByProperty(CATEGORY_NAME, categoryName);
	}

	public List<VCategoryProperty> findByCategoryImg(Object categoryImg) {
		return findByProperty(CATEGORY_IMG, categoryImg);
	}

	public List<VCategoryProperty> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<VCategoryProperty> findByPropertyId(Object propertyId) {
		return findByProperty(PROPERTY_ID, propertyId);
	}

	public List<VCategoryProperty> findByPropertyName(Object propertyName) {
		return findByProperty(PROPERTY_NAME, propertyName);
	}

	public List<VCategoryProperty> findBySelectType(Object selectType) {
		return findByProperty(SELECT_TYPE, selectType);
	}

	public List<VCategoryProperty> findBySelectValue(Object selectValue) {
		return findByProperty(SELECT_VALUE, selectValue);
	}

	public List<VCategoryProperty> findByIsNotNull(Object isNotNull) {
		return findByProperty(IS_NOT_NULL, isNotNull);
	}

	public List<VCategoryProperty> findByPropertyType(Object propertyType) {
		return findByProperty(PROPERTY_TYPE, propertyType);
	}

}
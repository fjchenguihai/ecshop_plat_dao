package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCategoryPropertyMap entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TCategoryPropertyMap
 * @author MyEclipse Persistence Tools
 */
@Component
public class TCategoryPropertyMapDAO extends
		HibernateGenericDao<TCategoryPropertyMap, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TCategoryPropertyMapDAO.class);
	// property constants
	public static final String PROPERTY_ID = "propertyId";
	public static final String CATEGORY_ID = "categoryId";

	public TCategoryPropertyMap findById(java.lang.Long id) {
		log.debug("getting TCategoryPropertyMap instance with id: " + id);
		try {
			TCategoryPropertyMap instance = (TCategoryPropertyMap) getSession()
					.get("com.vveplat.dao.business.models.TCategoryPropertyMap",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TCategoryPropertyMap> findByExample(
			TCategoryPropertyMap instance) {
		log.debug("finding TCategoryPropertyMap instance by example");
		try {
			List<TCategoryPropertyMap> results = (List<TCategoryPropertyMap>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TCategoryPropertyMap")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TCategoryPropertyMap> findByPropertyId(Object propertyId) {
		return findByProperty(PROPERTY_ID, propertyId);
	}

	public List<TCategoryPropertyMap> findByCategoryId(Object categoryId) {
		return findByProperty(CATEGORY_ID, categoryId);
	}

}
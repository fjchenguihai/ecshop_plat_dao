package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TDictionary entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TDictionary
 * @author MyEclipse Persistence Tools
 */
@Component
public class TDictionaryDAO extends HibernateGenericDao<TDictionary, Integer> {
	private static final Logger log = LoggerFactory
			.getLogger(TDictionaryDAO.class);
	// property constants
	public static final String DICTIONARY_TYPE = "dictionaryType";
	public static final String DICTIONARY_CODE = "dictionaryCode";
	public static final String DICTIONARY_TYPE_DESC = "dictionaryTypeDesc";
	public static final String DICTIONARY_VALUE = "dictionaryValue";
	public static final String DICTIONARY_DESC = "dictionaryDesc";

	public TDictionary findById(java.lang.Integer id) {
		log.debug("getting TDictionary instance with id: " + id);
		try {
			TDictionary instance = (TDictionary) getSession().get(
					"com.vveplat.dao.business.models.TDictionary", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TDictionary> findByExample(TDictionary instance) {
		log.debug("finding TDictionary instance by example");
		try {
			List<TDictionary> results = (List<TDictionary>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TDictionary")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TDictionary> findByDictionaryType(Object dictionaryType) {
		return findByProperty(DICTIONARY_TYPE, dictionaryType);
	}

	public List<TDictionary> findByDictionaryCode(Object dictionaryCode) {
		return findByProperty(DICTIONARY_CODE, dictionaryCode);
	}

	public List<TDictionary> findByDictionaryTypeDesc(Object dictionaryTypeDesc) {
		return findByProperty(DICTIONARY_TYPE_DESC, dictionaryTypeDesc);
	}

	public List<TDictionary> findByDictionaryValue(Object dictionaryValue) {
		return findByProperty(DICTIONARY_VALUE, dictionaryValue);
	}

	public List<TDictionary> findByDictionaryDesc(Object dictionaryDesc) {
		return findByProperty(DICTIONARY_DESC, dictionaryDesc);
	}

}
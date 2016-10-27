package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TBankConfig entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TBankConfig
 * @author MyEclipse Persistence Tools
 */
@Component
public class TBankConfigDAO extends HibernateGenericDao<TBankConfig, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TBankConfigDAO.class);
	// property constants
	public static final String BANK_NAME = "bankName";

	public TBankConfig findById(java.lang.Long id) {
		log.debug("getting TBankConfig instance with id: " + id);
		try {
			TBankConfig instance = (TBankConfig) getSession().get(
					"com.vveplat.dao.business.models.TBankConfig", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TBankConfig> findByExample(TBankConfig instance) {
		log.debug("finding TBankConfig instance by example");
		try {
			List<TBankConfig> results = (List<TBankConfig>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TBankConfig").add(
							create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TBankConfig> findByBankName(Object bankName) {
		return findByProperty(BANK_NAME, bankName);
	}

}
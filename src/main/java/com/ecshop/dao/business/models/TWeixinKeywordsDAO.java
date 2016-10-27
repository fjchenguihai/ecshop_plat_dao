package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TWeixinKeywords entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TWeixinKeywords
 * @author MyEclipse Persistence Tools
 */
@Component
public class TWeixinKeywordsDAO extends
		HibernateGenericDao<TWeixinKeywords, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TWeixinKeywordsDAO.class);
	// property constants
	public static final String MALL_ID = "mallId";
	public static final String NAME = "name";
	public static final String KEYWORD = "keyword";
	public static final String TYPE = "type";
	public static final String CONTENTS = "contents";
	public static final String PIC = "pic";
	public static final String PICTIT = "pictit";
	public static final String KEYDESC = "keydesc";
	public static final String PICURL = "picurl";
	public static final String COUNT = "count";
	public static final String STATUS = "status";

	public TWeixinKeywords findById(java.lang.Long id) {
		log.debug("getting TWeixinKeywords instance with id: " + id);
		try {
			TWeixinKeywords instance = (TWeixinKeywords) getSession().get(
					"com.vveplat.dao.business.models.TWeixinKeywords", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TWeixinKeywords> findByExample(TWeixinKeywords instance) {
		log.debug("finding TWeixinKeywords instance by example");
		try {
			List<TWeixinKeywords> results = (List<TWeixinKeywords>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TWeixinKeywords")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TWeixinKeywords> findByMallId(Object mallId) {
		return findByProperty(MALL_ID, mallId);
	}

	public List<TWeixinKeywords> findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List<TWeixinKeywords> findByKeyword(Object keyword) {
		return findByProperty(KEYWORD, keyword);
	}

	public List<TWeixinKeywords> findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List<TWeixinKeywords> findByContents(Object contents) {
		return findByProperty(CONTENTS, contents);
	}

	public List<TWeixinKeywords> findByPic(Object pic) {
		return findByProperty(PIC, pic);
	}

	public List<TWeixinKeywords> findByPictit(Object pictit) {
		return findByProperty(PICTIT, pictit);
	}

	public List<TWeixinKeywords> findByKeydesc(Object keydesc) {
		return findByProperty(KEYDESC, keydesc);
	}

	public List<TWeixinKeywords> findByPicurl(Object picurl) {
		return findByProperty(PICURL, picurl);
	}

	public List<TWeixinKeywords> findByCount(Object count) {
		return findByProperty(COUNT, count);
	}

	public List<TWeixinKeywords> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

}
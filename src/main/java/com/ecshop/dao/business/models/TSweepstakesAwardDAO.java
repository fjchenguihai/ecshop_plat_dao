package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;

/**
 * A data access object (DAO) providing persistence and search support for
 * TSweepstakesAward entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TSweepstakesAward
 * @author MyEclipse Persistence Tools
 */
@Component
public class TSweepstakesAwardDAO extends
		HibernateGenericDao<TSweepstakesAward, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TSweepstakesAwardDAO.class);
	// property constants
	public static final String SWEEPSTAKES_ACTIVITY_ID = "sweepstakesActivityId";
	public static final String PROBABILITY = "probability";
	public static final String AWARD_GRADE = "awardGrade";
	public static final String AWARD_NAME = "awardName";
	public static final String AWARD_PRICE = "awardPrice";
	public static final String AWARD_AVAILABLE_AMOUNT = "awardAvailableAmount";
	public static final String AWARD_USED_AMOUNT = "awardUsedAmount";
	public static final String PICTURE_URL = "pictureUrl";

	public TSweepstakesAward findById(java.lang.Long id) {
		log.debug("getting TSweepstakesAward instance with id: " + id);
		try {
			TSweepstakesAward instance = (TSweepstakesAward) getSession().get(
					"com.vveplat.dao.business.models.TSweepstakesAward", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TSweepstakesAward> findByExample(TSweepstakesAward instance) {
		log.debug("finding TSweepstakesAward instance by example");
		try {
			List<TSweepstakesAward> results = (List<TSweepstakesAward>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TSweepstakesAward")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TSweepstakesAward> findBySweepstakesActivityId(
			Object sweepstakesActivityId) {
		return findByProperty(SWEEPSTAKES_ACTIVITY_ID, sweepstakesActivityId);
	}

	public List<TSweepstakesAward> findByProbability(Object probability) {
		return findByProperty(PROBABILITY, probability);
	}

	public List<TSweepstakesAward> findByAwardGrade(Object awardGrade) {
		return findByProperty(AWARD_GRADE, awardGrade);
	}

	public List<TSweepstakesAward> findByAwardName(Object awardName) {
		return findByProperty(AWARD_NAME, awardName);
	}

	public List<TSweepstakesAward> findByAwardPrice(Object awardPrice) {
		return findByProperty(AWARD_PRICE, awardPrice);
	}

	public List<TSweepstakesAward> findByAwardAvailableAmount(
			Object awardAvailableAmount) {
		return findByProperty(AWARD_AVAILABLE_AMOUNT, awardAvailableAmount);
	}

	public List<TSweepstakesAward> findByAwardUsedAmount(Object awardUsedAmount) {
		return findByProperty(AWARD_USED_AMOUNT, awardUsedAmount);
	}

	public List<TSweepstakesAward> findByPictureUrl(Object pictureUrl) {
		return findByProperty(PICTURE_URL, pictureUrl);
	}

}
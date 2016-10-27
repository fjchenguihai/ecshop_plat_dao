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
 * TChartRoom entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TChartRoom
 * @author MyEclipse Persistence Tools
 */
@Component
public class TChartRoomDAO extends HibernateGenericDao<TChartRoom, String> {
	private static final Logger log = LoggerFactory
			.getLogger(TChartRoomDAO.class);
	// property constants
	public static final String CHAR_ROOM_NAME = "charRoomName";
	public static final String ACTIVITY_ID = "activityId";
	public static final String STATUS = "status";

	public TChartRoom findById(java.lang.String id) {
		log.debug("getting TChartRoom instance with id: " + id);
		try {
			TChartRoom instance = (TChartRoom) getSession().get(
					"com.vveplat.dao.business.models.TChartRoom", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TChartRoom> findByExample(TChartRoom instance) {
		log.debug("finding TChartRoom instance by example");
		try {
			List<TChartRoom> results = (List<TChartRoom>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TChartRoom")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TChartRoom> findByCharRoomName(Object charRoomName) {
		return findByProperty(CHAR_ROOM_NAME, charRoomName);
	}

	public List<TChartRoom> findByActivityId(Object activityId) {
		return findByProperty(ACTIVITY_ID, activityId);
	}

	public List<TChartRoom> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

}
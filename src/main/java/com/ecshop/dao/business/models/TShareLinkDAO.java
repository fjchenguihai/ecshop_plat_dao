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
 * TShareLink entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TShareLink
 * @author MyEclipse Persistence Tools
 */
@Component
public class TShareLinkDAO extends HibernateGenericDao<TShareLink, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TShareLinkDAO.class);
	// property constants
	public static final String APP_ID = "appId";
	public static final String SUB_STATION_ID = "subStationId";
	public static final String GOODS_ID = "goodsId";
	public static final String OWNER_ID = "ownerId";
	public static final String LINK_TITLE = "linkTitle";
	public static final String LINK_INTRO = "linkIntro";
	public static final String LINK_PICTURE = "linkPicture";
	public static final String LINK_SOURCE_ADDRESS = "linkSourceAddress";
	public static final String LINK_NEW_ADDRESS = "linkNewAddress";
	public static final String TOTAL_SHARE_COUNT = "totalShareCount";
	public static final String TOTAL_ACCESS_COUNT = "totalAccessCount";
	public static final String TOTAL_REG_COUNT = "totalRegCount";
	public static final String LINK_QRCODE_URL = "linkQrcodeUrl";

	public TShareLink findById(java.lang.Long id) {
		log.debug("getting TShareLink instance with id: " + id);
		try {
			TShareLink instance = (TShareLink) getSession().get(
					"com.vveplat.dao.business.models.TShareLink", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TShareLink> findByExample(TShareLink instance) {
		log.debug("finding TShareLink instance by example");
		try {
			List<TShareLink> results = (List<TShareLink>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TShareLink").add(
							create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TShareLink> findByAppId(Object appId) {
		return findByProperty(APP_ID, appId);
	}

	public List<TShareLink> findBySubStationId(Object subStationId) {
		return findByProperty(SUB_STATION_ID, subStationId);
	}

	public List<TShareLink> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TShareLink> findByOwnerId(Object ownerId) {
		return findByProperty(OWNER_ID, ownerId);
	}

	public List<TShareLink> findByLinkTitle(Object linkTitle) {
		return findByProperty(LINK_TITLE, linkTitle);
	}

	public List<TShareLink> findByLinkIntro(Object linkIntro) {
		return findByProperty(LINK_INTRO, linkIntro);
	}

	public List<TShareLink> findByLinkPicture(Object linkPicture) {
		return findByProperty(LINK_PICTURE, linkPicture);
	}

	public List<TShareLink> findByLinkSourceAddress(Object linkSourceAddress) {
		return findByProperty(LINK_SOURCE_ADDRESS, linkSourceAddress);
	}

	public List<TShareLink> findByLinkNewAddress(Object linkNewAddress) {
		return findByProperty(LINK_NEW_ADDRESS, linkNewAddress);
	}

	public List<TShareLink> findByTotalShareCount(Object totalShareCount) {
		return findByProperty(TOTAL_SHARE_COUNT, totalShareCount);
	}

	public List<TShareLink> findByTotalAccessCount(Object totalAccessCount) {
		return findByProperty(TOTAL_ACCESS_COUNT, totalAccessCount);
	}

	public List<TShareLink> findByTotalRegCount(Object totalRegCount) {
		return findByProperty(TOTAL_REG_COUNT, totalRegCount);
	}

	public List<TShareLink> findByLinkQrcodeUrl(Object linkQrcodeUrl) {
		return findByProperty(LINK_QRCODE_URL, linkQrcodeUrl);
	}

}
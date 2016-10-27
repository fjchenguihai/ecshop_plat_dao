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
 * TPrivilegeGoodsExt entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TPrivilegeGoodsExt
 * @author MyEclipse Persistence Tools
 */
@Component
public class TPrivilegeGoodsExtDAO extends
		HibernateGenericDao<TPrivilegeGoodsExt, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TPrivilegeGoodsExtDAO.class);
	// property constants
	public static final String COVER = "cover";
	public static final String COVER_DESC = "coverDesc";
	public static final String USER_TYPE_STR = "userTypeStr";
	public static final String QUOTA_NUM = "quotaNum";
	public static final String GOODS_ID = "goodsId";
	public static final String PLAT_RELEASE_STATUS = "platReleaseStatus";

	public TPrivilegeGoodsExt findById(java.lang.Long id) {
		log.debug("getting TPrivilegeGoodsExt instance with id: " + id);
		try {
			TPrivilegeGoodsExt instance = (TPrivilegeGoodsExt) getSession()
					.get("com.vveplat.dao.business.models.TPrivilegeGoodsExt",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TPrivilegeGoodsExt> findByExample(TPrivilegeGoodsExt instance) {
		log.debug("finding TPrivilegeGoodsExt instance by example");
		try {
			List<TPrivilegeGoodsExt> results = (List<TPrivilegeGoodsExt>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TPrivilegeGoodsExt")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TPrivilegeGoodsExt> findByCover(Object cover) {
		return findByProperty(COVER, cover);
	}

	public List<TPrivilegeGoodsExt> findByCoverDesc(Object coverDesc) {
		return findByProperty(COVER_DESC, coverDesc);
	}

	public List<TPrivilegeGoodsExt> findByUserTypeStr(Object userTypeStr) {
		return findByProperty(USER_TYPE_STR, userTypeStr);
	}

	public List<TPrivilegeGoodsExt> findByQuotaNum(Object quotaNum) {
		return findByProperty(QUOTA_NUM, quotaNum);
	}

	public List<TPrivilegeGoodsExt> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TPrivilegeGoodsExt> findByPlatReleaseStatus(
			Object platReleaseStatus) {
		return findByProperty(PLAT_RELEASE_STATUS, platReleaseStatus);
	}

}
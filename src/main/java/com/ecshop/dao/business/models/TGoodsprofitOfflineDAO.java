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
 * TGoodsprofitOffline entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ecshop.dao.business.models.TGoodsprofitOffline
 * @author MyEclipse Persistence Tools
 */
@Component
public class TGoodsprofitOfflineDAO extends
		HibernateGenericDao<TGoodsprofitOffline, Long> {
	private static final Logger log = LoggerFactory
			.getLogger(TGoodsprofitOfflineDAO.class);
	// property constants
	public static final String GOODS_ID = "goodsId";
	public static final String BCOMMISSION = "bcommission";
	public static final String MCOMMISSION = "mcommission";
	public static final String DCOMMISSION = "dcommission";
	public static final String DIRECT_COMMISSION = "directCommission";
	public static final String INDIRECT_COMMISSION = "indirectCommission";
	public static final String SERVICE_COMMISSION = "serviceCommission";
	public static final String OPERATION_COMMISSION = "operationCommission";
	public static final String PLATFORM_COMMISSION = "platformCommission";
	public static final String REGION_RATE = "regionRate";
	public static final String REMARK = "remark";

	public TGoodsprofitOffline findById(java.lang.Long id) {
		log.debug("getting TGoodsprofitOffline instance with id: " + id);
		try {
			TGoodsprofitOffline instance = (TGoodsprofitOffline) getSession()
					.get("com.vveplat.dao.business.models.TGoodsprofitOffline",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TGoodsprofitOffline> findByExample(TGoodsprofitOffline instance) {
		log.debug("finding TGoodsprofitOffline instance by example");
		try {
			List<TGoodsprofitOffline> results = (List<TGoodsprofitOffline>) getSession()
					.createCriteria(
							"com.vveplat.dao.business.models.TGoodsprofitOffline")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<TGoodsprofitOffline> findByGoodsId(Object goodsId) {
		return findByProperty(GOODS_ID, goodsId);
	}

	public List<TGoodsprofitOffline> findByBcommission(Object bcommission) {
		return findByProperty(BCOMMISSION, bcommission);
	}

	public List<TGoodsprofitOffline> findByMcommission(Object mcommission) {
		return findByProperty(MCOMMISSION, mcommission);
	}

	public List<TGoodsprofitOffline> findByDcommission(Object dcommission) {
		return findByProperty(DCOMMISSION, dcommission);
	}

	public List<TGoodsprofitOffline> findByDirectCommission(
			Object directCommission) {
		return findByProperty(DIRECT_COMMISSION, directCommission);
	}

	public List<TGoodsprofitOffline> findByIndirectCommission(
			Object indirectCommission) {
		return findByProperty(INDIRECT_COMMISSION, indirectCommission);
	}

	public List<TGoodsprofitOffline> findByServiceCommission(
			Object serviceCommission) {
		return findByProperty(SERVICE_COMMISSION, serviceCommission);
	}

	public List<TGoodsprofitOffline> findByOperationCommission(
			Object operationCommission) {
		return findByProperty(OPERATION_COMMISSION, operationCommission);
	}

	public List<TGoodsprofitOffline> findByPlatformCommission(
			Object platformCommission) {
		return findByProperty(PLATFORM_COMMISSION, platformCommission);
	}

	public List<TGoodsprofitOffline> findByRegionRate(Object regionRate) {
		return findByProperty(REGION_RATE, regionRate);
	}

	public List<TGoodsprofitOffline> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

}
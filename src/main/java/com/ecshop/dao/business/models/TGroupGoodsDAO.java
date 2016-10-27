package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TGroupGoods entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TGroupGoods
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TGroupGoodsDAO extends HibernateGenericDao<TGroupGoods,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TGroupGoodsDAO.class);
		//property constants
	public static final String COVER = "cover";
	public static final String COVER_DESC = "coverDesc";
	public static final String GROUP_TYPE = "groupType";
	public static final String GROUP_VALUE = "groupValue";
	public static final String VALID_TIME = "validTime";
	public static final String USER_TYPE_STR = "userTypeStr";
	public static final String GOODS_ID = "goodsId";
	public static final String PLAT_RELEASE_STATUS = "platReleaseStatus";



    
   
    
    public TGroupGoods findById( java.lang.Long id) {
        log.debug("getting TGroupGoods instance with id: " + id);
        try {
            TGroupGoods instance = (TGroupGoods) getSession()
                    .get("com.vveplat.dao.business.models.TGroupGoods", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TGroupGoods> findByExample(TGroupGoods instance) {
        log.debug("finding TGroupGoods instance by example");
        try {
            List<TGroupGoods> results = (List<TGroupGoods>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TGroupGoods")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TGroupGoods> findByCover(Object cover
	) {
		return findByProperty(COVER, cover
		);
	}
	
	public List<TGroupGoods> findByCoverDesc(Object coverDesc
	) {
		return findByProperty(COVER_DESC, coverDesc
		);
	}
	
	public List<TGroupGoods> findByGroupType(Object groupType
	) {
		return findByProperty(GROUP_TYPE, groupType
		);
	}
	
	public List<TGroupGoods> findByGroupValue(Object groupValue
	) {
		return findByProperty(GROUP_VALUE, groupValue
		);
	}
	
	public List<TGroupGoods> findByValidTime(Object validTime
	) {
		return findByProperty(VALID_TIME, validTime
		);
	}
	
	public List<TGroupGoods> findByUserTypeStr(Object userTypeStr
	) {
		return findByProperty(USER_TYPE_STR, userTypeStr
		);
	}
	
	public List<TGroupGoods> findByGoodsId(Object goodsId
	) {
		return findByProperty(GOODS_ID, goodsId
		);
	}
	
	public List<TGroupGoods> findByPlatReleaseStatus(Object platReleaseStatus
	) {
		return findByProperty(PLAT_RELEASE_STATUS, platReleaseStatus
		);
	}
	

    

}
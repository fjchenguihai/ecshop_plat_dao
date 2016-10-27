package com.ecshop.dao.business.models;

import java.util.Date;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TMallWeixinPayAccount entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TMallWeixinPayAccount
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TMallWeixinPayAccountDAO extends HibernateGenericDao<TMallWeixinPayAccount,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TMallWeixinPayAccountDAO.class);
		//property constants
	public static final String MALL_ID = "mallId";
	public static final String MCH_ID = "mchId";
	public static final String API_KEY = "apiKey";
	public static final String WECHAT_APP_ID = "wechatAppId";
	public static final String WECHAT_APP_SECRET = "wechatAppSecret";
	public static final String ENABLE_STATUS = "enableStatus";
	public static final String IS_PLAT_DEFAULT = "isPlatDefault";
	public static final String CREATE_USER = "createUser";
	public static final String TRADE_GOODS_NAME = "tradeGoodsName";



    
   
    
    public TMallWeixinPayAccount findById( java.lang.Long id) {
        log.debug("getting TMallWeixinPayAccount instance with id: " + id);
        try {
            TMallWeixinPayAccount instance = (TMallWeixinPayAccount) getSession()
                    .get("com.vveplat.dao.business.models.TMallWeixinPayAccount", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TMallWeixinPayAccount> findByExample(TMallWeixinPayAccount instance) {
        log.debug("finding TMallWeixinPayAccount instance by example");
        try {
            List<TMallWeixinPayAccount> results = (List<TMallWeixinPayAccount>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TMallWeixinPayAccount")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TMallWeixinPayAccount> findByMallId(Object mallId
	) {
		return findByProperty(MALL_ID, mallId
		);
	}
	
	public List<TMallWeixinPayAccount> findByMchId(Object mchId
	) {
		return findByProperty(MCH_ID, mchId
		);
	}
	
	public List<TMallWeixinPayAccount> findByApiKey(Object apiKey
	) {
		return findByProperty(API_KEY, apiKey
		);
	}
	
	public List<TMallWeixinPayAccount> findByWechatAppId(Object wechatAppId
	) {
		return findByProperty(WECHAT_APP_ID, wechatAppId
		);
	}
	
	public List<TMallWeixinPayAccount> findByWechatAppSecret(Object wechatAppSecret
	) {
		return findByProperty(WECHAT_APP_SECRET, wechatAppSecret
		);
	}
	
	public List<TMallWeixinPayAccount> findByEnableStatus(Object enableStatus
	) {
		return findByProperty(ENABLE_STATUS, enableStatus
		);
	}
	
	public List<TMallWeixinPayAccount> findByIsPlatDefault(Object isPlatDefault
	) {
		return findByProperty(IS_PLAT_DEFAULT, isPlatDefault
		);
	}
	
	public List<TMallWeixinPayAccount> findByCreateUser(Object createUser
	) {
		return findByProperty(CREATE_USER, createUser
		);
	}
	
	public List<TMallWeixinPayAccount> findByTradeGoodsName(Object tradeGoodsName
	) {
		return findByProperty(TRADE_GOODS_NAME, tradeGoodsName
		);
	}
	

    

}
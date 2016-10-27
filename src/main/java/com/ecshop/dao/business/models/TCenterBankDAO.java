package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TCenterBank entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TCenterBank
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TCenterBankDAO extends HibernateGenericDao<TCenterBank,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TCenterBankDAO.class);
		//property constants
	public static final String BANK_NO = "bankNo";
	public static final String BANK_NAME = "bankName";
	public static final String BANK_BRANCH = "bankBranch";
	public static final String HOLDER_NAME = "holderName";
	public static final String BANK_TYPE = "bankType";
	public static final String BANK_IMG = "bankImg";
	public static final String CARD_IMG = "cardImg";
	public static final String PROVINCE_ID = "provinceId";
	public static final String CITY_ID = "cityId";
	public static final String DISTRICT_ID = "districtId";



    
   
    
    public TCenterBank findById( java.lang.Long id) {
        log.debug("getting TCenterBank instance with id: " + id);
        try {
            TCenterBank instance = (TCenterBank) getSession()
                    .get("com.vveplat.dao.business.models.TCenterBank", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TCenterBank> findByExample(TCenterBank instance) {
        log.debug("finding TCenterBank instance by example");
        try {
            List<TCenterBank> results = (List<TCenterBank>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TCenterBank")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TCenterBank> findByBankNo(Object bankNo
	) {
		return findByProperty(BANK_NO, bankNo
		);
	}
	
	public List<TCenterBank> findByBankName(Object bankName
	) {
		return findByProperty(BANK_NAME, bankName
		);
	}
	
	public List<TCenterBank> findByBankBranch(Object bankBranch
	) {
		return findByProperty(BANK_BRANCH, bankBranch
		);
	}
	
	public List<TCenterBank> findByHolderName(Object holderName
	) {
		return findByProperty(HOLDER_NAME, holderName
		);
	}
	
	public List<TCenterBank> findByBankType(Object bankType
	) {
		return findByProperty(BANK_TYPE, bankType
		);
	}
	
	public List<TCenterBank> findByBankImg(Object bankImg
	) {
		return findByProperty(BANK_IMG, bankImg
		);
	}
	
	public List<TCenterBank> findByCardImg(Object cardImg
	) {
		return findByProperty(CARD_IMG, cardImg
		);
	}
	
	public List<TCenterBank> findByProvinceId(Object provinceId
	) {
		return findByProperty(PROVINCE_ID, provinceId
		);
	}
	
	public List<TCenterBank> findByCityId(Object cityId
	) {
		return findByProperty(CITY_ID, cityId
		);
	}
	
	public List<TCenterBank> findByDistrictId(Object districtId
	) {
		return findByProperty(DISTRICT_ID, districtId
		);
	}
	

    

}
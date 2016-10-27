package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TEnsureSheet entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TEnsureSheet
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TEnsureSheetDAO extends HibernateGenericDao<TEnsureSheet,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TEnsureSheetDAO.class);
		//property constants
	public static final String SHEET_NO = "sheetNo";
	public static final String STRING_CODE = "stringCode";
	public static final String SHEET_PIC = "sheetPic";
	public static final String USER_ID = "userId";
	public static final String GOODS_NAME = "goodsName";



    
   
    
    public TEnsureSheet findById( java.lang.Long id) {
        log.debug("getting TEnsureSheet instance with id: " + id);
        try {
            TEnsureSheet instance = (TEnsureSheet) getSession()
                    .get("com.vveplat.dao.business.models.TEnsureSheet", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TEnsureSheet> findByExample(TEnsureSheet instance) {
        log.debug("finding TEnsureSheet instance by example");
        try {
            List<TEnsureSheet> results = (List<TEnsureSheet>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TEnsureSheet")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TEnsureSheet> findBySheetNo(Object sheetNo
	) {
		return findByProperty(SHEET_NO, sheetNo
		);
	}
	
	public List<TEnsureSheet> findByStringCode(Object stringCode
	) {
		return findByProperty(STRING_CODE, stringCode
		);
	}
	
	public List<TEnsureSheet> findBySheetPic(Object sheetPic
	) {
		return findByProperty(SHEET_PIC, sheetPic
		);
	}
	
	public List<TEnsureSheet> findByUserId(Object userId
	) {
		return findByProperty(USER_ID, userId
		);
	}
	
	public List<TEnsureSheet> findByGoodsName(Object goodsName
	) {
		return findByProperty(GOODS_NAME, goodsName
		);
	}
	

    

}
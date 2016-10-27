package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TBlessingCategory entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TBlessingCategory
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TBlessingCategoryDAO extends HibernateGenericDao<TBlessingCategory,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TBlessingCategoryDAO.class);
		//property constants
	public static final String CATEGORY_NAME = "categoryName";
	public static final String CATEGORY_LOGO = "categoryLogo";
	public static final String REMARK = "remark";



    
   
    
    public TBlessingCategory findById( java.lang.Long id) {
        log.debug("getting TBlessingCategory instance with id: " + id);
        try {
            TBlessingCategory instance = (TBlessingCategory) getSession()
                    .get("com.vveplat.dao.business.models.TBlessingCategory", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TBlessingCategory> findByExample(TBlessingCategory instance) {
        log.debug("finding TBlessingCategory instance by example");
        try {
            List<TBlessingCategory> results = (List<TBlessingCategory>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TBlessingCategory")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TBlessingCategory> findByCategoryName(Object categoryName
	) {
		return findByProperty(CATEGORY_NAME, categoryName
		);
	}
	
	public List<TBlessingCategory> findByCategoryLogo(Object categoryLogo
	) {
		return findByProperty(CATEGORY_LOGO, categoryLogo
		);
	}
	
	public List<TBlessingCategory> findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	

    

}
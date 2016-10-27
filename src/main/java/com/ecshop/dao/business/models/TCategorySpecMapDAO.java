package com.ecshop.dao.business.models;

import java.util.List;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
/**
 	* A data access object (DAO) providing persistence and search support for TCategorySpecMap entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.ecshop.dao.business.models.TCategorySpecMap
  * @author MyEclipse Persistence Tools 
 */
@Component
public class TCategorySpecMapDAO extends HibernateGenericDao<TCategorySpecMap,Long> {
	     private static final Logger log = LoggerFactory.getLogger(TCategorySpecMapDAO.class);
		//property constants
	public static final String CATEGORY_ID = "categoryId";
	public static final String SPEC_ID = "specId";



    
   
    
    public TCategorySpecMap findById( java.lang.Long id) {
        log.debug("getting TCategorySpecMap instance with id: " + id);
        try {
            TCategorySpecMap instance = (TCategorySpecMap) getSession()
                    .get("com.vveplat.dao.business.models.TCategorySpecMap", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<TCategorySpecMap> findByExample(TCategorySpecMap instance) {
        log.debug("finding TCategorySpecMap instance by example");
        try {
            List<TCategorySpecMap> results = (List<TCategorySpecMap>) getSession()
                    .createCriteria("com.vveplat.dao.business.models.TCategorySpecMap")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    

	public List<TCategorySpecMap> findByCategoryId(Object categoryId
	) {
		return findByProperty(CATEGORY_ID, categoryId
		);
	}
	
	public List<TCategorySpecMap> findBySpecId(Object specId
	) {
		return findByProperty(SPEC_ID, specId
		);
	}
	

    

}
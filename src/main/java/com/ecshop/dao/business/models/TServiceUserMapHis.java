package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TServiceUserMapHis entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_service_user_map_his"
)

public class TServiceUserMapHis  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 461812450L;

    // Fields    

 
  /**   
  * serviceUserMapHisId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="serviceUserMapHisId", unique=true, nullable=false)

    private Long serviceUserMapHisId;// get serviceUserMapHisId  
 
  /**   
  * serviceCenterId:
  */     
    @Column(name="serviceCenterId")

    private Long serviceCenterId;// get serviceCenterId  
 
  /**   
  * userId:
  */     
    @Column(name="userId")

    private Long userId;// get userId  
 
  /**   
  * validTime:
  */     
    @Column(name="validTime", length=19)

    private Timestamp validTime;// get validTime  
 
  /**   
  * invalidTime:
  */     
    @Column(name="invalidTime", length=19)

    private Timestamp invalidTime;// get invalidTime  


    // Constructors

    /** default constructor */
    public TServiceUserMapHis() {
    }

    
    /** full constructor */
    public TServiceUserMapHis(Long serviceCenterId, Long userId, Timestamp validTime, Timestamp invalidTime) {
        this.serviceCenterId = serviceCenterId;
        this.userId = userId;
        this.validTime = validTime;
        this.invalidTime = invalidTime;
    }

   
    // Property accessors
	/**
	* get serviceUserMapHisId  
	*/
    public Long getServiceUserMapHisId() {
        return this.serviceUserMapHisId;
    }
    
    public void setServiceUserMapHisId(Long serviceUserMapHisId) {
        this.serviceUserMapHisId = serviceUserMapHisId;
    }
	/**
	* get serviceCenterId  
	*/
    public Long getServiceCenterId() {
        return this.serviceCenterId;
    }
    
    public void setServiceCenterId(Long serviceCenterId) {
        this.serviceCenterId = serviceCenterId;
    }
	/**
	* get userId  
	*/
    public Long getUserId() {
        return this.userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
	/**
	* get validTime  
	*/
    public Timestamp getValidTime() {
        return this.validTime;
    }
    
    public void setValidTime(Timestamp validTime) {
        this.validTime = validTime;
    }
	/**
	* get invalidTime  
	*/
    public Timestamp getInvalidTime() {
        return this.invalidTime;
    }
    
    public void setInvalidTime(Timestamp invalidTime) {
        this.invalidTime = invalidTime;
    }
   








}
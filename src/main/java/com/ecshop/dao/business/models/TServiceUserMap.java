package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TServiceUserMap entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_service_user_map"
)

public class TServiceUserMap  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1107353968L;

    // Fields    

 
  /**   
  * serviceUserMapId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="serviceUserMapId", unique=true, nullable=false)

    private Long serviceUserMapId;// get serviceUserMapId  
 
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
  * updTime:
  */     
    @Column(name="updTime", length=19)

    private Timestamp updTime;// get updTime  


    // Constructors

    /** default constructor */
    public TServiceUserMap() {
    }

    
    /** full constructor */
    public TServiceUserMap(Long serviceCenterId, Long userId, Timestamp updTime) {
        this.serviceCenterId = serviceCenterId;
        this.userId = userId;
        this.updTime = updTime;
    }

   
    // Property accessors
	/**
	* get serviceUserMapId  
	*/
    public Long getServiceUserMapId() {
        return this.serviceUserMapId;
    }
    
    public void setServiceUserMapId(Long serviceUserMapId) {
        this.serviceUserMapId = serviceUserMapId;
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
	* get updTime  
	*/
    public Timestamp getUpdTime() {
        return this.updTime;
    }
    
    public void setUpdTime(Timestamp updTime) {
        this.updTime = updTime;
    }
   








}
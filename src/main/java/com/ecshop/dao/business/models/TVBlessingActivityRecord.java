package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TVBlessingActivityRecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_v_blessing_activity_record"
)

public class TVBlessingActivityRecord  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 208966217L;

    // Fields    

 
  /**   
  * vblessingActivityRecordId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="vBlessingActivityRecordId", unique=true, nullable=false)

    private Long vblessingActivityRecordId;// get vblessingActivityRecordId  
 
  /**   
  * userId:
  */     
    @Column(name="userId")

    private Long userId;// get userId  
 
  /**   
  * mallId:
  */     
    @Column(name="mallId")

    private Long mallId;// get mallId  
 
  /**   
  * marketPlanId:
  */     
    @Column(name="marketPlanId")

    private Long marketPlanId;// get marketPlanId  
 
  /**   
  * marketActivityId:
  */     
    @Column(name="marketActivityId")

    private Long marketActivityId;// get marketActivityId  
 
  /**   
  * vblessingActivityId:
  */     
    @Column(name="vBlessingActivityId")

    private Long vblessingActivityId;// get vblessingActivityId  
 
  /**   
  * orderId:
  */     
    @Column(name="orderId")

    private Long orderId;// get orderId  
 
  /**   
  * creTime:
  */     
    @Column(name="creTime", length=19)

    private Timestamp creTime;// get creTime  
 
  /**   
  * status:
  */     
    @Column(name="status")

    private Integer status;// get status  
 
  /**   
  * submitTime:
  */     
    @Column(name="submitTime", length=19)

    private Timestamp submitTime;// get submitTime  
 
  /**   
  * blessingInfoId:
  */     
    @Column(name="blessingInfoId")

    private Long blessingInfoId;// get blessingInfoId  


    // Constructors

    /** default constructor */
    public TVBlessingActivityRecord() {
    }

    
    /** full constructor */
    public TVBlessingActivityRecord(Long userId, Long mallId, Long marketPlanId, Long marketActivityId, Long vblessingActivityId, Long orderId, Timestamp creTime, Integer status, Timestamp submitTime, Long blessingInfoId) {
        this.userId = userId;
        this.mallId = mallId;
        this.marketPlanId = marketPlanId;
        this.marketActivityId = marketActivityId;
        this.vblessingActivityId = vblessingActivityId;
        this.orderId = orderId;
        this.creTime = creTime;
        this.status = status;
        this.submitTime = submitTime;
        this.blessingInfoId = blessingInfoId;
    }

   
    // Property accessors
	/**
	* get vblessingActivityRecordId  
	*/
    public Long getVblessingActivityRecordId() {
        return this.vblessingActivityRecordId;
    }
    
    public void setVblessingActivityRecordId(Long vblessingActivityRecordId) {
        this.vblessingActivityRecordId = vblessingActivityRecordId;
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
	* get mallId  
	*/
    public Long getMallId() {
        return this.mallId;
    }
    
    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }
	/**
	* get marketPlanId  
	*/
    public Long getMarketPlanId() {
        return this.marketPlanId;
    }
    
    public void setMarketPlanId(Long marketPlanId) {
        this.marketPlanId = marketPlanId;
    }
	/**
	* get marketActivityId  
	*/
    public Long getMarketActivityId() {
        return this.marketActivityId;
    }
    
    public void setMarketActivityId(Long marketActivityId) {
        this.marketActivityId = marketActivityId;
    }
	/**
	* get vblessingActivityId  
	*/
    public Long getVblessingActivityId() {
        return this.vblessingActivityId;
    }
    
    public void setVblessingActivityId(Long vblessingActivityId) {
        this.vblessingActivityId = vblessingActivityId;
    }
	/**
	* get orderId  
	*/
    public Long getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
	/**
	* get creTime  
	*/
    public Timestamp getCreTime() {
        return this.creTime;
    }
    
    public void setCreTime(Timestamp creTime) {
        this.creTime = creTime;
    }
	/**
	* get status  
	*/
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
	/**
	* get submitTime  
	*/
    public Timestamp getSubmitTime() {
        return this.submitTime;
    }
    
    public void setSubmitTime(Timestamp submitTime) {
        this.submitTime = submitTime;
    }
	/**
	* get blessingInfoId  
	*/
    public Long getBlessingInfoId() {
        return this.blessingInfoId;
    }
    
    public void setBlessingInfoId(Long blessingInfoId) {
        this.blessingInfoId = blessingInfoId;
    }
   








}
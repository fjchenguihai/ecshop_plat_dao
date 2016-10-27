package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TGetActivityRecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_get_activity_record"
)

public class TGetActivityRecord  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -944979134L;

    // Fields    

 
  /**   
  * getActivityRecordId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="getActivityRecordId", unique=true, nullable=false)

    private Long getActivityRecordId;// get getActivityRecordId  
 
  /**   
  * relationId:
  */     
    @Column(name="relationId", nullable=false)

    private Long relationId;// get relationId  
 
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
  * getActivityId:
  */     
    @Column(name="getActivityId")

    private Long getActivityId;// get getActivityId  
 
  /**   
  * orderId:
  */     
    @Column(name="orderId")

    private Long orderId;// get orderId  
 
  /**   
  * goodName:
  */     
    @Column(name="goodName", length=100)

    private String goodName;// get goodName  
 
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
  * getTime:
  */     
    @Column(name="getTime", length=19)

    private Timestamp getTime;// get getTime  


    // Constructors

    /** default constructor */
    public TGetActivityRecord() {
    }

	/** minimal constructor */
    public TGetActivityRecord(Long relationId) {
        this.relationId = relationId;
    }
    
    /** full constructor */
    public TGetActivityRecord(Long relationId, Long userId, Long mallId, Long marketPlanId, Long marketActivityId, Long getActivityId, Long orderId, String goodName, Timestamp creTime, Integer status, Timestamp getTime) {
        this.relationId = relationId;
        this.userId = userId;
        this.mallId = mallId;
        this.marketPlanId = marketPlanId;
        this.marketActivityId = marketActivityId;
        this.getActivityId = getActivityId;
        this.orderId = orderId;
        this.goodName = goodName;
        this.creTime = creTime;
        this.status = status;
        this.getTime = getTime;
    }

   
    // Property accessors
	/**
	* get getActivityRecordId  
	*/
    public Long getGetActivityRecordId() {
        return this.getActivityRecordId;
    }
    
    public void setGetActivityRecordId(Long getActivityRecordId) {
        this.getActivityRecordId = getActivityRecordId;
    }
	/**
	* get relationId  
	*/
    public Long getRelationId() {
        return this.relationId;
    }
    
    public void setRelationId(Long relationId) {
        this.relationId = relationId;
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
	* get getActivityId  
	*/
    public Long getGetActivityId() {
        return this.getActivityId;
    }
    
    public void setGetActivityId(Long getActivityId) {
        this.getActivityId = getActivityId;
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
	* get goodName  
	*/
    public String getGoodName() {
        return this.goodName;
    }
    
    public void setGoodName(String goodName) {
        this.goodName = goodName;
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
	* get getTime  
	*/
    public Timestamp getGetTime() {
        return this.getTime;
    }
    
    public void setGetTime(Timestamp getTime) {
        this.getTime = getTime;
    }
   








}
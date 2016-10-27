package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TMarketPlanActivityRelation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_market_plan_activity_relation"
)

public class TMarketPlanActivityRelation  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 968465732L;

    // Fields    

 
  /**   
  * relationId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="relationId", unique=true, nullable=false)

    private Long relationId;// get relationId  
 
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
  * generateMode:
  */     
    @Column(name="generateMode")

    private Integer generateMode;// get generateMode  
 
  /**   
  * beginTime:
  */     
    @Column(name="beginTime", length=19)

    private Timestamp beginTime;// get beginTime  
 
  /**   
  * endTime:
  */     
    @Column(name="endTime", length=19)

    private Timestamp endTime;// get endTime  
 
  /**   
  * amount:
  */     
    @Column(name="amount")

    private Integer amount;// get amount  


    // Constructors

    /** default constructor */
    public TMarketPlanActivityRelation() {
    }

    
    /** full constructor */
    public TMarketPlanActivityRelation(Long marketPlanId, Long marketActivityId, Integer generateMode, Timestamp beginTime, Timestamp endTime, Integer amount) {
        this.marketPlanId = marketPlanId;
        this.marketActivityId = marketActivityId;
        this.generateMode = generateMode;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.amount = amount;
    }

   
    // Property accessors
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
	* get generateMode  
	*/
    public Integer getGenerateMode() {
        return this.generateMode;
    }
    
    public void setGenerateMode(Integer generateMode) {
        this.generateMode = generateMode;
    }
	/**
	* get beginTime  
	*/
    public Timestamp getBeginTime() {
        return this.beginTime;
    }
    
    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }
	/**
	* get endTime  
	*/
    public Timestamp getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }
	/**
	* get amount  
	*/
    public Integer getAmount() {
        return this.amount;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
   








}
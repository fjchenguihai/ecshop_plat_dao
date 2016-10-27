package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TMarketPlan entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_market_plan"
)

public class TMarketPlan  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1804429063L;

    // Fields    

 
  /**   
  * marketPlanId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="marketPlanId", unique=true, nullable=false)

    private Long marketPlanId;// get marketPlanId  
 
  /**   
  * marketPlanName:
  */     
    @Column(name="marketPlanName", length=100)

    private String marketPlanName;// get marketPlanName  
 
  /**   
  * beginTime:
  */     
    @Column(name="beginTime", length=19)

    private Timestamp beginTime;// get beginTime  
 
  /**   
  * endTime:
  */     
    @Column(name="endTIme", length=19)

    private Timestamp endTime;// get endTime  
 
  /**   
  * mallId:
  */     
    @Column(name="mallId")

    private Long mallId;// get mallId  
 
  /**   
  * creTime:
  */     
    @Column(name="creTime", length=19)

    private Timestamp creTime;// get creTime  
 
  /**   
  * creUserId:
  */     
    @Column(name="creUserId")

    private Long creUserId;// get creUserId  
 
  /**   
  * marketPlanPicture:
  */     
    @Column(name="marketPlanPicture", length=1024)

    private String marketPlanPicture;// get marketPlanPicture  
 
  /**   
  * marketPlanRemark:
  */     
    @Column(name="marketPlanRemark", length=1000)

    private String marketPlanRemark;// get marketPlanRemark  
 
  /**   
  * marketPlanRuleRemark:
  */     
    @Column(name="marketPlanRuleRemark", length=65535)

    private String marketPlanRuleRemark;// get marketPlanRuleRemark  
 
  /**   
  * marketPlanRuleDetail:
  */     
    @Column(name="marketPlanRuleDetail", length=65535)

    private String marketPlanRuleDetail;// get marketPlanRuleDetail  


    // Constructors

    /** default constructor */
    public TMarketPlan() {
    }

    
    /** full constructor */
    public TMarketPlan(String marketPlanName, Timestamp beginTime, Timestamp endTime, Long mallId, Timestamp creTime, Long creUserId, String marketPlanPicture, String marketPlanRemark, String marketPlanRuleRemark, String marketPlanRuleDetail) {
        this.marketPlanName = marketPlanName;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.mallId = mallId;
        this.creTime = creTime;
        this.creUserId = creUserId;
        this.marketPlanPicture = marketPlanPicture;
        this.marketPlanRemark = marketPlanRemark;
        this.marketPlanRuleRemark = marketPlanRuleRemark;
        this.marketPlanRuleDetail = marketPlanRuleDetail;
    }

   
    // Property accessors
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
	* get marketPlanName  
	*/
    public String getMarketPlanName() {
        return this.marketPlanName;
    }
    
    public void setMarketPlanName(String marketPlanName) {
        this.marketPlanName = marketPlanName;
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
	* get mallId  
	*/
    public Long getMallId() {
        return this.mallId;
    }
    
    public void setMallId(Long mallId) {
        this.mallId = mallId;
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
	* get creUserId  
	*/
    public Long getCreUserId() {
        return this.creUserId;
    }
    
    public void setCreUserId(Long creUserId) {
        this.creUserId = creUserId;
    }
	/**
	* get marketPlanPicture  
	*/
    public String getMarketPlanPicture() {
        return this.marketPlanPicture;
    }
    
    public void setMarketPlanPicture(String marketPlanPicture) {
        this.marketPlanPicture = marketPlanPicture;
    }
	/**
	* get marketPlanRemark  
	*/
    public String getMarketPlanRemark() {
        return this.marketPlanRemark;
    }
    
    public void setMarketPlanRemark(String marketPlanRemark) {
        this.marketPlanRemark = marketPlanRemark;
    }
	/**
	* get marketPlanRuleRemark  
	*/
    public String getMarketPlanRuleRemark() {
        return this.marketPlanRuleRemark;
    }
    
    public void setMarketPlanRuleRemark(String marketPlanRuleRemark) {
        this.marketPlanRuleRemark = marketPlanRuleRemark;
    }
	/**
	* get marketPlanRuleDetail  
	*/
    public String getMarketPlanRuleDetail() {
        return this.marketPlanRuleDetail;
    }
    
    public void setMarketPlanRuleDetail(String marketPlanRuleDetail) {
        this.marketPlanRuleDetail = marketPlanRuleDetail;
    }
   








}
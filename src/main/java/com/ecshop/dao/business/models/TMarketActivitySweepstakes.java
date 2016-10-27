package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TMarketActivitySweepstakes entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_market_activity_sweepstakes"
)

public class TMarketActivitySweepstakes  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1588139974L;

    // Fields    

 
  /**   
  * sweepstakesActivityId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="sweepstakesActivityId", unique=true, nullable=false)

    private Long sweepstakesActivityId;// get sweepstakesActivityId  
 
  /**   
  * marketActivityId:
  */     
    @Column(name="marketActivityId")

    private Long marketActivityId;// get marketActivityId  
 
  /**   
  * probability:
  */     
    @Column(name="probability", precision=6)

    private Double probability;// get probability  
 
  /**   
  * remark:
  */     
    @Column(name="remark", length=200)

    private String remark;// get remark  
 
  /**   
  * picture:
  */     
    @Column(name="picture", length=200)

    private String picture;// get picture  


    // Constructors

    /** default constructor */
    public TMarketActivitySweepstakes() {
    }

    
    /** full constructor */
    public TMarketActivitySweepstakes(Long marketActivityId, Double probability, String remark, String picture) {
        this.marketActivityId = marketActivityId;
        this.probability = probability;
        this.remark = remark;
        this.picture = picture;
    }

   
    // Property accessors
	/**
	* get sweepstakesActivityId  
	*/
    public Long getSweepstakesActivityId() {
        return this.sweepstakesActivityId;
    }
    
    public void setSweepstakesActivityId(Long sweepstakesActivityId) {
        this.sweepstakesActivityId = sweepstakesActivityId;
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
	* get probability  
	*/
    public Double getProbability() {
        return this.probability;
    }
    
    public void setProbability(Double probability) {
        this.probability = probability;
    }
	/**
	* get remark  
	*/
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
	/**
	* get picture  
	*/
    public String getPicture() {
        return this.picture;
    }
    
    public void setPicture(String picture) {
        this.picture = picture;
    }
   








}
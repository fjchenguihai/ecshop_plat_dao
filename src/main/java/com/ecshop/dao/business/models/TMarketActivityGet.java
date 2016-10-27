package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TMarketActivityGet entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_market_activity_get"
)

public class TMarketActivityGet  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1771101687L;

    // Fields    

 
  /**   
  * getActivityId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="getActivityId", unique=true, nullable=false)

    private Long getActivityId;// get getActivityId  
 
  /**   
  * marketActivityId:
  */     
    @Column(name="marketActivityId")

    private Long marketActivityId;// get marketActivityId  
 
  /**   
  * goodName:
  */     
    @Column(name="goodName", length=200)

    private String goodName;// get goodName  
 
  /**   
  * price:
  */     
    @Column(name="price", precision=12)

    private Double price;// get price  
 
  /**   
  * picture:
  */     
    @Column(name="picture", length=200)

    private String picture;// get picture  
 
  /**   
  * remark:
  */     
    @Column(name="remark", length=200)

    private String remark;// get remark  


    // Constructors

    /** default constructor */
    public TMarketActivityGet() {
    }

    
    /** full constructor */
    public TMarketActivityGet(Long marketActivityId, String goodName, Double price, String picture, String remark) {
        this.marketActivityId = marketActivityId;
        this.goodName = goodName;
        this.price = price;
        this.picture = picture;
        this.remark = remark;
    }

   
    // Property accessors
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
	* get marketActivityId  
	*/
    public Long getMarketActivityId() {
        return this.marketActivityId;
    }
    
    public void setMarketActivityId(Long marketActivityId) {
        this.marketActivityId = marketActivityId;
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
	* get price  
	*/
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
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
	/**
	* get remark  
	*/
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}
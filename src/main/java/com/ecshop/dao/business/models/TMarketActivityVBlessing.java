package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TMarketActivityVBlessing entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_market_activity_v_blessing"
)

public class TMarketActivityVBlessing  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1355133310L;

    // Fields    

 
  /**   
  * blessingActivityId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="blessingActivityId", unique=true, nullable=false)

    private Long blessingActivityId;// get blessingActivityId  
 
  /**   
  * marketActivityId:
  */     
    @Column(name="marketActivityId")

    private Long marketActivityId;// get marketActivityId  
 
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
    public TMarketActivityVBlessing() {
    }

    
    /** full constructor */
    public TMarketActivityVBlessing(Long marketActivityId, String picture, String remark) {
        this.marketActivityId = marketActivityId;
        this.picture = picture;
        this.remark = remark;
    }

   
    // Property accessors
	/**
	* get blessingActivityId  
	*/
    public Long getBlessingActivityId() {
        return this.blessingActivityId;
    }
    
    public void setBlessingActivityId(Long blessingActivityId) {
        this.blessingActivityId = blessingActivityId;
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
package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TMarketGift entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_market_gift"
)

public class TMarketGift  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1804699904L;

    // Fields    

 
  /**   
  * marketGiftId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="marketGiftId", unique=true, nullable=false)

    private Long marketGiftId;// get marketGiftId  
 
  /**   
  * mallId:
  */     
    @Column(name="mallId")

    private Long mallId;// get mallId  
 
  /**   
  * giftName:
  */     
    @Column(name="giftName", length=20)

    private String giftName;// get giftName  
 
  /**   
  * price:
  */     
    @Column(name="price", precision=12)

    private Double price;// get price  
 
  /**   
  * pictrue:
  */     
    @Column(name="pictrue", length=200)

    private String pictrue;// get pictrue  
 
  /**   
  * remark:
  */     
    @Column(name="remark", length=200)

    private String remark;// get remark  
 
  /**   
  * giftUnit:
  */     
    @Column(name="giftUnit", length=20)

    private String giftUnit;// get giftUnit  


    // Constructors

    /** default constructor */
    public TMarketGift() {
    }

    
    /** full constructor */
    public TMarketGift(Long mallId, String giftName, Double price, String pictrue, String remark, String giftUnit) {
        this.mallId = mallId;
        this.giftName = giftName;
        this.price = price;
        this.pictrue = pictrue;
        this.remark = remark;
        this.giftUnit = giftUnit;
    }

   
    // Property accessors
	/**
	* get marketGiftId  
	*/
    public Long getMarketGiftId() {
        return this.marketGiftId;
    }
    
    public void setMarketGiftId(Long marketGiftId) {
        this.marketGiftId = marketGiftId;
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
	* get giftName  
	*/
    public String getGiftName() {
        return this.giftName;
    }
    
    public void setGiftName(String giftName) {
        this.giftName = giftName;
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
	* get pictrue  
	*/
    public String getPictrue() {
        return this.pictrue;
    }
    
    public void setPictrue(String pictrue) {
        this.pictrue = pictrue;
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
	* get giftUnit  
	*/
    public String getGiftUnit() {
        return this.giftUnit;
    }
    
    public void setGiftUnit(String giftUnit) {
        this.giftUnit = giftUnit;
    }
   








}
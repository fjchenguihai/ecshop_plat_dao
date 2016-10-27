package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TCenterBank entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_center_bank"
)

public class TCenterBank  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1760127067L;

    // Fields    

 
  /**   
  * centerBankId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="centerBankId", unique=true, nullable=false)

    private Long centerBankId;// get centerBankId  
 
  /**   
  * bankNo:
  */     
    @Column(name="bankNo", length=50)

    private String bankNo;// get bankNo  
 
  /**   
  * bankName:
  */     
    @Column(name="bankName", length=50)

    private String bankName;// get bankName  
 
  /**   
  * bankBranch:
  */     
    @Column(name="bankBranch", length=50)

    private String bankBranch;// get bankBranch  
 
  /**   
  * holderName:
  */     
    @Column(name="holderName", length=50)

    private String holderName;// get holderName  
 
  /**   
  * bankType:
  */     
    @Column(name="bankType")

    private Integer bankType;// get bankType  
 
  /**   
  * bankImg:
  */     
    @Column(name="bankImg", length=200)

    private String bankImg;// get bankImg  
 
  /**   
  * cardImg:
  */     
    @Column(name="cardImg", length=200)

    private String cardImg;// get cardImg  
 
  /**   
  * provinceId:
  */     
    @Column(name="provinceId")

    private Integer provinceId;// get provinceId  
 
  /**   
  * cityId:
  */     
    @Column(name="cityId")

    private Integer cityId;// get cityId  
 
  /**   
  * districtId:
  */     
    @Column(name="districtId")

    private Integer districtId;// get districtId  


    // Constructors

    /** default constructor */
    public TCenterBank() {
    }

    
    /** full constructor */
    public TCenterBank(String bankNo, String bankName, String bankBranch, String holderName, Integer bankType, String bankImg, String cardImg, Integer provinceId, Integer cityId, Integer districtId) {
        this.bankNo = bankNo;
        this.bankName = bankName;
        this.bankBranch = bankBranch;
        this.holderName = holderName;
        this.bankType = bankType;
        this.bankImg = bankImg;
        this.cardImg = cardImg;
        this.provinceId = provinceId;
        this.cityId = cityId;
        this.districtId = districtId;
    }

   
    // Property accessors
	/**
	* get centerBankId  
	*/
    public Long getCenterBankId() {
        return this.centerBankId;
    }
    
    public void setCenterBankId(Long centerBankId) {
        this.centerBankId = centerBankId;
    }
	/**
	* get bankNo  
	*/
    public String getBankNo() {
        return this.bankNo;
    }
    
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }
	/**
	* get bankName  
	*/
    public String getBankName() {
        return this.bankName;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
	/**
	* get bankBranch  
	*/
    public String getBankBranch() {
        return this.bankBranch;
    }
    
    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }
	/**
	* get holderName  
	*/
    public String getHolderName() {
        return this.holderName;
    }
    
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
	/**
	* get bankType  
	*/
    public Integer getBankType() {
        return this.bankType;
    }
    
    public void setBankType(Integer bankType) {
        this.bankType = bankType;
    }
	/**
	* get bankImg  
	*/
    public String getBankImg() {
        return this.bankImg;
    }
    
    public void setBankImg(String bankImg) {
        this.bankImg = bankImg;
    }
	/**
	* get cardImg  
	*/
    public String getCardImg() {
        return this.cardImg;
    }
    
    public void setCardImg(String cardImg) {
        this.cardImg = cardImg;
    }
	/**
	* get provinceId  
	*/
    public Integer getProvinceId() {
        return this.provinceId;
    }
    
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }
	/**
	* get cityId  
	*/
    public Integer getCityId() {
        return this.cityId;
    }
    
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
	/**
	* get districtId  
	*/
    public Integer getDistrictId() {
        return this.districtId;
    }
    
    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }
   








}
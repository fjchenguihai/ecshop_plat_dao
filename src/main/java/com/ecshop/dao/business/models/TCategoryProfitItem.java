package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TCategoryProfitItem entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_category_profit_item"
)

public class TCategoryProfitItem  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1977233033L;

    // Fields    

 
  /**   
  * categoryProfitId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="categoryProfitId", unique=true, nullable=false)

    private Long categoryProfitId;// get categoryProfitId  
 
  /**   
  * categoryId:
  */     
    @Column(name="categoryId")

    private Long categoryId;// get categoryId  
 
  /**   
  * memberCommission:
  */     
    @Column(name="memberCommission", precision=15, scale=4)

    private Double memberCommission;// get memberCommission  
 
  /**   
  * platCommission:
  */     
    @Column(name="platCommission", precision=15, scale=4)

    private Double platCommission;// get platCommission  
 
  /**   
  * vcommission:
  */     
    @Column(name="vCommission", precision=15, scale=4)

    private Double vcommission;// get vcommission  
 
  /**   
  * dcommission:
  */     
    @Column(name="dCommission", precision=15, scale=4)

    private Double dcommission;// get dcommission  
 
  /**   
  * directCommission:
  */     
    @Column(name="directCommission", precision=15, scale=4)

    private Double directCommission;// get directCommission  
 
  /**   
  * indirectCommission:
  */     
    @Column(name="indirectCommission", precision=15, scale=4)

    private Double indirectCommission;// get indirectCommission  
 
  /**   
  * serviceCommission:
  */     
    @Column(name="serviceCommission", precision=15, scale=4)

    private Double serviceCommission;// get serviceCommission  
 
  /**   
  * operationCommission:
  */     
    @Column(name="operationCommission", precision=15, scale=4)

    private Double operationCommission;// get operationCommission  
 
  /**   
  * platformCommission:
  */     
    @Column(name="platformCommission", precision=15, scale=4)

    private Double platformCommission;// get platformCommission  
 
  /**   
  * validTime:
  */     
    @Column(name="validTime", length=19)

    private Timestamp validTime;// get validTime  
 
  /**   
  * invalidTime:
  */     
    @Column(name="invalidTime", length=19)

    private Timestamp invalidTime;// get invalidTime  
 
  /**   
  * regionCommission:
  */     
    @Column(name="regionCommission", precision=15, scale=4)

    private Double regionCommission;// get regionCommission  


    // Constructors

    /** default constructor */
    public TCategoryProfitItem() {
    }

    
    /** full constructor */
    public TCategoryProfitItem(Long categoryId, Double memberCommission, Double platCommission, Double vcommission, Double dcommission, Double directCommission, Double indirectCommission, Double serviceCommission, Double operationCommission, Double platformCommission, Timestamp validTime, Timestamp invalidTime, Double regionCommission) {
        this.categoryId = categoryId;
        this.memberCommission = memberCommission;
        this.platCommission = platCommission;
        this.vcommission = vcommission;
        this.dcommission = dcommission;
        this.directCommission = directCommission;
        this.indirectCommission = indirectCommission;
        this.serviceCommission = serviceCommission;
        this.operationCommission = operationCommission;
        this.platformCommission = platformCommission;
        this.validTime = validTime;
        this.invalidTime = invalidTime;
        this.regionCommission = regionCommission;
    }

   
    // Property accessors
	/**
	* get categoryProfitId  
	*/
    public Long getCategoryProfitId() {
        return this.categoryProfitId;
    }
    
    public void setCategoryProfitId(Long categoryProfitId) {
        this.categoryProfitId = categoryProfitId;
    }
	/**
	* get categoryId  
	*/
    public Long getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
	/**
	* get memberCommission  
	*/
    public Double getMemberCommission() {
        return this.memberCommission;
    }
    
    public void setMemberCommission(Double memberCommission) {
        this.memberCommission = memberCommission;
    }
	/**
	* get platCommission  
	*/
    public Double getPlatCommission() {
        return this.platCommission;
    }
    
    public void setPlatCommission(Double platCommission) {
        this.platCommission = platCommission;
    }
	/**
	* get vcommission  
	*/
    public Double getVcommission() {
        return this.vcommission;
    }
    
    public void setVcommission(Double vcommission) {
        this.vcommission = vcommission;
    }
	/**
	* get dcommission  
	*/
    public Double getDcommission() {
        return this.dcommission;
    }
    
    public void setDcommission(Double dcommission) {
        this.dcommission = dcommission;
    }
	/**
	* get directCommission  
	*/
    public Double getDirectCommission() {
        return this.directCommission;
    }
    
    public void setDirectCommission(Double directCommission) {
        this.directCommission = directCommission;
    }
	/**
	* get indirectCommission  
	*/
    public Double getIndirectCommission() {
        return this.indirectCommission;
    }
    
    public void setIndirectCommission(Double indirectCommission) {
        this.indirectCommission = indirectCommission;
    }
	/**
	* get serviceCommission  
	*/
    public Double getServiceCommission() {
        return this.serviceCommission;
    }
    
    public void setServiceCommission(Double serviceCommission) {
        this.serviceCommission = serviceCommission;
    }
	/**
	* get operationCommission  
	*/
    public Double getOperationCommission() {
        return this.operationCommission;
    }
    
    public void setOperationCommission(Double operationCommission) {
        this.operationCommission = operationCommission;
    }
	/**
	* get platformCommission  
	*/
    public Double getPlatformCommission() {
        return this.platformCommission;
    }
    
    public void setPlatformCommission(Double platformCommission) {
        this.platformCommission = platformCommission;
    }
	/**
	* get validTime  
	*/
    public Timestamp getValidTime() {
        return this.validTime;
    }
    
    public void setValidTime(Timestamp validTime) {
        this.validTime = validTime;
    }
	/**
	* get invalidTime  
	*/
    public Timestamp getInvalidTime() {
        return this.invalidTime;
    }
    
    public void setInvalidTime(Timestamp invalidTime) {
        this.invalidTime = invalidTime;
    }
	/**
	* get regionCommission  
	*/
    public Double getRegionCommission() {
        return this.regionCommission;
    }
    
    public void setRegionCommission(Double regionCommission) {
        this.regionCommission = regionCommission;
    }
   








}
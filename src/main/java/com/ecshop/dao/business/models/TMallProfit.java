package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TMallProfit entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_mall_profit"
)

public class TMallProfit  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 908973292L;

    // Fields    

 
  /**   
  * mallProfitId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="mallProfitId", unique=true, nullable=false)

    private Long mallProfitId;// get mallProfitId  
 
  /**   
  * mallId:
  */     
    @Column(name="mallId")

    private Long mallId;// get mallId  
 
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
  * regionCommission:
  */     
    @Column(name="regionCommission", precision=15, scale=4)

    private Double regionCommission;// get regionCommission  
 
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


    // Constructors

    /** default constructor */
    public TMallProfit() {
    }

    
    /** full constructor */
    public TMallProfit(Long mallId, Double directCommission, Double indirectCommission, Double serviceCommission, Double operationCommission, Double platformCommission, Double regionCommission, Timestamp validTime, Timestamp invalidTime) {
        this.mallId = mallId;
        this.directCommission = directCommission;
        this.indirectCommission = indirectCommission;
        this.serviceCommission = serviceCommission;
        this.operationCommission = operationCommission;
        this.platformCommission = platformCommission;
        this.regionCommission = regionCommission;
        this.validTime = validTime;
        this.invalidTime = invalidTime;
    }

   
    // Property accessors
	/**
	* get mallProfitId  
	*/
    public Long getMallProfitId() {
        return this.mallProfitId;
    }
    
    public void setMallProfitId(Long mallProfitId) {
        this.mallProfitId = mallProfitId;
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
	* get regionCommission  
	*/
    public Double getRegionCommission() {
        return this.regionCommission;
    }
    
    public void setRegionCommission(Double regionCommission) {
        this.regionCommission = regionCommission;
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
   








}
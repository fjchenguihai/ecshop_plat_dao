package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TSweepstakesActivityRecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_sweepstakes_activity_record"
)

public class TSweepstakesActivityRecord  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1995819985L;

    // Fields    

 
  /**   
  * sweepstakesActivityRecordId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="sweepstakesActivityRecordId", unique=true, nullable=false)

    private Long sweepstakesActivityRecordId;// get sweepstakesActivityRecordId  
 
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
  * sweepstakesActivityId:
  */     
    @Column(name="sweepstakesActivityId")

    private Long sweepstakesActivityId;// get sweepstakesActivityId  
 
  /**   
  * sweepstakesAwardId:
  */     
    @Column(name="sweepstakesAwardId")

    private Long sweepstakesAwardId;// get sweepstakesAwardId  
 
  /**   
  * orderId:
  */     
    @Column(name="orderId")

    private Long orderId;// get orderId  
 
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
  * useTime:
  */     
    @Column(name="useTime", length=19)

    private Timestamp useTime;// get useTime  
 
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
 
  /**   
  * deliversAddress:
  */     
    @Column(name="deliversAddress", length=100)

    private String deliversAddress;// get deliversAddress  
 
  /**   
  * addressee:
  */     
    @Column(name="addressee", length=20)

    private String addressee;// get addressee  
 
  /**   
  * telephone:
  */     
    @Column(name="telephone", length=20)

    private String telephone;// get telephone  


    // Constructors

    /** default constructor */
    public TSweepstakesActivityRecord() {
    }

    
    /** full constructor */
    public TSweepstakesActivityRecord(Long userId, Long mallId, Long marketPlanId, Long marketActivityId, Long sweepstakesActivityId, Long sweepstakesAwardId, Long orderId, Timestamp creTime, Integer status, Timestamp useTime, Integer provinceId, Integer cityId, Integer districtId, String deliversAddress, String addressee, String telephone) {
        this.userId = userId;
        this.mallId = mallId;
        this.marketPlanId = marketPlanId;
        this.marketActivityId = marketActivityId;
        this.sweepstakesActivityId = sweepstakesActivityId;
        this.sweepstakesAwardId = sweepstakesAwardId;
        this.orderId = orderId;
        this.creTime = creTime;
        this.status = status;
        this.useTime = useTime;
        this.provinceId = provinceId;
        this.cityId = cityId;
        this.districtId = districtId;
        this.deliversAddress = deliversAddress;
        this.addressee = addressee;
        this.telephone = telephone;
    }

   
    // Property accessors
	/**
	* get sweepstakesActivityRecordId  
	*/
    public Long getSweepstakesActivityRecordId() {
        return this.sweepstakesActivityRecordId;
    }
    
    public void setSweepstakesActivityRecordId(Long sweepstakesActivityRecordId) {
        this.sweepstakesActivityRecordId = sweepstakesActivityRecordId;
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
	* get sweepstakesActivityId  
	*/
    public Long getSweepstakesActivityId() {
        return this.sweepstakesActivityId;
    }
    
    public void setSweepstakesActivityId(Long sweepstakesActivityId) {
        this.sweepstakesActivityId = sweepstakesActivityId;
    }
	/**
	* get sweepstakesAwardId  
	*/
    public Long getSweepstakesAwardId() {
        return this.sweepstakesAwardId;
    }
    
    public void setSweepstakesAwardId(Long sweepstakesAwardId) {
        this.sweepstakesAwardId = sweepstakesAwardId;
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
	* get useTime  
	*/
    public Timestamp getUseTime() {
        return this.useTime;
    }
    
    public void setUseTime(Timestamp useTime) {
        this.useTime = useTime;
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
	/**
	* get deliversAddress  
	*/
    public String getDeliversAddress() {
        return this.deliversAddress;
    }
    
    public void setDeliversAddress(String deliversAddress) {
        this.deliversAddress = deliversAddress;
    }
	/**
	* get addressee  
	*/
    public String getAddressee() {
        return this.addressee;
    }
    
    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }
	/**
	* get telephone  
	*/
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
   








}
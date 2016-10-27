package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TCenter entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_center"
)

public class TCenter  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -744281655L;

    // Fields    

 
  /**   
  * centerId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="centerId", unique=true, nullable=false)

    private Long centerId;// get centerId  
 
  /**   
  * upCenterId:
  */     
    @Column(name="upCenterId")

    private Long upCenterId;// get upCenterId  
 
  /**   
  * centerName:
  */     
    @Column(name="centerName", length=30)

    private String centerName;// get centerName  
 
  /**   
  * remark:
  */     
    @Column(name="remark", length=500)

    private String remark;// get remark  
 
  /**   
  * address:
  */     
    @Column(name="address", length=200)

    private String address;// get address  
 
  /**   
  * position:
  */     
    @Column(name="position", length=50)

    private String position;// get position  
 
  /**   
  * creTime:
  */     
    @Column(name="creTime", length=19)

    private Timestamp creTime;// get creTime  
 
  /**   
  * updTime:
  */     
    @Column(name="updTime", length=19)

    private Timestamp updTime;// get updTime  
 
  /**   
  * status:
  */     
    @Column(name="status")

    private Integer status;// get status  
 
  /**   
  * centerBankId:
  */     
    @Column(name="centerBankId")

    private Long centerBankId;// get centerBankId  
 
  /**   
  * centerType:
  */     
    @Column(name="centerType")

    private Integer centerType;// get centerType  
 
  /**   
  * isDefault:
  */     
    @Column(name="isDefault")

    private Integer isDefault = 0;// get isDefault  


    // Constructors

    /** default constructor */
    public TCenter() {
    }

    
    /** full constructor */
    public TCenter(Long upCenterId, String centerName, String remark, String address, String position, Timestamp creTime, Timestamp updTime, Integer status, Long centerBankId, Integer centerType, Integer isDefault) {
        this.upCenterId = upCenterId;
        this.centerName = centerName;
        this.remark = remark;
        this.address = address;
        this.position = position;
        this.creTime = creTime;
        this.updTime = updTime;
        this.status = status;
        this.centerBankId = centerBankId;
        this.centerType = centerType;
        this.isDefault = isDefault;
    }

   
    // Property accessors
	/**
	* get centerId  
	*/
    public Long getCenterId() {
        return this.centerId;
    }
    
    public void setCenterId(Long centerId) {
        this.centerId = centerId;
    }
	/**
	* get upCenterId  
	*/
    public Long getUpCenterId() {
        return this.upCenterId;
    }
    
    public void setUpCenterId(Long upCenterId) {
        this.upCenterId = upCenterId;
    }
	/**
	* get centerName  
	*/
    public String getCenterName() {
        return this.centerName;
    }
    
    public void setCenterName(String centerName) {
        this.centerName = centerName;
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
	* get address  
	*/
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
	/**
	* get position  
	*/
    public String getPosition() {
        return this.position;
    }
    
    public void setPosition(String position) {
        this.position = position;
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
	* get updTime  
	*/
    public Timestamp getUpdTime() {
        return this.updTime;
    }
    
    public void setUpdTime(Timestamp updTime) {
        this.updTime = updTime;
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
	* get centerBankId  
	*/
    public Long getCenterBankId() {
        return this.centerBankId;
    }
    
    public void setCenterBankId(Long centerBankId) {
        this.centerBankId = centerBankId;
    }
	/**
	* get centerType  
	*/
    public Integer getCenterType() {
        return this.centerType;
    }
    
    public void setCenterType(Integer centerType) {
        this.centerType = centerType;
    }
	/**
	* get isDefault  
	*/
    public Integer getIsDefault() {
        return this.isDefault;
    }
    
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }
   








}
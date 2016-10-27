package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * TBlessingInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_blessing_info"
)

public class TBlessingInfo  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 689341641L;

    // Fields    

 
  /**   
  * blessingInfoId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="blessingInfoId", unique=true, nullable=false)

    private Long blessingInfoId;// get blessingInfoId  
 
  /**   
  * userId:
  */     
    @Column(name="userId")

    private Long userId;// get userId  
 
  /**   
  * realName:
  */     
    @Column(name="realName", length=50)

    private String realName;// get realName  
 
  /**   
  * mobile:
  */     
    @Column(name="mobile", length=20)

    private String mobile;// get mobile  
 
  /**   
  * memorialName:
  */     
    @Column(name="memorialName", length=50)

    private String memorialName;// get memorialName  
 
  /**   
  * memorialDay:
  */     @Temporal(TemporalType.DATE)
    @Column(name="memorialDay", length=10)

    private Date memorialDay;// get memorialDay  
 
  /**   
  * picture1:
  */     
    @Column(name="picture1", length=200)

    private String picture1;// get picture1  
 
  /**   
  * picture2:
  */     
    @Column(name="picture2", length=200)

    private String picture2;// get picture2  
 
  /**   
  * picture3:
  */     
    @Column(name="picture3", length=200)

    private String picture3;// get picture3  
 
  /**   
  * remark:
  */     
    @Column(name="remark", length=200)

    private String remark;// get remark  
 
  /**   
  * auditStatus:
  */     
    @Column(name="auditStatus")

    private Integer auditStatus;// get auditStatus  
 
  /**   
  * categoryId:
  */     
    @Column(name="categoryId")

    private Long categoryId;// get categoryId  
 
  /**   
  * showBeginTime:
  */     
    @Column(name="showBeginTime", length=19)

    private Timestamp showBeginTime;// get showBeginTime  
 
  /**   
  * showEndTime:
  */     
    @Column(name="showEndTime", length=19)

    private Timestamp showEndTime;// get showEndTime  


    // Constructors

    /** default constructor */
    public TBlessingInfo() {
    }

    
    /** full constructor */
    public TBlessingInfo(Long userId, String realName, String mobile, String memorialName, Date memorialDay, String picture1, String picture2, String picture3, String remark, Integer auditStatus, Long categoryId, Timestamp showBeginTime, Timestamp showEndTime) {
        this.userId = userId;
        this.realName = realName;
        this.mobile = mobile;
        this.memorialName = memorialName;
        this.memorialDay = memorialDay;
        this.picture1 = picture1;
        this.picture2 = picture2;
        this.picture3 = picture3;
        this.remark = remark;
        this.auditStatus = auditStatus;
        this.categoryId = categoryId;
        this.showBeginTime = showBeginTime;
        this.showEndTime = showEndTime;
    }

   
    // Property accessors
	/**
	* get blessingInfoId  
	*/
    public Long getBlessingInfoId() {
        return this.blessingInfoId;
    }
    
    public void setBlessingInfoId(Long blessingInfoId) {
        this.blessingInfoId = blessingInfoId;
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
	* get realName  
	*/
    public String getRealName() {
        return this.realName;
    }
    
    public void setRealName(String realName) {
        this.realName = realName;
    }
	/**
	* get mobile  
	*/
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
	/**
	* get memorialName  
	*/
    public String getMemorialName() {
        return this.memorialName;
    }
    
    public void setMemorialName(String memorialName) {
        this.memorialName = memorialName;
    }
	/**
	* get memorialDay  
	*/
    public Date getMemorialDay() {
        return this.memorialDay;
    }
    
    public void setMemorialDay(Date memorialDay) {
        this.memorialDay = memorialDay;
    }
	/**
	* get picture1  
	*/
    public String getPicture1() {
        return this.picture1;
    }
    
    public void setPicture1(String picture1) {
        this.picture1 = picture1;
    }
	/**
	* get picture2  
	*/
    public String getPicture2() {
        return this.picture2;
    }
    
    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }
	/**
	* get picture3  
	*/
    public String getPicture3() {
        return this.picture3;
    }
    
    public void setPicture3(String picture3) {
        this.picture3 = picture3;
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
	* get auditStatus  
	*/
    public Integer getAuditStatus() {
        return this.auditStatus;
    }
    
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
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
	* get showBeginTime  
	*/
    public Timestamp getShowBeginTime() {
        return this.showBeginTime;
    }
    
    public void setShowBeginTime(Timestamp showBeginTime) {
        this.showBeginTime = showBeginTime;
    }
	/**
	* get showEndTime  
	*/
    public Timestamp getShowEndTime() {
        return this.showEndTime;
    }
    
    public void setShowEndTime(Timestamp showEndTime) {
        this.showEndTime = showEndTime;
    }
   








}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TMessage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_message"
)

public class TMessage  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1308208877L;

    // Fields    

 
  /**   
  * messageId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="messageId", unique=true, nullable=false)

    private Long messageId;// get messageId  
 
  /**   
  * mallId:
  */     
    @Column(name="mallId")

    private Long mallId;// get mallId  
 
  /**   
  * adminId:
  */     
    @Column(name="adminId")

    private Long adminId;// get adminId  
 
  /**   
  * stationId:
  */     
    @Column(name="stationId")

    private Long stationId;// get stationId  
 
  /**   
  * title:
  */     
    @Column(name="title", length=100)

    private String title;// get title  
 
  /**   
  * type:
  */     
    @Column(name="type")

    private Integer type;// get type  
 
  /**   
  * content:
  */     
    @Column(name="content", length=65535)

    private String content;// get content  
 
  /**   
  * createTime:
  */     
    @Column(name="createTime", length=19)

    private Timestamp createTime;// get createTime  
 
  /**   
  * publishStartTime:
  */     
    @Column(name="publishStartTime", length=19)

    private Timestamp publishStartTime;// get publishStartTime  
 
  /**   
  * publishEndTime:
  */     
    @Column(name="publishEndTime", length=19)

    private Timestamp publishEndTime;// get publishEndTime  
 
  /**   
  * updateTime:
  */     
    @Column(name="updateTime", length=19)

    private Timestamp updateTime;// get updateTime  
 
  /**   
  * status:
  */     
    @Column(name="status")

    private Integer status;// get status  
 
  /**   
  * userTypeIds:
  */     
    @Column(name="userTypeIds", length=100)

    private String userTypeIds;// get userTypeIds  


    // Constructors

    /** default constructor */
    public TMessage() {
    }

    
    /** full constructor */
    public TMessage(Long mallId, Long adminId, Long stationId, String title, Integer type, String content, Timestamp createTime, Timestamp publishStartTime, Timestamp publishEndTime, Timestamp updateTime, Integer status, String userTypeIds) {
        this.mallId = mallId;
        this.adminId = adminId;
        this.stationId = stationId;
        this.title = title;
        this.type = type;
        this.content = content;
        this.createTime = createTime;
        this.publishStartTime = publishStartTime;
        this.publishEndTime = publishEndTime;
        this.updateTime = updateTime;
        this.status = status;
        this.userTypeIds = userTypeIds;
    }

   
    // Property accessors
	/**
	* get messageId  
	*/
    public Long getMessageId() {
        return this.messageId;
    }
    
    public void setMessageId(Long messageId) {
        this.messageId = messageId;
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
	* get adminId  
	*/
    public Long getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }
	/**
	* get stationId  
	*/
    public Long getStationId() {
        return this.stationId;
    }
    
    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }
	/**
	* get title  
	*/
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
	/**
	* get type  
	*/
    public Integer getType() {
        return this.type;
    }
    
    public void setType(Integer type) {
        this.type = type;
    }
	/**
	* get content  
	*/
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
	/**
	* get createTime  
	*/
    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
	/**
	* get publishStartTime  
	*/
    public Timestamp getPublishStartTime() {
        return this.publishStartTime;
    }
    
    public void setPublishStartTime(Timestamp publishStartTime) {
        this.publishStartTime = publishStartTime;
    }
	/**
	* get publishEndTime  
	*/
    public Timestamp getPublishEndTime() {
        return this.publishEndTime;
    }
    
    public void setPublishEndTime(Timestamp publishEndTime) {
        this.publishEndTime = publishEndTime;
    }
	/**
	* get updateTime  
	*/
    public Timestamp getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
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
	* get userTypeIds  
	*/
    public String getUserTypeIds() {
        return this.userTypeIds;
    }
    
    public void setUserTypeIds(String userTypeIds) {
        this.userTypeIds = userTypeIds;
    }
   








}
package com.ecshop.dao.business.models;

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
 * TMallWeixinPayAccount entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_mall_weixin_pay_account"
)

public class TMallWeixinPayAccount  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 463836431L;

    // Fields    

 
  /**   
  * id:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID", unique=true, nullable=false)

    private Long id;// get id  
 
  /**   
  * mallId:
  */     
    @Column(name="mallId", nullable=false)

    private Long mallId;// get mallId  
 
  /**   
  * mchId:
  */     
    @Column(name="mchId", nullable=false, length=15)

    private String mchId;// get mchId  
 
  /**   
  * apiKey:
  */     
    @Column(name="apiKey", nullable=false, length=32)

    private String apiKey;// get apiKey  
 
  /**   
  * wechatAppId:
  */     
    @Column(name="wechatAppId", nullable=false, length=20)

    private String wechatAppId;// get wechatAppId  
 
  /**   
  * wechatAppSecret:
  */     
    @Column(name="wechatAppSecret", nullable=false, length=35)

    private String wechatAppSecret;// get wechatAppSecret  
 
  /**   
  * enableStatus:
  */     
    @Column(name="enableStatus", nullable=false)

    private Integer enableStatus;// get enableStatus  
 
  /**   
  * isPlatDefault:
  */     
    @Column(name="isPlatDefault", nullable=false)

    private Integer isPlatDefault;// get isPlatDefault  
 
  /**   
  * createTime:
  */     @Temporal(TemporalType.DATE)
    @Column(name="createTime", nullable=false, length=10)

    private Date createTime;// get createTime  
 
  /**   
  * createUser:
  */     
    @Column(name="createUser", nullable=false, length=50)

    private String createUser;// get createUser  
 
  /**   
  * updateTime:
  */     @Temporal(TemporalType.DATE)
    @Column(name="updateTime", nullable=false, length=10)

    private Date updateTime;// get updateTime  
 
  /**   
  * tradeGoodsName:
  */     
    @Column(name="tradeGoodsName", nullable=false, length=50)

    private String tradeGoodsName;// get tradeGoodsName  


    // Constructors

    /** default constructor */
    public TMallWeixinPayAccount() {
    }

    
    /** full constructor */
    public TMallWeixinPayAccount(Long mallId, String mchId, String apiKey, String wechatAppId, String wechatAppSecret, Integer enableStatus, Integer isPlatDefault, Date createTime, String createUser, Date updateTime, String tradeGoodsName) {
        this.mallId = mallId;
        this.mchId = mchId;
        this.apiKey = apiKey;
        this.wechatAppId = wechatAppId;
        this.wechatAppSecret = wechatAppSecret;
        this.enableStatus = enableStatus;
        this.isPlatDefault = isPlatDefault;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.tradeGoodsName = tradeGoodsName;
    }

   
    // Property accessors
	/**
	* get id  
	*/
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
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
	* get mchId  
	*/
    public String getMchId() {
        return this.mchId;
    }
    
    public void setMchId(String mchId) {
        this.mchId = mchId;
    }
	/**
	* get apiKey  
	*/
    public String getApiKey() {
        return this.apiKey;
    }
    
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
	/**
	* get wechatAppId  
	*/
    public String getWechatAppId() {
        return this.wechatAppId;
    }
    
    public void setWechatAppId(String wechatAppId) {
        this.wechatAppId = wechatAppId;
    }
	/**
	* get wechatAppSecret  
	*/
    public String getWechatAppSecret() {
        return this.wechatAppSecret;
    }
    
    public void setWechatAppSecret(String wechatAppSecret) {
        this.wechatAppSecret = wechatAppSecret;
    }
	/**
	* get enableStatus  
	*/
    public Integer getEnableStatus() {
        return this.enableStatus;
    }
    
    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }
	/**
	* get isPlatDefault  
	*/
    public Integer getIsPlatDefault() {
        return this.isPlatDefault;
    }
    
    public void setIsPlatDefault(Integer isPlatDefault) {
        this.isPlatDefault = isPlatDefault;
    }
	/**
	* get createTime  
	*/
    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
	/**
	* get createUser  
	*/
    public String getCreateUser() {
        return this.createUser;
    }
    
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
	/**
	* get updateTime  
	*/
    public Date getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
	/**
	* get tradeGoodsName  
	*/
    public String getTradeGoodsName() {
        return this.tradeGoodsName;
    }
    
    public void setTradeGoodsName(String tradeGoodsName) {
        this.tradeGoodsName = tradeGoodsName;
    }
   








}
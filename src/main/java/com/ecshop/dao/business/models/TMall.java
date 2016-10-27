package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TMall entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_mall"
)

public class TMall  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 79966344L;

    // Fields    

 
  /**   
  * mallId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="mallId", unique=true, nullable=false)

    private Long mallId;// get mallId  
 
  /**   
  * industryId:
  */     
    @Column(name="industryId")

    private Long industryId;// get industryId  
 
  /**   
  * industryId2:
  */     
    @Column(name="industryId2")

    private Long industryId2;// get industryId2  
 
  /**   
  * userId:
  */     
    @Column(name="userId")

    private Long userId;// get userId  
 
  /**   
  * mallNo:
  */     
    @Column(name="mallNo", length=20)

    private String mallNo;// get mallNo  
 
  /**   
  * mallType:0：普通 1：自营
  */     
    @Column(name="mallType")

    private Integer mallType;// get mallType  
 
  /**   
  * operationType:
  */     
    @Column(name="operationType")

    private Integer operationType;// get operationType  
 
  /**   
  * mallName:
  */     
    @Column(name="mallName", length=50)

    private String mallName;// get mallName  
 
  /**   
  * mallLogo:
  */     
    @Column(name="mallLogo", length=2000)

    private String mallLogo;// get mallLogo  
 
  /**   
  * mallLink:
  */     
    @Column(name="mallLink", length=2000)

    private String mallLink;// get mallLink  
 
  /**   
  * mallIntro:
  */     
    @Column(name="mallIntro", length=2000)

    private String mallIntro;// get mallIntro  
 
  /**   
  * qrcode:
  */     
    @Column(name="qRCode", length=2000)

    private String qrcode;// get qrcode  
 
  /**   
  * examinestatus:0表示未审核
            -1表示审核失败
            1表示审核通过
  */     
    @Column(name="examinestatus")

    private Integer examinestatus;// get examinestatus  
 
  /**   
  * examineCause:审核未通过的原因描述
  */     
    @Column(name="examineCause", length=250)

    private String examineCause;// get examineCause  
 
  /**   
  * examineAdminId:审核人
  */     
    @Column(name="examineAdminId")

    private Long examineAdminId;// get examineAdminId  
 
  /**   
  * deletestatus:1表示正常
            -1表示删除
  */     
    @Column(name="deletestatus")

    private Integer deletestatus;// get deletestatus  
 
  /**   
  * weixinAppid:
  */     
    @Column(name="weixinAppid", length=100)

    private String weixinAppid;// get weixinAppid  
 
  /**   
  * weixinAppkey:
  */     
    @Column(name="weixinAppkey", length=100)

    private String weixinAppkey;// get weixinAppkey  
 
  /**   
  * weixinAppsecret:
  */     
    @Column(name="weixinAppsecret", length=100)

    private String weixinAppsecret;// get weixinAppsecret  
 
  /**   
  * provinceId:
  */     
    @Column(name="provinceId")

    private Integer provinceId;// get provinceId  
 
  /**   
  * districtId:
  */     
    @Column(name="districtId")

    private Integer districtId;// get districtId  
 
  /**   
  * detailAddress:
  */     
    @Column(name="detailAddress", length=200)

    private String detailAddress;// get detailAddress  
 
  /**   
  * zipCode:
  */     
    @Column(name="zipCode", length=10)

    private String zipCode;// get zipCode  
 
  /**   
  * cityId:
  */     
    @Column(name="cityId")

    private Integer cityId;// get cityId  
 
  /**   
  * creTime:
  */     
    @Column(name="creTime", length=19)

    private Timestamp creTime;// get creTime  
 
  /**   
  * expireTime:
  */     
    @Column(name="expireTime", length=19)

    private Timestamp expireTime;// get expireTime  
 
  /**   
  * minProfit:
  */     
    @Column(name="minProfit", precision=22, scale=0)

    private Double minProfit;// get minProfit  
 
  /**   
  * mallImage:商家广告宣传图
  */     
    @Column(name="mallImage", length=100)

    private String mallImage;// get mallImage  
 
  /**   
  * mallImageDesc:宣传图描述
  */     
    @Column(name="mallImageDesc", length=100)

    private String mallImageDesc;// get mallImageDesc  
 
  /**   
  * serviceCenter:
  */     
    @Column(name="serviceCenter", length=2000)

    private String serviceCenter;// get serviceCenter  
 
  /**   
  * defaultFreight:默认运费
  */     
    @Column(name="defaultFreight", precision=10)

    private Double defaultFreight;// get defaultFreight  
 
  /**   
  * selfDelivery:
  */     
    @Column(name="selfDelivery", nullable=false)

    private Integer selfDelivery = 0;// get selfDelivery  
 
  /**   
  * isUsingCustomWeChatPayAccount:是否采用自定义微信支付商户收款(0-否 1-是)
  */     
    @Column(name="isUsingCustomWeChatPayAccount")

    private Integer isUsingCustomWeChatPayAccount = 0;// get isUsingCustomWeChatPayAccount  
    
    
    /**   
     * servicePhone:
     */     
     @Column(name="servicePhone", length=20)

     private String servicePhone;// get servicePhone 
    


    // Constructors

    /** default constructor */
    public TMall() {
    }

	/** minimal constructor */
    public TMall(Integer selfDelivery) {
        this.selfDelivery = selfDelivery;
    }
    
    /** full constructor */
    public TMall(Long industryId, Long industryId2, Long userId, String mallNo, Integer mallType, Integer operationType, String mallName, String mallLogo, String mallLink, String mallIntro, String qrcode, Integer examinestatus, String examineCause, Long examineAdminId, Integer deletestatus, String weixinAppid, String weixinAppkey, String weixinAppsecret, Integer provinceId, Integer districtId, String detailAddress, String zipCode, Integer cityId, Timestamp creTime, Timestamp expireTime, Double minProfit, String mallImage, String mallImageDesc, String serviceCenter, Double defaultFreight, Integer selfDelivery, Integer isUsingCustomWeChatPayAccount,String servicePhone) {
        this.industryId = industryId;
        this.industryId2 = industryId2;
        this.userId = userId;
        this.mallNo = mallNo;
        this.mallType = mallType;
        this.operationType = operationType;
        this.mallName = mallName;
        this.mallLogo = mallLogo;
        this.mallLink = mallLink;
        this.mallIntro = mallIntro;
        this.qrcode = qrcode;
        this.examinestatus = examinestatus;
        this.examineCause = examineCause;
        this.examineAdminId = examineAdminId;
        this.deletestatus = deletestatus;
        this.weixinAppid = weixinAppid;
        this.weixinAppkey = weixinAppkey;
        this.weixinAppsecret = weixinAppsecret;
        this.provinceId = provinceId;
        this.districtId = districtId;
        this.detailAddress = detailAddress;
        this.zipCode = zipCode;
        this.cityId = cityId;
        this.creTime = creTime;
        this.expireTime = expireTime;
        this.minProfit = minProfit;
        this.mallImage = mallImage;
        this.mallImageDesc = mallImageDesc;
        this.serviceCenter = serviceCenter;
        this.defaultFreight = defaultFreight;
        this.selfDelivery = selfDelivery;
        this.isUsingCustomWeChatPayAccount = isUsingCustomWeChatPayAccount;
        this.servicePhone = servicePhone;
    }

   
    // Property accessors
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
	* get industryId  
	*/
    public Long getIndustryId() {
        return this.industryId;
    }
    
    public void setIndustryId(Long industryId) {
        this.industryId = industryId;
    }
	/**
	* get industryId2  
	*/
    public Long getIndustryId2() {
        return this.industryId2;
    }
    
    public void setIndustryId2(Long industryId2) {
        this.industryId2 = industryId2;
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
	* get mallNo  
	*/
    public String getMallNo() {
        return this.mallNo;
    }
    
    public void setMallNo(String mallNo) {
        this.mallNo = mallNo;
    }
	/**
	* get mallType  
	*/
    public Integer getMallType() {
        return this.mallType;
    }
    
    public void setMallType(Integer mallType) {
        this.mallType = mallType;
    }
	/**
	* get operationType  
	*/
    public Integer getOperationType() {
        return this.operationType;
    }
    
    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }
	/**
	* get mallName  
	*/
    public String getMallName() {
        return this.mallName;
    }
    
    public void setMallName(String mallName) {
        this.mallName = mallName;
    }
	/**
	* get mallLogo  
	*/
    public String getMallLogo() {
        return this.mallLogo;
    }
    
    public void setMallLogo(String mallLogo) {
        this.mallLogo = mallLogo;
    }
	/**
	* get mallLink  
	*/
    public String getMallLink() {
        return this.mallLink;
    }
    
    public void setMallLink(String mallLink) {
        this.mallLink = mallLink;
    }
	/**
	* get mallIntro  
	*/
    public String getMallIntro() {
        return this.mallIntro;
    }
    
    public void setMallIntro(String mallIntro) {
        this.mallIntro = mallIntro;
    }
	/**
	* get qrcode  
	*/
    public String getQrcode() {
        return this.qrcode;
    }
    
    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }
	/**
	* get examinestatus  
	*/
    public Integer getExaminestatus() {
        return this.examinestatus;
    }
    
    public void setExaminestatus(Integer examinestatus) {
        this.examinestatus = examinestatus;
    }
	/**
	* get examineCause  
	*/
    public String getExamineCause() {
        return this.examineCause;
    }
    
    public void setExamineCause(String examineCause) {
        this.examineCause = examineCause;
    }
	/**
	* get examineAdminId  
	*/
    public Long getExamineAdminId() {
        return this.examineAdminId;
    }
    
    public void setExamineAdminId(Long examineAdminId) {
        this.examineAdminId = examineAdminId;
    }
	/**
	* get deletestatus  
	*/
    public Integer getDeletestatus() {
        return this.deletestatus;
    }
    
    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }
	/**
	* get weixinAppid  
	*/
    public String getWeixinAppid() {
        return this.weixinAppid;
    }
    
    public void setWeixinAppid(String weixinAppid) {
        this.weixinAppid = weixinAppid;
    }
	/**
	* get weixinAppkey  
	*/
    public String getWeixinAppkey() {
        return this.weixinAppkey;
    }
    
    public void setWeixinAppkey(String weixinAppkey) {
        this.weixinAppkey = weixinAppkey;
    }
	/**
	* get weixinAppsecret  
	*/
    public String getWeixinAppsecret() {
        return this.weixinAppsecret;
    }
    
    public void setWeixinAppsecret(String weixinAppsecret) {
        this.weixinAppsecret = weixinAppsecret;
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
	* get districtId  
	*/
    public Integer getDistrictId() {
        return this.districtId;
    }
    
    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }
	/**
	* get detailAddress  
	*/
    public String getDetailAddress() {
        return this.detailAddress;
    }
    
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }
	/**
	* get zipCode  
	*/
    public String getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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
	* get creTime  
	*/
    public Timestamp getCreTime() {
        return this.creTime;
    }
    
    public void setCreTime(Timestamp creTime) {
        this.creTime = creTime;
    }
	/**
	* get expireTime  
	*/
    public Timestamp getExpireTime() {
        return this.expireTime;
    }
    
    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }
	/**
	* get minProfit  
	*/
    public Double getMinProfit() {
        return this.minProfit;
    }
    
    public void setMinProfit(Double minProfit) {
        this.minProfit = minProfit;
    }
	/**
	* get mallImage  
	*/
    public String getMallImage() {
        return this.mallImage;
    }
    
    public void setMallImage(String mallImage) {
        this.mallImage = mallImage;
    }
	/**
	* get mallImageDesc  
	*/
    public String getMallImageDesc() {
        return this.mallImageDesc;
    }
    
    public void setMallImageDesc(String mallImageDesc) {
        this.mallImageDesc = mallImageDesc;
    }
	/**
	* get serviceCenter  
	*/
    public String getServiceCenter() {
        return this.serviceCenter;
    }
    
    public void setServiceCenter(String serviceCenter) {
        this.serviceCenter = serviceCenter;
    }
	/**
	* get defaultFreight  
	*/
    public Double getDefaultFreight() {
        return this.defaultFreight;
    }
    
    public void setDefaultFreight(Double defaultFreight) {
        this.defaultFreight = defaultFreight;
    }
	/**
	* get selfDelivery  
	*/
    public Integer getSelfDelivery() {
        return this.selfDelivery;
    }
    
    public void setSelfDelivery(Integer selfDelivery) {
        this.selfDelivery = selfDelivery;
    }
	/**
	* get isUsingCustomWeChatPayAccount  
	*/
    public Integer getIsUsingCustomWeChatPayAccount() {
        return this.isUsingCustomWeChatPayAccount;
    }
    
    public void setIsUsingCustomWeChatPayAccount(Integer isUsingCustomWeChatPayAccount) {
        this.isUsingCustomWeChatPayAccount = isUsingCustomWeChatPayAccount;
    }

	public String getServicePhone() {
		return servicePhone;
	}

	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}
   


    





}
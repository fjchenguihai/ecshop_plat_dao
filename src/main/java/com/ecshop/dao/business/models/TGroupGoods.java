package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TGroupGoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_group_goods"
)

public class TGroupGoods  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1661375605L;

    // Fields    

 
  /**   
  * groupGoodId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="groupGoodId", unique=true, nullable=false)

    private Long groupGoodId;// get groupGoodId  
 
  /**   
  * cover:
  */     
    @Column(name="cover")

    private String cover;// get cover  
 
  /**   
  * coverDesc:
  */     
    @Column(name="coverDesc")

    private String coverDesc;// get coverDesc  
 
  /**   
  * groupBeginTime:必填
  */     
    @Column(name="groupBeginTime", nullable=false, length=19)

    private Timestamp groupBeginTime;// get groupBeginTime  
 
  /**   
  * groupEndTime:必填
  */     
    @Column(name="groupEndTime", nullable=false, length=19)

    private Timestamp groupEndTime;// get groupEndTime  
 
  /**   
  * groupType:0：按人数  1：按数量   必填
  */     
    @Column(name="groupType", nullable=false)

    private Integer groupType;// get groupType  
 
  /**   
  * groupValue:
  */     
    @Column(name="groupValue", nullable=false, length=20)

    private String groupValue;// get groupValue  
 
  /**   
  * validTime:以小时为单位，从成团开始计算 
  */     
    @Column(name="validTime", nullable=false)

    private Integer validTime;// get validTime  
 
  /**   
  * userTypeStr:以逗号分隔开  0:所有  1：VIP  2:V客  3：经销商  4：盟客 5：普通消费者
  */     
    @Column(name="userTypeStr", length=20)

    private String userTypeStr;// get userTypeStr  
 
  /**   
  * goodsId:
  */     
    @Column(name="goodsId")

    private Long goodsId;// get goodsId  
 
  /**   
  * platReleaseStatus:0：未申请  1：申请中 2：审核通过  3：审核不通过
  */     
    @Column(name="platReleaseStatus", nullable=false)

    private Integer platReleaseStatus = 0;// get platReleaseStatus  


    // Constructors

    /** default constructor */
    public TGroupGoods() {
    }

	/** minimal constructor */
    public TGroupGoods(Timestamp groupBeginTime, Timestamp groupEndTime, Integer groupType, String groupValue, Integer validTime, Integer platReleaseStatus) {
        this.groupBeginTime = groupBeginTime;
        this.groupEndTime = groupEndTime;
        this.groupType = groupType;
        this.groupValue = groupValue;
        this.validTime = validTime;
        this.platReleaseStatus = platReleaseStatus;
    }
    
    /** full constructor */
    public TGroupGoods(String cover, String coverDesc, Timestamp groupBeginTime, Timestamp groupEndTime, Integer groupType, String groupValue, Integer validTime, String userTypeStr, Long goodsId, Integer platReleaseStatus) {
        this.cover = cover;
        this.coverDesc = coverDesc;
        this.groupBeginTime = groupBeginTime;
        this.groupEndTime = groupEndTime;
        this.groupType = groupType;
        this.groupValue = groupValue;
        this.validTime = validTime;
        this.userTypeStr = userTypeStr;
        this.goodsId = goodsId;
        this.platReleaseStatus = platReleaseStatus;
    }

   
    // Property accessors
	/**
	* get groupGoodId  
	*/
    public Long getGroupGoodId() {
        return this.groupGoodId;
    }
    
    public void setGroupGoodId(Long groupGoodId) {
        this.groupGoodId = groupGoodId;
    }
	/**
	* get cover  
	*/
    public String getCover() {
        return this.cover;
    }
    
    public void setCover(String cover) {
        this.cover = cover;
    }
	/**
	* get coverDesc  
	*/
    public String getCoverDesc() {
        return this.coverDesc;
    }
    
    public void setCoverDesc(String coverDesc) {
        this.coverDesc = coverDesc;
    }
	/**
	* get groupBeginTime  
	*/
    public Timestamp getGroupBeginTime() {
        return this.groupBeginTime;
    }
    
    public void setGroupBeginTime(Timestamp groupBeginTime) {
        this.groupBeginTime = groupBeginTime;
    }
	/**
	* get groupEndTime  
	*/
    public Timestamp getGroupEndTime() {
        return this.groupEndTime;
    }
    
    public void setGroupEndTime(Timestamp groupEndTime) {
        this.groupEndTime = groupEndTime;
    }
	/**
	* get groupType  
	*/
    public Integer getGroupType() {
        return this.groupType;
    }
    
    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }
	/**
	* get groupValue  
	*/
    public String getGroupValue() {
        return this.groupValue;
    }
    
    public void setGroupValue(String groupValue) {
        this.groupValue = groupValue;
    }
	/**
	* get validTime  
	*/
    public Integer getValidTime() {
        return this.validTime;
    }
    
    public void setValidTime(Integer validTime) {
        this.validTime = validTime;
    }
	/**
	* get userTypeStr  
	*/
    public String getUserTypeStr() {
        return this.userTypeStr;
    }
    
    public void setUserTypeStr(String userTypeStr) {
        this.userTypeStr = userTypeStr;
    }
	/**
	* get goodsId  
	*/
    public Long getGoodsId() {
        return this.goodsId;
    }
    
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
	/**
	* get platReleaseStatus  
	*/
    public Integer getPlatReleaseStatus() {
        return this.platReleaseStatus;
    }
    
    public void setPlatReleaseStatus(Integer platReleaseStatus) {
        this.platReleaseStatus = platReleaseStatus;
    }
   








}
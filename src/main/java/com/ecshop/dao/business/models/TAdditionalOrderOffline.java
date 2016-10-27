package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TAdditionalOrderOffline entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_additional_order_offline"
)

public class TAdditionalOrderOffline  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -348378640L;

    // Fields    

 
  /**   
  * addOrderOfflineId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="addOrderOfflineId", unique=true, nullable=false)

    private Long addOrderOfflineId;// get addOrderOfflineId  
 
  /**   
  * offlineOrderId:
  */     
    @Column(name="offlineOrderId")

    private Long offlineOrderId;// get offlineOrderId  
 
  /**   
  * offlineOrderGoodsId:
  */     
    @Column(name="offlineOrderGoodsId")

    private Long offlineOrderGoodsId;// get offlineOrderGoodsId  
 
  /**   
  * returnNum:
  */     
    @Column(name="returnNum")

    private Integer returnNum;// get returnNum  
 
  /**   
  * remark:
  */     
    @Column(name="remark", nullable=false, length=500)

    private String remark;// get remark  
 
  /**   
  * isSettlement:是否已经计算了分润 0:否 1:是
  */     
    @Column(name="isSettlement", nullable=false)

    private Integer isSettlement = 0;// get isSettlement  
 
  /**   
  * settlementTime:计算时间
  */     
    @Column(name="settlementTime", length=19)

    private Timestamp settlementTime;// get settlementTime  
 
  /**   
  * financeAuditStatus:财务审核状态 0：待审核 1：审核通过 2：审核不通过
  */     
    @Column(name="auditStatus", nullable=false)

    private Integer auditStatus = 0;// get financeAuditStatus  
 
  /**   
  * auditRemark:财务审核说明
  */     
    @Column(name="auditRemark")

    private String auditRemark;// get auditRemark  
 
  /**   
  * source:
  */     
    @Column(name="source", nullable=false)

    private Integer source;// get source  
 
  /**   
  * creUserId:
  */     
    @Column(name="creUserId", nullable=false, length=100)

    private String creUserId;// get creUserId  
 
  /**   
  * creTime:
  */     
    @Column(name="creTime", nullable=false, length=19)

    private Timestamp creTime;// get creTime  


    // Constructors

    /** default constructor */
    public TAdditionalOrderOffline() {
    }

	/** minimal constructor */
    public TAdditionalOrderOffline(String remark, Integer isSettlement, Integer auditStatus, Integer source, String creUserId, Timestamp creTime) {
        this.remark = remark;
        this.isSettlement = isSettlement;
        this.auditStatus = auditStatus;
        this.source = source;
        this.creUserId = creUserId;
        this.creTime = creTime;
    }
    
    /** full constructor */
    public TAdditionalOrderOffline(Long offlineOrderId, Long offlineOrderGoodsId, Integer returnNum, String remark, Integer isSettlement, Timestamp settlementTime, Integer auditStatus, String auditRemark, Integer source, String creUserId, Timestamp creTime) {
        this.offlineOrderId = offlineOrderId;
        this.offlineOrderGoodsId = offlineOrderGoodsId;
        this.returnNum = returnNum;
        this.remark = remark;
        this.isSettlement = isSettlement;
        this.settlementTime = settlementTime;
        this.auditStatus = auditStatus;
        this.auditRemark = auditRemark;
        this.source = source;
        this.creUserId = creUserId;
        this.creTime = creTime;
    }

   
    // Property accessors
	/**
	* get addOrderOfflineId  
	*/
    public Long getAddOrderOfflineId() {
        return this.addOrderOfflineId;
    }
    
    public void setAddOrderOfflineId(Long addOrderOfflineId) {
        this.addOrderOfflineId = addOrderOfflineId;
    }
	/**
	* get offlineOrderId  
	*/
    public Long getOfflineOrderId() {
        return this.offlineOrderId;
    }
    
    public void setOfflineOrderId(Long offlineOrderId) {
        this.offlineOrderId = offlineOrderId;
    }
	/**
	* get offlineOrderGoodsId  
	*/
    public Long getOfflineOrderGoodsId() {
        return this.offlineOrderGoodsId;
    }
    
    public void setOfflineOrderGoodsId(Long offlineOrderGoodsId) {
        this.offlineOrderGoodsId = offlineOrderGoodsId;
    }
	/**
	* get returnNum  
	*/
    public Integer getReturnNum() {
        return this.returnNum;
    }
    
    public void setReturnNum(Integer returnNum) {
        this.returnNum = returnNum;
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
	* get isSettlement  
	*/
    public Integer getIsSettlement() {
        return this.isSettlement;
    }
    
    public void setIsSettlement(Integer isSettlement) {
        this.isSettlement = isSettlement;
    }
	/**
	* get settlementTime  
	*/
    public Timestamp getSettlementTime() {
        return this.settlementTime;
    }
    
    public void setSettlementTime(Timestamp settlementTime) {
        this.settlementTime = settlementTime;
    }
	/**
	* get financeAuditStatus  
	*/
    public Integer getAuditStatus() {
        return this.auditStatus;
    }
    
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }
	/**
	* get auditRemark  
	*/
    public String getAuditRemark() {
        return this.auditRemark;
    }
    
    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
    }
	/**
	* get source  
	*/
    public Integer getSource() {
        return this.source;
    }
    
    public void setSource(Integer source) {
        this.source = source;
    }
	/**
	* get creUserId  
	*/
    public String getCreUserId() {
        return this.creUserId;
    }
    
    public void setCreUserId(String creUserId) {
        this.creUserId = creUserId;
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
   








}
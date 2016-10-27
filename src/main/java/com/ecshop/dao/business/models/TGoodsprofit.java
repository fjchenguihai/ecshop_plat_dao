package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TGoodsprofit entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_goodsprofit"
)

public class TGoodsprofit  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 607610918L;

    // Fields    

 
  /**   
  * goodsprofitId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="goodsprofitId", unique=true, nullable=false)

    private Long goodsprofitId;// get goodsprofitId  
 
  /**   
  * goodsId:
  */     
    @Column(name="goodsId")

    private Long goodsId;// get goodsId  
 
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
  * vcommissionShow:
  */     
    @Column(name="vCommissionShow", precision=15, scale=4)

    private Double vcommissionShow;// get vcommissionShow  
 
  /**   
  * dcommissionShow:
  */     
    @Column(name="dCommissionShow", precision=15, scale=4)

    private Double dcommissionShow;// get dcommissionShow  
 
  /**   
  * vcommission:V客（大V或盟客）提成百分比
  */     
    @Column(name="vCommission", precision=15, scale=4)

    private Double vcommission;// get vcommission  
 
  /**   
  * bcommission:默认100%
  */     
    @Column(name="bCommission", precision=15, scale=4)

    private Double bcommission;// get bcommission  
 
  /**   
  * mcommission:默认0，V暂由平台决定是否。认证V客提成中的100%比
  */     
    @Column(name="mCommission", precision=15, scale=4)

    private Double mcommission;// get mcommission  
 
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
    @Column(name="IndirectCommission", precision=15, scale=4)

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
  * regionRate:
  */     
    @Column(name="regionRate", precision=15, scale=4)

    private Double regionRate;// get regionRate  


    // Constructors

    /** default constructor */
    public TGoodsprofit() {
    }

    
    /** full constructor */
    public TGoodsprofit(Long goodsId, Double memberCommission, Double platCommission, Double vcommissionShow, Double dcommissionShow, Double vcommission, Double bcommission, Double mcommission, Double dcommission, Double directCommission, Double indirectCommission, Double serviceCommission, Double operationCommission, Double platformCommission, Timestamp validTime, Timestamp invalidTime, Double regionRate) {
        this.goodsId = goodsId;
        this.memberCommission = memberCommission;
        this.platCommission = platCommission;
        this.vcommissionShow = vcommissionShow;
        this.dcommissionShow = dcommissionShow;
        this.vcommission = vcommission;
        this.bcommission = bcommission;
        this.mcommission = mcommission;
        this.dcommission = dcommission;
        this.directCommission = directCommission;
        this.indirectCommission = indirectCommission;
        this.serviceCommission = serviceCommission;
        this.operationCommission = operationCommission;
        this.platformCommission = platformCommission;
        this.validTime = validTime;
        this.invalidTime = invalidTime;
        this.regionRate = regionRate;
    }

   
    // Property accessors
	/**
	* get goodsprofitId  
	*/
    public Long getGoodsprofitId() {
        return this.goodsprofitId;
    }
    
    public void setGoodsprofitId(Long goodsprofitId) {
        this.goodsprofitId = goodsprofitId;
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
	* get vcommissionShow  
	*/
    public Double getVcommissionShow() {
        return this.vcommissionShow;
    }
    
    public void setVcommissionShow(Double vcommissionShow) {
        this.vcommissionShow = vcommissionShow;
    }
	/**
	* get dcommissionShow  
	*/
    public Double getDcommissionShow() {
        return this.dcommissionShow;
    }
    
    public void setDcommissionShow(Double dcommissionShow) {
        this.dcommissionShow = dcommissionShow;
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
	* get bcommission  
	*/
    public Double getBcommission() {
        return this.bcommission;
    }
    
    public void setBcommission(Double bcommission) {
        this.bcommission = bcommission;
    }
	/**
	* get mcommission  
	*/
    public Double getMcommission() {
        return this.mcommission;
    }
    
    public void setMcommission(Double mcommission) {
        this.mcommission = mcommission;
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
	* get regionRate  
	*/
    public Double getRegionRate() {
        return this.regionRate;
    }
    
    public void setRegionRate(Double regionRate) {
        this.regionRate = regionRate;
    }
   








}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TVblessingFlowDetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_vblessing_flow_detail"
)

public class TVblessingFlowDetail  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1323718264L;

    // Fields    

 
  /**   
  * vblessingFlowDetailId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="vblessingFlowDetailId", unique=true, nullable=false)

    private Long vblessingFlowDetailId;// get vblessingFlowDetailId  
 
  /**   
  * payNo:
  */     
    @Column(name="payNo", length=32)

    private String payNo;// get payNo  
 
  /**   
  * fromUserId:
  */     
    @Column(name="fromUserId")

    private Long fromUserId;// get fromUserId  
 
  /**   
  * toUserId:
  */     
    @Column(name="toUserId")

    private Long toUserId;// get toUserId  
 
  /**   
  * blessingInfoId:
  */     
    @Column(name="blessingInfoId")

    private Long blessingInfoId;// get blessingInfoId  
 
  /**   
  * remark:
  */     
    @Column(name="remark", length=200)

    private String remark;// get remark  
 
  /**   
  * marketGiftId:
  */     
    @Column(name="marketGiftId")

    private Long marketGiftId;// get marketGiftId  
 
  /**   
  * amount:
  */     
    @Column(name="amount")

    private Integer amount;// get amount  
 
  /**   
  * money:
  */     
    @Column(name="money", precision=12)

    private Double money;// get money  
 
  /**   
  * payStaus:
  */     
    @Column(name="payStaus")

    private Integer payStaus;// get payStaus  
 
  /**   
  * orderTime:
  */     
    @Column(name="orderTime", length=19)

    private Timestamp orderTime;// get orderTime  
 
  /**   
  * payTime:
  */     
    @Column(name="payTime", length=19)

    private Timestamp payTime;// get payTime  


    // Constructors

    /** default constructor */
    public TVblessingFlowDetail() {
    }

    
    /** full constructor */
    public TVblessingFlowDetail(String payNo, Long fromUserId, Long toUserId, Long blessingInfoId, String remark, Long marketGiftId, Integer amount, Double money, Integer payStaus, Timestamp orderTime, Timestamp payTime) {
        this.payNo = payNo;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.blessingInfoId = blessingInfoId;
        this.remark = remark;
        this.marketGiftId = marketGiftId;
        this.amount = amount;
        this.money = money;
        this.payStaus = payStaus;
        this.orderTime = orderTime;
        this.payTime = payTime;
    }

   
    // Property accessors
	/**
	* get vblessingFlowDetailId  
	*/
    public Long getVblessingFlowDetailId() {
        return this.vblessingFlowDetailId;
    }
    
    public void setVblessingFlowDetailId(Long vblessingFlowDetailId) {
        this.vblessingFlowDetailId = vblessingFlowDetailId;
    }
	/**
	* get payNo  
	*/
    public String getPayNo() {
        return this.payNo;
    }
    
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }
	/**
	* get fromUserId  
	*/
    public Long getFromUserId() {
        return this.fromUserId;
    }
    
    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }
	/**
	* get toUserId  
	*/
    public Long getToUserId() {
        return this.toUserId;
    }
    
    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }
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
	* get remark  
	*/
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
	/**
	* get marketGiftId  
	*/
    public Long getMarketGiftId() {
        return this.marketGiftId;
    }
    
    public void setMarketGiftId(Long marketGiftId) {
        this.marketGiftId = marketGiftId;
    }
	/**
	* get amount  
	*/
    public Integer getAmount() {
        return this.amount;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
	/**
	* get money  
	*/
    public Double getMoney() {
        return this.money;
    }
    
    public void setMoney(Double money) {
        this.money = money;
    }
	/**
	* get payStaus  
	*/
    public Integer getPayStaus() {
        return this.payStaus;
    }
    
    public void setPayStaus(Integer payStaus) {
        this.payStaus = payStaus;
    }
	/**
	* get orderTime  
	*/
    public Timestamp getOrderTime() {
        return this.orderTime;
    }
    
    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }
	/**
	* get payTime  
	*/
    public Timestamp getPayTime() {
        return this.payTime;
    }
    
    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }
   








}
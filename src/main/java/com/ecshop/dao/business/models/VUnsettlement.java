package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * VUnsettlement entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="v_unsettlement"
)

public class VUnsettlement  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1398050824L;

    // Fields    

 
  /**   
  * unsettlementId:
  */     @Id 
    
    @Column(name="unsettlementId", length=41)

    private String unsettlementId;// get unsettlementId  
 
  /**   
  * orderId:
  */     
    @Column(name="orderId")

    private Long orderId;// get orderId  
 
  /**   
  * orderNumber:
  */     
    @Column(name="orderNumber", length=200)

    private String orderNumber;// get orderNumber  
 
  /**   
  * afterSalesId:
  */     
    @Column(name="afterSalesId", nullable=false)

    private Long afterSalesId;// get afterSalesId  
 
  /**   
  * mallId:
  */     
    @Column(name="mallId")

    private Long mallId;// get mallId  
 
  /**   
  * mallName:
  */     
    @Column(name="mallName", length=50)

    private String mallName;// get mallName  
 
  /**   
  * money:
  */     
    @Column(name="money", precision=15)

    private Double money;// get money  
 
  /**   
  * mallMoney:
  */     
    @Column(name="mallMoney", precision=15)

    private Double mallMoney;// get mallMoney  
 
  /**   
  * profitMoney:
  */     
    @Column(name="profitMoney", precision=15)

    private Double profitMoney;// get profitMoney  
 
  /**   
  * ordertime:
  */     
    @Column(name="ordertime", length=19)

    private Timestamp ordertime;// get ordertime  
 
  /**   
  * paymenttime:
  */     
    @Column(name="paymenttime", length=19)

    private Timestamp paymenttime;// get paymenttime  
 
  /**   
  * mallCheckStatus:
  */     
    @Column(name="mallCheckStatus")

    private Integer mallCheckStatus;// get mallCheckStatus  
 
  /**   
  * type:
  */     
    @Column(name="type", nullable=false)

    private Long type;// get type  
 
  /**   
  * mallsettlementTime:
  */     
    @Column(name="mallsettlementTime", length=19)

    private Timestamp mallsettlementTime;// get mallsettlementTime  


    // Constructors

    /** default constructor */
    public VUnsettlement() {
    }

	/** minimal constructor */
    public VUnsettlement(String unsettlementId, Long afterSalesId, Long type) {
        this.unsettlementId = unsettlementId;
        this.afterSalesId = afterSalesId;
        this.type = type;
    }
    
    /** full constructor */
    public VUnsettlement(String unsettlementId, Long orderId, String orderNumber, Long afterSalesId, Long mallId, String mallName, Double money, Double mallMoney, Double profitMoney, Timestamp ordertime, Timestamp paymenttime, Integer mallCheckStatus, Long type, Timestamp mallsettlementTime) {
        this.unsettlementId = unsettlementId;
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.afterSalesId = afterSalesId;
        this.mallId = mallId;
        this.mallName = mallName;
        this.money = money;
        this.mallMoney = mallMoney;
        this.profitMoney = profitMoney;
        this.ordertime = ordertime;
        this.paymenttime = paymenttime;
        this.mallCheckStatus = mallCheckStatus;
        this.type = type;
        this.mallsettlementTime = mallsettlementTime;
    }

   
    // Property accessors
	/**
	* get unsettlementId  
	*/
    public String getUnsettlementId() {
        return this.unsettlementId;
    }
    
    public void setUnsettlementId(String unsettlementId) {
        this.unsettlementId = unsettlementId;
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
	* get orderNumber  
	*/
    public String getOrderNumber() {
        return this.orderNumber;
    }
    
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
	/**
	* get afterSalesId  
	*/
    public Long getAfterSalesId() {
        return this.afterSalesId;
    }
    
    public void setAfterSalesId(Long afterSalesId) {
        this.afterSalesId = afterSalesId;
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
	* get mallName  
	*/
    public String getMallName() {
        return this.mallName;
    }
    
    public void setMallName(String mallName) {
        this.mallName = mallName;
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
	* get mallMoney  
	*/
    public Double getMallMoney() {
        return this.mallMoney;
    }
    
    public void setMallMoney(Double mallMoney) {
        this.mallMoney = mallMoney;
    }
	/**
	* get profitMoney  
	*/
    public Double getProfitMoney() {
        return this.profitMoney;
    }
    
    public void setProfitMoney(Double profitMoney) {
        this.profitMoney = profitMoney;
    }
	/**
	* get ordertime  
	*/
    public Timestamp getOrdertime() {
        return this.ordertime;
    }
    
    public void setOrdertime(Timestamp ordertime) {
        this.ordertime = ordertime;
    }
	/**
	* get paymenttime  
	*/
    public Timestamp getPaymenttime() {
        return this.paymenttime;
    }
    
    public void setPaymenttime(Timestamp paymenttime) {
        this.paymenttime = paymenttime;
    }
	/**
	* get mallCheckStatus  
	*/
    public Integer getMallCheckStatus() {
        return this.mallCheckStatus;
    }
    
    public void setMallCheckStatus(Integer mallCheckStatus) {
        this.mallCheckStatus = mallCheckStatus;
    }
	/**
	* get type  
	*/
    public Long getType() {
        return this.type;
    }
    
    public void setType(Long type) {
        this.type = type;
    }
	/**
	* get mallsettlementTime  
	*/
    public Timestamp getMallsettlementTime() {
        return this.mallsettlementTime;
    }
    
    public void setMallsettlementTime(Timestamp mallsettlementTime) {
        this.mallsettlementTime = mallsettlementTime;
    }
   








}
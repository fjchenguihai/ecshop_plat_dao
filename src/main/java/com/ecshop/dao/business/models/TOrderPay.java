package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TOrderPay entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_order_pay"
)

public class TOrderPay  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -203385106L;

    // Fields    

 
  /**   
  * payNo:支付编号
  */     @Id 
    
    @Column(name="payNo", unique=true, nullable=false, length=32)

    private String payNo;// get payNo  
 
  /**   
  * payOrders:格式：{orderId01，orderId02……}
  */     
    @Column(name="payOrders", length=256)

    private String payOrders;// get payOrders  
 
  /**   
  * payMoney:
  */     
    @Column(name="payMoney", precision=15)

    private Double payMoney;// get payMoney  
 
  /**   
  * paysturs:
  */     
    @Column(name="paysturs")

    private Integer paysturs;// get paysturs  
 
  /**   
  * userId:
  */     
    @Column(name="userId")

    private Long userId;// get userId  
 
  /**   
  * payTime:
  */     
    @Column(name="payTime", length=19)

    private Timestamp payTime;// get payTime  
 
  /**   
  * auditStatus:
  */     
    @Column(name="auditStatus")

    private Short auditStatus = 0;// get auditStatus  


    // Constructors

    /** default constructor */
    public TOrderPay() {
    }

	/** minimal constructor */
    public TOrderPay(String payNo) {
        this.payNo = payNo;
    }
    
    /** full constructor */
    public TOrderPay(String payNo, String payOrders, Double payMoney, Integer paysturs, Long userId, Timestamp payTime, Short auditStatus) {
        this.payNo = payNo;
        this.payOrders = payOrders;
        this.payMoney = payMoney;
        this.paysturs = paysturs;
        this.userId = userId;
        this.payTime = payTime;
        this.auditStatus = auditStatus;
    }

   
    // Property accessors
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
	* get payOrders  
	*/
    public String getPayOrders() {
        return this.payOrders;
    }
    
    public void setPayOrders(String payOrders) {
        this.payOrders = payOrders;
    }
	/**
	* get payMoney  
	*/
    public Double getPayMoney() {
        return this.payMoney;
    }
    
    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }
	/**
	* get paysturs  
	*/
    public Integer getPaysturs() {
        return this.paysturs;
    }
    
    public void setPaysturs(Integer paysturs) {
        this.paysturs = paysturs;
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
	* get payTime  
	*/
    public Timestamp getPayTime() {
        return this.payTime;
    }
    
    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }
	/**
	* get auditStatus  
	*/
    public Short getAuditStatus() {
        return this.auditStatus;
    }
    
    public void setAuditStatus(Short auditStatus) {
        this.auditStatus = auditStatus;
    }
   








}
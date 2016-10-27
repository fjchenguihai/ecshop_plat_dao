package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TOrderOffline entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_order_offline"
)

public class TOrderOffline  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 629694761L;

    // Fields    

 
  /**   
  * offlineOrderId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="offlineOrderId", unique=true, nullable=false)

    private Long offlineOrderId;// get offlineOrderId  
 
  /**   
  * userId:
  */     
    @Column(name="userId", nullable=false)

    private Long userId;// get userId  
 
  /**   
  * usertypeId:
  */     
    @Column(name="usertypeId", nullable=false)

    private Long usertypeId;// get usertypeId  
 
  /**   
  * orderNumber:
  */     
    @Column(name="orderNumber", length=200)

    private String orderNumber;// get orderNumber  
 
  /**   
  * money:不含运费
  */     
    @Column(name="money", nullable=false, precision=15)

    private Double money;// get money  
 
  /**   
  * recievedMoney:
  */     
    @Column(name="recievedMoney", precision=15)

    private Double recievedMoney;// get recievedMoney  
 
  /**   
  * needPayMoney:
  */     
    @Column(name="needPayMoney", precision=15)

    private Double needPayMoney;// get needPayMoney  
 
  /**   
  * goodsPayment:
  */     
    @Column(name="goodsPayment", precision=15)

    private Double goodsPayment;// get goodsPayment  
 
  /**   
  * residualPayment:
  */     
    @Column(name="ResidualPayment", precision=15)

    private Double residualPayment;// get residualPayment  
 
  /**   
  * invoiceTitle:发票抬头
  */     
    @Column(name="invoiceTitle", length=200)

    private String invoiceTitle;// get invoiceTitle  
 
  /**   
  * remark:用户备注
  */     
    @Column(name="remark", length=200)

    private String remark;// get remark  
 
  /**   
  * consigneeName:
  */     
    @Column(name="consigneeName", length=50)

    private String consigneeName;// get consigneeName  
 
  /**   
  * consigneeMobile:
  */     
    @Column(name="consigneeMobile", length=20)

    private String consigneeMobile;// get consigneeMobile  
 
  /**   
  * consigneeAddress:
  */     
    @Column(name="consigneeAddress", length=200)

    private String consigneeAddress;// get consigneeAddress  
 
  /**   
  * creTime:
  */     
    @Column(name="creTime", nullable=false, length=19)

    private Timestamp creTime;// get creTime  


    // Constructors

    /** default constructor */
    public TOrderOffline() {
    }

	/** minimal constructor */
    public TOrderOffline(Long userId, Long usertypeId, Double money, Timestamp creTime) {
        this.userId = userId;
        this.usertypeId = usertypeId;
        this.money = money;
        this.creTime = creTime;
    }
    
    /** full constructor */
    public TOrderOffline(Long userId, Long usertypeId, String orderNumber, Double money, Double recievedMoney, Double needPayMoney, Double goodsPayment, Double residualPayment, String invoiceTitle, String remark, String consigneeName, String consigneeMobile, String consigneeAddress, Timestamp creTime) {
        this.userId = userId;
        this.usertypeId = usertypeId;
        this.orderNumber = orderNumber;
        this.money = money;
        this.recievedMoney = recievedMoney;
        this.needPayMoney = needPayMoney;
        this.goodsPayment = goodsPayment;
        this.residualPayment = residualPayment;
        this.invoiceTitle = invoiceTitle;
        this.remark = remark;
        this.consigneeName = consigneeName;
        this.consigneeMobile = consigneeMobile;
        this.consigneeAddress = consigneeAddress;
        this.creTime = creTime;
    }

   
    // Property accessors
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
	* get userId  
	*/
    public Long getUserId() {
        return this.userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
	/**
	* get usertypeId  
	*/
    public Long getUsertypeId() {
        return this.usertypeId;
    }
    
    public void setUsertypeId(Long usertypeId) {
        this.usertypeId = usertypeId;
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
	* get money  
	*/
    public Double getMoney() {
        return this.money;
    }
    
    public void setMoney(Double money) {
        this.money = money;
    }
	/**
	* get recievedMoney  
	*/
    public Double getRecievedMoney() {
        return this.recievedMoney;
    }
    
    public void setRecievedMoney(Double recievedMoney) {
        this.recievedMoney = recievedMoney;
    }
	/**
	* get needPayMoney  
	*/
    public Double getNeedPayMoney() {
        return this.needPayMoney;
    }
    
    public void setNeedPayMoney(Double needPayMoney) {
        this.needPayMoney = needPayMoney;
    }
	/**
	* get goodsPayment  
	*/
    public Double getGoodsPayment() {
        return this.goodsPayment;
    }
    
    public void setGoodsPayment(Double goodsPayment) {
        this.goodsPayment = goodsPayment;
    }
	/**
	* get residualPayment  
	*/
    public Double getResidualPayment() {
        return this.residualPayment;
    }
    
    public void setResidualPayment(Double residualPayment) {
        this.residualPayment = residualPayment;
    }
	/**
	* get invoiceTitle  
	*/
    public String getInvoiceTitle() {
        return this.invoiceTitle;
    }
    
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
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
	* get consigneeName  
	*/
    public String getConsigneeName() {
        return this.consigneeName;
    }
    
    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }
	/**
	* get consigneeMobile  
	*/
    public String getConsigneeMobile() {
        return this.consigneeMobile;
    }
    
    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }
	/**
	* get consigneeAddress  
	*/
    public String getConsigneeAddress() {
        return this.consigneeAddress;
    }
    
    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
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
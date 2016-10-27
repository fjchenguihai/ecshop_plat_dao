package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TPayment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_payment"
)

public class TPayment  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1245152018L;

    // Fields    

 
  /**   
  * payId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="PayId", unique=true, nullable=false)

    private Long payId;// get payId  
 
  /**   
  * payNo:对应订单支付表的编号ID.提交给支付渠道
  */     
    @Column(name="PayNo", length=32)

    private String payNo;// get payNo  
 
  /**   
  * channelTransNo:渠道返回的唯一标识
  */     
    @Column(name="ChannelTransNo", length=32)

    private String channelTransNo;// get channelTransNo  
 
  /**   
  * frontBackUrl:
  */     
    @Column(name="FrontBackUrl")

    private String frontBackUrl;// get frontBackUrl  
 
  /**   
  * noteUrl:
  */     
    @Column(name="NoteUrl")

    private String noteUrl;// get noteUrl  
 
  /**   
  * cardNo:
  */     
    @Column(name="CardNo", length=20)

    private String cardNo;// get cardNo  
 
  /**   
  * mallId:
  */     
    @Column(name="MallId", length=32)

    private String mallId;// get mallId  
 
  /**   
  * respCode:
  */     
    @Column(name="RespCode", length=8)

    private String respCode;// get respCode  
 
  /**   
  * respMsg:
  */     
    @Column(name="RespMsg", length=50)

    private String respMsg;// get respMsg  
 
  /**   
  * transStatus:0：未支付 1：待支付  2：支付成功   3：支付失败  4：支付关闭  5：状态未知
            6：退款
  */     
    @Column(name="TransStatus")

    private Short transStatus;// get transStatus  
 
  /**   
  * transType:1---(consume：支付) 2---(refund：退款)
  */     
    @Column(name="TransType")

    private Short transType;// get transType  
 
  /**   
  * transAmount:
  */     
    @Column(name="TransAmount", precision=22, scale=0)

    private Double transAmount;// get transAmount  
 
  /**   
  * payChannelId:微信 支付宝 银联
  */     
    @Column(name="PayChannelId")

    private Short payChannelId;// get payChannelId  
 
  /**   
  * transTime:
  */     
    @Column(name="TransTime", length=19)

    private Timestamp transTime;// get transTime  
 
  /**   
  * detailMsg:交易的详细信息，json存储
  */     
    @Column(name="DetailMsg", length=2000)

    private String detailMsg;// get detailMsg  
 
  /**   
  * userId:
  */     
    @Column(name="UserId", length=32)

    private String userId;// get userId  
 
  /**   
  * payAmount:
  */     
    @Column(name="PayAmount", precision=22, scale=0)

    private Double payAmount;// get payAmount  
 
  /**   
  * payStatus:
  */     
    @Column(name="PayStatus", length=50)

    private String payStatus;// get payStatus  
 
  /**   
  * remark:
  */     
    @Column(name="Remark", length=50)

    private String remark;// get remark  
 
  /**   
  * creTime:
  */     
    @Column(name="CreTime", length=19)

    private Timestamp creTime;// get creTime  
 
  /**   
  * updTime:
  */     
    @Column(name="UpdTime", length=19)

    private Timestamp updTime;// get updTime  
 
  /**   
  * orderPayType: 0:正常订单支付 1：虚拟订单支付
  */     
    @Column(name="orderPayType")

    private Integer orderPayType;// get orderPayType  


    // Constructors

    /** default constructor */
    public TPayment() {
    }

    
    /** full constructor */
    public TPayment(String payNo, String channelTransNo, String frontBackUrl, String noteUrl, String cardNo, String mallId, String respCode, String respMsg, Short transStatus, Short transType, Double transAmount, Short payChannelId, Timestamp transTime, String detailMsg, String userId, Double payAmount, String payStatus, String remark, Timestamp creTime, Timestamp updTime, Integer orderPayType) {
        this.payNo = payNo;
        this.channelTransNo = channelTransNo;
        this.frontBackUrl = frontBackUrl;
        this.noteUrl = noteUrl;
        this.cardNo = cardNo;
        this.mallId = mallId;
        this.respCode = respCode;
        this.respMsg = respMsg;
        this.transStatus = transStatus;
        this.transType = transType;
        this.transAmount = transAmount;
        this.payChannelId = payChannelId;
        this.transTime = transTime;
        this.detailMsg = detailMsg;
        this.userId = userId;
        this.payAmount = payAmount;
        this.payStatus = payStatus;
        this.remark = remark;
        this.creTime = creTime;
        this.updTime = updTime;
        this.orderPayType = orderPayType;
    }

   
    // Property accessors
	/**
	* get payId  
	*/
    public Long getPayId() {
        return this.payId;
    }
    
    public void setPayId(Long payId) {
        this.payId = payId;
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
	* get channelTransNo  
	*/
    public String getChannelTransNo() {
        return this.channelTransNo;
    }
    
    public void setChannelTransNo(String channelTransNo) {
        this.channelTransNo = channelTransNo;
    }
	/**
	* get frontBackUrl  
	*/
    public String getFrontBackUrl() {
        return this.frontBackUrl;
    }
    
    public void setFrontBackUrl(String frontBackUrl) {
        this.frontBackUrl = frontBackUrl;
    }
	/**
	* get noteUrl  
	*/
    public String getNoteUrl() {
        return this.noteUrl;
    }
    
    public void setNoteUrl(String noteUrl) {
        this.noteUrl = noteUrl;
    }
	/**
	* get cardNo  
	*/
    public String getCardNo() {
        return this.cardNo;
    }
    
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
	/**
	* get mallId  
	*/
    public String getMallId() {
        return this.mallId;
    }
    
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }
	/**
	* get respCode  
	*/
    public String getRespCode() {
        return this.respCode;
    }
    
    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }
	/**
	* get respMsg  
	*/
    public String getRespMsg() {
        return this.respMsg;
    }
    
    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }
	/**
	* get transStatus  
	*/
    public Short getTransStatus() {
        return this.transStatus;
    }
    
    public void setTransStatus(Short transStatus) {
        this.transStatus = transStatus;
    }
	/**
	* get transType  
	*/
    public Short getTransType() {
        return this.transType;
    }
    
    public void setTransType(Short transType) {
        this.transType = transType;
    }
	/**
	* get transAmount  
	*/
    public Double getTransAmount() {
        return this.transAmount;
    }
    
    public void setTransAmount(Double transAmount) {
        this.transAmount = transAmount;
    }
	/**
	* get payChannelId  
	*/
    public Short getPayChannelId() {
        return this.payChannelId;
    }
    
    public void setPayChannelId(Short payChannelId) {
        this.payChannelId = payChannelId;
    }
	/**
	* get transTime  
	*/
    public Timestamp getTransTime() {
        return this.transTime;
    }
    
    public void setTransTime(Timestamp transTime) {
        this.transTime = transTime;
    }
	/**
	* get detailMsg  
	*/
    public String getDetailMsg() {
        return this.detailMsg;
    }
    
    public void setDetailMsg(String detailMsg) {
        this.detailMsg = detailMsg;
    }
	/**
	* get userId  
	*/
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
	/**
	* get payAmount  
	*/
    public Double getPayAmount() {
        return this.payAmount;
    }
    
    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }
	/**
	* get payStatus  
	*/
    public String getPayStatus() {
        return this.payStatus;
    }
    
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
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
	* get creTime  
	*/
    public Timestamp getCreTime() {
        return this.creTime;
    }
    
    public void setCreTime(Timestamp creTime) {
        this.creTime = creTime;
    }
	/**
	* get updTime  
	*/
    public Timestamp getUpdTime() {
        return this.updTime;
    }
    
    public void setUpdTime(Timestamp updTime) {
        this.updTime = updTime;
    }
	/**
	* get orderPayType  
	*/
    public Integer getOrderPayType() {
        return this.orderPayType;
    }
    
    public void setOrderPayType(Integer orderPayType) {
        this.orderPayType = orderPayType;
    }
   








}
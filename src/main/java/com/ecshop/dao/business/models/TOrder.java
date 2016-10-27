package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TOrder entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_order"
)

public class TOrder  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1813664934L;

    // Fields    

 
  /**   
  * orderId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="orderId", unique=true, nullable=false)

    private Long orderId;// get orderId  
 
  /**   
  * userId:
  */     
    @Column(name="userId")

    private Long userId;// get userId  
 
  /**   
  * mallId:
  */     
    @Column(name="mallId")

    private Long mallId;// get mallId  
 
  /**   
  * payNo:支付编号
  */     
    @Column(name="payNo", length=32)

    private String payNo;// get payNo  
 
  /**   
  * stationId:
  */     
    @Column(name="stationId")

    private Long stationId;// get stationId  
 
  /**   
  * orderNumber:
  */     
    @Column(name="orderNumber", length=200)

    private String orderNumber;// get orderNumber  
 
  /**   
  * payStatus:0: 待付款 1:已付款
  */     
    @Column(name="payStatus")

    private Integer payStatus;// get payStatus  
 
  /**   
  * logisticsStatus:0:未发货 1:已发货 2:部分发货,3:已收货
  */     
    @Column(name="logisticsStatus")

    private Integer logisticsStatus;// get logisticsStatus  
 
  /**   
  * orderstatus:0:待确认 1:已确认 2:已取消,3:已完成
  */     
    @Column(name="orderstatus")

    private Integer orderstatus;// get orderstatus  
 
  /**   
  * ordertime:
  */     
    @Column(name="ordertime", length=19)

    private Timestamp ordertime;// get ordertime  
 
  /**   
  * money:不含运费
  */     
    @Column(name="money", precision=15)

    private Double money;// get money  
 
  /**   
  * freight:
  */     
    @Column(name="freight", precision=15)

    private Double freight;// get freight  
 
  /**   
  * paymenttime:
  */     
    @Column(name="paymenttime", length=19)

    private Timestamp paymenttime;// get paymenttime  
 
  /**   
  * wantLogisticsId:订单用户期望的物流类型
  */     
    @Column(name="wantLogisticsId")

    private Long wantLogisticsId;// get wantLogisticsId  
 
  /**   
  * provinceId:
  */     
    @Column(name="provinceId")

    private Integer provinceId;// get provinceId  
 
  /**   
  * cityId:
  */     
    @Column(name="cityId")

    private Integer cityId;// get cityId  
 
  /**   
  * districtId:
  */     
    @Column(name="districtId")

    private Integer districtId;// get districtId  
 
  /**   
  * deliversAddress:
  */     
    @Column(name="deliversAddress", length=100)

    private String deliversAddress;// get deliversAddress  
 
  /**   
  * addressee:
  */     
    @Column(name="addressee", length=50)

    private String addressee;// get addressee  
 
  /**   
  * userNote:用户备注
  */     
    @Column(name="userNote", length=200)

    private String userNote;// get userNote  
 
  /**   
  * mallNote:商家备注
  */     
    @Column(name="mallNote", length=200)

    private String mallNote;// get mallNote  
 
  /**   
  * zipCode:
  */     
    @Column(name="zipCode", length=6)

    private String zipCode;// get zipCode  
 
  /**   
  * mobile:
  */     
    @Column(name="mobile", length=20)

    private String mobile;// get mobile  
 
  /**   
  * usertypeId:
  */     
    @Column(name="usertypeId")

    private Long usertypeId;// get usertypeId  
 
  /**   
  * paymentId:
  */     
    @Column(name="paymentId")

    private Long paymentId;// get paymentId  
 
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
  * counterFee:
  */     
    @Column(name="counterFee", precision=15)

    private Double counterFee;// get counterFee  
 
  /**   
  * isCalculateProfit:是否已经计算了分润 0:否 1:是
  */     
    @Column(name="isCalculateProfit")

    private Integer isCalculateProfit;// get isCalculateProfit  
 
  /**   
  * calcTime:计算时间
  */     
    @Column(name="calcTime", length=19)

    private Timestamp calcTime;// get calcTime  
 
  /**   
  * deliveryLastTime:最后一次发货时间
  */     
    @Column(name="deliveryLastTime", length=19)

    private Timestamp deliveryLastTime;// get deliveryLastTime  
 
  /**   
  * confirmTime:确认收货时间
  */     
    @Column(name="confirmTime", length=19)

    private Timestamp confirmTime;// get confirmTime  
 
  /**   
  * mallCheckStatus:0：可核算 1：已核算  
  */     
    @Column(name="mallCheckStatus")

    private Integer mallCheckStatus;// get mallCheckStatus  
 
  /**   
  * mallsettlementTime:结算时间
  */     
    @Column(name="mallsettlementTime", length=19)

    private Timestamp mallsettlementTime;// get mallsettlementTime  
 
  /**   
  * sourceMallId:销售来源商城Id
  */     
    @Column(name="sourceMallId")

    private Long sourceMallId;// get sourceMallId  
 
  /**   
  * sourceStationId:销售来源站点Id
  */     
    @Column(name="sourceStationId")

    private Long sourceStationId;// get sourceStationId  
 
  /**   
  * isCumulative:是否累加到用户统计
  */     
    @Column(name="isCumulative")

    private Integer isCumulative;// get isCumulative  
 
  /**   
  * financeAuditStatus:财务审核状态 0：待审核 1：审核通过 2：审核不通过
  */     
    @Column(name="financeAuditStatus")

    private Integer financeAuditStatus = 0;// get financeAuditStatus  
 
  /**   
  * auditRemark:
  */     
    @Column(name="auditRemark", length = 100)

    private String auditRemark;// get auditRemark  
 
  /**   
  * derivedStatus:订单备货导出状态 0：未导出 1：已导出
  */     
    @Column(name="derivedStatus")

    private Integer derivedStatus = 0;// get derivedStatus  
 
  /**   
  * invoiceTitle:发票抬头
  */     
    @Column(name="invoiceTitle", length=200)

    private String invoiceTitle;// get invoiceTitle  
 
  /**   
  * needInvoiceFlag:是否需要开发票 0：否 1：是
  */     
    @Column(name="needInvoiceFlag", nullable=false)

    private Integer needInvoiceFlag = 0;// get needInvoiceFlag  
 
  /**   
  * invoiceStatus:
  */     
    @Column(name="invoiceStatus", nullable=false)

    private Integer invoiceStatus = 0;// get invoiceStatus  
 
  /**   
  * marketPlanStatus:营销计划执行状态 0：未执行  1：已执行
  */     
    @Column(name="marketPlanStatus")

    private Integer marketPlanStatus= 0;// get marketPlanStatus  
 
  /**   
  * deliveryType:0-物流
1-到店自提
2-虚拟商品(自动完成)
  */     
    @Column(name="deliveryType", nullable=false)

    private Integer deliveryType = 0;// get deliveryType  
 
  /**   
  * orderType:0：普通订单   1：团购订单
  */     
    @Column(name="orderType")

    private Integer orderType = 0;// get orderType  
 
  /**   
  * groupId:拼团购所属团ID  默认为空，当orderType值为1时必填
  */     
    @Column(name="groupId")

    private Long groupId;// get groupId  
    
    /**
     * 所属运营中心ID
     */
    @Column(name="centerId")
    private Long centerId;


    // Constructors

    /** default constructor */
    public TOrder() {
    }

	/** minimal constructor */
    public TOrder(Integer invoiceStatus, Integer marketPlanStatus, Integer deliveryType) {
        this.invoiceStatus = invoiceStatus;
        this.marketPlanStatus = marketPlanStatus;
        this.deliveryType = deliveryType;
    }
    
    /** full constructor */
    public TOrder(Long userId, Long mallId, String payNo, Long stationId, String orderNumber, Integer payStatus, Integer logisticsStatus, Integer orderstatus, Timestamp ordertime, Double money, Double freight, Timestamp paymenttime, Long wantLogisticsId, Integer provinceId, Integer cityId, Integer districtId, String deliversAddress, String addressee, String userNote, String mallNote, String zipCode, String mobile, Long usertypeId, Long paymentId, Double mallMoney, Double profitMoney, Double counterFee, Integer isCalculateProfit, Timestamp calcTime, Timestamp deliveryLastTime, Timestamp confirmTime, Integer mallCheckStatus, Timestamp mallsettlementTime, Long sourceMallId, Long sourceStationId, Integer isCumulative, Integer financeAuditStatus, String auditRemark, Integer derivedStatus, String invoiceTitle, Integer needInvoiceFlag, Integer invoiceStatus, Integer marketPlanStatus, Integer deliveryType, Integer orderType, Long groupId,Long centerId) {
        this.userId = userId;
        this.mallId = mallId;
        this.payNo = payNo;
        this.stationId = stationId;
        this.orderNumber = orderNumber;
        this.payStatus = payStatus;
        this.logisticsStatus = logisticsStatus;
        this.orderstatus = orderstatus;
        this.ordertime = ordertime;
        this.money = money;
        this.freight = freight;
        this.paymenttime = paymenttime;
        this.wantLogisticsId = wantLogisticsId;
        this.provinceId = provinceId;
        this.cityId = cityId;
        this.districtId = districtId;
        this.deliversAddress = deliversAddress;
        this.addressee = addressee;
        this.userNote = userNote;
        this.mallNote = mallNote;
        this.zipCode = zipCode;
        this.mobile = mobile;
        this.usertypeId = usertypeId;
        this.paymentId = paymentId;
        this.mallMoney = mallMoney;
        this.profitMoney = profitMoney;
        this.counterFee = counterFee;
        this.isCalculateProfit = isCalculateProfit;
        this.calcTime = calcTime;
        this.deliveryLastTime = deliveryLastTime;
        this.confirmTime = confirmTime;
        this.mallCheckStatus = mallCheckStatus;
        this.mallsettlementTime = mallsettlementTime;
        this.sourceMallId = sourceMallId;
        this.sourceStationId = sourceStationId;
        this.isCumulative = isCumulative;
        this.financeAuditStatus = financeAuditStatus;
        this.auditRemark = auditRemark;
        this.derivedStatus = derivedStatus;
        this.invoiceTitle = invoiceTitle;
        this.needInvoiceFlag = needInvoiceFlag;
        this.invoiceStatus = invoiceStatus;
        this.marketPlanStatus = marketPlanStatus;
        this.deliveryType = deliveryType;
        this.orderType = orderType;
        this.groupId = groupId;
        this.centerId = centerId;
    }

   
    // Property accessors
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
	* get userId  
	*/
    public Long getUserId() {
        return this.userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
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
	* get payNo  
	*/
    public String getPayNo() {
        return this.payNo;
    }
    
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }
	/**
	* get stationId  
	*/
    public Long getStationId() {
        return this.stationId;
    }
    
    public void setStationId(Long stationId) {
        this.stationId = stationId;
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
	* get payStatus  
	*/
    public Integer getPayStatus() {
        return this.payStatus;
    }
    
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }
	/**
	* get logisticsStatus  
	*/
    public Integer getLogisticsStatus() {
        return this.logisticsStatus;
    }
    
    public void setLogisticsStatus(Integer logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }
	/**
	* get orderstatus  
	*/
    public Integer getOrderstatus() {
        return this.orderstatus;
    }
    
    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
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
	* get money  
	*/
    public Double getMoney() {
        return this.money;
    }
    
    public void setMoney(Double money) {
        this.money = money;
    }
	/**
	* get freight  
	*/
    public Double getFreight() {
        return this.freight;
    }
    
    public void setFreight(Double freight) {
        this.freight = freight;
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
	* get wantLogisticsId  
	*/
    public Long getWantLogisticsId() {
        return this.wantLogisticsId;
    }
    
    public void setWantLogisticsId(Long wantLogisticsId) {
        this.wantLogisticsId = wantLogisticsId;
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
	* get cityId  
	*/
    public Integer getCityId() {
        return this.cityId;
    }
    
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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
	* get deliversAddress  
	*/
    public String getDeliversAddress() {
        return this.deliversAddress;
    }
    
    public void setDeliversAddress(String deliversAddress) {
        this.deliversAddress = deliversAddress;
    }
	/**
	* get addressee  
	*/
    public String getAddressee() {
        return this.addressee;
    }
    
    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }
	/**
	* get userNote  
	*/
    public String getUserNote() {
        return this.userNote;
    }
    
    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }
	/**
	* get mallNote  
	*/
    public String getMallNote() {
        return this.mallNote;
    }
    
    public void setMallNote(String mallNote) {
        this.mallNote = mallNote;
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
	* get mobile  
	*/
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
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
	* get paymentId  
	*/
    public Long getPaymentId() {
        return this.paymentId;
    }
    
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
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
	* get counterFee  
	*/
    public Double getCounterFee() {
        return this.counterFee;
    }
    
    public void setCounterFee(Double counterFee) {
        this.counterFee = counterFee;
    }
	/**
	* get isCalculateProfit  
	*/
    public Integer getIsCalculateProfit() {
        return this.isCalculateProfit;
    }
    
    public void setIsCalculateProfit(Integer isCalculateProfit) {
        this.isCalculateProfit = isCalculateProfit;
    }
	/**
	* get calcTime  
	*/
    public Timestamp getCalcTime() {
        return this.calcTime;
    }
    
    public void setCalcTime(Timestamp calcTime) {
        this.calcTime = calcTime;
    }
	/**
	* get deliveryLastTime  
	*/
    public Timestamp getDeliveryLastTime() {
        return this.deliveryLastTime;
    }
    
    public void setDeliveryLastTime(Timestamp deliveryLastTime) {
        this.deliveryLastTime = deliveryLastTime;
    }
	/**
	* get confirmTime  
	*/
    public Timestamp getConfirmTime() {
        return this.confirmTime;
    }
    
    public void setConfirmTime(Timestamp confirmTime) {
        this.confirmTime = confirmTime;
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
	* get mallsettlementTime  
	*/
    public Timestamp getMallsettlementTime() {
        return this.mallsettlementTime;
    }
    
    public void setMallsettlementTime(Timestamp mallsettlementTime) {
        this.mallsettlementTime = mallsettlementTime;
    }
	/**
	* get sourceMallId  
	*/
    public Long getSourceMallId() {
        return this.sourceMallId;
    }
    
    public void setSourceMallId(Long sourceMallId) {
        this.sourceMallId = sourceMallId;
    }
	/**
	* get sourceStationId  
	*/
    public Long getSourceStationId() {
        return this.sourceStationId;
    }
    
    public void setSourceStationId(Long sourceStationId) {
        this.sourceStationId = sourceStationId;
    }
	/**
	* get isCumulative  
	*/
    public Integer getIsCumulative() {
        return this.isCumulative;
    }
    
    public void setIsCumulative(Integer isCumulative) {
        this.isCumulative = isCumulative;
    }
	/**
	* get financeAuditStatus  
	*/
    public Integer getFinanceAuditStatus() {
        return this.financeAuditStatus;
    }
    
    public void setFinanceAuditStatus(Integer financeAuditStatus) {
        this.financeAuditStatus = financeAuditStatus;
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
	* get derivedStatus  
	*/
    public Integer getDerivedStatus() {
        return this.derivedStatus;
    }
    
    public void setDerivedStatus(Integer derivedStatus) {
        this.derivedStatus = derivedStatus;
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
	* get needInvoiceFlag  
	*/
    public Integer getNeedInvoiceFlag() {
        return this.needInvoiceFlag;
    }
    
    public void setNeedInvoiceFlag(Integer needInvoiceFlag) {
        this.needInvoiceFlag = needInvoiceFlag;
    }
	/**
	* get invoiceStatus  
	*/
    public Integer getInvoiceStatus() {
        return this.invoiceStatus;
    }
    
    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
	/**
	* get marketPlanStatus  
	*/
    public Integer getMarketPlanStatus() {
        return this.marketPlanStatus;
    }
    
    public void setMarketPlanStatus(Integer marketPlanStatus) {
        this.marketPlanStatus = marketPlanStatus;
    }
	/**
	* get deliveryType  
	*/
    public Integer getDeliveryType() {
        return this.deliveryType;
    }
    
    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }
	/**
	* get orderType  
	*/
    public Integer getOrderType() {
        return this.orderType;
    }
    
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }
	/**
	* get groupId  
	*/
    public Long getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

	public Long getCenterId() {
		return centerId;
	}

	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}
   








}
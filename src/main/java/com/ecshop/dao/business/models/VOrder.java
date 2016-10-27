package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * VOrder entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="v_order"
)

public class VOrder  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1756406632L;

    // Fields    

 
  /**   
  * orderId:
  */     @Id 
    
    @Column(name="orderId", nullable=false)

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
  * buyerMobile:
  */     
    @Column(name="buyerMobile", length=50)

    private String buyerMobile;// get buyerMobile  
 
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
  * username:
  */     
    @Column(name="username", length=50)

    private String username;// get username  
 
  /**   
  * nickname:微信昵称
  */     
    @Column(name="nickname", length=50)

    private String nickname;// get nickname  
 
  /**   
  * realName:
  */     
    @Column(name="realName", length=50)

    private String realName;// get realName  
 
  /**   
  * mallName:
  */     
    @Column(name="mallName", length=50)

    private String mallName;// get mallName  
 
  /**   
  * stationName:
  */     
    @Column(name="stationName", length=100)

    private String stationName;// get stationName  
 
  /**   
  * sourceMallName:
  */     
    @Column(name="sourceMallName", length=50)

    private String sourceMallName;// get sourceMallName  
 
  /**   
  * sourceStationName:
  */     
    @Column(name="sourceStationName", length=100)

    private String sourceStationName;// get sourceStationName  
 
  /**   
  * provinceName:行政区域名称
  */     
    @Column(name="provinceName", length=50)

    private String provinceName;// get provinceName  
 
  /**   
  * cityName:行政区域名称
  */     
    @Column(name="cityName", length=50)

    private String cityName;// get cityName  
 
  /**   
  * districtName:行政区域名称
  */     
    @Column(name="districtName", length=50)

    private String districtName;// get districtName  
 
  /**   
  * orderDesc:描述
  */     
    @Column(name="orderDesc", length=100)

    private String orderDesc;// get orderDesc  
 
  /**   
  * payDesc:描述
  */     
    @Column(name="payDesc", length=100)

    private String payDesc;// get payDesc  
 
  /**   
  * logisticsDesc:描述
  */     
    @Column(name="logisticsDesc", length=100)

    private String logisticsDesc;// get logisticsDesc  
 
  /**   
  * wantLogisticsName:
  */     
    @Column(name="wantLogisticsName", length=100)

    private String wantLogisticsName;// get wantLogisticsName  
 
  /**   
  * financeAuditStatus:财务审核状态 0：待审核 1：审核通过 2：审核不通过
  */     
    @Column(name="financeAuditStatus")

    private Integer financeAuditStatus;// get financeAuditStatus  
 
  /**   
  * auditRemark:
  */     
    @Column(name="auditRemark")

    private String auditRemark;// get auditRemark  
 
  /**   
  * derivedStatus:订单备货导出状态 0：未导出 1：已导出
  */     
    @Column(name="derivedStatus")

    private Integer derivedStatus;// get derivedStatus  
 
  /**   
  * invoiceTitle:发票抬头
  */     
    @Column(name="invoiceTitle", length=200)

    private String invoiceTitle;// get invoiceTitle  
 
  /**   
  * needInvoiceFlag:是否需要开发票 0：否 1：是
  */     
    @Column(name="needInvoiceFlag")

    private Integer needInvoiceFlag;// get needInvoiceFlag  
 
  /**   
  * invoiceStatus:
  */     
    @Column(name="invoiceStatus", nullable=false)

    private Integer invoiceStatus = 0;// get invoiceStatus  
 
  /**   
  * deliveryType:0-物流
1-到店自提
2-虚拟商品(自动完成)
  */     
    @Column(name="deliveryType", nullable=false)

    private Integer deliveryType = 0;// get deliveryType  
 
  /**   
  * orderType:订单类型(0为普通订单 1：团购订单)
  */     
    @Column(name="orderType")

    private Integer orderType = 0;// get orderType  
 
  /**   
  * fightGroupId:
  */     
    @Column(name="fightGroupId")

    private Long fightGroupId;// get fightGroupId  
 
  /**   
  * foundedTime:
  */     
    @Column(name="foundedTime", length=19)

    private Timestamp foundedTime;// get foundedTime  
 
  /**   
  * groupGoodNum:拼团最终有效商品数量
  */     
    @Column(name="groupGoodNum")

    private Integer groupGoodNum;// get groupGoodNum  
 
  /**   
  * groupStatus:
  */     
    @Column(name="groupStatus")

    private Integer groupStatus;// get groupStatus  
 
  /**   
  * groupUserNum:拼团最终有效人数
  */     
    @Column(name="groupUserNum")

    private Integer groupUserNum;// get groupUserNum  
 
  /**   
  * remark:
  */     
    @Column(name="remark", length=1000)

    private String remark;// get remark  


    // Constructors

    /** default constructor */
    public VOrder() {
    }

	/** minimal constructor */
    public VOrder(Long orderId, Integer invoiceStatus, Integer deliveryType) {
        this.orderId = orderId;
        this.invoiceStatus = invoiceStatus;
        this.deliveryType = deliveryType;
    }
    
    /** full constructor */
    public VOrder(Long orderId, Long userId, Long mallId, String buyerMobile, String payNo, Long stationId, String orderNumber, Integer payStatus, Integer logisticsStatus, Integer orderstatus, Timestamp ordertime, Double money, Double freight, Timestamp paymenttime, Long wantLogisticsId, Integer provinceId, Integer cityId, Integer districtId, String deliversAddress, String addressee, String userNote, String mallNote, String zipCode, String mobile, Long usertypeId, Long paymentId, Double mallMoney, Double profitMoney, Double counterFee, Integer isCalculateProfit, Timestamp calcTime, Timestamp deliveryLastTime, Timestamp confirmTime, Integer mallCheckStatus, Timestamp mallsettlementTime, Long sourceMallId, Long sourceStationId, Integer isCumulative, String username, String nickname, String realName, String mallName, String stationName, String sourceMallName, String sourceStationName, String provinceName, String cityName, String districtName, String orderDesc, String payDesc, String logisticsDesc, String wantLogisticsName, Integer financeAuditStatus, String auditRemark, Integer derivedStatus, String invoiceTitle, Integer needInvoiceFlag, Integer invoiceStatus, Integer deliveryType, Integer orderType, Long fightGroupId, Timestamp foundedTime, Integer groupGoodNum, Integer groupStatus, Integer groupUserNum, String remark) {
        this.orderId = orderId;
        this.userId = userId;
        this.mallId = mallId;
        this.buyerMobile = buyerMobile;
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
        this.username = username;
        this.nickname = nickname;
        this.realName = realName;
        this.mallName = mallName;
        this.stationName = stationName;
        this.sourceMallName = sourceMallName;
        this.sourceStationName = sourceStationName;
        this.provinceName = provinceName;
        this.cityName = cityName;
        this.districtName = districtName;
        this.orderDesc = orderDesc;
        this.payDesc = payDesc;
        this.logisticsDesc = logisticsDesc;
        this.wantLogisticsName = wantLogisticsName;
        this.financeAuditStatus = financeAuditStatus;
        this.auditRemark = auditRemark;
        this.derivedStatus = derivedStatus;
        this.invoiceTitle = invoiceTitle;
        this.needInvoiceFlag = needInvoiceFlag;
        this.invoiceStatus = invoiceStatus;
        this.deliveryType = deliveryType;
        this.orderType = orderType;
        this.fightGroupId = fightGroupId;
        this.foundedTime = foundedTime;
        this.groupGoodNum = groupGoodNum;
        this.groupStatus = groupStatus;
        this.groupUserNum = groupUserNum;
        this.remark = remark;
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
	* get buyerMobile  
	*/
    public String getBuyerMobile() {
        return this.buyerMobile;
    }
    
    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile;
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
	* get username  
	*/
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
	/**
	* get nickname  
	*/
    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
	/**
	* get realName  
	*/
    public String getRealName() {
        return this.realName;
    }
    
    public void setRealName(String realName) {
        this.realName = realName;
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
	* get stationName  
	*/
    public String getStationName() {
        return this.stationName;
    }
    
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
	/**
	* get sourceMallName  
	*/
    public String getSourceMallName() {
        return this.sourceMallName;
    }
    
    public void setSourceMallName(String sourceMallName) {
        this.sourceMallName = sourceMallName;
    }
	/**
	* get sourceStationName  
	*/
    public String getSourceStationName() {
        return this.sourceStationName;
    }
    
    public void setSourceStationName(String sourceStationName) {
        this.sourceStationName = sourceStationName;
    }
	/**
	* get provinceName  
	*/
    public String getProvinceName() {
        return this.provinceName;
    }
    
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
	/**
	* get cityName  
	*/
    public String getCityName() {
        return this.cityName;
    }
    
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
	/**
	* get districtName  
	*/
    public String getDistrictName() {
        return this.districtName;
    }
    
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
	/**
	* get orderDesc  
	*/
    public String getOrderDesc() {
        return this.orderDesc;
    }
    
    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }
	/**
	* get payDesc  
	*/
    public String getPayDesc() {
        return this.payDesc;
    }
    
    public void setPayDesc(String payDesc) {
        this.payDesc = payDesc;
    }
	/**
	* get logisticsDesc  
	*/
    public String getLogisticsDesc() {
        return this.logisticsDesc;
    }
    
    public void setLogisticsDesc(String logisticsDesc) {
        this.logisticsDesc = logisticsDesc;
    }
	/**
	* get wantLogisticsName  
	*/
    public String getWantLogisticsName() {
        return this.wantLogisticsName;
    }
    
    public void setWantLogisticsName(String wantLogisticsName) {
        this.wantLogisticsName = wantLogisticsName;
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
	* get fightGroupId  
	*/
    public Long getFightGroupId() {
        return this.fightGroupId;
    }
    
    public void setFightGroupId(Long fightGroupId) {
        this.fightGroupId = fightGroupId;
    }
	/**
	* get foundedTime  
	*/
    public Timestamp getFoundedTime() {
        return this.foundedTime;
    }
    
    public void setFoundedTime(Timestamp foundedTime) {
        this.foundedTime = foundedTime;
    }
	/**
	* get groupGoodNum  
	*/
    public Integer getGroupGoodNum() {
        return this.groupGoodNum;
    }
    
    public void setGroupGoodNum(Integer groupGoodNum) {
        this.groupGoodNum = groupGoodNum;
    }
	/**
	* get groupStatus  
	*/
    public Integer getGroupStatus() {
        return this.groupStatus;
    }
    
    public void setGroupStatus(Integer groupStatus) {
        this.groupStatus = groupStatus;
    }
	/**
	* get groupUserNum  
	*/
    public Integer getGroupUserNum() {
        return this.groupUserNum;
    }
    
    public void setGroupUserNum(Integer groupUserNum) {
        this.groupUserNum = groupUserNum;
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
   








}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VDelivery entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_delivery")
public class VDelivery implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 65849962L;

	// Fields

	/**
	 * deliveryId:
	 */
	@Id
	@Column(name = "deliveryId", nullable = false)
	private Long deliveryId;// get deliveryId

	/**
	 * deliveryNo:��������
	 */
	@Column(name = "deliveryNo", length = 30)
	private String deliveryNo;// get deliveryNo

	/**
	 * deliveryTime:
	 */
	@Column(name = "deliveryTime", length = 19)
	private Timestamp deliveryTime;// get deliveryTime

	/**
	 * logisticsId:����ID
	 */
	@Column(name = "logisticsId")
	private Long logisticsId;// get logisticsId

	/**
	 * logisticsName:�������
	 */
	@Column(name = "logisticsName", length = 100)
	private String logisticsName;// get logisticsName

	/**
	 * logisticsNo:��������
	 */
	@Column(name = "logisticsNo", length = 30)
	private String logisticsNo;// get logisticsNo

	/**
	 * status:0��δ���� 1���ѷ��� 2��ȡ���
	 */
	@Column(name = "status")
	private Integer status;// get status

	/**
	 * remark:
	 */
	@Column(name = "remark", length = 200)
	private String remark;// get remark

	/**
	 * orderId:
	 */
	@Column(name = "orderId")
	private Long orderId;// get orderId

	/**
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * payNo:֧�����
	 */
	@Column(name = "payNo", length = 32)
	private String payNo;// get payNo

	/**
	 * stationId:
	 */
	@Column(name = "stationId")
	private Long stationId;// get stationId

	/**
	 * orderNumber:
	 */
	@Column(name = "orderNumber", length = 200)
	private String orderNumber;// get orderNumber

	/**
	 * payStatus:0: ��� 1:�Ѹ���
	 */
	@Column(name = "payStatus")
	private Integer payStatus;// get payStatus

	/**
	 * logisticsStatus:0:δ���� 1:�ѷ��� 2:���ַ���,3:���ջ�
	 */
	@Column(name = "logisticsStatus")
	private Integer logisticsStatus;// get logisticsStatus

	/**
	 * orderstatus:0:��ȷ�� 1:��ȷ�� 2:��ȡ��,3:�����
	 */
	@Column(name = "orderstatus")
	private Integer orderstatus;// get orderstatus

	/**
	 * ordertime:
	 */
	@Column(name = "ordertime", length = 19)
	private Timestamp ordertime;// get ordertime

	/**
	 * money:�����˷�
	 */
	@Column(name = "money", precision = 15)
	private Double money;// get money

	/**
	 * freight:
	 */
	@Column(name = "freight", precision = 15)
	private Double freight;// get freight

	/**
	 * paymenttime:
	 */
	@Column(name = "paymenttime", length = 19)
	private Timestamp paymenttime;// get paymenttime

	/**
	 * wantLogisticsId:�����û��������������
	 */
	@Column(name = "wantLogisticsId")
	private Long wantLogisticsId;// get wantLogisticsId

	/**
	 * provinceId:
	 */
	@Column(name = "provinceId")
	private Integer provinceId;// get provinceId

	/**
	 * cityId:
	 */
	@Column(name = "cityId")
	private Integer cityId;// get cityId

	/**
	 * districtId:
	 */
	@Column(name = "districtId")
	private Integer districtId;// get districtId

	/**
	 * deliversAddress:
	 */
	@Column(name = "deliversAddress", length = 100)
	private String deliversAddress;// get deliversAddress

	/**
	 * addressee:
	 */
	@Column(name = "addressee", length = 50)
	private String addressee;// get addressee

	/**
	 * userNote:�û���ע
	 */
	@Column(name = "userNote", length = 200)
	private String userNote;// get userNote

	/**
	 * mallNote:�̼ұ�ע
	 */
	@Column(name = "mallNote", length = 200)
	private String mallNote;// get mallNote

	/**
	 * zipCode:
	 */
	@Column(name = "zipCode", length = 6)
	private String zipCode;// get zipCode

	/**
	 * mobile:
	 */
	@Column(name = "mobile", length = 20)
	private String mobile;// get mobile

	/**
	 * usertypeId:
	 */
	@Column(name = "usertypeId")
	private Long usertypeId;// get usertypeId

	/**
	 * paymentId:
	 */
	@Column(name = "paymentId")
	private Long paymentId;// get paymentId

	/**
	 * mallMoney:
	 */
	@Column(name = "mallMoney", precision = 15)
	private Double mallMoney;// get mallMoney

	/**
	 * profitMoney:
	 */
	@Column(name = "profitMoney", precision = 15)
	private Double profitMoney;// get profitMoney

	/**
	 * counterFee:
	 */
	@Column(name = "counterFee", precision = 15)
	private Double counterFee;// get counterFee

	/**
	 * isCalculateProfit:�Ƿ��Ѿ������˷��� 0:�� 1:��
	 */
	@Column(name = "isCalculateProfit")
	private Integer isCalculateProfit;// get isCalculateProfit

	/**
	 * calcTime:����ʱ��
	 */
	@Column(name = "calcTime", length = 19)
	private Timestamp calcTime;// get calcTime

	/**
	 * deliveryLastTime:���һ�η���ʱ��
	 */
	@Column(name = "deliveryLastTime", length = 19)
	private Timestamp deliveryLastTime;// get deliveryLastTime

	/**
	 * confirmTime:ȷ���ջ�ʱ��
	 */
	@Column(name = "confirmTime", length = 19)
	private Timestamp confirmTime;// get confirmTime

	/**
	 * mallCheckStatus:0���ɺ��� 1���Ѻ���
	 */
	@Column(name = "mallCheckStatus")
	private Integer mallCheckStatus;// get mallCheckStatus

	/**
	 * mallsettlementTime:����ʱ��
	 */
	@Column(name = "mallsettlementTime", length = 19)
	private Timestamp mallsettlementTime;// get mallsettlementTime

	/**
	 * sourceMallId:������Դ�̳�Id
	 */
	@Column(name = "sourceMallId")
	private Long sourceMallId;// get sourceMallId

	/**
	 * sourceStationId:������Դվ��Id
	 */
	@Column(name = "sourceStationId")
	private Long sourceStationId;// get sourceStationId

	/**
	 * isCumulative:�Ƿ��ۼӵ��û�ͳ��
	 */
	@Column(name = "isCumulative")
	private Integer isCumulative;// get isCumulative

	/**
	 * provinceName:�����������
	 */
	@Column(name = "provinceName", length = 50)
	private String provinceName;// get provinceName

	/**
	 * cityName:�����������
	 */
	@Column(name = "cityName", length = 50)
	private String cityName;// get cityName

	/**
	 * districtName:�����������
	 */
	@Column(name = "districtName", length = 50)
	private String districtName;// get districtName

	/**
	 * username:
	 */
	@Column(name = "username", length = 50)
	private String username;// get username

	/**
	 * realName:
	 */
	@Column(name = "realName", length = 50)
	private String realName;// get realName

	/**
	 * stationName:
	 */
	@Column(name = "stationName", length = 100)
	private String stationName;// get stationName

	/**
	 * logisticsDesc:����
	 */
	@Column(name = "logisticsDesc", length = 100)
	private String logisticsDesc;// get logisticsDesc

	/**
	 * logisticsImg:
	 */
	@Column(name = "logisticsImg", length = 100)
	private String logisticsImg;// get logisticsImg

	// Constructors

	/** default constructor */
	public VDelivery() {
	}

	/** minimal constructor */
	public VDelivery(Long deliveryId) {
		this.deliveryId = deliveryId;
	}

	/** full constructor */
	public VDelivery(Long deliveryId, String deliveryNo,
			Timestamp deliveryTime, Long logisticsId, String logisticsName,
			String logisticsNo, Integer status, String remark, Long orderId,
			Long userId, Long mallId, String payNo, Long stationId,
			String orderNumber, Integer payStatus, Integer logisticsStatus,
			Integer orderstatus, Timestamp ordertime, Double money,
			Double freight, Timestamp paymenttime, Long wantLogisticsId,
			Integer provinceId, Integer cityId, Integer districtId,
			String deliversAddress, String addressee, String userNote,
			String mallNote, String zipCode, String mobile, Long usertypeId,
			Long paymentId, Double mallMoney, Double profitMoney,
			Double counterFee, Integer isCalculateProfit, Timestamp calcTime,
			Timestamp deliveryLastTime, Timestamp confirmTime,
			Integer mallCheckStatus, Timestamp mallsettlementTime,
			Long sourceMallId, Long sourceStationId, Integer isCumulative,
			String provinceName, String cityName, String districtName,
			String username, String realName, String stationName,
			String logisticsDesc, String logisticsImg) {
		this.deliveryId = deliveryId;
		this.deliveryNo = deliveryNo;
		this.deliveryTime = deliveryTime;
		this.logisticsId = logisticsId;
		this.logisticsName = logisticsName;
		this.logisticsNo = logisticsNo;
		this.status = status;
		this.remark = remark;
		this.orderId = orderId;
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
		this.provinceName = provinceName;
		this.cityName = cityName;
		this.districtName = districtName;
		this.username = username;
		this.realName = realName;
		this.stationName = stationName;
		this.logisticsDesc = logisticsDesc;
		this.logisticsImg = logisticsImg;
	}

	// Property accessors
	/**
	 * get deliveryId
	 */
	public Long getDeliveryId() {
		return this.deliveryId;
	}

	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}

	/**
	 * get deliveryNo
	 */
	public String getDeliveryNo() {
		return this.deliveryNo;
	}

	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	/**
	 * get deliveryTime
	 */
	public Timestamp getDeliveryTime() {
		return this.deliveryTime;
	}

	public void setDeliveryTime(Timestamp deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	/**
	 * get logisticsId
	 */
	public Long getLogisticsId() {
		return this.logisticsId;
	}

	public void setLogisticsId(Long logisticsId) {
		this.logisticsId = logisticsId;
	}

	/**
	 * get logisticsName
	 */
	public String getLogisticsName() {
		return this.logisticsName;
	}

	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	/**
	 * get logisticsNo
	 */
	public String getLogisticsNo() {
		return this.logisticsNo;
	}

	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	/**
	 * get status
	 */
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
	 * get username
	 */
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
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
	 * get stationName
	 */
	public String getStationName() {
		return this.stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
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
	 * get logisticsImg
	 */
	public String getLogisticsImg() {
		return this.logisticsImg;
	}

	public void setLogisticsImg(String logisticsImg) {
		this.logisticsImg = logisticsImg;
	}

}
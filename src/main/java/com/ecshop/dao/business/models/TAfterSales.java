package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAfterSales entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_after_sales")
public class TAfterSales implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1390796796L;

	// Fields

	/**
	 * afterSalesId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "afterSalesId", unique = true, nullable = false)
	private Long afterSalesId;// get afterSalesId

	/**
	 * afterSalesNo:�ۺ󵥺�
	 */
	@Column(name = "afterSalesNo", length = 30)
	private String afterSalesNo;// get afterSalesNo

	/**
	 * afterSalesType:0:�˻� 1:���� 2�����˿� 3��ά��
	 */
	@Column(name = "afterSalesType")
	private Integer afterSalesType;// get afterSalesType

	/**
	 * orderGoodsId:
	 */
	@Column(name = "orderGoodsId")
	private Long orderGoodsId;// get orderGoodsId

	/**
	 * orderId:����ID
	 */
	@Column(name = "orderId")
	private Long orderId;// get orderId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * orderNumber:�������
	 */
	@Column(name = "orderNumber", length = 200)
	private String orderNumber;// get orderNumber

	/**
	 * afterSalesTime:�ۺ�����ʱ��
	 */
	@Column(name = "afterSalesTime", length = 19)
	private Timestamp afterSalesTime;// get afterSalesTime

	/**
	 * goodId:��ƷID
	 */
	@Column(name = "goodId")
	private Long goodId;// get goodId

	/**
	 * goodItemsId:��Ʒ��ID
	 */
	@Column(name = "goodItemsId")
	private Long goodItemsId;// get goodItemsId

	/**
	 * goodsName:��Ʒ���
	 */
	@Column(name = "goodsName", length = 100)
	private String goodsName;// get goodsName

	/**
	 * goodNum:��Ʒ����
	 */
	@Column(name = "goodNum")
	private Integer goodNum;// get goodNum

	/**
	 * goodsPic:��ƷͼƬ
	 */
	@Column(name = "goodsPic")
	private String goodsPic;// get goodsPic

	/**
	 * amount:�˿���
	 */
	@Column(name = "amount", precision = 15)
	private Double amount;// get amount

	/**
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * username:
	 */
	@Column(name = "username", length = 50)
	private String username;// get username

	/**
	 * status:0���ȴ����Ҵ��� 1���ȴ���Ҵ��� 2���ȴ�����ջ� 3���ȴ������ 4�����˿�
	 * 5���ѻ��� 6�����Ҿܾ�
	 */
	@Column(name = "status")
	private Integer status;// get status

	/**
	 * remark:
	 */
	@Column(name = "remark", length = 100)
	private String remark;// get remark

	/**
	 * isCalculateProfit:�Ƿ��Ѿ������˷��� 0:�� 1:�ǣ�����������Ϊ�˻��ͽ��˿�ʹ�ã�
	 */
	@Column(name = "isCalculateProfit")
	private Integer isCalculateProfit;// get isCalculateProfit

	/**
	 * calcTime:����ʱ��
	 */
	@Column(name = "calcTime", length = 19)
	private Timestamp calcTime;// get calcTime

	/**
	 * img1:
	 */
	@Column(name = "img1", length = 200)
	private String img1;// get img1

	/**
	 * img2:
	 */
	@Column(name = "img2", length = 200)
	private String img2;// get img2

	/**
	 * img3:
	 */
	@Column(name = "img3", length = 200)
	private String img3;// get img3

	/**
	 * img4:
	 */
	@Column(name = "img4", length = 200)
	private String img4;// get img4

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
	 * userLogisticsName:�û�������˾
	 */
	@Column(name = "userLogisticsName", length = 100)
	private String userLogisticsName;// get userLogisticsName

	/**
	 * userLogisticsNo:�û��������
	 */
	@Column(name = "userLogisticsNo", length = 32)
	private String userLogisticsNo;// get userLogisticsNo

	/**
	 * mallLogisticsName:�̼�������˾
	 */
	@Column(name = "mallLogisticsName", length = 100)
	private String mallLogisticsName;// get mallLogisticsName

	/**
	 * mallLogisticsNo:�̼��������
	 */
	@Column(name = "mallLogisticsNo", length = 32)
	private String mallLogisticsNo;// get mallLogisticsNo
	
	
	@Column(name = "confirmRefundTime", length = 19)
	private Timestamp confirmRefundTime;

	// Constructors

	/** default constructor */
	public TAfterSales() {
	}

	/** full constructor */
	public TAfterSales(String afterSalesNo, Integer afterSalesType,
			Long orderGoodsId, Long orderId, Long mallId, String orderNumber,
			Timestamp afterSalesTime, Long goodId, Long goodItemsId,
			String goodsName, Integer goodNum, String goodsPic, Double amount,
			Long userId, String username, Integer status, String remark,
			Integer isCalculateProfit, Timestamp calcTime, String img1,
			String img2, String img3, String img4, Double mallMoney,
			Double profitMoney, Integer mallCheckStatus,
			Timestamp mallsettlementTime, String userLogisticsName,
			String userLogisticsNo, String mallLogisticsName,
			String mallLogisticsNo,
			Timestamp confirmRefundTime) {
		this.afterSalesNo = afterSalesNo;
		this.afterSalesType = afterSalesType;
		this.orderGoodsId = orderGoodsId;
		this.orderId = orderId;
		this.mallId = mallId;
		this.orderNumber = orderNumber;
		this.afterSalesTime = afterSalesTime;
		this.goodId = goodId;
		this.goodItemsId = goodItemsId;
		this.goodsName = goodsName;
		this.goodNum = goodNum;
		this.goodsPic = goodsPic;
		this.amount = amount;
		this.userId = userId;
		this.username = username;
		this.status = status;
		this.remark = remark;
		this.isCalculateProfit = isCalculateProfit;
		this.calcTime = calcTime;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.img4 = img4;
		this.mallMoney = mallMoney;
		this.profitMoney = profitMoney;
		this.mallCheckStatus = mallCheckStatus;
		this.mallsettlementTime = mallsettlementTime;
		this.userLogisticsName = userLogisticsName;
		this.userLogisticsNo = userLogisticsNo;
		this.mallLogisticsName = mallLogisticsName;
		this.mallLogisticsNo = mallLogisticsNo;
		this.confirmRefundTime = confirmRefundTime;
	}

	// Property accessors
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
	 * get afterSalesNo
	 */
	public String getAfterSalesNo() {
		return this.afterSalesNo;
	}

	public void setAfterSalesNo(String afterSalesNo) {
		this.afterSalesNo = afterSalesNo;
	}

	/**
	 * get afterSalesType
	 */
	public Integer getAfterSalesType() {
		return this.afterSalesType;
	}

	public void setAfterSalesType(Integer afterSalesType) {
		this.afterSalesType = afterSalesType;
	}

	/**
	 * get orderGoodsId
	 */
	public Long getOrderGoodsId() {
		return this.orderGoodsId;
	}

	public void setOrderGoodsId(Long orderGoodsId) {
		this.orderGoodsId = orderGoodsId;
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
	 * get mallId
	 */
	public Long getMallId() {
		return this.mallId;
	}

	public void setMallId(Long mallId) {
		this.mallId = mallId;
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
	 * get afterSalesTime
	 */
	public Timestamp getAfterSalesTime() {
		return this.afterSalesTime;
	}

	public void setAfterSalesTime(Timestamp afterSalesTime) {
		this.afterSalesTime = afterSalesTime;
	}

	/**
	 * get goodId
	 */
	public Long getGoodId() {
		return this.goodId;
	}

	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}

	/**
	 * get goodItemsId
	 */
	public Long getGoodItemsId() {
		return this.goodItemsId;
	}

	public void setGoodItemsId(Long goodItemsId) {
		this.goodItemsId = goodItemsId;
	}

	/**
	 * get goodsName
	 */
	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * get goodNum
	 */
	public Integer getGoodNum() {
		return this.goodNum;
	}

	public void setGoodNum(Integer goodNum) {
		this.goodNum = goodNum;
	}

	/**
	 * get goodsPic
	 */
	public String getGoodsPic() {
		return this.goodsPic;
	}

	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}

	/**
	 * get amount
	 */
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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
	 * get username
	 */
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
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
	 * get img1
	 */
	public String getImg1() {
		return this.img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	/**
	 * get img2
	 */
	public String getImg2() {
		return this.img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	/**
	 * get img3
	 */
	public String getImg3() {
		return this.img3;
	}

	public void setImg3(String img3) {
		this.img3 = img3;
	}

	/**
	 * get img4
	 */
	public String getImg4() {
		return this.img4;
	}

	public void setImg4(String img4) {
		this.img4 = img4;
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
	 * get userLogisticsName
	 */
	public String getUserLogisticsName() {
		return this.userLogisticsName;
	}

	public void setUserLogisticsName(String userLogisticsName) {
		this.userLogisticsName = userLogisticsName;
	}

	/**
	 * get userLogisticsNo
	 */
	public String getUserLogisticsNo() {
		return this.userLogisticsNo;
	}

	public void setUserLogisticsNo(String userLogisticsNo) {
		this.userLogisticsNo = userLogisticsNo;
	}

	/**
	 * get mallLogisticsName
	 */
	public String getMallLogisticsName() {
		return this.mallLogisticsName;
	}

	public void setMallLogisticsName(String mallLogisticsName) {
		this.mallLogisticsName = mallLogisticsName;
	}

	/**
	 * get mallLogisticsNo
	 */
	public String getMallLogisticsNo() {
		return this.mallLogisticsNo;
	}

	public void setMallLogisticsNo(String mallLogisticsNo) {
		this.mallLogisticsNo = mallLogisticsNo;
	}

	public Timestamp getConfirmRefundTime() {
		return confirmRefundTime;
	}

	public void setConfirmRefundTime(Timestamp confirmRefundTime) {
		this.confirmRefundTime = confirmRefundTime;
	}
	
	

}
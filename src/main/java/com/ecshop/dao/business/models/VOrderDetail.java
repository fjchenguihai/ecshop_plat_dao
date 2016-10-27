package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VOrderDetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_order_detail")
public class VOrderDetail implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1071419145L;

	// Fields

	/**
	 * goodsSpec:
	 */
	@Column(name = "goodsSpec", length = 255)
	private String goodsSpec;// get goodsSpec
	
	/**
	 * orderGoodsId:
	 */
	@Id
	@Column(name = "orderGoodsId", nullable = false)
	private Long orderGoodsId;// get orderGoodsId

	/**
	 * goodsId:
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * goodsItemsId:
	 */
	@Column(name = "goodsItemsId")
	private Long goodsItemsId;// get goodsItemsId

	/**
	 * orderId:
	 */
	@Column(name = "orderId")
	private Long orderId;// get orderId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * goodsName:
	 */
	@Column(name = "goodsName", length = 50)
	private String goodsName;// get goodsName

	/**
	 * goodsNum:
	 */
	@Column(name = "goodsNum")
	private Integer goodsNum;// get goodsNum

	/**
	 * goodsPrice:
	 */
	@Column(name = "goodsPrice", precision = 15)
	private Double goodsPrice;// get goodsPrice

	/**
	 * goodsPic:
	 */
	@Column(name = "goodsPic")
	private String goodsPic;// get goodsPic

	/**
	 * afterSaleId:�ۺ�ID
	 */
	@Column(name = "afterSaleId")
	private Long afterSaleId;// get afterSaleId

	/**
	 * commentStatus:����״̬��0δ���ۣ�1������
	 */
	@Column(name = "commentStatus")
	private Integer commentStatus;// get commentStatus

	/**
	 * returnNum:���˻�����
	 */
	@Column(name = "returnNum")
	private Integer returnNum;// get returnNum

	/**
	 * deliveryNum:�ѷ�������
	 */
	@Column(name = "deliveryNum")
	private Integer deliveryNum;// get deliveryNum

	/**
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * stationId:
	 */
	@Column(name = "stationId")
	private Long stationId;// get stationId

	/**
	 * ordertime:
	 */
	@Column(name = "ordertime", length = 19)
	private Timestamp ordertime;// get ordertime

	/**
	 * mallName:
	 */
	@Column(name = "mallName", length = 50)
	private String mallName;// get mallName

	/**
	 * categoryId:
	 */
	@Column(name = "categoryId")
	private Long categoryId;// get categoryId

	/**
	 * mallGoodsName:
	 */
	@Column(name = "mallGoodsName", length = 100)
	private String mallGoodsName;// get mallGoodsName

	/**
	 * propertyJson:����json
	 */
	@Column(name = "propertyJson", length = 200)
	private String propertyJson;// get propertyJson

	/**
	 * specJson:���json
	 */
	@Column(name = "specJson", length = 200)
	private String specJson;// get specJson

	/**
	 * addtime:
	 */
	@Column(name = "addtime", length = 19)
	private Timestamp addtime;// get addtime

	/**
	 * salePrice:
	 */
	@Column(name = "salePrice", precision = 15)
	private Double salePrice;// get salePrice

	/**
	 * profitPercent:
	 */
	@Column(name = "profitPercent", precision = 15)
	private Double profitPercent;// get profitPercent

	/**
	 * goodsStatus:0��ʾ����ˣ�1��ʾ��2��ʾ��-1��ʾɾ��
	 */
	@Column(name = "goodsStatus")
	private Integer goodsStatus;// get goodsStatus

	/**
	 * goodsNo:
	 */
	@Column(name = "goodsNo", length = 30)
	private String goodsNo;// get goodsNo

	/**
	 * packList:
	 */
	@Column(name = "packList", length = 65535)
	private String packList;// get packList

	/**
	 * afterSale:
	 */
	@Column(name = "afterSale", length = 65535)
	private String afterSale;// get afterSale

	/**
	 * isFreeMail:
	 */
	@Column(name = "isFreeMail")
	private Integer isFreeMail;// get isFreeMail

	/**
	 * itemNo:��Ʒ���
	 */
	@Column(name = "itemNo", length = 20)
	private String itemNo;// get itemNo

	/**
	 * spec:���json��
	 */
	@Column(name = "spec", length = 200)
	private String spec;// get spec

	/**
	 * inventory:���
	 */
	@Column(name = "inventory")
	private Integer inventory;// get inventory

	/**
	 * marketPrice:�г��۸�
	 */
	@Column(name = "marketPrice", precision = 15)
	private Double marketPrice;// get marketPrice

	/**
	 * price:�������ռ�
	 */
	@Column(name = "price", precision = 15)
	private Double price;// get price

	/**
	 * deliveryGoodsId:
	 */
	@Column(name = "deliveryGoodsId")
	private Long deliveryGoodsId;// get deliveryGoodsId

	/**
	 * deliveryId:����id
	 */
	@Column(name = "deliveryId")
	private Long deliveryId;// get deliveryId

	/**
	 * afterSalesType:0:�˻� 1:���� 2�����˿� 3��ά��
	 */
	@Column(name = "afterSalesType")
	private Integer afterSalesType;// get afterSalesType

	/**
	 * status:0���ȴ����Ҵ��� 1���ȴ���Ҵ��� 2���ȴ�����ջ� 3���ȴ������ 4�����˿�
	 * 5���ѻ��� 6�����Ҿܾ�
	 */
	@Column(name = "status")
	private Integer status;// get status

	/**
	 * financeAuditStatus:�������״̬ 0������� 1�����ͨ�� 2����˲�ͨ��
	 */
	@Column(name = "financeAuditStatus")
	private Integer financeAuditStatus;// get financeAuditStatus

	/**
	 * auditRemark:����������
	 */
	@Column(name = "auditRemark", length = 100)
	private String auditRemark;// get auditRemark

	/**
	 * derivedStatus:������������״̬ 0��δ���� 1���ѵ���
	 */
	@Column(name = "derivedStatus")
	private Integer derivedStatus;// get derivedStatus

	// Constructors

	/** default constructor */
	public VOrderDetail() {
	}

	/** minimal constructor */
	public VOrderDetail(Long orderGoodsId) {
		this.orderGoodsId = orderGoodsId;
	}

	/** full constructor */
	public VOrderDetail(Long orderGoodsId, Long goodsId, Long goodsItemsId,
			Long orderId, Long mallId, String goodsName, Integer goodsNum,
			Double goodsPrice, String goodsPic, Long afterSaleId,
			Integer commentStatus, Integer returnNum, Integer deliveryNum,
			Long userId, Long stationId, Timestamp ordertime, String mallName,
			Long categoryId, String mallGoodsName, String propertyJson,
			String specJson, Timestamp addtime, Double salePrice,
			Double profitPercent, Integer goodsStatus, String goodsNo,
			String packList, String afterSale, Integer isFreeMail,
			String itemNo, String spec, Integer inventory, Double marketPrice,
			Double price, Long deliveryGoodsId, Long deliveryId,
			Integer afterSalesType, Integer status, Integer financeAuditStatus,
			String auditRemark, Integer derivedStatus) {
		this.orderGoodsId = orderGoodsId;
		this.goodsId = goodsId;
		this.goodsItemsId = goodsItemsId;
		this.orderId = orderId;
		this.mallId = mallId;
		this.goodsName = goodsName;
		this.goodsNum = goodsNum;
		this.goodsPrice = goodsPrice;
		this.goodsPic = goodsPic;
		this.afterSaleId = afterSaleId;
		this.commentStatus = commentStatus;
		this.returnNum = returnNum;
		this.deliveryNum = deliveryNum;
		this.userId = userId;
		this.stationId = stationId;
		this.ordertime = ordertime;
		this.mallName = mallName;
		this.categoryId = categoryId;
		this.mallGoodsName = mallGoodsName;
		this.propertyJson = propertyJson;
		this.specJson = specJson;
		this.addtime = addtime;
		this.salePrice = salePrice;
		this.profitPercent = profitPercent;
		this.goodsStatus = goodsStatus;
		this.goodsNo = goodsNo;
		this.packList = packList;
		this.afterSale = afterSale;
		this.isFreeMail = isFreeMail;
		this.itemNo = itemNo;
		this.spec = spec;
		this.inventory = inventory;
		this.marketPrice = marketPrice;
		this.price = price;
		this.deliveryGoodsId = deliveryGoodsId;
		this.deliveryId = deliveryId;
		this.afterSalesType = afterSalesType;
		this.status = status;
		this.financeAuditStatus = financeAuditStatus;
		this.auditRemark = auditRemark;
		this.derivedStatus = derivedStatus;
	}

	// Property accessors
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
	 * get goodsId
	 */
	public Long getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * get goodsItemsId
	 */
	public Long getGoodsItemsId() {
		return this.goodsItemsId;
	}

	public void setGoodsItemsId(Long goodsItemsId) {
		this.goodsItemsId = goodsItemsId;
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
	 * get goodsName
	 */
	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * get goodsNum
	 */
	public Integer getGoodsNum() {
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	/**
	 * get goodsPrice
	 */
	public Double getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
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
	 * get afterSaleId
	 */
	public Long getAfterSaleId() {
		return this.afterSaleId;
	}

	public void setAfterSaleId(Long afterSaleId) {
		this.afterSaleId = afterSaleId;
	}

	/**
	 * get commentStatus
	 */
	public Integer getCommentStatus() {
		return this.commentStatus;
	}

	public void setCommentStatus(Integer commentStatus) {
		this.commentStatus = commentStatus;
	}

	/**
	 * get returnNum
	 */
	public Integer getReturnNum() {
		return this.returnNum;
	}

	public void setReturnNum(Integer returnNum) {
		this.returnNum = returnNum;
	}

	/**
	 * get deliveryNum
	 */
	public Integer getDeliveryNum() {
		return this.deliveryNum;
	}

	public void setDeliveryNum(Integer deliveryNum) {
		this.deliveryNum = deliveryNum;
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
	 * get stationId
	 */
	public Long getStationId() {
		return this.stationId;
	}

	public void setStationId(Long stationId) {
		this.stationId = stationId;
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
	 * get mallName
	 */
	public String getMallName() {
		return this.mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	/**
	 * get categoryId
	 */
	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * get mallGoodsName
	 */
	public String getMallGoodsName() {
		return this.mallGoodsName;
	}

	public void setMallGoodsName(String mallGoodsName) {
		this.mallGoodsName = mallGoodsName;
	}

	/**
	 * get propertyJson
	 */
	public String getPropertyJson() {
		return this.propertyJson;
	}

	public void setPropertyJson(String propertyJson) {
		this.propertyJson = propertyJson;
	}

	/**
	 * get specJson
	 */
	public String getSpecJson() {
		return this.specJson;
	}

	public void setSpecJson(String specJson) {
		this.specJson = specJson;
	}

	/**
	 * get addtime
	 */
	public Timestamp getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	/**
	 * get salePrice
	 */
	public Double getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * get profitPercent
	 */
	public Double getProfitPercent() {
		return this.profitPercent;
	}

	public void setProfitPercent(Double profitPercent) {
		this.profitPercent = profitPercent;
	}

	/**
	 * get goodsStatus
	 */
	public Integer getGoodsStatus() {
		return this.goodsStatus;
	}

	public void setGoodsStatus(Integer goodsStatus) {
		this.goodsStatus = goodsStatus;
	}

	/**
	 * get goodsNo
	 */
	public String getGoodsNo() {
		return this.goodsNo;
	}

	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	/**
	 * get packList
	 */
	public String getPackList() {
		return this.packList;
	}

	public void setPackList(String packList) {
		this.packList = packList;
	}

	/**
	 * get afterSale
	 */
	public String getAfterSale() {
		return this.afterSale;
	}

	public void setAfterSale(String afterSale) {
		this.afterSale = afterSale;
	}

	/**
	 * get isFreeMail
	 */
	public Integer getIsFreeMail() {
		return this.isFreeMail;
	}

	public void setIsFreeMail(Integer isFreeMail) {
		this.isFreeMail = isFreeMail;
	}

	/**
	 * get itemNo
	 */
	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	/**
	 * get spec
	 */
	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	/**
	 * get inventory
	 */
	public Integer getInventory() {
		return this.inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	/**
	 * get marketPrice
	 */
	public Double getMarketPrice() {
		return this.marketPrice;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	/**
	 * get price
	 */
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * get deliveryGoodsId
	 */
	public Long getDeliveryGoodsId() {
		return this.deliveryGoodsId;
	}

	public void setDeliveryGoodsId(Long deliveryGoodsId) {
		this.deliveryGoodsId = deliveryGoodsId;
	}

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
	 * get afterSalesType
	 */
	public Integer getAfterSalesType() {
		return this.afterSalesType;
	}

	public void setAfterSalesType(Integer afterSalesType) {
		this.afterSalesType = afterSalesType;
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

	
	public String getGoodsSpec() {
		return goodsSpec;
	}

	public void setGoodsSpec(String goodsSpec) {
		this.goodsSpec = goodsSpec;
	}
	
}
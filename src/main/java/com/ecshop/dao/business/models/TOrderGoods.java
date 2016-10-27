package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TOrderGoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_order_goods")
public class TOrderGoods implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2107507740L;

	// Fields

	/**
	 * orderGoodsId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "orderGoodsId", unique = true, nullable = false)
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
	 * goodsSpec
	 */
	@Column(name = "goodsSpec")
	private String goodsSpec;// get goodsSpec

	// Constructors

	/** default constructor */
	public TOrderGoods() {
	}

	/** full constructor */
	public TOrderGoods(Long goodsId, Long goodsItemsId, Long orderId,
			Long mallId, String goodsName, Integer goodsNum, Double goodsPrice,
			String goodsPic, Long afterSaleId, Integer commentStatus,
			Integer returnNum, Integer deliveryNum, String goodsSpec) {
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
		this.goodsSpec = goodsSpec;
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
	 * get goodsSpec
	 */
	public String getGoodsSpec() {
		return this.goodsSpec;
	}

	public void setGoodsSpec(String goodsSpec) {
		this.goodsSpec = goodsSpec;
	}

}
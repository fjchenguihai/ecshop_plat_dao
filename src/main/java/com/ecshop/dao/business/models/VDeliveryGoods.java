package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VDeliveryGoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_delivery_goods")
public class VDeliveryGoods implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -75510004L;

	// Fields

	/**
	 * deliveryGoodsId:
	 */
	@Id
	@Column(name = "deliveryGoodsId", nullable = false)
	private Long deliveryGoodsId;// get deliveryGoodsId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * deliveryId:����id
	 */
	@Column(name = "deliveryId", nullable = false)
	private Long deliveryId;// get deliveryId

	/**
	 * orderId:����id
	 */
	@Column(name = "orderId", nullable = false)
	private Long orderId;// get orderId

	/**
	 * goodsId:��Ʒid
	 */
	@Column(name = "goodsId", nullable = false)
	private Long goodsId;// get goodsId

	/**
	 * goodsItemsId:��Ʒ��
	 */
	@Column(name = "goodsItemsId")
	private Long goodsItemsId;// get goodsItemsId

	/**
	 * goodsName:��Ʒ���
	 */
	@Column(name = "goodsName", length = 100)
	private String goodsName;// get goodsName

	/**
	 * goodsNum:��Ʒ����
	 */
	@Column(name = "goodsNum")
	private Integer goodsNum;// get goodsNum

	/**
	 * goodsPic:
	 */
	@Column(name = "goodsPic")
	private String goodsPic;// get goodsPic

	/**
	 * spec:���json��
	 */
	@Column(name = "spec", length = 200)
	private String spec;// get spec

	// Constructors

	/** default constructor */
	public VDeliveryGoods() {
	}

	/** minimal constructor */
	public VDeliveryGoods(Long deliveryGoodsId, Long deliveryId, Long orderId,
			Long goodsId) {
		this.deliveryGoodsId = deliveryGoodsId;
		this.deliveryId = deliveryId;
		this.orderId = orderId;
		this.goodsId = goodsId;
	}

	/** full constructor */
	public VDeliveryGoods(Long deliveryGoodsId, Long mallId, Long deliveryId,
			Long orderId, Long goodsId, Long goodsItemsId, String goodsName,
			Integer goodsNum, String goodsPic, String spec) {
		this.deliveryGoodsId = deliveryGoodsId;
		this.mallId = mallId;
		this.deliveryId = deliveryId;
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.goodsItemsId = goodsItemsId;
		this.goodsName = goodsName;
		this.goodsNum = goodsNum;
		this.goodsPic = goodsPic;
		this.spec = spec;
	}

	// Property accessors
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
	 * get mallId
	 */
	public Long getMallId() {
		return this.mallId;
	}

	public void setMallId(Long mallId) {
		this.mallId = mallId;
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
	 * get orderId
	 */
	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
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
	 * get goodsPic
	 */
	public String getGoodsPic() {
		return this.goodsPic;
	}

	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
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

}
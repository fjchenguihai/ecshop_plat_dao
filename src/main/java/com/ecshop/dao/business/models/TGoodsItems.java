package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TGoodsItems entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_goods_items")
public class TGoodsItems implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1646201214L;

	// Fields

	/**
	 * goodsItemsId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "goodsItemsId", unique = true, nullable = false)
	private Long goodsItemsId;// get goodsItemsId

	/**
	 * goodsId:��ƷID
	 */
	@Column(name = "goodsId", nullable = false)
	private Long goodsId;// get goodsId

	/**
	 * itemNo:��Ʒ���
	 */
	@Column(name = "itemNo", nullable = false, length = 20)
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
	 * status:״̬ 0������ 1����
	 */
	@Column(name = "status")
	private Short status;// get status

	// Constructors

	/** default constructor */
	public TGoodsItems() {
	}

	/** minimal constructor */
	public TGoodsItems(Long goodsId, String itemNo) {
		this.goodsId = goodsId;
		this.itemNo = itemNo;
	}

	/** full constructor */
	public TGoodsItems(Long goodsId, String itemNo, String spec,
			Integer inventory, Double marketPrice, Double price, Short status) {
		this.goodsId = goodsId;
		this.itemNo = itemNo;
		this.spec = spec;
		this.inventory = inventory;
		this.marketPrice = marketPrice;
		this.price = price;
		this.status = status;
	}

	// Property accessors
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
	 * get goodsId
	 */
	public Long getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
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
	 * get status
	 */
	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

}
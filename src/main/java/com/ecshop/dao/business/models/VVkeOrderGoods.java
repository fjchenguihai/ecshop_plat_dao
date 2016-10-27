package com.ecshop.dao.business.models;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VVkeOrderGoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_vke_order_goods")
public class VVkeOrderGoods implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1735136158L;

	// Fields

	/**
	 * userId:
	 */
	@Id
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * goodsId:
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * goodsName:
	 */
	@Column(name = "goodsName", length = 50)
	private String goodsName;// get goodsName

	/**
	 * goodsCount:
	 */
	@Column(name = "goodsCount", precision = 33, scale = 0)
	private BigDecimal goodsCount;// get goodsCount

	// Constructors

	/** default constructor */
	public VVkeOrderGoods() {
	}

	/** minimal constructor */
	public VVkeOrderGoods(Long userId) {
		this.userId = userId;
	}

	/** full constructor */
	public VVkeOrderGoods(Long userId, Long mallId, Long goodsId,
			String goodsName, BigDecimal goodsCount) {
		this.userId = userId;
		this.mallId = mallId;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsCount = goodsCount;
	}

	// Property accessors
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
	 * get goodsId
	 */
	public Long getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
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
	 * get goodsCount
	 */
	public BigDecimal getGoodsCount() {
		return this.goodsCount;
	}

	public void setGoodsCount(BigDecimal goodsCount) {
		this.goodsCount = goodsCount;
	}

}
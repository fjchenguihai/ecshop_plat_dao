package com.ecshop.dao.business.models;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VVkeQualList entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_vke_qual_list")
public class VVkeQualList implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -347596601L;

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

	/**
	 * condQty:��Ʒ����
	 */
	@Column(name = "condQty")
	private Integer condQty;// get condQty

	// Constructors

	/** default constructor */
	public VVkeQualList() {
	}

	/** minimal constructor */
	public VVkeQualList(Long userId) {
		this.userId = userId;
	}

	/** full constructor */
	public VVkeQualList(Long userId, Long mallId, Long goodsId,
			String goodsName, BigDecimal goodsCount, Integer condQty) {
		this.userId = userId;
		this.mallId = mallId;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsCount = goodsCount;
		this.condQty = condQty;
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

	/**
	 * get condQty
	 */
	public Integer getCondQty() {
		return this.condQty;
	}

	public void setCondQty(Integer condQty) {
		this.condQty = condQty;
	}

}
package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VVkeQualUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_vke_qual_user")
public class VVkeQualUser implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -347319308L;

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
	 * goodsQual:
	 */
	@Column(name = "goodsQual", nullable = false)
	private Integer goodsQual;// get goodsQual

	// Constructors

	/** default constructor */
	public VVkeQualUser() {
	}

	/** minimal constructor */
	public VVkeQualUser(Long userId, Integer goodsQual) {
		this.userId = userId;
		this.goodsQual = goodsQual;
	}

	/** full constructor */
	public VVkeQualUser(Long userId, Long mallId, Integer goodsQual) {
		this.userId = userId;
		this.mallId = mallId;
		this.goodsQual = goodsQual;
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
	 * get goodsQual
	 */
	public Integer getGoodsQual() {
		return this.goodsQual;
	}

	public void setGoodsQual(Integer goodsQual) {
		this.goodsQual = goodsQual;
	}

}
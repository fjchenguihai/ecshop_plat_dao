package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VVkeOrderAmount entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_vke_order_amount")
public class VVkeOrderAmount implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1871748300L;

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
	 * amount:
	 */
	@Column(name = "amount", precision = 48)
	private Double amount;// get amount

	// Constructors

	/** default constructor */
	public VVkeOrderAmount() {
	}

	/** minimal constructor */
	public VVkeOrderAmount(Long userId) {
		this.userId = userId;
	}

	/** full constructor */
	public VVkeOrderAmount(Long userId, Long mallId, Double amount) {
		this.userId = userId;
		this.mallId = mallId;
		this.amount = amount;
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
	 * get amount
	 */
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
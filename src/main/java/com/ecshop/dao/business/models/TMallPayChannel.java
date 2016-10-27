package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallPayChannel entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_pay_channel")
public class TMallPayChannel implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 140171747L;

	// Fields

	/**
	 * id:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;// get id

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * paymentTypeId:
	 */
	@Column(name = "PaymentTypeId")
	private Long paymentTypeId;// get paymentTypeId

	// Constructors

	/** default constructor */
	public TMallPayChannel() {
	}

	/** full constructor */
	public TMallPayChannel(Long mallId, Long paymentTypeId) {
		this.mallId = mallId;
		this.paymentTypeId = paymentTypeId;
	}

	// Property accessors
	/**
	 * get id
	 */
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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
	 * get paymentTypeId
	 */
	public Long getPaymentTypeId() {
		return this.paymentTypeId;
	}

	public void setPaymentTypeId(Long paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

}
package com.ecshop.dao.business.models;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMoney entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_money")
public class TMoney implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1815591732L;

	// Fields

	/**
	 * mallId:
	 */
	@Id
	@Column(name = "mallId", unique = true, nullable = false)
	private Long mallId;// get mallId

	/**
	 * useMoney:
	 */
	@Column(name = "useMoney", precision = 15)
	private Double useMoney;// get useMoney

	/**
	 * promiseMoney:
	 */
	@Column(name = "promiseMoney", precision = 15)
	private Double promiseMoney;// get promiseMoney

	/**
	 * frozenMoney:
	 */
	@Column(name = "FrozenMoney", precision = 15)
	private Double frozenMoney;// get frozenMoney

	// Constructors

	/** default constructor */
	public TMoney() {
	}

	/** full constructor */
	public TMoney(Double useMoney, Double promiseMoney, Double frozenMoney) {
		this.useMoney = useMoney;
		this.promiseMoney = promiseMoney;
		this.frozenMoney = frozenMoney;
	}

	// Property accessors
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
	 * get useMoney
	 */
	public Double getUseMoney() {
		return this.useMoney;
	}

	public void setUseMoney(Double useMoney) {
		this.useMoney = useMoney;
	}

	/**
	 * get promiseMoney
	 */
	public Double getPromiseMoney() {
		return this.promiseMoney;
	}

	public void setPromiseMoney(Double promiseMoney) {
		this.promiseMoney = promiseMoney;
	}

	/**
	 * get frozenMoney
	 */
	public Double getFrozenMoney() {
		return this.frozenMoney;
	}

	public void setFrozenMoney(Double frozenMoney) {
		this.frozenMoney = frozenMoney;
	}

}
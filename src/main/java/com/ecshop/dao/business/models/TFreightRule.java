package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TFreightRule entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_freight_rule")
public class TFreightRule implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 545669099L;

	// Fields

	/**
	 * ruleId:����ID
	 */
	@Id
	@Column(name = "ruleId", unique = true, nullable = false)
	private Long ruleId;// get ruleId

	/**
	 * freight:Ĭ���˷ѽ��
	 */
	@Column(name = "freight")
	private Integer freight;// get freight

	/**
	 * freeAmount:���˷ѵĽ��
	 */
	@Column(name = "freeAmount")
	private Integer freeAmount;// get freeAmount

	/**
	 * mallId:�̼�ID
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * isDefault:�Ƿ�Ϊ�̼�Ĭ���˷ѹ���
	 */
	@Column(name = "isDefault")
	private Boolean isDefault;// get isDefault

	// Constructors

	/** default constructor */
	public TFreightRule() {
	}

	/** minimal constructor */
	public TFreightRule(Long ruleId) {
		this.ruleId = ruleId;
	}

	/** full constructor */
	public TFreightRule(Long ruleId, Integer freight, Integer freeAmount,
			Long mallId, Boolean isDefault) {
		this.ruleId = ruleId;
		this.freight = freight;
		this.freeAmount = freeAmount;
		this.mallId = mallId;
		this.isDefault = isDefault;
	}

	// Property accessors
	/**
	 * get ruleId
	 */
	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	/**
	 * get freight
	 */
	public Integer getFreight() {
		return this.freight;
	}

	public void setFreight(Integer freight) {
		this.freight = freight;
	}

	/**
	 * get freeAmount
	 */
	public Integer getFreeAmount() {
		return this.freeAmount;
	}

	public void setFreeAmount(Integer freeAmount) {
		this.freeAmount = freeAmount;
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
	 * get isDefault
	 */
	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

}
package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TBankConfig entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_bank_config")
public class TBankConfig implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 998792210L;

	// Fields

	/**
	 * bankId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "bankId", unique = true, nullable = false)
	private Long bankId;// get bankId

	/**
	 * bankName:�������
	 */
	@Column(name = "bankName", nullable = false, length = 100)
	private String bankName;// get bankName

	// Constructors

	/** default constructor */
	public TBankConfig() {
	}

	/** full constructor */
	public TBankConfig(String bankName) {
		this.bankName = bankName;
	}

	// Property accessors
	/**
	 * get bankId
	 */
	public Long getBankId() {
		return this.bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	/**
	 * get bankName
	 */
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
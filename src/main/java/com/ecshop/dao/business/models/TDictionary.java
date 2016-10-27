package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TDictionary entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_dictionary")
public class TDictionary implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1820455946L;

	// Fields

	/**
	 * dictionaryId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "dictionaryId", unique = true, nullable = false)
	private Integer dictionaryId;// get dictionaryId

	/**
	 * dictionaryType:�ֵ�����
	 */
	@Column(name = "dictionaryType", nullable = false)
	private Integer dictionaryType;// get dictionaryType

	/**
	 * dictionaryCode:�ֵ����
	 */
	@Column(name = "dictionaryCode", length = 50)
	private String dictionaryCode;// get dictionaryCode

	/**
	 * dictionaryTypeDesc:�ֵ���������
	 */
	@Column(name = "dictionaryTypeDesc", nullable = false, length = 100)
	private String dictionaryTypeDesc;// get dictionaryTypeDesc

	/**
	 * dictionaryValue:�ֵ�ֵ
	 */
	@Column(name = "dictionaryValue", nullable = false, length = 50)
	private String dictionaryValue;// get dictionaryValue

	/**
	 * dictionaryDesc:����
	 */
	@Column(name = "dictionaryDesc", nullable = false, length = 100)
	private String dictionaryDesc;// get dictionaryDesc

	// Constructors

	/** default constructor */
	public TDictionary() {
	}

	/** minimal constructor */
	public TDictionary(Integer dictionaryType, String dictionaryTypeDesc,
			String dictionaryValue, String dictionaryDesc) {
		this.dictionaryType = dictionaryType;
		this.dictionaryTypeDesc = dictionaryTypeDesc;
		this.dictionaryValue = dictionaryValue;
		this.dictionaryDesc = dictionaryDesc;
	}

	/** full constructor */
	public TDictionary(Integer dictionaryType, String dictionaryCode,
			String dictionaryTypeDesc, String dictionaryValue,
			String dictionaryDesc) {
		this.dictionaryType = dictionaryType;
		this.dictionaryCode = dictionaryCode;
		this.dictionaryTypeDesc = dictionaryTypeDesc;
		this.dictionaryValue = dictionaryValue;
		this.dictionaryDesc = dictionaryDesc;
	}

	// Property accessors
	/**
	 * get dictionaryId
	 */
	public Integer getDictionaryId() {
		return this.dictionaryId;
	}

	public void setDictionaryId(Integer dictionaryId) {
		this.dictionaryId = dictionaryId;
	}

	/**
	 * get dictionaryType
	 */
	public Integer getDictionaryType() {
		return this.dictionaryType;
	}

	public void setDictionaryType(Integer dictionaryType) {
		this.dictionaryType = dictionaryType;
	}

	/**
	 * get dictionaryCode
	 */
	public String getDictionaryCode() {
		return this.dictionaryCode;
	}

	public void setDictionaryCode(String dictionaryCode) {
		this.dictionaryCode = dictionaryCode;
	}

	/**
	 * get dictionaryTypeDesc
	 */
	public String getDictionaryTypeDesc() {
		return this.dictionaryTypeDesc;
	}

	public void setDictionaryTypeDesc(String dictionaryTypeDesc) {
		this.dictionaryTypeDesc = dictionaryTypeDesc;
	}

	/**
	 * get dictionaryValue
	 */
	public String getDictionaryValue() {
		return this.dictionaryValue;
	}

	public void setDictionaryValue(String dictionaryValue) {
		this.dictionaryValue = dictionaryValue;
	}

	/**
	 * get dictionaryDesc
	 */
	public String getDictionaryDesc() {
		return this.dictionaryDesc;
	}

	public void setDictionaryDesc(String dictionaryDesc) {
		this.dictionaryDesc = dictionaryDesc;
	}

}
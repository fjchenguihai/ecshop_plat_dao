package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TConfig entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_config")
public class TConfig implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -735059786L;

	// Fields

	/**
	 * configId:����ID����:vve.maxaliance
	 */
	@Id
	@Column(name = "configId", unique = true, nullable = false, length = 100)
	private String configId;// get configId

	/**
	 * configTitle:�����������
	 */
	@Column(name = "configTitle", length = 100)
	private String configTitle;// get configTitle

	/**
	 * configValue:����ֵ
	 */
	@Column(name = "configValue", length = 1024)
	private String configValue;// get configValue

	// Constructors

	/** default constructor */
	public TConfig() {
	}

	/** minimal constructor */
	public TConfig(String configId) {
		this.configId = configId;
	}

	/** full constructor */
	public TConfig(String configId, String configTitle, String configValue) {
		this.configId = configId;
		this.configTitle = configTitle;
		this.configValue = configValue;
	}

	// Property accessors
	/**
	 * get configId
	 */
	public String getConfigId() {
		return this.configId;
	}

	public void setConfigId(String configId) {
		this.configId = configId;
	}

	/**
	 * get configTitle
	 */
	public String getConfigTitle() {
		return this.configTitle;
	}

	public void setConfigTitle(String configTitle) {
		this.configTitle = configTitle;
	}

	/**
	 * get configValue
	 */
	public String getConfigValue() {
		return this.configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

}
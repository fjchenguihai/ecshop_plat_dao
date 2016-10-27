package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TLogistics entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_logistics")
public class TLogistics implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 962992159L;

	// Fields

	/**
	 * logisticsId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "logisticsId", unique = true, nullable = false)
	private Long logisticsId;// get logisticsId

	/**
	 * logisticsName:
	 */
	@Column(name = "logisticsName", nullable = false, length = 100)
	private String logisticsName;// get logisticsName

	/**
	 * logisticsImg:
	 */
	@Column(name = "logisticsImg", length = 100)
	private String logisticsImg;// get logisticsImg

	// Constructors

	/** default constructor */
	public TLogistics() {
	}

	/** minimal constructor */
	public TLogistics(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	/** full constructor */
	public TLogistics(String logisticsName, String logisticsImg) {
		this.logisticsName = logisticsName;
		this.logisticsImg = logisticsImg;
	}

	// Property accessors
	/**
	 * get logisticsId
	 */
	public Long getLogisticsId() {
		return this.logisticsId;
	}

	public void setLogisticsId(Long logisticsId) {
		this.logisticsId = logisticsId;
	}

	/**
	 * get logisticsName
	 */
	public String getLogisticsName() {
		return this.logisticsName;
	}

	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	/**
	 * get logisticsImg
	 */
	public String getLogisticsImg() {
		return this.logisticsImg;
	}

	public void setLogisticsImg(String logisticsImg) {
		this.logisticsImg = logisticsImg;
	}

}
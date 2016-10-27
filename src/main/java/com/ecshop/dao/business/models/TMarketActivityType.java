package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMarketActivityType entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_market_activity_type")
public class TMarketActivityType implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -930016071L;

	// Fields

	/**
	 * marketActivityTypeId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "marketActivityTypeId", unique = true, nullable = false)
	private Long marketActivityTypeId;// get marketActivityTypeId

	/**
	 * marketActivityTypeCode:
	 */
	@Column(name = "marketActivityTypeCode", length = 50)
	private String marketActivityTypeCode;// get marketActivityTypeCode

	/**
	 * marketActivityTypeName:
	 */
	@Column(name = "marketActivityTypeName", length = 50)
	private String marketActivityTypeName;// get marketActivityTypeName

	/**
	 * creTime:
	 */
	@Column(name = "creTime", length = 19)
	private Timestamp creTime;// get creTime

	// Constructors

	/** default constructor */
	public TMarketActivityType() {
	}

	/** full constructor */
	public TMarketActivityType(String marketActivityTypeCode,
			String marketActivityTypeName, Timestamp creTime) {
		this.marketActivityTypeCode = marketActivityTypeCode;
		this.marketActivityTypeName = marketActivityTypeName;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get marketActivityTypeId
	 */
	public Long getMarketActivityTypeId() {
		return this.marketActivityTypeId;
	}

	public void setMarketActivityTypeId(Long marketActivityTypeId) {
		this.marketActivityTypeId = marketActivityTypeId;
	}

	/**
	 * get marketActivityTypeCode
	 */
	public String getMarketActivityTypeCode() {
		return this.marketActivityTypeCode;
	}

	public void setMarketActivityTypeCode(String marketActivityTypeCode) {
		this.marketActivityTypeCode = marketActivityTypeCode;
	}

	/**
	 * get marketActivityTypeName
	 */
	public String getMarketActivityTypeName() {
		return this.marketActivityTypeName;
	}

	public void setMarketActivityTypeName(String marketActivityTypeName) {
		this.marketActivityTypeName = marketActivityTypeName;
	}

	/**
	 * get creTime
	 */
	public Timestamp getCreTime() {
		return this.creTime;
	}

	public void setCreTime(Timestamp creTime) {
		this.creTime = creTime;
	}

}
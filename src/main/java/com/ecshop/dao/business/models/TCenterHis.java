package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCenterHis entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_center_his")
public class TCenterHis implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2021437705L;

	// Fields

	/**
	 * centerHisId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "centerHisId", unique = true, nullable = false)
	private Long centerHisId;// get centerHisId

	/**
	 * centerId:
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	/**
	 * upCenterId:
	 */
	@Column(name = "upCenterId")
	private Long upCenterId;// get upCenterId

	/**
	 * validTime:
	 */
	@Column(name = "validTime", length = 19)
	private Timestamp validTime;// get validTime

	/**
	 * invalidTime:
	 */
	@Column(name = "invalidTime", length = 19)
	private Timestamp invalidTime;// get invalidTime

	// Constructors

	/** default constructor */
	public TCenterHis() {
	}

	/** full constructor */
	public TCenterHis(Long centerId, Long upCenterId, Timestamp validTime,
			Timestamp invalidTime) {
		this.centerId = centerId;
		this.upCenterId = upCenterId;
		this.validTime = validTime;
		this.invalidTime = invalidTime;
	}

	// Property accessors
	/**
	 * get centerHisId
	 */
	public Long getCenterHisId() {
		return this.centerHisId;
	}

	public void setCenterHisId(Long centerHisId) {
		this.centerHisId = centerHisId;
	}

	/**
	 * get centerId
	 */
	public Long getCenterId() {
		return this.centerId;
	}

	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}

	/**
	 * get upCenterId
	 */
	public Long getUpCenterId() {
		return this.upCenterId;
	}

	public void setUpCenterId(Long upCenterId) {
		this.upCenterId = upCenterId;
	}

	/**
	 * get validTime
	 */
	public Timestamp getValidTime() {
		return this.validTime;
	}

	public void setValidTime(Timestamp validTime) {
		this.validTime = validTime;
	}

	/**
	 * get invalidTime
	 */
	public Timestamp getInvalidTime() {
		return this.invalidTime;
	}

	public void setInvalidTime(Timestamp invalidTime) {
		this.invalidTime = invalidTime;
	}

}
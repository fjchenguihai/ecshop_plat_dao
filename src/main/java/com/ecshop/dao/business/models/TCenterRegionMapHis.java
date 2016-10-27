package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCenterRegionMapHis entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_center_region_map_his")
public class TCenterRegionMapHis implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1431129363L;

	// Fields

	/**
	 * centerRegionMapHisId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "centerRegionMapHisId", unique = true, nullable = false)
	private Long centerRegionMapHisId;// get centerRegionMapHisId

	/**
	 * centerId:
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	/**
	 * regionId:
	 */
	@Column(name = "regionId")
	private Integer regionId;// get regionId

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
	public TCenterRegionMapHis() {
	}

	/** full constructor */
	public TCenterRegionMapHis(Long centerId, Integer regionId,
			Timestamp validTime, Timestamp invalidTime) {
		this.centerId = centerId;
		this.regionId = regionId;
		this.validTime = validTime;
		this.invalidTime = invalidTime;
	}

	// Property accessors
	/**
	 * get centerRegionMapHisId
	 */
	public Long getCenterRegionMapHisId() {
		return this.centerRegionMapHisId;
	}

	public void setCenterRegionMapHisId(Long centerRegionMapHisId) {
		this.centerRegionMapHisId = centerRegionMapHisId;
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
	 * get regionId
	 */
	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
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
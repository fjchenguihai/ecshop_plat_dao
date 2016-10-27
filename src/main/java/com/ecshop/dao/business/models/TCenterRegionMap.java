package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCenterRegionMap entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_center_region_map")
public class TCenterRegionMap implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1603986945L;

	// Fields

	/**
	 * centerRegionMapId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "centerRegionMapId", unique = true, nullable = false)
	private Long centerRegionMapId;// get centerRegionMapId

	/**
	 * centerId:
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	/**
	 * regionId
	 */
	@Column(name = "regionId")
	private Integer regionId;// get regionId

	/**
	 * cityId
	 */
	@Column(name = "cityId")
	private Integer cityId;// get cityId

	// Constructors

	/** default constructor */
	public TCenterRegionMap() {
	}

	/** full constructor */
	public TCenterRegionMap(Long centerId, Integer regionId, Integer cityId) {
		this.centerId = centerId;
		this.regionId = regionId;
		this.cityId = cityId;
	}

	// Property accessors
	/**
	 * get centerRegionMapId
	 */
	public Long getCenterRegionMapId() {
		return this.centerRegionMapId;
	}

	public void setCenterRegionMapId(Long centerRegionMapId) {
		this.centerRegionMapId = centerRegionMapId;
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
	 * get cityId
	 */
	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TSubstation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_substation")
public class TSubstation implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 624967272L;

	// Fields

	/**
	 * stationId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "stationId", unique = true, nullable = false)
	private Long stationId;// get stationId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * stationName:
	 */
	@Column(name = "stationName", length = 100)
	private String stationName;// get stationName

	/**
	 * stationType:0��վ���̼����ҽ�ֻ��һ������1��վ
	 */
	@Column(name = "stationType", nullable = false)
	private Integer stationType;// get stationType

	/**
	 * provinceId:
	 */
	@Column(name = "provinceId")
	private Integer provinceId;// get provinceId

	/**
	 * cityId:
	 */
	@Column(name = "cityId")
	private Integer cityId;// get cityId

	/**
	 * districtId:
	 */
	@Column(name = "districtId")
	private Integer districtId;// get districtId

	/**
	 * creTime:
	 */
	@Column(name = "creTime", length = 19)
	private Timestamp creTime;// get creTime

	/**
	 * expireTime:
	 */
	@Column(name = "expireTime", length = 19)
	private Timestamp expireTime;// get expireTime

	/**
	 * status:0:�ر� 1����
	 */
	@Column(name = "status")
	private Integer status;// get status

	/**
	 * remark:
	 */
	@Column(name = "remark", length = 200)
	private String remark;// get remark

	// Constructors

	/** default constructor */
	public TSubstation() {
	}

	/** minimal constructor */
	public TSubstation(Integer stationType) {
		this.stationType = stationType;
	}

	/** full constructor */
	public TSubstation(Long mallId, String stationName, Integer stationType,
			Integer provinceId, Integer cityId, Integer districtId,
			Timestamp creTime, Timestamp expireTime, Integer status,
			String remark) {
		this.mallId = mallId;
		this.stationName = stationName;
		this.stationType = stationType;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.districtId = districtId;
		this.creTime = creTime;
		this.expireTime = expireTime;
		this.status = status;
		this.remark = remark;
	}

	// Property accessors
	/**
	 * get stationId
	 */
	public Long getStationId() {
		return this.stationId;
	}

	public void setStationId(Long stationId) {
		this.stationId = stationId;
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
	 * get stationName
	 */
	public String getStationName() {
		return this.stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	/**
	 * get stationType
	 */
	public Integer getStationType() {
		return this.stationType;
	}

	public void setStationType(Integer stationType) {
		this.stationType = stationType;
	}

	/**
	 * get provinceId
	 */
	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
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

	/**
	 * get districtId
	 */
	public Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
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

	/**
	 * get expireTime
	 */
	public Timestamp getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Timestamp expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * get status
	 */
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * get remark
	 */
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
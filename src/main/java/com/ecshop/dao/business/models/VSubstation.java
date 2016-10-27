package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VSubstation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_substation")
public class VSubstation implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1326031850L;

	// Fields

	/**
	 * stationId:
	 */
	@Id
	@Column(name = "stationId", nullable = false)
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

	/**
	 * mallName:
	 */
	@Column(name = "mallName", length = 50)
	private String mallName;// get mallName

	/**
	 * mallType:0����ͨ 1����Ӫ
	 */
	@Column(name = "mallType")
	private Integer mallType;// get mallType

	/**
	 * mallNo:
	 */
	@Column(name = "mallNo", length = 20)
	private String mallNo;// get mallNo

	/**
	 * provinceName:�����������
	 */
	@Column(name = "provinceName", length = 50)
	private String provinceName;// get provinceName

	/**
	 * cityName:�����������
	 */
	@Column(name = "cityName", length = 50)
	private String cityName;// get cityName

	/**
	 * districtName:�����������
	 */
	@Column(name = "districtName", length = 50)
	private String districtName;// get districtName

	// Constructors

	/** default constructor */
	public VSubstation() {
	}

	/** minimal constructor */
	public VSubstation(Long stationId, Integer stationType) {
		this.stationId = stationId;
		this.stationType = stationType;
	}

	/** full constructor */
	public VSubstation(Long stationId, Long mallId, String stationName,
			Integer stationType, Integer provinceId, Integer cityId,
			Integer districtId, Timestamp creTime, Timestamp expireTime,
			Integer status, String remark, String mallName, Integer mallType,
			String mallNo, String provinceName, String cityName,
			String districtName) {
		this.stationId = stationId;
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
		this.mallName = mallName;
		this.mallType = mallType;
		this.mallNo = mallNo;
		this.provinceName = provinceName;
		this.cityName = cityName;
		this.districtName = districtName;
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

	/**
	 * get mallName
	 */
	public String getMallName() {
		return this.mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	/**
	 * get mallType
	 */
	public Integer getMallType() {
		return this.mallType;
	}

	public void setMallType(Integer mallType) {
		this.mallType = mallType;
	}

	/**
	 * get mallNo
	 */
	public String getMallNo() {
		return this.mallNo;
	}

	public void setMallNo(String mallNo) {
		this.mallNo = mallNo;
	}

	/**
	 * get provinceName
	 */
	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	/**
	 * get cityName
	 */
	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * get districtName
	 */
	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

}
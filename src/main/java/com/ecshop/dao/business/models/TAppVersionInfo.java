package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAppVersionInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_app_version_info")
public class TAppVersionInfo implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 416395833L;

	// Fields

	/**
	 * appVersionId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "appVersionId", unique = true, nullable = false)
	private Long appVersionId;// get appVersionId

	/**
	 * appName:
	 */
	@Column(name = "appName", length = 100)
	private String appName;// get appName

	/**
	 * appType:(1-android 2-ios)
	 */
	@Column(name = "appType", nullable = false)
	private Integer appType;// get appType

	/**
	 * appVersionCode:
	 */
	@Column(name = "appVersionCode", nullable = false, length = 20)
	private String appVersionCode;// get appVersionCode

	/**
	 * isForce:(1- 2-)
	 */
	@Column(name = "isForce", nullable = false)
	private Integer isForce;// get isForce

	/**
	 * url:
	 */
	@Column(name = "url", nullable = false, length = 1024)
	private String url;// get url

	/**
	 * createTime:
	 */
	@Column(name = "createTime", length = 19)
	private Timestamp createTime;// get createTime

	/**
	 * memo:()
	 */
	@Column(name = "memo", length = 500)
	private String memo;// get memo

	/**
	 * upAppVersionId:
	 */
	@Column(name = "upAppVersionId")
	private Long upAppVersionId;// get upAppVersionId

	// Constructors

	/** default constructor */
	public TAppVersionInfo() {
	}

	/** minimal constructor */
	public TAppVersionInfo(Integer appType, String appVersionCode,
			Integer isForce, String url) {
		this.appType = appType;
		this.appVersionCode = appVersionCode;
		this.isForce = isForce;
		this.url = url;
	}

	/** full constructor */
	public TAppVersionInfo(String appName, Integer appType,
			String appVersionCode, Integer isForce, String url,
			Timestamp createTime, String memo, Long upAppVersionId) {
		this.appName = appName;
		this.appType = appType;
		this.appVersionCode = appVersionCode;
		this.isForce = isForce;
		this.url = url;
		this.createTime = createTime;
		this.memo = memo;
		this.upAppVersionId = upAppVersionId;
	}

	// Property accessors
	/**
	 * get appVersionId
	 */
	public Long getAppVersionId() {
		return this.appVersionId;
	}

	public void setAppVersionId(Long appVersionId) {
		this.appVersionId = appVersionId;
	}

	/**
	 * get appName
	 */
	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * get appType
	 */
	public Integer getAppType() {
		return this.appType;
	}

	public void setAppType(Integer appType) {
		this.appType = appType;
	}

	/**
	 * get appVersionCode
	 */
	public String getAppVersionCode() {
		return this.appVersionCode;
	}

	public void setAppVersionCode(String appVersionCode) {
		this.appVersionCode = appVersionCode;
	}

	/**
	 * get isForce
	 */
	public Integer getIsForce() {
		return this.isForce;
	}

	public void setIsForce(Integer isForce) {
		this.isForce = isForce;
	}

	/**
	 * get url
	 */
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * get createTime
	 */
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	/**
	 * get memo
	 */
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * get upAppVersionId
	 */
	public Long getUpAppVersionId() {
		return this.upAppVersionId;
	}

	public void setUpAppVersionId(Long upAppVersionId) {
		this.upAppVersionId = upAppVersionId;
	}

}
package com.ecshop.dao.business.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Transient;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TResources entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_resources")
public class TResources implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 693632049L;

	// Fields

	/**
	 * resourcesId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ResourcesId", unique = true, nullable = false)
	private Long resourcesId;// get resourcesId

	/**
	 * resourcesName:
	 */
	@Column(name = "ResourcesName", nullable = false, length = 50)
	private String resourcesName;// get resourcesName

	/**
	 * upResourcesId:
	 */
	@Column(name = "UpResourcesId", nullable = false)
	private Long upResourcesId;// get upResourcesId
	
	@Transient
	private String upResourcesName;// get upResourcesId

	/**
	 * resourcesKey:
	 */
	@Column(name = "ResourcesKey", nullable = false, length = 100)
	private String resourcesKey;// get resourcesKey

	/**
	 * type:0��ʾ���˵���1��ʾ�Ӳ˵���2��ʾ��ť
	 */
	@Column(name = "Type", nullable = false)
	private Integer type;// get type

	/**
	 * url:
	 */
	@Column(name = "Url", nullable = false, length = 200)
	private String url;// get url

	/**
	 * resourcesLevel:
	 */
	@Column(name = "ResourcesLevel")
	private Integer resourcesLevel;// get resourcesLevel
	
	/**
	 * orderno:
	 */
	@Column(name = "orderNo")
	private Integer orderNo;//排序
	
	/**
	 * remarks:
	 */
	@Column(name = "appId")
	private Integer appId;// get remarks

	/**
	 * remarks:
	 */
	@Column(name = "Remarks", length = 65535)
	private String remarks;// get remarks
	
	@Transient
	private List<TResources> resList;

	// Constructors

	/** default constructor */
	public TResources() {
	}

	/** minimal constructor */
	public TResources(String resourcesName, Long upResourcesId,
			String resourcesKey, Integer type, String url) {
		this.resourcesName = resourcesName;
		this.upResourcesId = upResourcesId;
		this.resourcesKey = resourcesKey;
		this.type = type;
		this.url = url;
	}

	/** full constructor */
	public TResources(String resourcesName, Long upResourcesId,
			String resourcesKey, Integer type, String url,
			Integer resourcesLevel, String remarks) {
		this.resourcesName = resourcesName;
		this.upResourcesId = upResourcesId;
		this.resourcesKey = resourcesKey;
		this.type = type;
		this.url = url;
		this.resourcesLevel = resourcesLevel;
		this.remarks = remarks;
	}

	// Property accessors
	/**
	 * get resourcesId
	 */
	public Long getResourcesId() {
		return this.resourcesId;
	}

	public void setResourcesId(Long resourcesId) {
		this.resourcesId = resourcesId;
	}

	/**
	 * get resourcesName
	 */
	public String getResourcesName() {
		return this.resourcesName;
	}

	public void setResourcesName(String resourcesName) {
		this.resourcesName = resourcesName;
	}

	/**
	 * get upResourcesId
	 */
	public Long getUpResourcesId() {
		return this.upResourcesId;
	}

	public void setUpResourcesId(Long upResourcesId) {
		this.upResourcesId = upResourcesId;
	}

	/**
	 * get resourcesKey
	 */
	public String getResourcesKey() {
		return this.resourcesKey;
	}

	public void setResourcesKey(String resourcesKey) {
		this.resourcesKey = resourcesKey;
	}

	/**
	 * get type
	 */
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
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
	 * get resourcesLevel
	 */
	public Integer getResourcesLevel() {
		return this.resourcesLevel;
	}

	public void setResourcesLevel(Integer resourcesLevel) {
		this.resourcesLevel = resourcesLevel;
	}

	/**
	 * get remarks
	 */
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getUpResourcesName() {
		return upResourcesName;
	}

	public void setUpResourcesName(String upResourcesName) {
		this.upResourcesName = upResourcesName;
	}
	
	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public List<TResources> getResList() {
		return resList;
	}

	public void setResList(List<TResources> resList) {
		this.resList = resList;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

}
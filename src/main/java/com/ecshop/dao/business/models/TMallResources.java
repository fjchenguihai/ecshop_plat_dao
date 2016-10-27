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
 * TMallResources entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_resources")
public class TMallResources implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1523267971L;

	// Fields

	/**
	 * resourcesId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "resourcesId", unique = true, nullable = false)
	private Long resourcesId;// get resourcesId

	/**
	 * resourcesName:
	 */
	@Column(name = "resourcesName", nullable = false, length = 50)
	private String resourcesName;// get resourcesName

	/**
	 * upResourcesId:
	 */
	@Column(name = "upResourcesId", nullable = false)
	private Long upResourcesId;// get upResourcesId

	/**
	 * resourcesKey:
	 */
	@Column(name = "resourcesKey", nullable = false, length = 100)
	private String resourcesKey;// get resourcesKey

	/**
	 * type:0��ʾ���˵���1��ʾ���ܰ�ť
	 */
	@Column(name = "type", nullable = false)
	private Integer type;// get type

	/**
	 * url:
	 */
	@Column(name = "url", nullable = false, length = 200)
	private String url;// get url

	/**
	 * resourcesLevel:
	 */
	@Column(name = "resourcesLevel")
	private Integer resourcesLevel;// get resourcesLevel

	/**
	 * remarks:
	 */
	@Column(name = "remarks", length = 65535)
	private String remarks;// get remarks

	/**
	 * orderNo:
	 */
	@Column(name = "orderNo")
	private Integer orderNo;// get orderNo
	
	
	@Transient
	private String upResourcesName;// get upResourcesId
	
	
	@Transient
	private List<TMallResources> resList;

	// Constructors

	/** default constructor */
	public TMallResources() {
	}

	/** minimal constructor */
	public TMallResources(String resourcesName, Long upResourcesId,
			String resourcesKey, Integer type, String url) {
		this.resourcesName = resourcesName;
		this.upResourcesId = upResourcesId;
		this.resourcesKey = resourcesKey;
		this.type = type;
		this.url = url;
	}

	/** full constructor */
	public TMallResources(String resourcesName, Long upResourcesId,
			String resourcesKey, Integer type, String url,
			Integer resourcesLevel, String remarks, Integer orderNo) {
		this.resourcesName = resourcesName;
		this.upResourcesId = upResourcesId;
		this.resourcesKey = resourcesKey;
		this.type = type;
		this.url = url;
		this.resourcesLevel = resourcesLevel;
		this.remarks = remarks;
		this.orderNo = orderNo;
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

	/**
	 * get orderNo
	 */
	public Integer getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public String getUpResourcesName() {
		return upResourcesName;
	}

	public void setUpResourcesName(String upResourcesName) {
		this.upResourcesName = upResourcesName;
	}

	public List<TMallResources> getResList() {
		return resList;
	}

	public void setResList(List<TMallResources> resList) {
		this.resList = resList;
	}
	
	

}
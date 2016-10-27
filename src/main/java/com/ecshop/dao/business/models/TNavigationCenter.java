package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TNavigationCenter entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_navigation_center")
public class TNavigationCenter implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1886126077L;

	// Fields

	/**
	 * navigationCenterId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "navigationCenterId", unique = true, nullable = false)
	private Long navigationCenterId;// get navigationCenterId

	/**
	 * imgUrl:����ͼƬ
	 */
	@Column(name = "imgUrl")
	private String imgUrl;// get imgUrl

	/**
	 * navigationType:�������ͣ���Ʒ���̼ҡ�V��Ȩ���Ź������ 0����Ʒ 1���̼� 2��V��Ȩ
	 * 3���Ź� 4���
	 */
	@Column(name = "navigationType")
	private Integer navigationType;// get navigationType

	/**
	 * navigationName:������ƣ���V��Ȩ
	 */
	@Column(name = "navigationName", length = 100)
	private String navigationName;// get navigationName

	/**
	 * targetId:��������ID���絼�����ûΪ1�Ļ
	 */
	@Column(name = "targetId")
	private Long targetId;// get targetId

	/**
	 * creTime:
	 */
	@Column(name = "creTime", length = 19)
	private Timestamp creTime;// get creTime

	/**
	 * scope:ƽ̨��0 ����1
	 */
	@Column(name = "scope")
	private Short scope;// get scope

	/**
	 * centerId:������Ӫ����ID ��rangeֵΪ1ʱ
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	/**
	 * navigationId:��������ID
	 */
	@Column(name = "navigationId")
	private Long navigationId;// get navigationId

	// Constructors

	/** default constructor */
	public TNavigationCenter() {
	}

	/** full constructor */
	public TNavigationCenter(String imgUrl, Integer navigationType,
			String navigationName, Long targetId, Timestamp creTime,
			Short scope, Long centerId, Long navigationId) {
		this.imgUrl = imgUrl;
		this.navigationType = navigationType;
		this.navigationName = navigationName;
		this.targetId = targetId;
		this.creTime = creTime;
		this.scope = scope;
		this.centerId = centerId;
		this.navigationId = navigationId;
	}

	// Property accessors
	/**
	 * get navigationCenterId
	 */
	public Long getNavigationCenterId() {
		return this.navigationCenterId;
	}

	public void setNavigationCenterId(Long navigationCenterId) {
		this.navigationCenterId = navigationCenterId;
	}

	/**
	 * get imgUrl
	 */
	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	/**
	 * get navigationType
	 */
	public Integer getNavigationType() {
		return this.navigationType;
	}

	public void setNavigationType(Integer navigationType) {
		this.navigationType = navigationType;
	}

	/**
	 * get navigationName
	 */
	public String getNavigationName() {
		return this.navigationName;
	}

	public void setNavigationName(String navigationName) {
		this.navigationName = navigationName;
	}

	/**
	 * get targetId
	 */
	public Long getTargetId() {
		return this.targetId;
	}

	public void setTargetId(Long targetId) {
		this.targetId = targetId;
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
	 * get scope
	 */
	public Short getScope() {
		return this.scope;
	}

	public void setScope(Short scope) {
		this.scope = scope;
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
	 * get navigationId
	 */
	public Long getNavigationId() {
		return this.navigationId;
	}

	public void setNavigationId(Long navigationId) {
		this.navigationId = navigationId;
	}

}
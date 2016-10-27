package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TNavigation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_navigation")
public class TNavigation implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1058894456L;

	// Fields

	/**
	 * navigationId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "navigationId", unique = true, nullable = false)
	private Long navigationId;// get navigationId

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
	 * isDelete:0������ɾ�� 1����ɾ��
	 */
	@Column(name = "isDelete")
	private Short isDelete;// get isDelete

	// Constructors

	/** default constructor */
	public TNavigation() {
	}

	/** full constructor */
	public TNavigation(String imgUrl, Integer navigationType,
			String navigationName, Long targetId, Timestamp creTime,
			Short isDelete) {
		this.imgUrl = imgUrl;
		this.navigationType = navigationType;
		this.navigationName = navigationName;
		this.targetId = targetId;
		this.creTime = creTime;
		this.isDelete = isDelete;
	}

	// Property accessors
	/**
	 * get navigationId
	 */
	public Long getNavigationId() {
		return this.navigationId;
	}

	public void setNavigationId(Long navigationId) {
		this.navigationId = navigationId;
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
	 * get isDelete
	 */
	public Short getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Short isDelete) {
		this.isDelete = isDelete;
	}

}
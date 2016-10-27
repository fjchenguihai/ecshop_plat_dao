package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VCategoryProperty entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_category_property")
public class VCategoryProperty implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -303433367L;

	// Fields

	/**
	 * categoryPropertyMapid:
	 */
	@Id
	@Column(name = "categoryPropertyMapid", nullable = false)
	private Long categoryPropertyMapid;// get categoryPropertyMapid

	/**
	 * categoryId:
	 */
	@Column(name = "categoryId", nullable = false)
	private Long categoryId;// get categoryId

	/**
	 * categoryPid:
	 */
	@Column(name = "categoryPid")
	private Long categoryPid;// get categoryPid

	/**
	 * categoryName:
	 */
	@Column(name = "categoryName", length = 100)
	private String categoryName;// get categoryName

	/**
	 * categoryImg:ͼƬ·��
	 */
	@Column(name = "categoryImg", length = 100)
	private String categoryImg;// get categoryImg

	/**
	 * status:1��ʾ���ã�0��ʾ����
	 */
	@Column(name = "status", nullable = false)
	private Integer status;// get status

	/**
	 * propertyId:
	 */
	@Column(name = "propertyId", nullable = false)
	private Long propertyId;// get propertyId

	/**
	 * propertyName:�������
	 */
	@Column(name = "propertyName", nullable = false, length = 50)
	private String propertyName;// get propertyName

	/**
	 * selectType:0����ѡ 1����ѡ 2���Զ���
	 */
	@Column(name = "selectType", nullable = false)
	private Integer selectType;// get selectType

	/**
	 * selectValue:ѡ�����ݣ�JSON�洢
	 */
	@Column(name = "selectValue")
	private String selectValue;// get selectValue

	/**
	 * isNotNull:�Ƿ����
	 */
	@Column(name = "isNotNull")
	private Integer isNotNull;// get isNotNull

	/**
	 * propertyType:���/���ԣ�1-��� 2-���ԣ�
	 */
	@Column(name = "propertyType")
	private Integer propertyType;// get propertyType

	// Constructors

	/** default constructor */
	public VCategoryProperty() {
	}

	/** minimal constructor */
	public VCategoryProperty(Long categoryPropertyMapid, Long categoryId,
			Integer status, Long propertyId, String propertyName,
			Integer selectType) {
		this.categoryPropertyMapid = categoryPropertyMapid;
		this.categoryId = categoryId;
		this.status = status;
		this.propertyId = propertyId;
		this.propertyName = propertyName;
		this.selectType = selectType;
	}

	/** full constructor */
	public VCategoryProperty(Long categoryPropertyMapid, Long categoryId,
			Long categoryPid, String categoryName, String categoryImg,
			Integer status, Long propertyId, String propertyName,
			Integer selectType, String selectValue, Integer isNotNull,
			Integer propertyType) {
		this.categoryPropertyMapid = categoryPropertyMapid;
		this.categoryId = categoryId;
		this.categoryPid = categoryPid;
		this.categoryName = categoryName;
		this.categoryImg = categoryImg;
		this.status = status;
		this.propertyId = propertyId;
		this.propertyName = propertyName;
		this.selectType = selectType;
		this.selectValue = selectValue;
		this.isNotNull = isNotNull;
		this.propertyType = propertyType;
	}

	// Property accessors
	/**
	 * get categoryPropertyMapid
	 */
	public Long getCategoryPropertyMapid() {
		return this.categoryPropertyMapid;
	}

	public void setCategoryPropertyMapid(Long categoryPropertyMapid) {
		this.categoryPropertyMapid = categoryPropertyMapid;
	}

	/**
	 * get categoryId
	 */
	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * get categoryPid
	 */
	public Long getCategoryPid() {
		return this.categoryPid;
	}

	public void setCategoryPid(Long categoryPid) {
		this.categoryPid = categoryPid;
	}

	/**
	 * get categoryName
	 */
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * get categoryImg
	 */
	public String getCategoryImg() {
		return this.categoryImg;
	}

	public void setCategoryImg(String categoryImg) {
		this.categoryImg = categoryImg;
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
	 * get propertyId
	 */
	public Long getPropertyId() {
		return this.propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}

	/**
	 * get propertyName
	 */
	public String getPropertyName() {
		return this.propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	/**
	 * get selectType
	 */
	public Integer getSelectType() {
		return this.selectType;
	}

	public void setSelectType(Integer selectType) {
		this.selectType = selectType;
	}

	/**
	 * get selectValue
	 */
	public String getSelectValue() {
		return this.selectValue;
	}

	public void setSelectValue(String selectValue) {
		this.selectValue = selectValue;
	}

	/**
	 * get isNotNull
	 */
	public Integer getIsNotNull() {
		return this.isNotNull;
	}

	public void setIsNotNull(Integer isNotNull) {
		this.isNotNull = isNotNull;
	}

	/**
	 * get propertyType
	 */
	public Integer getPropertyType() {
		return this.propertyType;
	}

	public void setPropertyType(Integer propertyType) {
		this.propertyType = propertyType;
	}

}
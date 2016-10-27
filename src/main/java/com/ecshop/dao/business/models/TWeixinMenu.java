package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TWeixinMenu entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_weixin_menu")
public class TWeixinMenu implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2141621845L;

	// Fields

	/**
	 * catId:�˵�ID
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "catId", unique = true, nullable = false)
	private Long catId;// get catId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * catName:�˵����
	 */
	@Column(name = "catName", nullable = false)
	private String catName;// get catName

	/**
	 * catType:�˵�����
	 */
	@Column(name = "catType", nullable = false)
	private Short catType;// get catType

	/**
	 * keywords:�˵���Ӧֵ
	 */
	@Column(name = "keywords", nullable = false, length = 500)
	private String keywords;// get keywords

	/**
	 * sortOrder:�˵�˳��
	 */
	@Column(name = "sortOrder", nullable = false)
	private Short sortOrder;// get sortOrder

	/**
	 * parentId:�˵�����ID
	 */
	@Column(name = "parentId", nullable = false)
	private Long parentId;// get parentId

	// Constructors

	/** default constructor */
	public TWeixinMenu() {
	}

	/** minimal constructor */
	public TWeixinMenu(String catName, Short catType, String keywords,
			Short sortOrder, Long parentId) {
		this.catName = catName;
		this.catType = catType;
		this.keywords = keywords;
		this.sortOrder = sortOrder;
		this.parentId = parentId;
	}

	/** full constructor */
	public TWeixinMenu(Long mallId, String catName, Short catType,
			String keywords, Short sortOrder, Long parentId) {
		this.mallId = mallId;
		this.catName = catName;
		this.catType = catType;
		this.keywords = keywords;
		this.sortOrder = sortOrder;
		this.parentId = parentId;
	}

	// Property accessors
	/**
	 * get catId
	 */
	public Long getCatId() {
		return this.catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
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
	 * get catName
	 */
	public String getCatName() {
		return this.catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	/**
	 * get catType
	 */
	public Short getCatType() {
		return this.catType;
	}

	public void setCatType(Short catType) {
		this.catType = catType;
	}

	/**
	 * get keywords
	 */
	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	/**
	 * get sortOrder
	 */
	public Short getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Short sortOrder) {
		this.sortOrder = sortOrder;
	}

	/**
	 * get parentId
	 */
	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

}
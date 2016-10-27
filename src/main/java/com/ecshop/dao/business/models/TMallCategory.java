package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallCategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_category")
public class TMallCategory implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1597224538L;

	// Fields

	/**
	 * mallCategoryId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "mallCategoryId", unique = true, nullable = false)
	private Long mallCategoryId;// get mallCategoryId

	/**
	 * mallId:
	 */
	@Column(name = "mallId", nullable = false)
	private Long mallId;// get mallId

	/**
	 * categoryId:
	 */
	@Column(name = "categoryId", nullable = false)
	private Long categoryId;// get categoryId

	/**
	 * categoryPid:
	 */
	@Column(name = "categoryPid", nullable = false)
	private Long categoryPid;// get categoryPid

	/**
	 * categoryName:
	 */
	@Column(name = "categoryName", nullable = false, length = 100)
	private String categoryName;// get categoryName

	/**
	 * categoryImg:ͼƬ·��
	 */
	@Column(name = "categoryImg", nullable = false, length = 100)
	private String categoryImg;// get categoryImg

	/**
	 * status:1��ʾ���ã�0��ʾ����
	 */
	@Column(name = "status", nullable = false)
	private Integer status;// get status

	// Constructors

	/** default constructor */
	public TMallCategory() {
	}

	/** full constructor */
	public TMallCategory(Long mallId, Long categoryId, Long categoryPid,
			String categoryName, String categoryImg, Integer status) {
		this.mallId = mallId;
		this.categoryId = categoryId;
		this.categoryPid = categoryPid;
		this.categoryName = categoryName;
		this.categoryImg = categoryImg;
		this.status = status;
	}

	// Property accessors
	/**
	 * get mallCategoryId
	 */
	public Long getMallCategoryId() {
		return this.mallCategoryId;
	}

	public void setMallCategoryId(Long mallCategoryId) {
		this.mallCategoryId = mallCategoryId;
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

}
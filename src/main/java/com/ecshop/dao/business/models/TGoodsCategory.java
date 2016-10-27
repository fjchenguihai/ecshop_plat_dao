package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TGoodsCategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_goods_category")
public class TGoodsCategory implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 915954304L;

	// Fields

	/**
	 * categoryId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "categoryId", unique = true, nullable = false)
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

	// Constructors

	/** default constructor */
	public TGoodsCategory() {
	}

	/** minimal constructor */
	public TGoodsCategory(Integer status) {
		this.status = status;
	}

	/** full constructor */
	public TGoodsCategory(Long categoryPid, String categoryName,
			String categoryImg, Integer status) {
		this.categoryPid = categoryPid;
		this.categoryName = categoryName;
		this.categoryImg = categoryImg;
		this.status = status;
	}

	// Property accessors
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
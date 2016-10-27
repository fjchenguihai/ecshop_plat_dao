package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TNewsCategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_news_category")
public class TNewsCategory implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1994940571L;

	// Fields

	/**
	 * newsCategoryId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "newsCategoryId", unique = true, nullable = false)
	private Long newsCategoryId;// get newsCategoryId

	/**
	 * newsCategoryName:
	 */
	@Column(name = "newsCategoryName", length = 100)
	private String newsCategoryName;// get newsCategoryName

	// Constructors

	/** default constructor */
	public TNewsCategory() {
	}

	/** full constructor */
	public TNewsCategory(String newsCategoryName) {
		this.newsCategoryName = newsCategoryName;
	}

	// Property accessors
	/**
	 * get newsCategoryId
	 */
	public Long getNewsCategoryId() {
		return this.newsCategoryId;
	}

	public void setNewsCategoryId(Long newsCategoryId) {
		this.newsCategoryId = newsCategoryId;
	}

	/**
	 * get newsCategoryName
	 */
	public String getNewsCategoryName() {
		return this.newsCategoryName;
	}

	public void setNewsCategoryName(String newsCategoryName) {
		this.newsCategoryName = newsCategoryName;
	}

}
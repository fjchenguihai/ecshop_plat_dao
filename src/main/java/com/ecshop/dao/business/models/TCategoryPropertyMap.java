package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCategoryPropertyMap entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_category_property_map")
public class TCategoryPropertyMap implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2140447349L;

	// Fields

	/**
	 * categoryPropertyMapid:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "categoryPropertyMapid", unique = true, nullable = false)
	private Long categoryPropertyMapid;// get categoryPropertyMapid

	/**
	 * propertyId:����ID
	 */
	@Column(name = "propertyId", nullable = false)
	private Long propertyId;// get propertyId

	/**
	 * categoryId:����ID
	 */
	@Column(name = "categoryId", nullable = false)
	private Long categoryId;// get categoryId

	// Constructors

	/** default constructor */
	public TCategoryPropertyMap() {
	}

	/** full constructor */
	public TCategoryPropertyMap(Long propertyId, Long categoryId) {
		this.propertyId = propertyId;
		this.categoryId = categoryId;
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
	 * get propertyId
	 */
	public Long getPropertyId() {
		return this.propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
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

}
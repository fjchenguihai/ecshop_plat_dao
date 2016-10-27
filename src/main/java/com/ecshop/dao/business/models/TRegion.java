package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TRegion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_region")
public class TRegion implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -315063192L;

	// Fields

	/**
	 * regionId:��������Id
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "regionId", unique = true, nullable = false)
	private Integer regionId;// get regionId

	/**
	 * parentId:�ϼ�����id
	 */
	@Column(name = "parentId", nullable = false)
	private Integer parentId;// get parentId

	/**
	 * regionName:�����������
	 */
	@Column(name = "regionName", nullable = false, length = 50)
	private String regionName;// get regionName

	/**
	 * regionType:������������ 0:��� 1��ʡ 2������ 3����
	 */
	@Column(name = "regionType")
	private Integer regionType;// get regionType

	// Constructors

	/** default constructor */
	public TRegion() {
	}

	/** minimal constructor */
	public TRegion(Integer parentId, String regionName) {
		this.parentId = parentId;
		this.regionName = regionName;
	}

	/** full constructor */
	public TRegion(Integer parentId, String regionName, Integer regionType) {
		this.parentId = parentId;
		this.regionName = regionName;
		this.regionType = regionType;
	}

	// Property accessors
	/**
	 * get regionId
	 */
	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	/**
	 * get parentId
	 */
	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	/**
	 * get regionName
	 */
	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	/**
	 * get regionType
	 */
	public Integer getRegionType() {
		return this.regionType;
	}

	public void setRegionType(Integer regionType) {
		this.regionType = regionType;
	}

}
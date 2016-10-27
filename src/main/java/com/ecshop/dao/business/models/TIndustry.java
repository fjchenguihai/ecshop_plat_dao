package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TIndustry entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_industry", uniqueConstraints = {
		@UniqueConstraint(columnNames = "industryName"),
		@UniqueConstraint(columnNames = "industryCode") })
public class TIndustry implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1310518702L;

	// Fields

	/**
	 * industryId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "industryId", unique = true, nullable = false)
	private Long industryId;// get industryId

	/**
	 * industryName:
	 */
	@Column(name = "industryName", unique = true, nullable = false, length = 50)
	private String industryName;// get industryName

	/**
	 * upIndustryId:
	 */
	@Column(name = "upIndustryId", nullable = false)
	private Long upIndustryId;// get upIndustryId

	/**
	 * industryImg:ͼƬ·��
	 */
	@Column(name = "industryImg", length = 100)
	private String industryImg;// get industryImg

	/**
	 * industryCode:
	 */
	@Column(name = "industryCode", unique = true)
	private Integer industryCode;// get industryCode

	/**
	 * status:1��ʾ���ã�0��ʾ����
	 */
	@Column(name = "status", nullable = false)
	private Integer status;// get status

	// Constructors

	/** default constructor */
	public TIndustry() {
	}

	/** minimal constructor */
	public TIndustry(String industryName, Long upIndustryId, Integer status) {
		this.industryName = industryName;
		this.upIndustryId = upIndustryId;
		this.status = status;
	}

	/** full constructor */
	public TIndustry(String industryName, Long upIndustryId,
			String industryImg, Integer industryCode, Integer status) {
		this.industryName = industryName;
		this.upIndustryId = upIndustryId;
		this.industryImg = industryImg;
		this.industryCode = industryCode;
		this.status = status;
	}

	// Property accessors
	/**
	 * get industryId
	 */
	public Long getIndustryId() {
		return this.industryId;
	}

	public void setIndustryId(Long industryId) {
		this.industryId = industryId;
	}

	/**
	 * get industryName
	 */
	public String getIndustryName() {
		return this.industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	/**
	 * get upIndustryId
	 */
	public Long getUpIndustryId() {
		return this.upIndustryId;
	}

	public void setUpIndustryId(Long upIndustryId) {
		this.upIndustryId = upIndustryId;
	}

	/**
	 * get industryImg
	 */
	public String getIndustryImg() {
		return this.industryImg;
	}

	public void setIndustryImg(String industryImg) {
		this.industryImg = industryImg;
	}

	/**
	 * get industryCode
	 */
	public Integer getIndustryCode() {
		return this.industryCode;
	}

	public void setIndustryCode(Integer industryCode) {
		this.industryCode = industryCode;
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
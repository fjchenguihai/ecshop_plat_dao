package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TGuidePage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_guide_page")
public class TGuidePage implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 600142263L;

	// Fields

	/**
	 * guidePageId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "guidePageId", unique = true, nullable = false)
	private Long guidePageId;// get guidePageId

	/**
	 * guidePageImg:
	 */
	@Column(name = "guidePageImg")
	private String guidePageImg;// get guidePageImg

	// Constructors

	/** default constructor */
	public TGuidePage() {
	}

	/** full constructor */
	public TGuidePage(String guidePageImg) {
		this.guidePageImg = guidePageImg;
	}

	// Property accessors
	/**
	 * get guidePageId
	 */
	public Long getGuidePageId() {
		return this.guidePageId;
	}

	public void setGuidePageId(Long guidePageId) {
		this.guidePageId = guidePageId;
	}

	/**
	 * get guidePageImg
	 */
	public String getGuidePageImg() {
		return this.guidePageImg;
	}

	public void setGuidePageImg(String guidePageImg) {
		this.guidePageImg = guidePageImg;
	}

}
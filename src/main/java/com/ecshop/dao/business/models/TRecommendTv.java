package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TRecommendTv entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_recommend_tv")
public class TRecommendTv implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1063831402L;

	// Fields

	/**
	 * recommendedId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "recommendedId", unique = true, nullable = false)
	private Long recommendedId;// get recommendedId

	/**
	 * type:
	 */
	@Column(name = "type", nullable = false)
	private Short type;// get type

	/**
	 * recommendedJson:
	 */
	@Column(name = "recommendedJson", length = 65535)
	private String recommendedJson;// get recommendedJson

	// Constructors

	/** default constructor */
	public TRecommendTv() {
	}

	/** minimal constructor */
	public TRecommendTv(Short type) {
		this.type = type;
	}

	/** full constructor */
	public TRecommendTv(Short type, String recommendedJson) {
		this.type = type;
		this.recommendedJson = recommendedJson;
	}

	// Property accessors
	/**
	 * get recommendedId
	 */
	public Long getRecommendedId() {
		return this.recommendedId;
	}

	public void setRecommendedId(Long recommendedId) {
		this.recommendedId = recommendedId;
	}

	/**
	 * get type
	 */
	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	/**
	 * get recommendedJson
	 */
	public String getRecommendedJson() {
		return this.recommendedJson;
	}

	public void setRecommendedJson(String recommendedJson) {
		this.recommendedJson = recommendedJson;
	}

}
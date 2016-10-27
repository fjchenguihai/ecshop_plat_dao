package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallAdvert entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_advert")
public class TMallAdvert implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 466814588L;

	// Fields

	/**
	 * advertId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "advertId", unique = true, nullable = false)
	private Long advertId;// get advertId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * stationId:
	 */
	@Column(name = "stationId")
	private Long stationId;// get stationId

	/**
	 * advertPage:0:��ҳ��1...����ҳ��
	 */
	@Column(name = "advertPage")
	private Integer advertPage;// get advertPage

	/**
	 * advertJson:
	 */
	@Column(name = "advertJson", length = 65535)
	private String advertJson;// get advertJson

	// Constructors

	/** default constructor */
	public TMallAdvert() {
	}

	/** full constructor */
	public TMallAdvert(Long mallId, Long stationId, Integer advertPage,
			String advertJson) {
		this.mallId = mallId;
		this.stationId = stationId;
		this.advertPage = advertPage;
		this.advertJson = advertJson;
	}

	// Property accessors
	/**
	 * get advertId
	 */
	public Long getAdvertId() {
		return this.advertId;
	}

	public void setAdvertId(Long advertId) {
		this.advertId = advertId;
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
	 * get stationId
	 */
	public Long getStationId() {
		return this.stationId;
	}

	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}

	/**
	 * get advertPage
	 */
	public Integer getAdvertPage() {
		return this.advertPage;
	}

	public void setAdvertPage(Integer advertPage) {
		this.advertPage = advertPage;
	}

	/**
	 * get advertJson
	 */
	public String getAdvertJson() {
		return this.advertJson;
	}

	public void setAdvertJson(String advertJson) {
		this.advertJson = advertJson;
	}

}
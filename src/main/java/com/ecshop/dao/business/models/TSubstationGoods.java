package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TSubstationGoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_substation_goods")
public class TSubstationGoods implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1530189362L;

	// Fields

	/**
	 * stationGoodId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "stationGoodId", unique = true, nullable = false)
	private Long stationGoodId;// get stationGoodId

	/**
	 * stationId:
	 */
	@Column(name = "stationId")
	private Long stationId;// get stationId

	/**
	 * goodsId:
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * publishTime:
	 */
	@Column(name = "publishTime", length = 19)
	private Timestamp publishTime;// get publishTime

	// Constructors

	/** default constructor */
	public TSubstationGoods() {
	}

	/** full constructor */
	public TSubstationGoods(Long stationId, Long goodsId, Long mallId,
			Timestamp publishTime) {
		this.stationId = stationId;
		this.goodsId = goodsId;
		this.mallId = mallId;
		this.publishTime = publishTime;
	}

	// Property accessors
	/**
	 * get stationGoodId
	 */
	public Long getStationGoodId() {
		return this.stationGoodId;
	}

	public void setStationGoodId(Long stationGoodId) {
		this.stationGoodId = stationGoodId;
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
	 * get goodsId
	 */
	public Long getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
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
	 * get publishTime
	 */
	public Timestamp getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}

}
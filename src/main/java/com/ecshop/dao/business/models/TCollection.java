package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCollection entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_collection")
public class TCollection implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -367906286L;

	// Fields

	/**
	 * collectionId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "collectionId", unique = true, nullable = false)
	private Long collectionId;// get collectionId

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
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * goodsId:
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * centerId:
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	/**
	 * addTime:
	 */
	@Column(name = "addTime", length = 19)
	private Timestamp addTime;// get addTime

	// Constructors

	/** default constructor */
	public TCollection() {
	}

	/** full constructor */
	public TCollection(Long mallId, Long stationId, Long userId, Long goodsId,
			Long centerId, Timestamp addTime) {
		this.mallId = mallId;
		this.stationId = stationId;
		this.userId = userId;
		this.goodsId = goodsId;
		this.centerId = centerId;
		this.addTime = addTime;
	}

	// Property accessors
	/**
	 * get collectionId
	 */
	public Long getCollectionId() {
		return this.collectionId;
	}

	public void setCollectionId(Long collectionId) {
		this.collectionId = collectionId;
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
	 * get userId
	 */
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
	 * get centerId
	 */
	public Long getCenterId() {
		return this.centerId;
	}

	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}

	/**
	 * get addTime
	 */
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

}
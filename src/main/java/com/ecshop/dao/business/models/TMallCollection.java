package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallCollection entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_collection")
public class TMallCollection implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -372330170L;

	// Fields

	/**
	 * mallCollectionId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "mallCollectionId", unique = true, nullable = false)
	private Long mallCollectionId;// get mallCollectionId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * creTime:
	 */
	@Column(name = "creTime", length = 19)
	private Timestamp creTime;// get creTime

	/**
	 * centerId:
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	// Constructors

	/** default constructor */
	public TMallCollection() {
	}

	/** full constructor */
	public TMallCollection(Long mallId, Long userId, Timestamp creTime,
			Long centerId) {
		this.mallId = mallId;
		this.userId = userId;
		this.creTime = creTime;
		this.centerId = centerId;
	}

	// Property accessors
	/**
	 * get mallCollectionId
	 */
	public Long getMallCollectionId() {
		return this.mallCollectionId;
	}

	public void setMallCollectionId(Long mallCollectionId) {
		this.mallCollectionId = mallCollectionId;
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
	 * get userId
	 */
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * get creTime
	 */
	public Timestamp getCreTime() {
		return this.creTime;
	}

	public void setCreTime(Timestamp creTime) {
		this.creTime = creTime;
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

}
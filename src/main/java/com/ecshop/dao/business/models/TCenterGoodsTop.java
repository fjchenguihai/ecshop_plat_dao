package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCenterGoodsTop entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_center_goods_top")
public class TCenterGoodsTop implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1653415688L;

	// Fields

	/**
	 * centerGoodsTopId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "centerGoodsTopId", unique = true, nullable = false)
	private Long centerGoodsTopId;// get centerGoodsTopId

	/**
	 * centerId:��Ӫ����ID
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	/**
	 * mallId:�̼�ID
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * goodsId:��ƷID
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * topTime:
	 */
	@Column(name = "topTime", length = 19)
	private Timestamp topTime;// get topTime

	// Constructors

	/** default constructor */
	public TCenterGoodsTop() {
	}

	/** full constructor */
	public TCenterGoodsTop(Long centerId, Long mallId, Long goodsId,
			Timestamp topTime) {
		this.centerId = centerId;
		this.mallId = mallId;
		this.goodsId = goodsId;
		this.topTime = topTime;
	}

	// Property accessors
	/**
	 * get centerGoodsTopId
	 */
	public Long getCenterGoodsTopId() {
		return this.centerGoodsTopId;
	}

	public void setCenterGoodsTopId(Long centerGoodsTopId) {
		this.centerGoodsTopId = centerGoodsTopId;
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
	 * get mallId
	 */
	public Long getMallId() {
		return this.mallId;
	}

	public void setMallId(Long mallId) {
		this.mallId = mallId;
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
	 * get topTime
	 */
	public Timestamp getTopTime() {
		return this.topTime;
	}

	public void setTopTime(Timestamp topTime) {
		this.topTime = topTime;
	}

}
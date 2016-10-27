package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCenterGoodsOffshelf entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_center_goods_offshelf")
public class TCenterGoodsOffshelf implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 862713928L;

	// Fields

	/**
	 * centerGoodsOffshelfId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "centerGoodsOffshelfId", unique = true, nullable = false)
	private Long centerGoodsOffshelfId;// get centerGoodsOffshelfId

	/**
	 * centerId:
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * goodsId:
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * offshelfTime:
	 */
	@Column(name = "offshelfTime", length = 19)
	private Timestamp offshelfTime;// get offshelfTime

	// Constructors

	/** default constructor */
	public TCenterGoodsOffshelf() {
	}

	/** full constructor */
	public TCenterGoodsOffshelf(Long centerId, Long mallId, Long goodsId,
			Timestamp offshelfTime) {
		this.centerId = centerId;
		this.mallId = mallId;
		this.goodsId = goodsId;
		this.offshelfTime = offshelfTime;
	}

	// Property accessors
	/**
	 * get centerGoodsOffshelfId
	 */
	public Long getCenterGoodsOffshelfId() {
		return this.centerGoodsOffshelfId;
	}

	public void setCenterGoodsOffshelfId(Long centerGoodsOffshelfId) {
		this.centerGoodsOffshelfId = centerGoodsOffshelfId;
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
	 * get offshelfTime
	 */
	public Timestamp getOffshelfTime() {
		return this.offshelfTime;
	}

	public void setOffshelfTime(Timestamp offshelfTime) {
		this.offshelfTime = offshelfTime;
	}

}
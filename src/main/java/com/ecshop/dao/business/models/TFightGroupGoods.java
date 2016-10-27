package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TFightGroupGoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_fight_group_goods")
public class TFightGroupGoods implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1975116461L;

	// Fields

	/**
	 * fightGroupGoodsId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "fightGroupGoodsId", unique = true, nullable = false)
	private Long fightGroupGoodsId;// get fightGroupGoodsId

	/**
	 * fightGroupId:
	 */
	@Column(name = "fightGroupId", nullable = false)
	private Long fightGroupId;// get fightGroupId

	/**
	 * goodsId:
	 */
	@Column(name = "goodsId", nullable = false)
	private Long goodsId;// get goodsId

	// Constructors

	/** default constructor */
	public TFightGroupGoods() {
	}

	/** full constructor */
	public TFightGroupGoods(Long fightGroupId, Long goodsId) {
		this.fightGroupId = fightGroupId;
		this.goodsId = goodsId;
	}

	// Property accessors
	/**
	 * get fightGroupGoodsId
	 */
	public Long getFightGroupGoodsId() {
		return this.fightGroupGoodsId;
	}

	public void setFightGroupGoodsId(Long fightGroupGoodsId) {
		this.fightGroupGoodsId = fightGroupGoodsId;
	}

	/**
	 * get fightGroupId
	 */
	public Long getFightGroupId() {
		return this.fightGroupId;
	}

	public void setFightGroupId(Long fightGroupId) {
		this.fightGroupId = fightGroupId;
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

}
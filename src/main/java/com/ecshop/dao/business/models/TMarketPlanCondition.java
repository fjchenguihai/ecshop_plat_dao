package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMarketPlanCondition entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_market_plan_condition")
public class TMarketPlanCondition implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -964494302L;

	// Fields

	/**
	 * activityConditionId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "activityConditionId", unique = true, nullable = false)
	private Long activityConditionId;// get activityConditionId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * marketPlanId:
	 */
	@Column(name = "marketPlanId")
	private Long marketPlanId;// get marketPlanId

	/**
	 * goodsId:
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * goodQty:
	 */
	@Column(name = "goodQty")
	private Integer goodQty;// get goodQty

	// Constructors

	/** default constructor */
	public TMarketPlanCondition() {
	}

	/** full constructor */
	public TMarketPlanCondition(Long mallId, Long marketPlanId, Long goodsId,
			Integer goodQty) {
		this.mallId = mallId;
		this.marketPlanId = marketPlanId;
		this.goodsId = goodsId;
		this.goodQty = goodQty;
	}

	// Property accessors
	/**
	 * get activityConditionId
	 */
	public Long getActivityConditionId() {
		return this.activityConditionId;
	}

	public void setActivityConditionId(Long activityConditionId) {
		this.activityConditionId = activityConditionId;
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
	 * get marketPlanId
	 */
	public Long getMarketPlanId() {
		return this.marketPlanId;
	}

	public void setMarketPlanId(Long marketPlanId) {
		this.marketPlanId = marketPlanId;
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
	 * get goodQty
	 */
	public Integer getGoodQty() {
		return this.goodQty;
	}

	public void setGoodQty(Integer goodQty) {
		this.goodQty = goodQty;
	}

}
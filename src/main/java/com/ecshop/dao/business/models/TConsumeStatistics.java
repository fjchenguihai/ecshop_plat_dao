package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TConsumeStatistics entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_consume_statistics")
public class TConsumeStatistics implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -177590197L;

	// Fields

	/**
	 * consumeStatId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "consumeStatId", unique = true, nullable = false)
	private Long consumeStatId;// get consumeStatId

	/**
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

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
	 * goodsQty:
	 */
	@Column(name = "goodsQty")
	private Integer goodsQty;// get goodsQty

	/**
	 * amount:
	 */
	@Column(name = "amount", precision = 15)
	private Double amount;// get amount

	/**
	 * usedQty:
	 */
	@Column(name = "usedQty")
	private Integer usedQty;// get usedQty

	/**
	 * usedAmount:
	 */
	@Column(name = "usedAmount", precision = 15)
	private Double usedAmount;// get usedAmount

	// Constructors

	/** default constructor */
	public TConsumeStatistics() {
	}

	/** full constructor */
	public TConsumeStatistics(Long userId, Long mallId, Long goodsId,
			Integer goodsQty, Double amount, Integer usedQty, Double usedAmount) {
		this.userId = userId;
		this.mallId = mallId;
		this.goodsId = goodsId;
		this.goodsQty = goodsQty;
		this.amount = amount;
		this.usedQty = usedQty;
		this.usedAmount = usedAmount;
	}

	// Property accessors
	/**
	 * get consumeStatId
	 */
	public Long getConsumeStatId() {
		return this.consumeStatId;
	}

	public void setConsumeStatId(Long consumeStatId) {
		this.consumeStatId = consumeStatId;
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
	 * get goodsQty
	 */
	public Integer getGoodsQty() {
		return this.goodsQty;
	}

	public void setGoodsQty(Integer goodsQty) {
		this.goodsQty = goodsQty;
	}

	/**
	 * get amount
	 */
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * get usedQty
	 */
	public Integer getUsedQty() {
		return this.usedQty;
	}

	public void setUsedQty(Integer usedQty) {
		this.usedQty = usedQty;
	}

	/**
	 * get usedAmount
	 */
	public Double getUsedAmount() {
		return this.usedAmount;
	}

	public void setUsedAmount(Double usedAmount) {
		this.usedAmount = usedAmount;
	}

}
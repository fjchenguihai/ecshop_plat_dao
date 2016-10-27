package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TGradePrice entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_grade_price")
public class TGradePrice implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1494864678L;

	// Fields

	/**
	 * gradePriceId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "gradePriceId", unique = true, nullable = false)
	private Long gradePriceId;// get gradePriceId

	/**
	 * goodsId:��ƷID
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * goodsItemsId:��Ʒ��ID
	 */
	@Column(name = "goodsItemsId")
	private Long goodsItemsId;// get goodsItemsId

	/**
	 * userGrade:�û��ȼ�
	 */
	@Column(name = "userGrade")
	private Integer userGrade;// get userGrade

	/**
	 * price:�۸�
	 */
	@Column(name = "price", precision = 15)
	private Double price;// get price

	// Constructors

	/** default constructor */
	public TGradePrice() {
	}

	/** full constructor */
	public TGradePrice(Long goodsId, Long goodsItemsId, Integer userGrade,
			Double price) {
		this.goodsId = goodsId;
		this.goodsItemsId = goodsItemsId;
		this.userGrade = userGrade;
		this.price = price;
	}

	// Property accessors
	/**
	 * get gradePriceId
	 */
	public Long getGradePriceId() {
		return this.gradePriceId;
	}

	public void setGradePriceId(Long gradePriceId) {
		this.gradePriceId = gradePriceId;
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
	 * get goodsItemsId
	 */
	public Long getGoodsItemsId() {
		return this.goodsItemsId;
	}

	public void setGoodsItemsId(Long goodsItemsId) {
		this.goodsItemsId = goodsItemsId;
	}

	/**
	 * get userGrade
	 */
	public Integer getUserGrade() {
		return this.userGrade;
	}

	public void setUserGrade(Integer userGrade) {
		this.userGrade = userGrade;
	}

	/**
	 * get price
	 */
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TVipCondition entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_vip_condition")
public class TVipCondition implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 246811634L;

	// Fields

	/**
	 * vipConditionId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "vipConditionId", unique = true, nullable = false)
	private Long vipConditionId;// get vipConditionId

	/**
	 * mallId:�����̼�
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * usertypeId:
	 */
	@Column(name = "usertypeId")
	private Long usertypeId;// get usertypeId

	/**
	 * amount:��ѽ��
	 */
	@Column(name = "amount", precision = 15)
	private Double amount;// get amount

	/**
	 * goodsId:��ƷID
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * goodQty:��Ʒ����
	 */
	@Column(name = "goodQty")
	private Integer goodQty;// get goodQty

	/**
	 * recommendCount:�Ƽ�����
	 */
	@Column(name = "recommendCount")
	private Integer recommendCount;// get recommendCount

	/**
	 * teamGoodsList:��ƷID�б?���Ÿ���
	 */
	@Column(name = "teamGoodsList", length = 120)
	private String teamGoodsList;// get teamGoodsList

	/**
	 * teamGoodsQty:�ۼ���Ʒ����
	 */
	@Column(name = "teamGoodsQty")
	private Integer teamGoodsQty;// get teamGoodsQty

	// Constructors

	/** default constructor */
	public TVipCondition() {
	}

	/** full constructor */
	public TVipCondition(Long mallId, Long usertypeId, Double amount,
			Long goodsId, Integer goodQty, Integer recommendCount,
			String teamGoodsList, Integer teamGoodsQty) {
		this.mallId = mallId;
		this.usertypeId = usertypeId;
		this.amount = amount;
		this.goodsId = goodsId;
		this.goodQty = goodQty;
		this.recommendCount = recommendCount;
		this.teamGoodsList = teamGoodsList;
		this.teamGoodsQty = teamGoodsQty;
	}

	// Property accessors
	/**
	 * get vipConditionId
	 */
	public Long getVipConditionId() {
		return this.vipConditionId;
	}

	public void setVipConditionId(Long vipConditionId) {
		this.vipConditionId = vipConditionId;
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
	 * get usertypeId
	 */
	public Long getUsertypeId() {
		return this.usertypeId;
	}

	public void setUsertypeId(Long usertypeId) {
		this.usertypeId = usertypeId;
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

	/**
	 * get recommendCount
	 */
	public Integer getRecommendCount() {
		return this.recommendCount;
	}

	public void setRecommendCount(Integer recommendCount) {
		this.recommendCount = recommendCount;
	}

	/**
	 * get teamGoodsList
	 */
	public String getTeamGoodsList() {
		return this.teamGoodsList;
	}

	public void setTeamGoodsList(String teamGoodsList) {
		this.teamGoodsList = teamGoodsList;
	}

	/**
	 * get teamGoodsQty
	 */
	public Integer getTeamGoodsQty() {
		return this.teamGoodsQty;
	}

	public void setTeamGoodsQty(Integer teamGoodsQty) {
		this.teamGoodsQty = teamGoodsQty;
	}

}
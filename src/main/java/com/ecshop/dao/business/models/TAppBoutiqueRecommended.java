package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAppBoutiqueRecommended entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_app_boutique_recommended")
public class TAppBoutiqueRecommended implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 14183914L;

	// Fields

	/**
	 * recommendedId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "recommendedId", unique = true, nullable = false)
	private Long recommendedId;// get recommendedId

	/**
	 * goodsId:��ƷID
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * scope:��Χ 0 ��ƽ̨ 1������
	 */
	@Column(name = "scope")
	private Short scope;// get scope

	/**
	 * centerId:��Ӫ����ID
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	/**
	 * stationId:��Ʒ����վ��ID
	 */
	@Column(name = "stationId")
	private Long stationId;// get stationId

	/**
	 * orderNo:���� Ĭ��9999
	 */
	@Column(name = "orderNo")
	private Integer orderNo;// get orderNo

	/**
	 * creTime:
	 */
	@Column(name = "creTime", length = 19)
	private Timestamp creTime;// get creTime

	// Constructors

	/** default constructor */
	public TAppBoutiqueRecommended() {
	}

	/** full constructor */
	public TAppBoutiqueRecommended(Long goodsId, Short scope, Long centerId,
			Long stationId, Integer orderNo, Timestamp creTime) {
		this.goodsId = goodsId;
		this.scope = scope;
		this.centerId = centerId;
		this.stationId = stationId;
		this.orderNo = orderNo;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get recommendedId
	 */
	public Long getRecommendedId() {
		return this.recommendedId;
	}

	public void setRecommendedId(Long recommendedId) {
		this.recommendedId = recommendedId;
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
	 * get scope
	 */
	public Short getScope() {
		return this.scope;
	}

	public void setScope(Short scope) {
		this.scope = scope;
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
	 * get stationId
	 */
	public Long getStationId() {
		return this.stationId;
	}

	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}

	/**
	 * get orderNo
	 */
	public Integer getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
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

}
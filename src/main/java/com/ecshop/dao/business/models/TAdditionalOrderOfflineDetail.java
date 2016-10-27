package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAdditionalOrderOfflineDetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_additional_order_offline_detail")
public class TAdditionalOrderOfflineDetail implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2136996449L;

	// Fields

	/**
	 * addOrderofflineDetailId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "addOrderofflineDetailId", unique = true, nullable = false)
	private Long addOrderofflineDetailId;// get addOrderofflineDetailId

	/**
	 * addOrderOfflineId:
	 */
	@Column(name = "addOrderOfflineId", nullable = false)
	private Long addOrderOfflineId;// get addOrderOfflineId

	/**
	 * userId:
	 */
	@Column(name = "userId", length = 100)
	private String userId;// get userId

	/**
	 * userTypeId:
	 */
	@Column(name = "userTypeId")
	private Integer userTypeId;// get userTypeId

	/**
	 * centerId:
	 */
	@Column(name = "centerId", length = 20)
	private String centerId;// get centerId

	/**
	 * offlineOrderId:
	 */
	@Column(name = "offlineOrderId")
	private Long offlineOrderId;// get offlineOrderId

	/**
	 * offlineOrderGoodsId:
	 */
	@Column(name = "offlineOrderGoodsId")
	private Long offlineOrderGoodsId;// get offlineOrderGoodsId

	/**
	 * amount:
	 */
	@Column(name = "amount", nullable = false, precision = 15)
	private Double amount;// get amount

	/**
	 * creTime:
	 */
	@Column(name = "creTime", nullable = false, length = 19)
	private Timestamp creTime;// get creTime

	// Constructors

	/** default constructor */
	public TAdditionalOrderOfflineDetail() {
	}

	/** minimal constructor */
	public TAdditionalOrderOfflineDetail(Long addOrderOfflineId, Double amount,
			Timestamp creTime) {
		this.addOrderOfflineId = addOrderOfflineId;
		this.amount = amount;
		this.creTime = creTime;
	}

	/** full constructor */
	public TAdditionalOrderOfflineDetail(Long addOrderOfflineId, String userId,
			Integer userTypeId, String centerId, Long offlineOrderId,
			Long offlineOrderGoodsId, Double amount, Timestamp creTime) {
		this.addOrderOfflineId = addOrderOfflineId;
		this.userId = userId;
		this.userTypeId = userTypeId;
		this.centerId = centerId;
		this.offlineOrderId = offlineOrderId;
		this.offlineOrderGoodsId = offlineOrderGoodsId;
		this.amount = amount;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get addOrderofflineDetailId
	 */
	public Long getAddOrderofflineDetailId() {
		return this.addOrderofflineDetailId;
	}

	public void setAddOrderofflineDetailId(Long addOrderofflineDetailId) {
		this.addOrderofflineDetailId = addOrderofflineDetailId;
	}

	/**
	 * get addOrderOfflineId
	 */
	public Long getAddOrderOfflineId() {
		return this.addOrderOfflineId;
	}

	public void setAddOrderOfflineId(Long addOrderOfflineId) {
		this.addOrderOfflineId = addOrderOfflineId;
	}

	/**
	 * get userId
	 */
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * get userTypeId
	 */
	public Integer getUserTypeId() {
		return this.userTypeId;
	}

	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
	}

	/**
	 * get centerId
	 */
	public String getCenterId() {
		return this.centerId;
	}

	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}

	/**
	 * get offlineOrderId
	 */
	public Long getOfflineOrderId() {
		return this.offlineOrderId;
	}

	public void setOfflineOrderId(Long offlineOrderId) {
		this.offlineOrderId = offlineOrderId;
	}

	/**
	 * get offlineOrderGoodsId
	 */
	public Long getOfflineOrderGoodsId() {
		return this.offlineOrderGoodsId;
	}

	public void setOfflineOrderGoodsId(Long offlineOrderGoodsId) {
		this.offlineOrderGoodsId = offlineOrderGoodsId;
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
	 * get creTime
	 */
	public Timestamp getCreTime() {
		return this.creTime;
	}

	public void setCreTime(Timestamp creTime) {
		this.creTime = creTime;
	}

}
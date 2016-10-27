package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TGoodsprofitOffline entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_goodsprofit_offline")
public class TGoodsprofitOffline implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -327489827L;

	// Fields

	/**
	 * offlineGoodsprofitId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "offlineGoodsprofitId", unique = true, nullable = false)
	private Long offlineGoodsprofitId;// get offlineGoodsprofitId

	/**
	 * goodsId:
	 */
	@Column(name = "goodsId", nullable = false)
	private Long goodsId;// get goodsId

	/**
	 * bcommission:
	 */
	@Column(name = "bCommission", nullable = false, precision = 15, scale = 4)
	private Double bcommission;// get bcommission

	/**
	 * mcommission:
	 */
	@Column(name = "mCommission", nullable = false, precision = 15, scale = 4)
	private Double mcommission;// get mcommission

	/**
	 * dcommission:
	 */
	@Column(name = "dCommission", nullable = false, precision = 15, scale = 4)
	private Double dcommission;// get dcommission

	/**
	 * directCommission:
	 */
	@Column(name = "directCommission", nullable = false, precision = 15, scale = 4)
	private Double directCommission;// get directCommission

	/**
	 * indirectCommission:
	 */
	@Column(name = "IndirectCommission", nullable = false, precision = 15, scale = 4)
	private Double indirectCommission;// get indirectCommission

	/**
	 * serviceCommission:
	 */
	@Column(name = "serviceCommission", nullable = false, precision = 15, scale = 4)
	private Double serviceCommission;// get serviceCommission

	/**
	 * operationCommission:
	 */
	@Column(name = "operationCommission", nullable = false, precision = 15, scale = 4)
	private Double operationCommission;// get operationCommission

	/**
	 * platformCommission:
	 */
	@Column(name = "platformCommission", nullable = false, precision = 15, scale = 4)
	private Double platformCommission;// get platformCommission

	/**
	 * regionRate:
	 */
	@Column(name = "regionRate", nullable = false, precision = 15, scale = 4)
	private Double regionRate;// get regionRate

	/**
	 * validTime:
	 */
	@Column(name = "validTime", nullable = false, length = 19)
	private Timestamp validTime;// get validTime

	/**
	 * invalidTime:
	 */
	@Column(name = "invalidTime", length = 19)
	private Timestamp invalidTime;// get invalidTime

	/**
	 * remark:
	 */
	@Column(name = "remark", length = 200)
	private String remark;// get remark

	// Constructors

	/** default constructor */
	public TGoodsprofitOffline() {
	}

	/** minimal constructor */
	public TGoodsprofitOffline(Long goodsId, Double bcommission,
			Double mcommission, Double dcommission, Double directCommission,
			Double indirectCommission, Double serviceCommission,
			Double operationCommission, Double platformCommission,
			Double regionRate, Timestamp validTime) {
		this.goodsId = goodsId;
		this.bcommission = bcommission;
		this.mcommission = mcommission;
		this.dcommission = dcommission;
		this.directCommission = directCommission;
		this.indirectCommission = indirectCommission;
		this.serviceCommission = serviceCommission;
		this.operationCommission = operationCommission;
		this.platformCommission = platformCommission;
		this.regionRate = regionRate;
		this.validTime = validTime;
	}

	/** full constructor */
	public TGoodsprofitOffline(Long goodsId, Double bcommission,
			Double mcommission, Double dcommission, Double directCommission,
			Double indirectCommission, Double serviceCommission,
			Double operationCommission, Double platformCommission,
			Double regionRate, Timestamp validTime, Timestamp invalidTime,
			String remark) {
		this.goodsId = goodsId;
		this.bcommission = bcommission;
		this.mcommission = mcommission;
		this.dcommission = dcommission;
		this.directCommission = directCommission;
		this.indirectCommission = indirectCommission;
		this.serviceCommission = serviceCommission;
		this.operationCommission = operationCommission;
		this.platformCommission = platformCommission;
		this.regionRate = regionRate;
		this.validTime = validTime;
		this.invalidTime = invalidTime;
		this.remark = remark;
	}

	// Property accessors
	/**
	 * get offlineGoodsprofitId
	 */
	public Long getOfflineGoodsprofitId() {
		return this.offlineGoodsprofitId;
	}

	public void setOfflineGoodsprofitId(Long offlineGoodsprofitId) {
		this.offlineGoodsprofitId = offlineGoodsprofitId;
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
	 * get bcommission
	 */
	public Double getBcommission() {
		return this.bcommission;
	}

	public void setBcommission(Double bcommission) {
		this.bcommission = bcommission;
	}

	/**
	 * get mcommission
	 */
	public Double getMcommission() {
		return this.mcommission;
	}

	public void setMcommission(Double mcommission) {
		this.mcommission = mcommission;
	}

	/**
	 * get dcommission
	 */
	public Double getDcommission() {
		return this.dcommission;
	}

	public void setDcommission(Double dcommission) {
		this.dcommission = dcommission;
	}

	/**
	 * get directCommission
	 */
	public Double getDirectCommission() {
		return this.directCommission;
	}

	public void setDirectCommission(Double directCommission) {
		this.directCommission = directCommission;
	}

	/**
	 * get indirectCommission
	 */
	public Double getIndirectCommission() {
		return this.indirectCommission;
	}

	public void setIndirectCommission(Double indirectCommission) {
		this.indirectCommission = indirectCommission;
	}

	/**
	 * get serviceCommission
	 */
	public Double getServiceCommission() {
		return this.serviceCommission;
	}

	public void setServiceCommission(Double serviceCommission) {
		this.serviceCommission = serviceCommission;
	}

	/**
	 * get operationCommission
	 */
	public Double getOperationCommission() {
		return this.operationCommission;
	}

	public void setOperationCommission(Double operationCommission) {
		this.operationCommission = operationCommission;
	}

	/**
	 * get platformCommission
	 */
	public Double getPlatformCommission() {
		return this.platformCommission;
	}

	public void setPlatformCommission(Double platformCommission) {
		this.platformCommission = platformCommission;
	}

	/**
	 * get regionRate
	 */
	public Double getRegionRate() {
		return this.regionRate;
	}

	public void setRegionRate(Double regionRate) {
		this.regionRate = regionRate;
	}

	/**
	 * get validTime
	 */
	public Timestamp getValidTime() {
		return this.validTime;
	}

	public void setValidTime(Timestamp validTime) {
		this.validTime = validTime;
	}

	/**
	 * get invalidTime
	 */
	public Timestamp getInvalidTime() {
		return this.invalidTime;
	}

	public void setInvalidTime(Timestamp invalidTime) {
		this.invalidTime = invalidTime;
	}

	/**
	 * get remark
	 */
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
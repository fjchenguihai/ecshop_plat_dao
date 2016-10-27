package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TSettlement entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_settlement")
public class TSettlement implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1447234717L;

	// Fields

	/**
	 * settlementId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "settlementId", unique = true, nullable = false)
	private Long settlementId;// get settlementId

	/**
	 * settlementDay:
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "settlementDay", length = 10)
	private Date settlementDay;// get settlementDay

	/**
	 * amountOfPaymen�
	 */
	@Column(name = "amountOfPayment", precision = 15)
	private Double amountOfPayment;// get amountOfPayment

	/**
	 * refundAmount
	 */
	@Column(name = "refundAmount", precision = 15)
	private Double refundAmount;// get refundAmount

	/**
	 * orderNumber:
	 */
	@Column(name = "orderNumber")
	private Integer orderNumber;// get orderNumber

	/**
	 * refundNumber
	 */
	@Column(name = "refundNumber")
	private Integer refundNumber;// get refundNumber

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * poundage
	 */
	@Column(name = "poundage", precision = 15)
	private Double poundage;// get poundage

	/**
	 * profitCost
	 */
	@Column(name = "profitCost", precision = 15)
	private Double profitCost;// get profitCost

	/**
	 * otherFees
	 */
	@Column(name = "otherFees", precision = 15)
	private Double otherFees;// get otherFees

	/**
	 * status
	 */
	@Column(name = "status")
	private Integer status;// get status

	/**
	 * calcTime:
	 */
	@Column(name = "calcTime", length = 19)
	private Timestamp calcTime;// get calcTime

	/**
	 * orderAmount:
	 */
	@Column(name = "orderAmount", precision = 15)
	private Double orderAmount;// get orderAmount

	/**
	 * feightFee
	 */
	@Column(name = "feightFee", precision = 15)
	private Double feightFee;// get feightFee

	// Constructors

	/** default constructor */
	public TSettlement() {
	}

	/** full constructor */
	public TSettlement(Date settlementDay, Double amountOfPayment,
			Double refundAmount, Integer orderNumber, Integer refundNumber,
			Long mallId, Double poundage, Double profitCost, Double otherFees,
			Integer status, Timestamp calcTime, Double orderAmount,
			Double feightFee) {
		this.settlementDay = settlementDay;
		this.amountOfPayment = amountOfPayment;
		this.refundAmount = refundAmount;
		this.orderNumber = orderNumber;
		this.refundNumber = refundNumber;
		this.mallId = mallId;
		this.poundage = poundage;
		this.profitCost = profitCost;
		this.otherFees = otherFees;
		this.status = status;
		this.calcTime = calcTime;
		this.orderAmount = orderAmount;
		this.feightFee = feightFee;
	}

	// Property accessors
	/**
	 * get settlementId
	 */
	public Long getSettlementId() {
		return this.settlementId;
	}

	public void setSettlementId(Long settlementId) {
		this.settlementId = settlementId;
	}

	/**
	 * get settlementDay
	 */
	public Date getSettlementDay() {
		return this.settlementDay;
	}

	public void setSettlementDay(Date settlementDay) {
		this.settlementDay = settlementDay;
	}

	/**
	 * get amountOfPayment
	 */
	public Double getAmountOfPayment() {
		return this.amountOfPayment;
	}

	public void setAmountOfPayment(Double amountOfPayment) {
		this.amountOfPayment = amountOfPayment;
	}

	/**
	 * get refundAmount
	 */
	public Double getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(Double refundAmount) {
		this.refundAmount = refundAmount;
	}

	/**
	 * get orderNumber
	 */
	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * get refundNumber
	 */
	public Integer getRefundNumber() {
		return this.refundNumber;
	}

	public void setRefundNumber(Integer refundNumber) {
		this.refundNumber = refundNumber;
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
	 * get poundage
	 */
	public Double getPoundage() {
		return this.poundage;
	}

	public void setPoundage(Double poundage) {
		this.poundage = poundage;
	}

	/**
	 * get profitCost
	 */
	public Double getProfitCost() {
		return this.profitCost;
	}

	public void setProfitCost(Double profitCost) {
		this.profitCost = profitCost;
	}

	/**
	 * get otherFees
	 */
	public Double getOtherFees() {
		return this.otherFees;
	}

	public void setOtherFees(Double otherFees) {
		this.otherFees = otherFees;
	}

	/**
	 * get status
	 */
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * get calcTime
	 */
	public Timestamp getCalcTime() {
		return this.calcTime;
	}

	public void setCalcTime(Timestamp calcTime) {
		this.calcTime = calcTime;
	}

	/**
	 * get orderAmount
	 */
	public Double getOrderAmount() {
		return this.orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	/**
	 * get feightFee
	 */
	public Double getFeightFee() {
		return this.feightFee;
	}

	public void setFeightFee(Double feightFee) {
		this.feightFee = feightFee;
	}

}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VTrade entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_trade")
public class VTrade implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1751791954L;

	// Fields

	/**
	 * tradeId:
	 */
	@Id
	@Column(name = "tradeId", length = 22)
	private String tradeId;// get tradeId

	/**
	 * orderId:
	 */
	@Column(name = "orderId")
	private Long orderId;// get orderId

	/**
	 * orderNumber:
	 */
	@Column(name = "orderNumber", length = 200)
	private String orderNumber;// get orderNumber

	/**
	 * afterSalesId:
	 */
	@Column(name = "afterSalesId", nullable = false)
	private Long afterSalesId;// get afterSalesId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * money:
	 */
	@Column(name = "money", precision = 15)
	private Double money;// get money

	/**
	 * mallMoney:
	 */
	@Column(name = "mallMoney", precision = 15)
	private Double mallMoney;// get mallMoney

	/**
	 * profitMoney:
	 */
	@Column(name = "profitMoney", precision = 15)
	private Double profitMoney;// get profitMoney

	/**
	 * ordertime:
	 */
	@Column(name = "ordertime", length = 19)
	private Timestamp ordertime;// get ordertime

	/**
	 * paymenttime:
	 */
	@Column(name = "paymenttime", length = 19)
	private Timestamp paymenttime;// get paymenttime

	/**
	 * type:
	 */
	@Column(name = "type", nullable = false)
	private Long type;// get type

	/**
	 * mallsettlementTime:
	 */
	@Column(name = "mallsettlementTime", length = 19)
	private Timestamp mallsettlementTime;// get mallsettlementTime

	// Constructors

	/** default constructor */
	public VTrade() {
	}

	/** minimal constructor */
	public VTrade(String tradeId, Long afterSalesId, Long type) {
		this.tradeId = tradeId;
		this.afterSalesId = afterSalesId;
		this.type = type;
	}

	/** full constructor */
	public VTrade(String tradeId, Long orderId, String orderNumber,
			Long afterSalesId, Long mallId, Double money, Double mallMoney,
			Double profitMoney, Timestamp ordertime, Timestamp paymenttime,
			Long type, Timestamp mallsettlementTime) {
		this.tradeId = tradeId;
		this.orderId = orderId;
		this.orderNumber = orderNumber;
		this.afterSalesId = afterSalesId;
		this.mallId = mallId;
		this.money = money;
		this.mallMoney = mallMoney;
		this.profitMoney = profitMoney;
		this.ordertime = ordertime;
		this.paymenttime = paymenttime;
		this.type = type;
		this.mallsettlementTime = mallsettlementTime;
	}

	// Property accessors
	/**
	 * get tradeId
	 */
	public String getTradeId() {
		return this.tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	/**
	 * get orderId
	 */
	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * get orderNumber
	 */
	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * get afterSalesId
	 */
	public Long getAfterSalesId() {
		return this.afterSalesId;
	}

	public void setAfterSalesId(Long afterSalesId) {
		this.afterSalesId = afterSalesId;
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
	 * get money
	 */
	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	/**
	 * get mallMoney
	 */
	public Double getMallMoney() {
		return this.mallMoney;
	}

	public void setMallMoney(Double mallMoney) {
		this.mallMoney = mallMoney;
	}

	/**
	 * get profitMoney
	 */
	public Double getProfitMoney() {
		return this.profitMoney;
	}

	public void setProfitMoney(Double profitMoney) {
		this.profitMoney = profitMoney;
	}

	/**
	 * get ordertime
	 */
	public Timestamp getOrdertime() {
		return this.ordertime;
	}

	public void setOrdertime(Timestamp ordertime) {
		this.ordertime = ordertime;
	}

	/**
	 * get paymenttime
	 */
	public Timestamp getPaymenttime() {
		return this.paymenttime;
	}

	public void setPaymenttime(Timestamp paymenttime) {
		this.paymenttime = paymenttime;
	}

	/**
	 * get type
	 */
	public Long getType() {
		return this.type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	/**
	 * get mallsettlementTime
	 */
	public Timestamp getMallsettlementTime() {
		return this.mallsettlementTime;
	}

	public void setMallsettlementTime(Timestamp mallsettlementTime) {
		this.mallsettlementTime = mallsettlementTime;
	}

}
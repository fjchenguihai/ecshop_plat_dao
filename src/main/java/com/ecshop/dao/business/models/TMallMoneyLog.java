package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallMoneyLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_money_log")
public class TMallMoneyLog implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1980113140L;

	// Fields

	/**
	 * moneyLogId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "moneyLogId", unique = true, nullable = false)
	private Long moneyLogId;// get moneyLogId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * money:
	 */
	@Column(name = "money", precision = 22, scale = 0)
	private Double money;// get money

	/**
	 * addTime:
	 */
	@Column(name = "addTime", length = 19)
	private Timestamp addTime;// get addTime

	/**
	 * remark:��ע
	 */
	@Column(name = "remark", length = 1000)
	private String remark;// get remark

	/**
	 * adminId:
	 */
	@Column(name = "adminId")
	private Long adminId;// get adminId

	// Constructors

	/** default constructor */
	public TMallMoneyLog() {
	}

	/** full constructor */
	public TMallMoneyLog(Long mallId, Double money, Timestamp addTime,
			String remark, Long adminId) {
		this.mallId = mallId;
		this.money = money;
		this.addTime = addTime;
		this.remark = remark;
		this.adminId = adminId;
	}

	// Property accessors
	/**
	 * get moneyLogId
	 */
	public Long getMoneyLogId() {
		return this.moneyLogId;
	}

	public void setMoneyLogId(Long moneyLogId) {
		this.moneyLogId = moneyLogId;
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
	 * get addTime
	 */
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
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

	/**
	 * get adminId
	 */
	public Long getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

}
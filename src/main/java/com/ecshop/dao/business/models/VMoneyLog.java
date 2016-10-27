package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VMoneyLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_money_log")
public class VMoneyLog implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1089994534L;

	// Fields

	/**
	 * moneyLogId:
	 */
	@Id
	@Column(name = "moneyLogId", nullable = false)
	private Long moneyLogId;// get moneyLogId

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

	/**
	 * username:
	 */
	@Column(name = "username", length = 30)
	private String username;// get username

	/**
	 * mallName:
	 */
	@Column(name = "mallName", length = 50)
	private String mallName;// get mallName

	/**
	 * mallLogo:
	 */
	@Column(name = "mallLogo", length = 2000)
	private String mallLogo;// get mallLogo

	/**
	 * minProfit:
	 */
	@Column(name = "minProfit", precision = 22, scale = 0)
	private Double minProfit;// get minProfit

	// Constructors

	/** default constructor */
	public VMoneyLog() {
	}

	/** minimal constructor */
	public VMoneyLog(Long moneyLogId) {
		this.moneyLogId = moneyLogId;
	}

	/** full constructor */
	public VMoneyLog(Long moneyLogId, Long mallId, Double money,
			Timestamp addTime, String remark, Long adminId, String username,
			String mallName, String mallLogo, Double minProfit) {
		this.moneyLogId = moneyLogId;
		this.mallId = mallId;
		this.money = money;
		this.addTime = addTime;
		this.remark = remark;
		this.adminId = adminId;
		this.username = username;
		this.mallName = mallName;
		this.mallLogo = mallLogo;
		this.minProfit = minProfit;
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

	/**
	 * get username
	 */
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * get mallName
	 */
	public String getMallName() {
		return this.mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	/**
	 * get mallLogo
	 */
	public String getMallLogo() {
		return this.mallLogo;
	}

	public void setMallLogo(String mallLogo) {
		this.mallLogo = mallLogo;
	}

	/**
	 * get minProfit
	 */
	public Double getMinProfit() {
		return this.minProfit;
	}

	public void setMinProfit(Double minProfit) {
		this.minProfit = minProfit;
	}

}
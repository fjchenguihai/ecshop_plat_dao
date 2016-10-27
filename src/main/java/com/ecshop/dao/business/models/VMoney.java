package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VMoney entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_money")
public class VMoney implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1758333430L;

	// Fields

	/**
	 * mallId:
	 */
	@Id
	@Column(name = "mallId", nullable = false)
	private Long mallId;// get mallId

	/**
	 * useMoney:
	 */
	@Column(name = "useMoney", precision = 15)
	private Double useMoney;// get useMoney

	/**
	 * promiseMoney:
	 */
	@Column(name = "promiseMoney", precision = 15)
	private Double promiseMoney;// get promiseMoney

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
	public VMoney() {
	}

	/** minimal constructor */
	public VMoney(Long mallId) {
		this.mallId = mallId;
	}

	/** full constructor */
	public VMoney(Long mallId, Double useMoney, Double promiseMoney,
			String mallName, String mallLogo, Double minProfit) {
		this.mallId = mallId;
		this.useMoney = useMoney;
		this.promiseMoney = promiseMoney;
		this.mallName = mallName;
		this.mallLogo = mallLogo;
		this.minProfit = minProfit;
	}

	// Property accessors
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
	 * get useMoney
	 */
	public Double getUseMoney() {
		return this.useMoney;
	}

	public void setUseMoney(Double useMoney) {
		this.useMoney = useMoney;
	}

	/**
	 * get promiseMoney
	 */
	public Double getPromiseMoney() {
		return this.promiseMoney;
	}

	public void setPromiseMoney(Double promiseMoney) {
		this.promiseMoney = promiseMoney;
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
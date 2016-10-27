package com.ecshop.dao.business.models;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VVkeOrder entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_vke_order")
public class VVkeOrder implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2117783724L;

	// Fields

	/**
	 * userid:
	 */
	@Id
	@Column(name = "USERID")
	private Long userid;// get userid

	/**
	 * mallid:
	 */
	@Column(name = "MALLID")
	private Long mallid;// get mallid

	/**
	 * goodsid:
	 */
	@Column(name = "GOODSID")
	private Long goodsid;// get goodsid

	/**
	 * goodsname:
	 */
	@Column(name = "GOODSNAME", length = 50)
	private String goodsname;// get goodsname

	/**
	 * goodscount:
	 */
	@Column(name = "GOODSCOUNT", precision = 33, scale = 0)
	private BigDecimal goodscount;// get goodscount

	/**
	 * amount:
	 */
	@Column(name = "AMOUNT", precision = 48)
	private Double amount;// get amount

	// Constructors

	/** default constructor */
	public VVkeOrder() {
	}

	/** minimal constructor */
	public VVkeOrder(Long userid) {
		this.userid = userid;
	}

	/** full constructor */
	public VVkeOrder(Long userid, Long mallid, Long goodsid, String goodsname,
			BigDecimal goodscount, Double amount) {
		this.userid = userid;
		this.mallid = mallid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.goodscount = goodscount;
		this.amount = amount;
	}

	// Property accessors
	/**
	 * get userid
	 */
	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	/**
	 * get mallid
	 */
	public Long getMallid() {
		return this.mallid;
	}

	public void setMallid(Long mallid) {
		this.mallid = mallid;
	}

	/**
	 * get goodsid
	 */
	public Long getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(Long goodsid) {
		this.goodsid = goodsid;
	}

	/**
	 * get goodsname
	 */
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	/**
	 * get goodscount
	 */
	public BigDecimal getGoodscount() {
		return this.goodscount;
	}

	public void setGoodscount(BigDecimal goodscount) {
		this.goodscount = goodscount;
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

}
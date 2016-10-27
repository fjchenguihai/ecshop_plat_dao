package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * THotWordVlink entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_hot_word_vlink")
public class THotWordVlink implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1499671853L;

	// Fields

	/**
	 * vlinkwordId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "vlinkwordId", unique = true, nullable = false)
	private Long vlinkwordId;// get vlinkwordId

	/**
	 * word:
	 */
	@Column(name = "word")
	private String word;// get word

	/**
	 * scope
	 */
	@Column(name = "scope")
	private Short scope;// get scope

	/**
	 * centerId
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	/**
	 * orderNo
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
	public THotWordVlink() {
	}

	/** full constructor */
	public THotWordVlink(String word, Short scope, Long centerId,
			Integer orderNo, Timestamp creTime) {
		this.word = word;
		this.scope = scope;
		this.centerId = centerId;
		this.orderNo = orderNo;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get vlinkwordId
	 */
	public Long getVlinkwordId() {
		return this.vlinkwordId;
	}

	public void setVlinkwordId(Long vlinkwordId) {
		this.vlinkwordId = vlinkwordId;
	}

	/**
	 * get word
	 */
	public String getWord() {
		return this.word;
	}

	public void setWord(String word) {
		this.word = word;
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
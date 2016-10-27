package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * THotWord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_hot_word")
public class THotWord implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1164365309L;

	// Fields

	/**
	 * hotWordId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "hotWordId", unique = true, nullable = false)
	private Long hotWordId;// get hotWordId

	/**
	 * hotWord:
	 */
	@Column(name = "hotWord", length = 100)
	private String hotWord;// get hotWord

	/**
	 * orderNo:
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
	public THotWord() {
	}

	/** full constructor */
	public THotWord(String hotWord, Integer orderNo, Timestamp creTime) {
		this.hotWord = hotWord;
		this.orderNo = orderNo;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get hotWordId
	 */
	public Long getHotWordId() {
		return this.hotWordId;
	}

	public void setHotWordId(Long hotWordId) {
		this.hotWordId = hotWordId;
	}

	/**
	 * get hotWord
	 */
	public String getHotWord() {
		return this.hotWord;
	}

	public void setHotWord(String hotWord) {
		this.hotWord = hotWord;
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
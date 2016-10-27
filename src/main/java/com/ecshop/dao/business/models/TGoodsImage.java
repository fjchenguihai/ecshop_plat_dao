package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TGoodsImage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_goods_image")
public class TGoodsImage implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1645988633L;

	// Fields

	/**
	 * imgId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "imgId", unique = true, nullable = false)
	private Long imgId;// get imgId

	/**
	 * goodsId:
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * src:
	 */
	@Column(name = "src", length = 200)
	private String src;// get src

	/**
	 * alt:
	 */
	@Column(name = "alt", length = 100)
	private String alt;// get alt

	// Constructors

	/** default constructor */
	public TGoodsImage() {
	}

	/** full constructor */
	public TGoodsImage(Long goodsId, String src, String alt) {
		this.goodsId = goodsId;
		this.src = src;
		this.alt = alt;
	}

	// Property accessors
	/**
	 * get imgId
	 */
	public Long getImgId() {
		return this.imgId;
	}

	public void setImgId(Long imgId) {
		this.imgId = imgId;
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
	 * get src
	 */
	public String getSrc() {
		return this.src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	/**
	 * get alt
	 */
	public String getAlt() {
		return this.alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

}
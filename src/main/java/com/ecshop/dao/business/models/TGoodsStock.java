package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TGoodsStock entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_goods_stock")
public class TGoodsStock implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1655445716L;

	// Fields

	/**
	 * stockId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "stockId", unique = true, nullable = false)
	private Long stockId;// get stockId

	/**
	 * goodsId:��ƷID
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * linkMallId:VVElink�̼�ID
	 */
	@Column(name = "linkMallId")
	private Long linkMallId;// get linkMallId

	/**
	 * addtime:����ʱ��
	 */
	@Column(name = "addtime", length = 19)
	private Timestamp addtime;// get addtime

	// Constructors

	/** default constructor */
	public TGoodsStock() {
	}

	/** full constructor */
	public TGoodsStock(Long goodsId, Long linkMallId, Timestamp addtime) {
		this.goodsId = goodsId;
		this.linkMallId = linkMallId;
		this.addtime = addtime;
	}

	// Property accessors
	/**
	 * get stockId
	 */
	public Long getStockId() {
		return this.stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
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
	 * get linkMallId
	 */
	public Long getLinkMallId() {
		return this.linkMallId;
	}

	public void setLinkMallId(Long linkMallId) {
		this.linkMallId = linkMallId;
	}

	/**
	 * get addtime
	 */
	public Timestamp getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TShoppingCart entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_shopping_cart")
public class TShoppingCart implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -289774820L;

	// Fields

	/**
	 * cartId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cartId", unique = true, nullable = false)
	private Long cartId;// get cartId

	/**
	 * goodsId:
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * goodsItemsId:
	 */
	@Column(name = "goodsItemsId")
	private Long goodsItemsId;// get goodsItemsId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * stationId:
	 */
	@Column(name = "stationId")
	private Long stationId;// get stationId

	/**
	 * userId:δ��¼��ʱ�򱣴��sessionId����½�󱣴��USERID
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * cartTme:
	 */
	@Column(name = "cartTme", length = 19)
	private Timestamp cartTme;// get cartTme

	/**
	 * goodsNum:��Ʒ����
	 */
	@Column(name = "goodsNum")
	private Integer goodsNum;// get goodsNum

	/**
	 * openid:΢���û�openid
	 */
	@Column(name = "openid", length = 100)
	private String openid;// get openid

	/**
	 * sourceMallId:������Դ�̳�Id
	 */
	@Column(name = "sourceMallId")
	private Long sourceMallId;// get sourceMallId

	/**
	 * sourceStationId:������Դվ��Id
	 */
	@Column(name = "sourceStationId")
	private Long sourceStationId;// get sourceStationId

	// Constructors

	/** default constructor */
	public TShoppingCart() {
	}

	/** full constructor */
	public TShoppingCart(Long goodsId, Long goodsItemsId, Long mallId,
			Long stationId, Long userId, Timestamp cartTme, Integer goodsNum,
			String openid, Long sourceMallId, Long sourceStationId) {
		this.goodsId = goodsId;
		this.goodsItemsId = goodsItemsId;
		this.mallId = mallId;
		this.stationId = stationId;
		this.userId = userId;
		this.cartTme = cartTme;
		this.goodsNum = goodsNum;
		this.openid = openid;
		this.sourceMallId = sourceMallId;
		this.sourceStationId = sourceStationId;
	}

	// Property accessors
	/**
	 * get cartId
	 */
	public Long getCartId() {
		return this.cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
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
	 * get goodsItemsId
	 */
	public Long getGoodsItemsId() {
		return this.goodsItemsId;
	}

	public void setGoodsItemsId(Long goodsItemsId) {
		this.goodsItemsId = goodsItemsId;
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
	 * get stationId
	 */
	public Long getStationId() {
		return this.stationId;
	}

	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}

	/**
	 * get userId
	 */
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * get cartTme
	 */
	public Timestamp getCartTme() {
		return this.cartTme;
	}

	public void setCartTme(Timestamp cartTme) {
		this.cartTme = cartTme;
	}

	/**
	 * get goodsNum
	 */
	public Integer getGoodsNum() {
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	/**
	 * get openid
	 */
	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	/**
	 * get sourceMallId
	 */
	public Long getSourceMallId() {
		return this.sourceMallId;
	}

	public void setSourceMallId(Long sourceMallId) {
		this.sourceMallId = sourceMallId;
	}

	/**
	 * get sourceStationId
	 */
	public Long getSourceStationId() {
		return this.sourceStationId;
	}

	public void setSourceStationId(Long sourceStationId) {
		this.sourceStationId = sourceStationId;
	}

}
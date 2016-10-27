package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TGoodsComments entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_goods_comments")
public class TGoodsComments implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 263027574L;

	// Fields

	/**
	 * goodsCommentsId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "goodsCommentsId", unique = true, nullable = false)
	private Long goodsCommentsId;// get goodsCommentsId

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
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * score:
	 */
	@Column(name = "score", precision = 12, scale = 0)
	private Float score;// get score

	/**
	 * content:
	 */
	@Column(name = "content", length = 200)
	private String content;// get content

	/**
	 * commentsTime:
	 */
	@Column(name = "commentsTime", length = 19)
	private Timestamp commentsTime;// get commentsTime

	/**
	 * image1:
	 */
	@Column(name = "image1", length = 200)
	private String image1;// get image1

	/**
	 * image2:
	 */
	@Column(name = "image2", length = 200)
	private String image2;// get image2

	/**
	 * image3:
	 */
	@Column(name = "image3", length = 200)
	private String image3;// get image3

	// Constructors

	/** default constructor */
	public TGoodsComments() {
	}

	/** full constructor */
	public TGoodsComments(Long goodsId, Long goodsItemsId, Long userId,
			Long mallId, Float score, String content, Timestamp commentsTime,
			String image1, String image2, String image3) {
		this.goodsId = goodsId;
		this.goodsItemsId = goodsItemsId;
		this.userId = userId;
		this.mallId = mallId;
		this.score = score;
		this.content = content;
		this.commentsTime = commentsTime;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
	}

	// Property accessors
	/**
	 * get goodsCommentsId
	 */
	public Long getGoodsCommentsId() {
		return this.goodsCommentsId;
	}

	public void setGoodsCommentsId(Long goodsCommentsId) {
		this.goodsCommentsId = goodsCommentsId;
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
	 * get userId
	 */
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
	 * get score
	 */
	public Float getScore() {
		return this.score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	/**
	 * get content
	 */
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * get commentsTime
	 */
	public Timestamp getCommentsTime() {
		return this.commentsTime;
	}

	public void setCommentsTime(Timestamp commentsTime) {
		this.commentsTime = commentsTime;
	}

	/**
	 * get image1
	 */
	public String getImage1() {
		return this.image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	/**
	 * get image2
	 */
	public String getImage2() {
		return this.image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	/**
	 * get image3
	 */
	public String getImage3() {
		return this.image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

}
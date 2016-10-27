package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TComments entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_comments")
public class TComments implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2040091032L;

	// Fields

	/**
	 * commentsId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "commentsId", unique = true, nullable = false)
	private Long commentsId;// get commentsId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * content:
	 */
	@Column(name = "content")
	private String content;// get content

	/**
	 * addtime:
	 */
	@Column(name = "addtime", length = 19)
	private Timestamp addtime;// get addtime

	// Constructors

	/** default constructor */
	public TComments() {
	}

	/** full constructor */
	public TComments(Long mallId, Long userId, String content, Timestamp addtime) {
		this.mallId = mallId;
		this.userId = userId;
		this.content = content;
		this.addtime = addtime;
	}

	// Property accessors
	/**
	 * get commentsId
	 */
	public Long getCommentsId() {
		return this.commentsId;
	}

	public void setCommentsId(Long commentsId) {
		this.commentsId = commentsId;
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
	 * get userId
	 */
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
	 * get addtime
	 */
	public Timestamp getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

}
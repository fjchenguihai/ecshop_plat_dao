package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TNews entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_news")
public class TNews implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 80000327L;

	// Fields

	/**
	 * newsId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "newsId", unique = true, nullable = false)
	private Long newsId;// get newsId

	/**
	 * title:���ű���
	 */
	@Column(name = "title")
	private String title;// get title

	/**
	 * imgUrl:����ͼƬ
	 */
	@Column(name = "imgUrl")
	private String imgUrl;// get imgUrl

	/**
	 * newsCategoryId:
	 */
	@Column(name = "newsCategoryId")
	private Long newsCategoryId;// get newsCategoryId

	/**
	 * content:��������
	 */
	@Column(name = "content", length = 65535)
	private String content;// get content

	/**
	 * scope:0��ƽ̨���� 1������
	 */
	@Column(name = "scope", nullable = false)
	private Short scope;// get scope

	/**
	 * publisher:������
	 */
	@Column(name = "publisher", length = 30)
	private String publisher;// get publisher

	/**
	 * publishTime:����ʱ��
	 */
	@Column(name = "publishTime", length = 19)
	private Timestamp publishTime;// get publishTime

	/**
	 * userTypeStr:�Զ��ŷָ��� 0:���� 1��VIP 2:V�� 3�������� 4���˿� 5����ͨ�����
	 */
	@Column(name = "userTypeStr", length = 2)
	private String userTypeStr;// get userTypeStr

	/**
	 * centerId:
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	// Constructors

	/** default constructor */
	public TNews() {
	}

	/** minimal constructor */
	public TNews(Short scope) {
		this.scope = scope;
	}

	/** full constructor */
	public TNews(String title, String imgUrl, Long newsCategoryId,
			String content, Short scope, String publisher,
			Timestamp publishTime, String userTypeStr, Long centerId) {
		this.title = title;
		this.imgUrl = imgUrl;
		this.newsCategoryId = newsCategoryId;
		this.content = content;
		this.scope = scope;
		this.publisher = publisher;
		this.publishTime = publishTime;
		this.userTypeStr = userTypeStr;
		this.centerId = centerId;
	}

	// Property accessors
	/**
	 * get newsId
	 */
	public Long getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Long newsId) {
		this.newsId = newsId;
	}

	/**
	 * get title
	 */
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * get imgUrl
	 */
	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	/**
	 * get newsCategoryId
	 */
	public Long getNewsCategoryId() {
		return this.newsCategoryId;
	}

	public void setNewsCategoryId(Long newsCategoryId) {
		this.newsCategoryId = newsCategoryId;
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
	 * get scope
	 */
	public Short getScope() {
		return this.scope;
	}

	public void setScope(Short scope) {
		this.scope = scope;
	}

	/**
	 * get publisher
	 */
	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * get publishTime
	 */
	public Timestamp getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}

	/**
	 * get userTypeStr
	 */
	public String getUserTypeStr() {
		return this.userTypeStr;
	}

	public void setUserTypeStr(String userTypeStr) {
		this.userTypeStr = userTypeStr;
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

}
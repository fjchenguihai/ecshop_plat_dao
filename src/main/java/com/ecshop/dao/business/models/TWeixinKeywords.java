package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TWeixinKeywords entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_weixin_keywords")
public class TWeixinKeywords implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1437642144L;

	// Fields

	/**
	 * id:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;// get id

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * name:
	 */
	@Column(name = "name", nullable = false, length = 100)
	private String name;// get name

	/**
	 * keyword:
	 */
	@Column(name = "keyword", nullable = false, length = 100)
	private String keyword;// get keyword

	/**
	 * type:
	 */
	@Column(name = "type", nullable = false)
	private Boolean type;// get type

	/**
	 * contents:
	 */
	@Column(name = "contents", length = 65535)
	private String contents;// get contents

	/**
	 * pic:
	 */
	@Column(name = "pic", length = 80)
	private String pic;// get pic

	/**
	 * pictit:
	 */
	@Column(name = "pictit", length = 80)
	private String pictit;// get pictit

	/**
	 * keydesc:
	 */
	@Column(name = "keydesc", length = 65535)
	private String keydesc;// get keydesc

	/**
	 * picurl:
	 */
	@Column(name = "picurl", length = 80)
	private String picurl;// get picurl

	/**
	 * count:
	 */
	@Column(name = "count")
	private Integer count;// get count

	/**
	 * status:
	 */
	@Column(name = "status")
	private Short status;// get status

	// Constructors

	/** default constructor */
	public TWeixinKeywords() {
	}

	/** minimal constructor */
	public TWeixinKeywords(String name, String keyword, Boolean type) {
		this.name = name;
		this.keyword = keyword;
		this.type = type;
	}

	/** full constructor */
	public TWeixinKeywords(Long mallId, String name, String keyword,
			Boolean type, String contents, String pic, String pictit,
			String keydesc, String picurl, Integer count, Short status) {
		this.mallId = mallId;
		this.name = name;
		this.keyword = keyword;
		this.type = type;
		this.contents = contents;
		this.pic = pic;
		this.pictit = pictit;
		this.keydesc = keydesc;
		this.picurl = picurl;
		this.count = count;
		this.status = status;
	}

	// Property accessors
	/**
	 * get id
	 */
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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
	 * get name
	 */
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * get keyword
	 */
	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	/**
	 * get type
	 */
	public Boolean getType() {
		return this.type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	/**
	 * get contents
	 */
	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	/**
	 * get pic
	 */
	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	/**
	 * get pictit
	 */
	public String getPictit() {
		return this.pictit;
	}

	public void setPictit(String pictit) {
		this.pictit = pictit;
	}

	/**
	 * get keydesc
	 */
	public String getKeydesc() {
		return this.keydesc;
	}

	public void setKeydesc(String keydesc) {
		this.keydesc = keydesc;
	}

	/**
	 * get picurl
	 */
	public String getPicurl() {
		return this.picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}

	/**
	 * get count
	 */
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * get status
	 */
	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

}
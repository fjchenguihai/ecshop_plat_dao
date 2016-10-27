package com.ecshop.dao.business.models;

import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TWeixinOpenPlatUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_weixin_open_plat_user")
public class TWeixinOpenPlatUser implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -297500934L;

	// Fields

	/**
	 * id:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;// get id

	/**
	 * platUnionid:
	 */
	@Column(name = "platUnionid", length = 100)
	private String platUnionid;// get platUnionid

	/**
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * referrerUserId:
	 */
	@Column(name = "referrerUserId")
	private Long referrerUserId;// get referrerUserId

	/**
	 * referrerUpTime:
	 */
	@Column(name = "referrerUpTime", length = 19)
	private Timestamp referrerUpTime;// get referrerUpTime

	/**
	 * referrerSourceType:1.�ƶ�Ӧ�� 2.��վӦ�� 3.�����ʺ�
	 */
	@Column(name = "referrerSourceType")
	private Integer referrerSourceType;// get referrerSourceType

	/**
	 * referrerSourceAppId:
	 */
	@Column(name = "referrerSourceAppId", length = 100)
	private String referrerSourceAppId;// get referrerSourceAppId

	/**
	 * creTime:
	 */
	@Column(name = "creTime", length = 19)
	private Timestamp creTime;// get creTime

	// Constructors

	/** default constructor */
	public TWeixinOpenPlatUser() {
	}

	/** full constructor */
	public TWeixinOpenPlatUser(String platUnionid, Long userId,
			Long referrerUserId, Timestamp referrerUpTime,
			Integer referrerSourceType, String referrerSourceAppId, Timestamp creTime) {
		this.platUnionid = platUnionid;
		this.userId = userId;
		this.referrerUserId = referrerUserId;
		this.referrerUpTime = referrerUpTime;
		this.referrerSourceType = referrerSourceType;
		this.referrerSourceAppId = referrerSourceAppId;
		this.creTime = creTime;
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
	 * get platUnionid
	 */
	public String getPlatUnionid() {
		return this.platUnionid;
	}

	public void setPlatUnionid(String platUnionid) {
		this.platUnionid = platUnionid;
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
	 * get referrerUserId
	 */
	public Long getReferrerUserId() {
		return this.referrerUserId;
	}

	public void setReferrerUserId(Long referrerUserId) {
		this.referrerUserId = referrerUserId;
	}

	/**
	 * get referrerUpTime
	 */
	public Timestamp getReferrerUpTime() {
		return this.referrerUpTime;
	}

	public void setReferrerUpTime(Timestamp referrerUpTime) {
		this.referrerUpTime = referrerUpTime;
	}

	/**
	 * get referrerSourceType
	 */
	public Integer getReferrerSourceType() {
		return this.referrerSourceType;
	}

	public void setReferrerSourceType(Integer referrerSourceType) {
		this.referrerSourceType = referrerSourceType;
	}

	/**
	 * get referrerSourceAppId
	 */
	public String getReferrerSourceAppId() {
		return this.referrerSourceAppId;
	}

	public void setReferrerSourceAppId(String referrerSourceAppId) {
		this.referrerSourceAppId = referrerSourceAppId;
	}

	/**
	 * get creTime
	 */
	public Date getCreTime() {
		return this.creTime;
	}

	public void setCreTime(Timestamp creTime) {
		this.creTime = creTime;
	}

}
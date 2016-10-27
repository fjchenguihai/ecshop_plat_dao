package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TUserRelation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_user_relation")
public class TUserRelation implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -34093733L;

	// Fields

	/**
	 * userRelationId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "userRelationId", unique = true, nullable = false)
	private Long userRelationId;// get userRelationId

	/**
	 * userId:
	 */
	@Column(name = "userId", nullable = false)
	private Long userId;// get userId

	/**
	 * upUserId:
	 */
	@Column(name = "upUserId", nullable = false)
	private Long upUserId;// get upUserId

	/**
	 * usertypeId:
	 */
	@Column(name = "usertypeId", nullable = false)
	private Long usertypeId;// get usertypeId

	/**
	 * validTime:��Чʱ��
	 */
	@Column(name = "validTime", nullable = false, length = 19)
	private Timestamp validTime;// get validTime

	/**
	 * inValidTime:ʧЧʱ��
	 */
	@Column(name = "inValidTime", length = 19)
	private Timestamp inValidTime;// get inValidTime

	/**
	 * remark:��ע��ϵ���ԭ��
	 */
	@Column(name = "remark", length = 50)
	private String remark;// get remark

	// Constructors

	/** default constructor */
	public TUserRelation() {
	}

	/** minimal constructor */
	public TUserRelation(Long userId, Long upUserId, Long usertypeId,
			Timestamp validTime) {
		this.userId = userId;
		this.upUserId = upUserId;
		this.usertypeId = usertypeId;
		this.validTime = validTime;
	}

	/** full constructor */
	public TUserRelation(Long userId, Long upUserId, Long usertypeId,
			Timestamp validTime, Timestamp inValidTime, String remark) {
		this.userId = userId;
		this.upUserId = upUserId;
		this.usertypeId = usertypeId;
		this.validTime = validTime;
		this.inValidTime = inValidTime;
		this.remark = remark;
	}

	// Property accessors
	/**
	 * get userRelationId
	 */
	public Long getUserRelationId() {
		return this.userRelationId;
	}

	public void setUserRelationId(Long userRelationId) {
		this.userRelationId = userRelationId;
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
	 * get upUserId
	 */
	public Long getUpUserId() {
		return this.upUserId;
	}

	public void setUpUserId(Long upUserId) {
		this.upUserId = upUserId;
	}

	/**
	 * get usertypeId
	 */
	public Long getUsertypeId() {
		return this.usertypeId;
	}

	public void setUsertypeId(Long usertypeId) {
		this.usertypeId = usertypeId;
	}

	/**
	 * get validTime
	 */
	public Timestamp getValidTime() {
		return this.validTime;
	}

	public void setValidTime(Timestamp validTime) {
		this.validTime = validTime;
	}

	/**
	 * get inValidTime
	 */
	public Timestamp getInValidTime() {
		return this.inValidTime;
	}

	public void setInValidTime(Timestamp inValidTime) {
		this.inValidTime = inValidTime;
	}

	/**
	 * get remark
	 */
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
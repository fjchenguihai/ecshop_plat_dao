package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TUserToken entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_user_token")
public class TUserToken implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1289043206L;

	// Fields

	/**
	 * userTokenId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "userTokenId", unique = true, nullable = false)
	private Long userTokenId;// get userTokenId

	/**
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * token:
	 */
	@Column(name = "token", length = 256)
	private String token;// get token

	/**
	 * typeId:
	 */
	@Column(name = "typeId")
	private Integer typeId;// get typeId

	/**
	 * addTime:
	 */
	@Column(name = "addTime", length = 19)
	private Timestamp addTime;// get addTime

	/**
	 * expireDate:
	 */
	@Column(name = "expireDate", length = 19)
	private Timestamp expireDate;// get expireDate

	/**
	 * remark:
	 */
	@Column(name = "remark", length = 1000)
	private String remark;// get remark

	// Constructors

	/** default constructor */
	public TUserToken() {
	}

	/** full constructor */
	public TUserToken(Long userId, String token, Integer typeId,
			Timestamp addTime, Timestamp expireDate, String remark) {
		this.userId = userId;
		this.token = token;
		this.typeId = typeId;
		this.addTime = addTime;
		this.expireDate = expireDate;
		this.remark = remark;
	}

	// Property accessors
	/**
	 * get userTokenId
	 */
	public Long getUserTokenId() {
		return this.userTokenId;
	}

	public void setUserTokenId(Long userTokenId) {
		this.userTokenId = userTokenId;
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
	 * get token
	 */
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * get typeId
	 */
	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	/**
	 * get addTime
	 */
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	/**
	 * get expireDate
	 */
	public Timestamp getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Timestamp expireDate) {
		this.expireDate = expireDate;
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
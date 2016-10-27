package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCenterLoginuserMap entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_center_loginuser_map")
public class TCenterLoginuserMap implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1133402737L;

	// Fields

	/**
	 * centerUserMapId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "centerUserMapId", unique = true, nullable = false)
	private Long centerUserMapId;// get centerUserMapId

	/**
	 * centerId:
	 */
	@Column(name = "centerId", length = 50)
	private String centerId;// get centerId

	/**
	 * userId:
	 */
	@Column(name = "userId", length = 50)
	private String userId;// get userId

	/**
	 * creTime:
	 */
	@Column(name = "creTime", length = 19)
	private Timestamp creTime;// get creTime

	// Constructors

	/** default constructor */
	public TCenterLoginuserMap() {
	}

	/** full constructor */
	public TCenterLoginuserMap(String centerId, String userId, Timestamp creTime) {
		this.centerId = centerId;
		this.userId = userId;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get centerUserMapId
	 */
	public Long getCenterUserMapId() {
		return this.centerUserMapId;
	}

	public void setCenterUserMapId(Long centerUserMapId) {
		this.centerUserMapId = centerUserMapId;
	}

	/**
	 * get centerId
	 */
	public String getCenterId() {
		return this.centerId;
	}

	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}

	/**
	 * get userId
	 */
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * get creTime
	 */
	public Timestamp getCreTime() {
		return this.creTime;
	}

	public void setCreTime(Timestamp creTime) {
		this.creTime = creTime;
	}

}
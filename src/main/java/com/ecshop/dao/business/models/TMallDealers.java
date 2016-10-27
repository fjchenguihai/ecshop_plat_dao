package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallDealers entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_dealers")
public class TMallDealers implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -36674606L;

	// Fields

	/**
	 * mallDealersId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "mallDealersId", unique = true, nullable = false)
	private Long mallDealersId;// get mallDealersId

	/**
	 * mallId:�̼�id
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * userId:�û�id
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * joinTime:����ʱ��
	 */
	@Column(name = "joinTime", length = 19)
	private Timestamp joinTime;// get joinTime

	/**
	 * leaveTime:�뿪ʱ��
	 */
	@Column(name = "leaveTime", length = 19)
	private Timestamp leaveTime;// get leaveTime

	// Constructors

	/** default constructor */
	public TMallDealers() {
	}

	/** full constructor */
	public TMallDealers(Long mallId, Long userId, Timestamp joinTime,
			Timestamp leaveTime) {
		this.mallId = mallId;
		this.userId = userId;
		this.joinTime = joinTime;
		this.leaveTime = leaveTime;
	}

	// Property accessors
	/**
	 * get mallDealersId
	 */
	public Long getMallDealersId() {
		return this.mallDealersId;
	}

	public void setMallDealersId(Long mallDealersId) {
		this.mallDealersId = mallDealersId;
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
	 * get joinTime
	 */
	public Timestamp getJoinTime() {
		return this.joinTime;
	}

	public void setJoinTime(Timestamp joinTime) {
		this.joinTime = joinTime;
	}

	/**
	 * get leaveTime
	 */
	public Timestamp getLeaveTime() {
		return this.leaveTime;
	}

	public void setLeaveTime(Timestamp leaveTime) {
		this.leaveTime = leaveTime;
	}

}
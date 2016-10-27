package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VAlianceMall entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_aliance_mall")
public class VAlianceMall implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 145698155L;

	// Fields

	/**
	 * alianceMallId:
	 */
	@Id
	@Column(name = "alianceMallId", nullable = false)
	private Long alianceMallId;// get alianceMallId

	/**
	 * mallId:�̼�ID
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * alianceId:��������ID
	 */
	@Column(name = "alianceId")
	private Long alianceId;// get alianceId

	/**
	 * joinType:0���̼�������� 1���̼��������
	 */
	@Column(name = "joinType")
	private Short joinType;// get joinType

	/**
	 * joinTime:����ʱ��
	 */
	@Column(name = "joinTime", length = 19)
	private Timestamp joinTime;// get joinTime

	/**
	 * validTime:��Чʱ��
	 */
	@Column(name = "validTime", length = 19)
	private Timestamp validTime;// get validTime

	/**
	 * leaveTime:�뿪ʱ��
	 */
	@Column(name = "leaveTime", length = 19)
	private Timestamp leaveTime;// get leaveTime

	/**
	 * mallName:
	 */
	@Column(name = "mallName", length = 50)
	private String mallName;// get mallName

	// Constructors

	/** default constructor */
	public VAlianceMall() {
	}

	/** minimal constructor */
	public VAlianceMall(Long alianceMallId) {
		this.alianceMallId = alianceMallId;
	}

	/** full constructor */
	public VAlianceMall(Long alianceMallId, Long mallId, Long alianceId,
			Short joinType, Timestamp joinTime, Timestamp validTime,
			Timestamp leaveTime, String mallName) {
		this.alianceMallId = alianceMallId;
		this.mallId = mallId;
		this.alianceId = alianceId;
		this.joinType = joinType;
		this.joinTime = joinTime;
		this.validTime = validTime;
		this.leaveTime = leaveTime;
		this.mallName = mallName;
	}

	// Property accessors
	/**
	 * get alianceMallId
	 */
	public Long getAlianceMallId() {
		return this.alianceMallId;
	}

	public void setAlianceMallId(Long alianceMallId) {
		this.alianceMallId = alianceMallId;
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
	 * get alianceId
	 */
	public Long getAlianceId() {
		return this.alianceId;
	}

	public void setAlianceId(Long alianceId) {
		this.alianceId = alianceId;
	}

	/**
	 * get joinType
	 */
	public Short getJoinType() {
		return this.joinType;
	}

	public void setJoinType(Short joinType) {
		this.joinType = joinType;
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
	 * get validTime
	 */
	public Timestamp getValidTime() {
		return this.validTime;
	}

	public void setValidTime(Timestamp validTime) {
		this.validTime = validTime;
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

	/**
	 * get mallName
	 */
	public String getMallName() {
		return this.mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

}
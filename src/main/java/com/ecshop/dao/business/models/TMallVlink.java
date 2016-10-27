package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallVlink entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_vlink")
public class TMallVlink implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 727415240L;

	// Fields

	/**
	 * mallVlinkId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "mallVlinkId", unique = true, nullable = false)
	private Long mallVlinkId;// get mallVlinkId

	/**
	 * settledType:��פ��ʽ��������פ��������פ�������̳ǣ�
	 */
	@Column(name = "settledType")
	private Short settledType;// get settledType

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * centerId:��פ������ ����פ��ʽΪ�����������פʱ��ֵ
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	/**
	 * remark:
	 */
	@Column(name = "remark")
	private String remark;// get remark

	/**
	 * applyUserId:����/������
	 */
	@Column(name = "applyUserId")
	private Long applyUserId;// get applyUserId

	/**
	 * applyTime:����ʱ��
	 */
	@Column(name = "applyTime", length = 19)
	private Timestamp applyTime;// get applyTime

	/**
	 * auditStatus:0������� 1�����ͨ�� 2���ܾ� 3��ȡ��
	 */
	@Column(name = "auditStatus")
	private Integer auditStatus;// get auditStatus

	// Constructors

	/** default constructor */
	public TMallVlink() {
	}

	/** full constructor */
	public TMallVlink(Short settledType, Long mallId, Long centerId,
			String remark, Long applyUserId, Timestamp applyTime,
			Integer auditStatus) {
		this.settledType = settledType;
		this.mallId = mallId;
		this.centerId = centerId;
		this.remark = remark;
		this.applyUserId = applyUserId;
		this.applyTime = applyTime;
		this.auditStatus = auditStatus;
	}

	// Property accessors
	/**
	 * get mallVlinkId
	 */
	public Long getMallVlinkId() {
		return this.mallVlinkId;
	}

	public void setMallVlinkId(Long mallVlinkId) {
		this.mallVlinkId = mallVlinkId;
	}

	/**
	 * get settledType
	 */
	public Short getSettledType() {
		return this.settledType;
	}

	public void setSettledType(Short settledType) {
		this.settledType = settledType;
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
	 * get centerId
	 */
	public Long getCenterId() {
		return this.centerId;
	}

	public void setCenterId(Long centerId) {
		this.centerId = centerId;
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

	/**
	 * get applyUserId
	 */
	public Long getApplyUserId() {
		return this.applyUserId;
	}

	public void setApplyUserId(Long applyUserId) {
		this.applyUserId = applyUserId;
	}

	/**
	 * get applyTime
	 */
	public Timestamp getApplyTime() {
		return this.applyTime;
	}

	public void setApplyTime(Timestamp applyTime) {
		this.applyTime = applyTime;
	}

	/**
	 * get auditStatus
	 */
	public Integer getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}

}
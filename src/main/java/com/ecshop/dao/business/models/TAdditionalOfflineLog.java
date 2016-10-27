package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAdditionalOfflineLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_additional_offline_log")
public class TAdditionalOfflineLog implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1124663388L;

	// Fields

	/**
	 * additionalOfflineLogId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "additionalOfflineLogId", unique = true, nullable = false)
	private Long additionalOfflineLogId;// get additionalOfflineLogId

	/**
	 * addOrderOfflineId:
	 */
	@Column(name = "addOrderOfflineId", nullable = false)
	private Long addOrderOfflineId;// get addOrderOfflineId

	/**
	 * applyUserId:
	 */
	@Column(name = "applyUserId")
	private Long applyUserId;// get applyUserId

	/**
	 * auditUserId:
	 */
	@Column(name = "auditUserId")
	private Long auditUserId;// get auditUserId

	/**
	 * remark:
	 */
	@Column(name = "remark", length = 500)
	private String remark;// get remark

	/**
	 * creTime:
	 */
	@Column(name = "creTime", nullable = false, length = 19)
	private Timestamp creTime;// get creTime

	// Constructors

	/** default constructor */
	public TAdditionalOfflineLog() {
	}

	/** minimal constructor */
	public TAdditionalOfflineLog(Long addOrderOfflineId, Timestamp creTime) {
		this.addOrderOfflineId = addOrderOfflineId;
		this.creTime = creTime;
	}

	/** full constructor */
	public TAdditionalOfflineLog(Long addOrderOfflineId, Long applyUserId,
			Long auditUserId, String remark, Timestamp creTime) {
		this.addOrderOfflineId = addOrderOfflineId;
		this.applyUserId = applyUserId;
		this.auditUserId = auditUserId;
		this.remark = remark;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get additionalOfflineLogId
	 */
	public Long getAdditionalOfflineLogId() {
		return this.additionalOfflineLogId;
	}

	public void setAdditionalOfflineLogId(Long additionalOfflineLogId) {
		this.additionalOfflineLogId = additionalOfflineLogId;
	}

	/**
	 * get addOrderOfflineId
	 */
	public Long getAddOrderOfflineId() {
		return this.addOrderOfflineId;
	}

	public void setAddOrderOfflineId(Long addOrderOfflineId) {
		this.addOrderOfflineId = addOrderOfflineId;
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
	 * get auditUserId
	 */
	public Long getAuditUserId() {
		return this.auditUserId;
	}

	public void setAuditUserId(Long auditUserId) {
		this.auditUserId = auditUserId;
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
	 * get creTime
	 */
	public Timestamp getCreTime() {
		return this.creTime;
	}

	public void setCreTime(Timestamp creTime) {
		this.creTime = creTime;
	}

}
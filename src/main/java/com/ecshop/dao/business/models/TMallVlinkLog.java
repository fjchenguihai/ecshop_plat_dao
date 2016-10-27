package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallVlinkLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_vlink_log")
public class TMallVlinkLog implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1977484196L;

	// Fields

	/**
	 * mallVlinkLogId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "mallVlinkLogId", unique = true, nullable = false)
	private Long mallVlinkLogId;// get mallVlinkLogId

	/**
	 * mallVlinkId:
	 */
	@Column(name = "mallVlinkId", nullable = false)
	private Long mallVlinkId;// get mallVlinkId

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
	public TMallVlinkLog() {
	}

	/** minimal constructor */
	public TMallVlinkLog(Long mallVlinkId, Timestamp creTime) {
		this.mallVlinkId = mallVlinkId;
		this.creTime = creTime;
	}

	/** full constructor */
	public TMallVlinkLog(Long mallVlinkId, Long applyUserId, Long auditUserId,
			String remark, Timestamp creTime) {
		this.mallVlinkId = mallVlinkId;
		this.applyUserId = applyUserId;
		this.auditUserId = auditUserId;
		this.remark = remark;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get mallVlinkLogId
	 */
	public Long getMallVlinkLogId() {
		return this.mallVlinkLogId;
	}

	public void setMallVlinkLogId(Long mallVlinkLogId) {
		this.mallVlinkLogId = mallVlinkLogId;
	}

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
package com.ecshop.dao.business.models;

import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TFinancialLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_financial_log")
public class TFinancialLog implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1700498543L;

	// Fields

	/**
	 * financialLogId:���������־ID
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "financialLogId", unique = true, nullable = false)
	private Long financialLogId;// get financialLogId

	/**
	 * payNo:�̼�֧�����
	 */
	@Column(name = "payNo", length = 32)
	private String payNo;// get payNo

	/**
	 * auditstatus:���״̬
	 */
	@Column(name = "auditstatus")
	private Short auditstatus;// get auditstatus

	/**
	 * auditMember:�����
	 */
	@Column(name = "auditMember")
	private Long auditMember;// get auditMember

	/**
	 * auditReason:���ԭ��
	 */
	@Column(name = "auditReason")
	private String auditReason;// get auditReason

	/**
	 * addTime:���ʱ��
	 */
	@Column(name = "addTime", length = 19)
	private Timestamp addTime;// get addTime

	// Constructors

	/** default constructor */
	public TFinancialLog() {
	}

	/** full constructor */
	public TFinancialLog(String payNo, Short auditstatus, Long auditMember,
			String auditReason, Timestamp addTime) {
		this.payNo = payNo;
		this.auditstatus = auditstatus;
		this.auditMember = auditMember;
		this.auditReason = auditReason;
		this.addTime = addTime;
	}

	// Property accessors
	/**
	 * get financialLogId
	 */
	public Long getFinancialLogId() {
		return this.financialLogId;
	}

	public void setFinancialLogId(Long financialLogId) {
		this.financialLogId = financialLogId;
	}

	/**
	 * get payNo
	 */
	public String getPayNo() {
		return this.payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	/**
	 * get auditstatus
	 */
	public Short getAuditstatus() {
		return this.auditstatus;
	}

	public void setAuditstatus(Short auditstatus) {
		this.auditstatus = auditstatus;
	}

	/**
	 * get auditMember
	 */
	public Long getAuditMember() {
		return this.auditMember;
	}

	public void setAuditMember(Long auditMember) {
		this.auditMember = auditMember;
	}

	/**
	 * get auditReason
	 */
	public String getAuditReason() {
		return this.auditReason;
	}

	public void setAuditReason(String auditReason) {
		this.auditReason = auditReason;
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

}
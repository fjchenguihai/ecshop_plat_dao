package com.ecshop.dao.business.models;

import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallMoneyOutput entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_money_output")
public class TMallMoneyOutput implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1917184057L;

	// Fields

	/**
	 * moneyOutputId:��������ID
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "moneyOutputId", unique = true, nullable = false)
	private Long moneyOutputId;// get moneyOutputId

	/**
	 * mallId:�̼�ID
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * amount:���ֽ��
	 */
	@Column(name = "amount", precision = 12)
	private Double amount;// get amount

	/**
	 * applyUserId:������ID
	 */
	@Column(name = "applyUserId")
	private Long applyUserId;// get applyUserId

	/**
	 * applyTime:����ʱ��
	 */
	@Column(name = "applyTime", length = 19)
	private Timestamp applyTime;// get applyTime

	/**
	 * auditStatus:���״̬ 0������� 1�����ͨ�� 2����˲�ͨ��
	 */
	@Column(name = "auditStatus")
	private Integer auditStatus = 0;// get auditStatus

	/**
	 * auditOpinion:������
	 */
	@Column(name = "auditOpinion")
	private String auditOpinion;// get auditOpinion

	/**
	 * auditTime:���ʱ��
	 */
	@Column(name = "auditTime", length = 19)
	private Timestamp auditTime;// get auditTime

	/**
	 * isTransfer:�Ƿ�ת�� 0��δת�� 1����ת��
	 */
	@Column(name = "isTransfer")
	private Integer isTransfer = 0;// get isTransfer

	/**
	 * transferTime:ȷ��ת��ʱ��
	 */
	@Column(name = "transferTime", length = 19)
	private Timestamp transferTime;// get transferTime

	/**
	 * auditUserId:审核人ID
	 */
	@Column(name = "auditUserId")
	private Long auditUserId;// get applyUserId
	
	/**
	 * transferUserId:打款人ID
	 */
	@Column(name = "transferUserId")
	private Long transferUserId;// get applyUserId
	
	
	// Constructors

	/** default constructor */
	public TMallMoneyOutput() {
	}

	/** full constructor */
	public TMallMoneyOutput(Long mallId, Double amount, Long applyUserId,
			Timestamp applyTime, Integer auditStatus, String auditOpinion,
			Timestamp auditTime, Integer isTransfer, Timestamp transferTime,Long auditUserId,Long transferUserId) {
		this.mallId = mallId;
		this.amount = amount;
		this.applyUserId = applyUserId;
		this.applyTime = applyTime;
		this.auditStatus = auditStatus;
		this.auditOpinion = auditOpinion;
		this.auditTime = auditTime;
		this.isTransfer = isTransfer;
		this.transferTime = transferTime;
		this.auditUserId = auditUserId;
		this.transferUserId = transferUserId;
	}

	// Property accessors
	/**
	 * get moneyOutputId
	 */
	public Long getMoneyOutputId() {
		return this.moneyOutputId;
	}

	public void setMoneyOutputId(Long moneyOutputId) {
		this.moneyOutputId = moneyOutputId;
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
	 * get amount
	 */
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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

	/**
	 * get auditOpinion
	 */
	public String getAuditOpinion() {
		return this.auditOpinion;
	}

	public void setAuditOpinion(String auditOpinion) {
		this.auditOpinion = auditOpinion;
	}

	/**
	 * get auditTime
	 */
	public Timestamp getAuditTime() {
		return this.auditTime;
	}

	public void setAuditTime(Timestamp auditTime) {
		this.auditTime = auditTime;
	}

	/**
	 * get isTransfer
	 */
	public Integer getIsTransfer() {
		return this.isTransfer;
	}

	public void setIsTransfer(Integer isTransfer) {
		this.isTransfer = isTransfer;
	}

	/**
	 * get transferTime
	 */
	public Timestamp getTransferTime() {
		return this.transferTime;
	}

	public void setTransferTime(Timestamp transferTime) {
		this.transferTime = transferTime;
	}

	public Long getAuditUserId() {
		return auditUserId;
	}

	public void setAuditUserId(Long auditUserId) {
		this.auditUserId = auditUserId;
	}

	public Long getTransferUserId() {
		return transferUserId;
	}

	public void setTransferUserId(Long transferUserId) {
		this.transferUserId = transferUserId;
	}

	
}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TSmsRecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_sms_record")
public class TSmsRecord implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -901698282L;

	// Fields

	/**
	 * smsRecordId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "smsRecordId", unique = true, nullable = false)
	private Long smsRecordId;// get smsRecordId

	/**
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * mobile:
	 */
	@Column(name = "mobile", length = 2000)
	private String mobile;// get mobile

	/**
	 * content:
	 */
	@Column(name = "content", length = 65535)
	private String content;// get content

	/**
	 * purpose:���磺�޸��ֻ��ȡ��֤�롢�޸������ȡ��֤��
	 */
	@Column(name = "purpose", length = 100)
	private String purpose;// get purpose

	/**
	 * deliveryType:���磺V������
	 */
	@Column(name = "deliveryType", length = 100)
	private String deliveryType;// get deliveryType

	/**
	 * deliverystatus:1��ʾ��,-1��ʾʧ��
	 */
	@Column(name = "deliverystatus")
	private Integer deliverystatus;// get deliverystatus

	/**
	 * addtime:
	 */
	@Column(name = "addtime", length = 19)
	private Timestamp addtime;// get addtime

	/**
	 * captchas:
	 */
	@Column(name = "captchas", length = 10)
	private String captchas;// get captchas

	/**
	 * endtime:
	 */
	@Column(name = "endtime", length = 19)
	private Timestamp endtime;// get endtime

	/**
	 * captchasStatus:0��ʾδ��֤��1��ʾ����֤
	 */
	@Column(name = "captchasStatus")
	private Integer captchasStatus;// get captchasStatus

	// Constructors

	/** default constructor */
	public TSmsRecord() {
	}

	/** full constructor */
	public TSmsRecord(Long userId, String mobile, String content,
			String purpose, String deliveryType, Integer deliverystatus,
			Timestamp addtime, String captchas, Timestamp endtime,
			Integer captchasStatus) {
		this.userId = userId;
		this.mobile = mobile;
		this.content = content;
		this.purpose = purpose;
		this.deliveryType = deliveryType;
		this.deliverystatus = deliverystatus;
		this.addtime = addtime;
		this.captchas = captchas;
		this.endtime = endtime;
		this.captchasStatus = captchasStatus;
	}

	// Property accessors
	/**
	 * get smsRecordId
	 */
	public Long getSmsRecordId() {
		return this.smsRecordId;
	}

	public void setSmsRecordId(Long smsRecordId) {
		this.smsRecordId = smsRecordId;
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
	 * get mobile
	 */
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * get content
	 */
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * get purpose
	 */
	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	/**
	 * get deliveryType
	 */
	public String getDeliveryType() {
		return this.deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	/**
	 * get deliverystatus
	 */
	public Integer getDeliverystatus() {
		return this.deliverystatus;
	}

	public void setDeliverystatus(Integer deliverystatus) {
		this.deliverystatus = deliverystatus;
	}

	/**
	 * get addtime
	 */
	public Timestamp getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	/**
	 * get captchas
	 */
	public String getCaptchas() {
		return this.captchas;
	}

	public void setCaptchas(String captchas) {
		this.captchas = captchas;
	}

	/**
	 * get endtime
	 */
	public Timestamp getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	/**
	 * get captchasStatus
	 */
	public Integer getCaptchasStatus() {
		return this.captchasStatus;
	}

	public void setCaptchasStatus(Integer captchasStatus) {
		this.captchasStatus = captchasStatus;
	}

}
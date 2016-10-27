package com.ecshop.dao.wxserver.sms.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_sms_record")
public class SmsRecord implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name = "persistenceGenerator", strategy = "increment")
	@Column(name="SMSRecordId")
	private Long smsRecordId;
	
	@Column(name="UserId")
	private Long userId; 
	
	@Column(name="Mobile")
	private String mobile; 
	
	@Column(name="Content")
	private String content; 
	
	@Column(name="Purpose")
	private String purpose; 
	
	@Column(name="DeliveryType")
	private String deliveryType; 
	
	@Column(name="Deliverystatus")
	private Integer deliverystatus; 
	
	@Column(name="Addtime")
	private Date addtime; 
	
	@Column(name="Captchas")
	private String captchas; 
	
	@Column(name="Endtime")
	private Date endtime; 
	
	@Column(name="CaptchasStatus")
	private Integer captchasStatus;

	
	
	public Long getSmsRecordId() {
		return smsRecordId;
	}

	public void setSmsRecordId(Long smsRecordId) {
		this.smsRecordId = smsRecordId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public Integer getDeliverystatus() {
		return deliverystatus;
	}

	public void setDeliverystatus(Integer deliverystatus) {
		this.deliverystatus = deliverystatus;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public String getCaptchas() {
		return captchas;
	}

	public void setCaptchas(String captchas) {
		this.captchas = captchas;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Integer getCaptchasStatus() {
		return captchasStatus;
	}

	public void setCaptchasStatus(Integer captchasStatus) {
		this.captchasStatus = captchasStatus;
	} 
	
	
	
}

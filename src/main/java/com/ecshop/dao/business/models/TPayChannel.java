package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TPayChannel entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_pay_channel")
public class TPayChannel implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 144595631L;

	// Fields

	/**
	 * paymentTypeId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PaymentTypeId", unique = true, nullable = false)
	private Long paymentTypeId;// get paymentTypeId

	/**
	 * paymentTypeName:
	 */
	@Column(name = "PaymentTypeName", length = 50)
	private String paymentTypeName;// get paymentTypeName

	/**
	 * channelCode:
	 */
	@Column(name = "ChannelCode", length = 30)
	private String channelCode;// get channelCode

	/**
	 * paymentTypeFee:
	 */
	@Column(name = "PaymentTypeFee", precision = 15)
	private Double paymentTypeFee;// get paymentTypeFee

	/**
	 * status:1�����ã�0��������
	 */
	@Column(name = "Status")
	private Integer status;// get status

	/**
	 * paymentTypePic:
	 */
	@Column(name = "PaymentTypePic")
	private String paymentTypePic;// get paymentTypePic

	/**
	 * paymentTypeUrl:
	 */
	@Column(name = "PaymentTypeUrl")
	private String paymentTypeUrl;// get paymentTypeUrl

	/**
	 * creTime:
	 */
	@Column(name = "CreTime", length = 19)
	private Timestamp creTime;// get creTime

	/**
	 * updTime:
	 */
	@Column(name = "UpdTime", length = 19)
	private Timestamp updTime;// get updTime

	// Constructors

	/** default constructor */
	public TPayChannel() {
	}

	/** full constructor */
	public TPayChannel(String paymentTypeName, String channelCode,
			Double paymentTypeFee, Integer status, String paymentTypePic,
			String paymentTypeUrl, Timestamp creTime, Timestamp updTime) {
		this.paymentTypeName = paymentTypeName;
		this.channelCode = channelCode;
		this.paymentTypeFee = paymentTypeFee;
		this.status = status;
		this.paymentTypePic = paymentTypePic;
		this.paymentTypeUrl = paymentTypeUrl;
		this.creTime = creTime;
		this.updTime = updTime;
	}

	// Property accessors
	/**
	 * get paymentTypeId
	 */
	public Long getPaymentTypeId() {
		return this.paymentTypeId;
	}

	public void setPaymentTypeId(Long paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	/**
	 * get paymentTypeName
	 */
	public String getPaymentTypeName() {
		return this.paymentTypeName;
	}

	public void setPaymentTypeName(String paymentTypeName) {
		this.paymentTypeName = paymentTypeName;
	}

	/**
	 * get channelCode
	 */
	public String getChannelCode() {
		return this.channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	/**
	 * get paymentTypeFee
	 */
	public Double getPaymentTypeFee() {
		return this.paymentTypeFee;
	}

	public void setPaymentTypeFee(Double paymentTypeFee) {
		this.paymentTypeFee = paymentTypeFee;
	}

	/**
	 * get status
	 */
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * get paymentTypePic
	 */
	public String getPaymentTypePic() {
		return this.paymentTypePic;
	}

	public void setPaymentTypePic(String paymentTypePic) {
		this.paymentTypePic = paymentTypePic;
	}

	/**
	 * get paymentTypeUrl
	 */
	public String getPaymentTypeUrl() {
		return this.paymentTypeUrl;
	}

	public void setPaymentTypeUrl(String paymentTypeUrl) {
		this.paymentTypeUrl = paymentTypeUrl;
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

	/**
	 * get updTime
	 */
	public Timestamp getUpdTime() {
		return this.updTime;
	}

	public void setUpdTime(Timestamp updTime) {
		this.updTime = updTime;
	}

}
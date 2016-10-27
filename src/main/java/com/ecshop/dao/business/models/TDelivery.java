package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TDelivery entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_delivery")
public class TDelivery implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -614208408L;

	// Fields

	/**
	 * deliveryId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "deliveryId", unique = true, nullable = false)
	private Long deliveryId;// get deliveryId

	/**
	 * deliveryNo:��������
	 */
	@Column(name = "deliveryNo", length = 30)
	private String deliveryNo;// get deliveryNo

	/**
	 * orderId:����ID
	 */
	@Column(name = "orderId")
	private Long orderId;// get orderId

	/**
	 * deliveryTime:
	 */
	@Column(name = "deliveryTime", length = 19)
	private Timestamp deliveryTime;// get deliveryTime

	/**
	 * logisticsId:����ID
	 */
	@Column(name = "logisticsId")
	private Long logisticsId;// get logisticsId

	/**
	 * deliveryAddrId:
	 */
	@Column(name = "deliveryAddrId")
	private Long deliveryAddrId;// get deliveryAddrId

	/**
	 * logisticsName:�������
	 */
	@Column(name = "logisticsName", length = 100)
	private String logisticsName;// get logisticsName

	/**
	 * logisticsNo:��������
	 */
	@Column(name = "logisticsNo", length = 30)
	private String logisticsNo;// get logisticsNo

	/**
	 * status:0��δ���� 1���ѷ��� 2��ȡ���
	 */
	@Column(name = "status")
	private Integer status;// get status

	/**
	 * remark:
	 */
	@Column(name = "remark", length = 200)
	private String remark;// get remark

	// Constructors

	/** default constructor */
	public TDelivery() {
	}

	/** full constructor */
	public TDelivery(String deliveryNo, Long orderId, Timestamp deliveryTime,
			Long logisticsId, Long deliveryAddrId, String logisticsName,
			String logisticsNo, Integer status, String remark) {
		this.deliveryNo = deliveryNo;
		this.orderId = orderId;
		this.deliveryTime = deliveryTime;
		this.logisticsId = logisticsId;
		this.deliveryAddrId = deliveryAddrId;
		this.logisticsName = logisticsName;
		this.logisticsNo = logisticsNo;
		this.status = status;
		this.remark = remark;
	}

	// Property accessors
	/**
	 * get deliveryId
	 */
	public Long getDeliveryId() {
		return this.deliveryId;
	}

	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}

	/**
	 * get deliveryNo
	 */
	public String getDeliveryNo() {
		return this.deliveryNo;
	}

	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	/**
	 * get orderId
	 */
	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * get deliveryTime
	 */
	public Timestamp getDeliveryTime() {
		return this.deliveryTime;
	}

	public void setDeliveryTime(Timestamp deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	/**
	 * get logisticsId
	 */
	public Long getLogisticsId() {
		return this.logisticsId;
	}

	public void setLogisticsId(Long logisticsId) {
		this.logisticsId = logisticsId;
	}

	/**
	 * get deliveryAddrId
	 */
	public Long getDeliveryAddrId() {
		return this.deliveryAddrId;
	}

	public void setDeliveryAddrId(Long deliveryAddrId) {
		this.deliveryAddrId = deliveryAddrId;
	}

	/**
	 * get logisticsName
	 */
	public String getLogisticsName() {
		return this.logisticsName;
	}

	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	/**
	 * get logisticsNo
	 */
	public String getLogisticsNo() {
		return this.logisticsNo;
	}

	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
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
	 * get remark
	 */
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
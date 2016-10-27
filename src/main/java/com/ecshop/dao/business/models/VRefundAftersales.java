package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VRefundAftersales entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_refund_aftersales")
public class VRefundAftersales implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 421014206L;

	// Fields

	/**
	 * refundId:
	 */
	@Id
	@Column(name = "refundId", nullable = false)
	private Long refundId;// get refundId

	/**
	 * goodNum:
	 */
	@Column(name = "goodNum")
	private Integer goodNum;// get goodNum

	/**
	 * amount:
	 */
	@Column(name = "amount", nullable = false, precision = 15)
	private Double amount;// get amount

	/**
	 * refundTime:
	 */
	@Column(name = "refundTime", nullable = false, length = 19)
	private Timestamp refundTime;// get refundTime

	/**
	 * endtime:
	 */
	@Column(name = "endtime", length = 19)
	private Timestamp endtime;// get endtime

	/**
	 * statusRefund:0�ȴ�����˿� 1���˿�
	 */
	@Column(name = "statusRefund", nullable = false)
	private Integer statusRefund;// get statusRefund

	/**
	 * afterSalesId:
	 */
	@Column(name = "afterSalesId")
	private Long afterSalesId;// get afterSalesId

	/**
	 * afterSalesTime:�ۺ�����ʱ��
	 */
	@Column(name = "afterSalesTime", length = 19)
	private Timestamp afterSalesTime;// get afterSalesTime

	/**
	 * goodsName:��Ʒ���
	 */
	@Column(name = "goodsName", length = 100)
	private String goodsName;// get goodsName

	/**
	 * username:
	 */
	@Column(name = "username", length = 50)
	private String username;// get username

	/**
	 * statusAfterSales:0���ȴ����Ҵ��� 1���ȴ���Ҵ��� 2���ȴ�����ջ� 3���ȴ������
	 * 4�����˿� 5���ѻ��� 6�����Ҿܾ�
	 */
	@Column(name = "statusAfterSales")
	private Integer statusAfterSales;// get statusAfterSales

	/**
	 * mallName:
	 */
	@Column(name = "mallName", length = 50)
	private String mallName;// get mallName

	// Constructors

	/** default constructor */
	public VRefundAftersales() {
	}

	/** minimal constructor */
	public VRefundAftersales(Long refundId, Double amount,
			Timestamp refundTime, Integer statusRefund) {
		this.refundId = refundId;
		this.amount = amount;
		this.refundTime = refundTime;
		this.statusRefund = statusRefund;
	}

	/** full constructor */
	public VRefundAftersales(Long refundId, Integer goodNum, Double amount,
			Timestamp refundTime, Timestamp endtime, Integer statusRefund,
			Long afterSalesId, Timestamp afterSalesTime, String goodsName,
			String username, Integer statusAfterSales, String mallName) {
		this.refundId = refundId;
		this.goodNum = goodNum;
		this.amount = amount;
		this.refundTime = refundTime;
		this.endtime = endtime;
		this.statusRefund = statusRefund;
		this.afterSalesId = afterSalesId;
		this.afterSalesTime = afterSalesTime;
		this.goodsName = goodsName;
		this.username = username;
		this.statusAfterSales = statusAfterSales;
		this.mallName = mallName;
	}

	// Property accessors
	/**
	 * get refundId
	 */
	public Long getRefundId() {
		return this.refundId;
	}

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	/**
	 * get goodNum
	 */
	public Integer getGoodNum() {
		return this.goodNum;
	}

	public void setGoodNum(Integer goodNum) {
		this.goodNum = goodNum;
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
	 * get refundTime
	 */
	public Timestamp getRefundTime() {
		return this.refundTime;
	}

	public void setRefundTime(Timestamp refundTime) {
		this.refundTime = refundTime;
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
	 * get statusRefund
	 */
	public Integer getStatusRefund() {
		return this.statusRefund;
	}

	public void setStatusRefund(Integer statusRefund) {
		this.statusRefund = statusRefund;
	}

	/**
	 * get afterSalesId
	 */
	public Long getAfterSalesId() {
		return this.afterSalesId;
	}

	public void setAfterSalesId(Long afterSalesId) {
		this.afterSalesId = afterSalesId;
	}

	/**
	 * get afterSalesTime
	 */
	public Timestamp getAfterSalesTime() {
		return this.afterSalesTime;
	}

	public void setAfterSalesTime(Timestamp afterSalesTime) {
		this.afterSalesTime = afterSalesTime;
	}

	/**
	 * get goodsName
	 */
	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * get username
	 */
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * get statusAfterSales
	 */
	public Integer getStatusAfterSales() {
		return this.statusAfterSales;
	}

	public void setStatusAfterSales(Integer statusAfterSales) {
		this.statusAfterSales = statusAfterSales;
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
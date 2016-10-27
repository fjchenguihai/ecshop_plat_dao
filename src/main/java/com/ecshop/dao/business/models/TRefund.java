package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TRefund entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_refund")
public class TRefund implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -315081492L;

	// Fields

	/**
	 * refundId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "refundId", unique = true, nullable = false)
	private Long refundId;// get refundId

	/**
	 * goodId:��ƷID
	 */
	@Column(name = "goodId")
	private Long goodId;// get goodId

	/**
	 * goodsItemId:��Ʒ��ID
	 */
	@Column(name = "goodsItemId")
	private Long goodsItemId;// get goodsItemId

	/**
	 * orderId:
	 */
	@Column(name = "orderId")
	private Long orderId;// get orderId

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
	 * status:0�ȴ�����˿� 1���˿�
	 */
	@Column(name = "status", nullable = false)
	private Integer status;// get status

	/**
	 * remark:
	 */
	@Column(name = "remark", length = 100)
	private String remark;// get remark

	/**
	 * afterSaleId:�����ۺ�
	 */
	@Column(name = "afterSaleId")
	private Long afterSaleId;// get afterSaleId

	// Constructors

	/** default constructor */
	public TRefund() {
	}

	/** minimal constructor */
	public TRefund(Double amount, Timestamp refundTime, Integer status) {
		this.amount = amount;
		this.refundTime = refundTime;
		this.status = status;
	}

	/** full constructor */
	public TRefund(Long goodId, Long goodsItemId, Long orderId,
			Integer goodNum, Double amount, Timestamp refundTime,
			Timestamp endtime, Integer status, String remark, Long afterSaleId) {
		this.goodId = goodId;
		this.goodsItemId = goodsItemId;
		this.orderId = orderId;
		this.goodNum = goodNum;
		this.amount = amount;
		this.refundTime = refundTime;
		this.endtime = endtime;
		this.status = status;
		this.remark = remark;
		this.afterSaleId = afterSaleId;
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
	 * get goodId
	 */
	public Long getGoodId() {
		return this.goodId;
	}

	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}

	/**
	 * get goodsItemId
	 */
	public Long getGoodsItemId() {
		return this.goodsItemId;
	}

	public void setGoodsItemId(Long goodsItemId) {
		this.goodsItemId = goodsItemId;
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

	/**
	 * get afterSaleId
	 */
	public Long getAfterSaleId() {
		return this.afterSaleId;
	}

	public void setAfterSaleId(Long afterSaleId) {
		this.afterSaleId = afterSaleId;
	}

}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCheckLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_check_log")
public class TCheckLog implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 99195280L;

	// Fields

	/**
	 * checkLogId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "checkLogId", unique = true, nullable = false)
	private Long checkLogId;// get checkLogId

	/**
	 * weixinOpenId:
	 */
	@Column(name = "weixinOpenId", nullable = false, length = 100)
	private String weixinOpenId;// get weixinOpenId

	/**
	 * mallId:
	 */
	@Column(name = "mallId", nullable = false)
	private Long mallId;// get mallId

	/**
	 * orderId:
	 */
	@Column(name = "orderId", nullable = false)
	private Long orderId;// get orderId

	/**
	 * nickName:
	 */
	@Column(name = "nickName", length = 100)
	private String nickName;// get nickName

	/**
	 * checkTime:
	 */
	@Column(name = "checkTime", length = 19)
	private Timestamp checkTime;// get checkTime

	/**
	 * headimgurl:
	 */
	@Column(name = "headimgurl", length = 300)
	private String headimgurl;// get headimgurl

	/**
	 * remark:
	 */
	@Column(name = "remark", length = 1000)
	private String remark;// get remark

	// Constructors

	/** default constructor */
	public TCheckLog() {
	}

	/** minimal constructor */
	public TCheckLog(String weixinOpenId, Long mallId, Long orderId) {
		this.weixinOpenId = weixinOpenId;
		this.mallId = mallId;
		this.orderId = orderId;
	}

	/** full constructor */
	public TCheckLog(String weixinOpenId, Long mallId, Long orderId,
			String nickName, Timestamp checkTime, String headimgurl,
			String remark) {
		this.weixinOpenId = weixinOpenId;
		this.mallId = mallId;
		this.orderId = orderId;
		this.nickName = nickName;
		this.checkTime = checkTime;
		this.headimgurl = headimgurl;
		this.remark = remark;
	}

	// Property accessors
	/**
	 * get checkLogId
	 */
	public Long getCheckLogId() {
		return this.checkLogId;
	}

	public void setCheckLogId(Long checkLogId) {
		this.checkLogId = checkLogId;
	}

	/**
	 * get weixinOpenId
	 */
	public String getWeixinOpenId() {
		return this.weixinOpenId;
	}

	public void setWeixinOpenId(String weixinOpenId) {
		this.weixinOpenId = weixinOpenId;
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
	 * get orderId
	 */
	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * get nickName
	 */
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * get checkTime
	 */
	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	/**
	 * get headimgurl
	 */
	public String getHeadimgurl() {
		return this.headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
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
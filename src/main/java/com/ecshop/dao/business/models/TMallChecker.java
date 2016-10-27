package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallChecker entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_checker")
public class TMallChecker implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -834859507L;

	// Fields

	/**
	 * mallCheckerId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "mallCheckerId", unique = true, nullable = false)
	private Long mallCheckerId;// get mallCheckerId

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
	 * status:
	 */
	@Column(name = "status", nullable = false)
	private Integer status = 0;// get status

	/**
	 * updateTime:
	 */
	@Column(name = "updateTime", nullable = false, length = 19)
	private Timestamp updateTime;// get updateTime

	/**
	 * nickName:
	 */
	@Column(name = "nickName", length = 100)
	private String nickName;// get nickName

	/**
	 * applyTime:
	 */
	@Column(name = "applyTime", length = 19)
	private Timestamp applyTime;// get applyTime

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
	public TMallChecker() {
	}

	/** minimal constructor */
	public TMallChecker(String weixinOpenId, Long mallId, Integer status,
			Timestamp updateTime) {
		this.weixinOpenId = weixinOpenId;
		this.mallId = mallId;
		this.status = status;
		this.updateTime = updateTime;
	}

	/** full constructor */
	public TMallChecker(String weixinOpenId, Long mallId, Integer status,
			Timestamp updateTime, String nickName, Timestamp applyTime,
			String headimgurl, String remark) {
		this.weixinOpenId = weixinOpenId;
		this.mallId = mallId;
		this.status = status;
		this.updateTime = updateTime;
		this.nickName = nickName;
		this.applyTime = applyTime;
		this.headimgurl = headimgurl;
		this.remark = remark;
	}

	// Property accessors
	/**
	 * get mallCheckerId
	 */
	public Long getMallCheckerId() {
		return this.mallCheckerId;
	}

	public void setMallCheckerId(Long mallCheckerId) {
		this.mallCheckerId = mallCheckerId;
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
	 * get status
	 */
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * get updateTime
	 */
	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
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
	 * get applyTime
	 */
	public Timestamp getApplyTime() {
		return this.applyTime;
	}

	public void setApplyTime(Timestamp applyTime) {
		this.applyTime = applyTime;
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
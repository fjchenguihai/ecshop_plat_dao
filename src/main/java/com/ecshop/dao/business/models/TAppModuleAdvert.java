package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAppModuleAdvert entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_app_module_advert")
public class TAppModuleAdvert implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 888449837L;

	// Fields

	/**
	 * moduleAdvertId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "moduleAdvertId", unique = true, nullable = false)
	private Long moduleAdvertId;// get moduleAdvertId

	/**
	 * adverstJson:
	 */
	@Column(name = "adverstJson", length = 512)
	private String adverstJson;// get adverstJson

	/**
	 * scope:0��ƽ̨ 1������
	 */
	@Column(name = "scope")
	private Short scope;// get scope

	/**
	 * centerId:��Ϊ����ʱָ��������Ӫ����ID
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	/**
	 * orderNo:9999
	 */
	@Column(name = "orderNo")
	private Integer orderNo;// get orderNo

	/**
	 * creTime:
	 */
	@Column(name = "creTime", length = 19)
	private Timestamp creTime;// get creTime

	// Constructors

	/** default constructor */
	public TAppModuleAdvert() {
	}

	/** full constructor */
	public TAppModuleAdvert(String adverstJson, Short scope, Long centerId,
			Integer orderNo, Timestamp creTime) {
		this.adverstJson = adverstJson;
		this.scope = scope;
		this.centerId = centerId;
		this.orderNo = orderNo;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get moduleAdvertId
	 */
	public Long getModuleAdvertId() {
		return this.moduleAdvertId;
	}

	public void setModuleAdvertId(Long moduleAdvertId) {
		this.moduleAdvertId = moduleAdvertId;
	}

	/**
	 * get adverstJson
	 */
	public String getAdverstJson() {
		return this.adverstJson;
	}

	public void setAdverstJson(String adverstJson) {
		this.adverstJson = adverstJson;
	}

	/**
	 * get scope
	 */
	public Short getScope() {
		return this.scope;
	}

	public void setScope(Short scope) {
		this.scope = scope;
	}

	/**
	 * get centerId
	 */
	public Long getCenterId() {
		return this.centerId;
	}

	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}

	/**
	 * get orderNo
	 */
	public Integer getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
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

}
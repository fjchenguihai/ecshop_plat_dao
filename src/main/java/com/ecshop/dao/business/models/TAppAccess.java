package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAppAccess entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_app_access")
public class TAppAccess implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -649888527L;

	// Fields

	/**
	 * accessId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "accessId", unique = true, nullable = false)
	private Long accessId;// get accessId

	/**
	 * accessName:����Ӧ�õ����
	 */
	@Column(name = "accessName", length = 40)
	private String accessName;// get accessName

	/**
	 * appId:��ɽ���Ӧ�õ�Ψһ��ʾ
	 */
	@Column(name = "appId", length = 32)
	private String appId;// get appId

	/**
	 * secretKey:Ӧ�ü�����Կ
	 */
	@Column(name = "secretKey", length = 32)
	private String secretKey;// get secretKey

	/**
	 * creTime:
	 */
	@Column(name = "creTime", length = 19)
	private Timestamp creTime;// get creTime

	// Constructors

	/** default constructor */
	public TAppAccess() {
	}

	/** full constructor */
	public TAppAccess(String accessName, String appId, String secretKey,
			Timestamp creTime) {
		this.accessName = accessName;
		this.appId = appId;
		this.secretKey = secretKey;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get accessId
	 */
	public Long getAccessId() {
		return this.accessId;
	}

	public void setAccessId(Long accessId) {
		this.accessId = accessId;
	}

	/**
	 * get accessName
	 */
	public String getAccessName() {
		return this.accessName;
	}

	public void setAccessName(String accessName) {
		this.accessName = accessName;
	}

	/**
	 * get appId
	 */
	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * get secretKey
	 */
	public String getSecretKey() {
		return this.secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
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
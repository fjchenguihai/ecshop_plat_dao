package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAfterSalesLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_after_sales_log")
public class TAfterSalesLog implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 322231456L;

	// Fields

	/**
	 * logId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "logId", unique = true, nullable = false)
	private Long logId;// get logId

	/**
	 * afterSalesId:
	 */
	@Column(name = "afterSalesId")
	private Long afterSalesId;// get afterSalesId

	/**
	 * adminId:
	 */
	@Column(name = "adminId")
	private Long adminId;// get adminId

	/**
	 * username:
	 */
	@Column(name = "username", length = 50)
	private String username;// get username

	/**
	 * content:
	 */
	@Column(name = "content", length = 200)
	private String content;// get content

	/**
	 * addtime:
	 */
	@Column(name = "addtime", length = 19)
	private Timestamp addtime;// get addtime

	// Constructors

	/** default constructor */
	public TAfterSalesLog() {
	}

	/** full constructor */
	public TAfterSalesLog(Long afterSalesId, Long adminId, String username,
			String content, Timestamp addtime) {
		this.afterSalesId = afterSalesId;
		this.adminId = adminId;
		this.username = username;
		this.content = content;
		this.addtime = addtime;
	}

	// Property accessors
	/**
	 * get logId
	 */
	public Long getLogId() {
		return this.logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
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
	 * get adminId
	 */
	public Long getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
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
	 * get content
	 */
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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

}
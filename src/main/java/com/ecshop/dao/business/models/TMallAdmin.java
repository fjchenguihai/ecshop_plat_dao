package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallAdmin entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_admin")
public class TMallAdmin implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 707786663L;

	// Fields

	/**
	 * adminId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "adminId", unique = true, nullable = false)
	private Long adminId;// get adminId

	/**
	 * account:
	 */
	@Column(name = "account", nullable = false, length = 50)
	private String account;// get account

	/**
	 * password:
	 */
	@Column(name = "password", nullable = false, length = 50)
	private String password;// get password

	/**
	 * username:
	 */
	@Column(name = "username", nullable = false, length = 30)
	private String username;// get username

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * stationId:
	 */
	@Column(name = "stationId")
	private Long stationId;// get stationId

	/**
	 * email:
	 */
	@Column(name = "email", length = 100)
	private String email;// get email

	/**
	 * phone:
	 */
	@Column(name = "phone", length = 30)
	private String phone;// get phone

	/**
	 * addtime:
	 */
	@Column(name = "addtime", length = 19)
	private Timestamp addtime;// get addtime

	/**
	 * status:1��ʾ���ã�0��ʾ����
	 */
	@Column(name = "status", nullable = false)
	private Integer status;// get status

	/**
	 * remark:
	 */
	@Column(name = "remark", length = 65535)
	private String remark;// get remark

	// Constructors

	/** default constructor */
	public TMallAdmin() {
	}

	/** minimal constructor */
	public TMallAdmin(String account, String password, String username,
			Integer status) {
		this.account = account;
		this.password = password;
		this.username = username;
		this.status = status;
	}

	/** full constructor */
	public TMallAdmin(String account, String password, String username,
			Long mallId, Long stationId, String email, String phone,
			Timestamp addtime, Integer status, String remark) {
		this.account = account;
		this.password = password;
		this.username = username;
		this.mallId = mallId;
		this.stationId = stationId;
		this.email = email;
		this.phone = phone;
		this.addtime = addtime;
		this.status = status;
		this.remark = remark;
	}

	// Property accessors
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
	 * get account
	 */
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * get password
	 */
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	 * get mallId
	 */
	public Long getMallId() {
		return this.mallId;
	}

	public void setMallId(Long mallId) {
		this.mallId = mallId;
	}

	/**
	 * get stationId
	 */
	public Long getStationId() {
		return this.stationId;
	}

	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}

	/**
	 * get email
	 */
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * get phone
	 */
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
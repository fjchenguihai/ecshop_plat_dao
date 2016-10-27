package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VMallAdmin entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_mall_admin")
public class VMallAdmin implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 314759653L;

	// Fields

	/**
	 * adminId:
	 */
	@Id
	@Column(name = "adminId", nullable = false)
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

	/**
	 * mallName:
	 */
	@Column(name = "mallName", length = 50)
	private String mallName;// get mallName

	/**
	 * mallType:0����ͨ 1����Ӫ
	 */
	@Column(name = "mallType")
	private Integer mallType;// get mallType

	/**
	 * stationType:0��վ���̼����ҽ�ֻ��һ������1��վ
	 */
	@Column(name = "stationType")
	private Integer stationType;// get stationType

	/**
	 * stationName:
	 */
	@Column(name = "stationName", length = 100)
	private String stationName;// get stationName

	/**
	 * roleId:
	 */
	@Column(name = "roleId")
	private Long roleId;// get roleId

	/**
	 * roleName:
	 */
	@Column(name = "roleName", length = 30)
	private String roleName;// get roleName

	/**
	 * roleKey:
	 */
	@Column(name = "roleKey", length = 50)
	private String roleKey;// get roleKey

	// Constructors

	/** default constructor */
	public VMallAdmin() {
	}

	/** minimal constructor */
	public VMallAdmin(Long adminId, String account, String password,
			String username, Integer status) {
		this.adminId = adminId;
		this.account = account;
		this.password = password;
		this.username = username;
		this.status = status;
	}

	/** full constructor */
	public VMallAdmin(Long adminId, String account, String password,
			String username, Long mallId, Long stationId, String email,
			String phone, Timestamp addtime, Integer status, String remark,
			String mallName, Integer mallType, Integer stationType,
			String stationName, Long roleId, String roleName, String roleKey) {
		this.adminId = adminId;
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
		this.mallName = mallName;
		this.mallType = mallType;
		this.stationType = stationType;
		this.stationName = stationName;
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleKey = roleKey;
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

	/**
	 * get mallName
	 */
	public String getMallName() {
		return this.mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	/**
	 * get mallType
	 */
	public Integer getMallType() {
		return this.mallType;
	}

	public void setMallType(Integer mallType) {
		this.mallType = mallType;
	}

	/**
	 * get stationType
	 */
	public Integer getStationType() {
		return this.stationType;
	}

	public void setStationType(Integer stationType) {
		this.stationType = stationType;
	}

	/**
	 * get stationName
	 */
	public String getStationName() {
		return this.stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	/**
	 * get roleId
	 */
	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * get roleName
	 */
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * get roleKey
	 */
	public String getRoleKey() {
		return this.roleKey;
	}

	public void setRoleKey(String roleKey) {
		this.roleKey = roleKey;
	}

}
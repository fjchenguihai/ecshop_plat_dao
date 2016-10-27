package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TRole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_role")
public class TRole implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 80128746L;

	// Fields

	/**
	 * roleId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "roleId", unique = true, nullable = false)
	private Long roleId;// get roleId

	/**
	 * roleName:
	 */
	@Column(name = "roleName", nullable = false, length = 30)
	private String roleName;// get roleName

	/**
	 * roleKey:
	 */
	@Column(name = "roleKey", nullable = false, length = 50)
	private String roleKey;// get roleKey

	/**
	 * remarks:
	 */
	@Column(name = "remarks", length = 65535)
	private String remarks;// get remarks

	/**
	 * status:1��ʾ���ã�0��ʾ������
	 */
	@Column(name = "status", nullable = false)
	private Integer status;// get status

	// Constructors

	/** default constructor */
	public TRole() {
	}

	/** minimal constructor */
	public TRole(String roleName, String roleKey, Integer status) {
		this.roleName = roleName;
		this.roleKey = roleKey;
		this.status = status;
	}

	/** full constructor */
	public TRole(String roleName, String roleKey, String remarks, Integer status) {
		this.roleName = roleName;
		this.roleKey = roleKey;
		this.remarks = remarks;
		this.status = status;
	}

	// Property accessors
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

	/**
	 * get remarks
	 */
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

}
package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAdminRole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_admin_role")
public class TAdminRole implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1596459407L;

	// Fields

	/**
	 * adminRoleId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "adminRoleId", unique = true, nullable = false)
	private Long adminRoleId;// get adminRoleId

	/**
	 * adminId:
	 */
	@Column(name = "adminId")
	private Long adminId;// get adminId

	/**
	 * roleId:
	 */
	@Column(name = "roleId")
	private Long roleId;// get roleId
	
	@Column(name = "userType")
	private Integer userType;

	// Constructors

	/** default constructor */
	public TAdminRole() {
	}

	/** full constructor */
	public TAdminRole(Long adminId, Long roleId) {
		this.adminId = adminId;
		this.roleId = roleId;
	}

	// Property accessors
	/**
	 * get adminRoleId
	 */
	public Long getAdminRoleId() {
		return this.adminRoleId;
	}

	public void setAdminRoleId(Long adminRoleId) {
		this.adminRoleId = adminRoleId;
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
	 * get roleId
	 */
	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	
	

}
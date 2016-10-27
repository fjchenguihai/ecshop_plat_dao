package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallAdminRole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_admin_role")
public class TMallAdminRole implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 481607869L;

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

	// Constructors

	/** default constructor */
	public TMallAdminRole() {
	}

	/** full constructor */
	public TMallAdminRole(Long adminId, Long roleId) {
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

}
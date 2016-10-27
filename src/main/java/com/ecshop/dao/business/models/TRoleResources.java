package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TRoleResources entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_role_resources")
public class TRoleResources implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 192469595L;

	// Fields

	/**
	 * roleResourcesId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "RoleResourcesId", unique = true, nullable = false)
	private Long roleResourcesId;// get roleResourcesId

	/**
	 * roleId:
	 */
	@Column(name = "roleId")
	private Long roleId;// get roleId

	/**
	 * resourcesId:
	 */
	@Column(name = "ResourcesId")
	private Long resourcesId;// get resourcesId

	// Constructors

	/** default constructor */
	public TRoleResources() {
	}

	/** full constructor */
	public TRoleResources(Long roleId, Long resourcesId) {
		this.roleId = roleId;
		this.resourcesId = resourcesId;
	}

	// Property accessors
	/**
	 * get roleResourcesId
	 */
	public Long getRoleResourcesId() {
		return this.roleResourcesId;
	}

	public void setRoleResourcesId(Long roleResourcesId) {
		this.roleResourcesId = roleResourcesId;
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
	 * get resourcesId
	 */
	public Long getResourcesId() {
		return this.resourcesId;
	}

	public void setResourcesId(Long resourcesId) {
		this.resourcesId = resourcesId;
	}

}
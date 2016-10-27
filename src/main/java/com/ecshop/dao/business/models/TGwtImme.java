package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TGwtImme entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_gwt_imme")
public class TGwtImme implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1823254932L;

	// Fields

	/**
	 * immeId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "immeId", unique = true, nullable = false)
	private Long immeId;// get immeId

	/**
	 * immeCode:
	 */
	@Column(name = "immeCode", length = 32)
	private String immeCode;// get immeCode

	/**
	 * useTime:
	 */
	@Column(name = "useTime", length = 19)
	private Timestamp useTime;// get useTime

	// Constructors

	/** default constructor */
	public TGwtImme() {
	}

	/** full constructor */
	public TGwtImme(String immeCode, Timestamp useTime) {
		this.immeCode = immeCode;
		this.useTime = useTime;
	}

	// Property accessors
	/**
	 * get immeId
	 */
	public Long getImmeId() {
		return this.immeId;
	}

	public void setImmeId(Long immeId) {
		this.immeId = immeId;
	}

	/**
	 * get immeCode
	 */
	public String getImmeCode() {
		return this.immeCode;
	}

	public void setImmeCode(String immeCode) {
		this.immeCode = immeCode;
	}

	/**
	 * get useTime
	 */
	public Timestamp getUseTime() {
		return this.useTime;
	}

	public void setUseTime(Timestamp useTime) {
		this.useTime = useTime;
	}

}
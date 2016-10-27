package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TUsertype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_usertype")
public class TUsertype implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1703186951L;

	// Fields

	/**
	 * usertypeId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "usertypeId", unique = true, nullable = false)
	private Long usertypeId;// get usertypeId

	/**
	 * usertypeName:
	 */
	@Column(name = "usertypeName", length = 50)
	private String usertypeName;// get usertypeName

	/**
	 * usertypeIntro:
	 */
	@Column(name = "usertypeIntro", length = 2000)
	private String usertypeIntro;// get usertypeIntro

	/**
	 * addtime:
	 */
	@Column(name = "addtime", length = 19)
	private Timestamp addtime;// get addtime

	/**
	 * disablestatus:1��ʾ�� -1��ʾ����
	 */
	@Column(name = "disablestatus")
	private Integer disablestatus;// get disablestatus

	/**
	 * deletestatus:1��ʾ�� -1��ʾɾ��
	 */
	@Column(name = "deletestatus")
	private Integer deletestatus;// get deletestatus

	// Constructors

	/** default constructor */
	public TUsertype() {
	}

	/** full constructor */
	public TUsertype(String usertypeName, String usertypeIntro,
			Timestamp addtime, Integer disablestatus, Integer deletestatus) {
		this.usertypeName = usertypeName;
		this.usertypeIntro = usertypeIntro;
		this.addtime = addtime;
		this.disablestatus = disablestatus;
		this.deletestatus = deletestatus;
	}

	// Property accessors
	/**
	 * get usertypeId
	 */
	public Long getUsertypeId() {
		return this.usertypeId;
	}

	public void setUsertypeId(Long usertypeId) {
		this.usertypeId = usertypeId;
	}

	/**
	 * get usertypeName
	 */
	public String getUsertypeName() {
		return this.usertypeName;
	}

	public void setUsertypeName(String usertypeName) {
		this.usertypeName = usertypeName;
	}

	/**
	 * get usertypeIntro
	 */
	public String getUsertypeIntro() {
		return this.usertypeIntro;
	}

	public void setUsertypeIntro(String usertypeIntro) {
		this.usertypeIntro = usertypeIntro;
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
	 * get disablestatus
	 */
	public Integer getDisablestatus() {
		return this.disablestatus;
	}

	public void setDisablestatus(Integer disablestatus) {
		this.disablestatus = disablestatus;
	}

	/**
	 * get deletestatus
	 */
	public Integer getDeletestatus() {
		return this.deletestatus;
	}

	public void setDeletestatus(Integer deletestatus) {
		this.deletestatus = deletestatus;
	}

}
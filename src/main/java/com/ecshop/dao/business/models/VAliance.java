package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VAliance entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_aliance")
public class VAliance implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 307947191L;

	// Fields

	/**
	 * alianceId:����ID
	 */
	@Id
	@Column(name = "alianceId", nullable = false)
	private Long alianceId;// get alianceId

	/**
	 * alianceName:�������
	 */
	@Column(name = "alianceName", length = 100)
	private String alianceName;// get alianceName

	/**
	 * mallId:�����̼�id
	 */
	@Column(name = "mallId", nullable = false)
	private Long mallId;// get mallId

	/**
	 * userId:������
	 */
	@Column(name = "userId", nullable = false)
	private Long userId;// get userId

	/**
	 * creTime:����ʱ��
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "creTime", length = 10)
	private Date creTime;// get creTime

	/**
	 * status:״̬ 0 δ��� 1��ͨ�� 2 ��δͨ��
	 */
	@Column(name = "status")
	private Short status;// get status

	/**
	 * auditUserId:�����
	 */
	@Column(name = "auditUserId")
	private Long auditUserId;// get auditUserId

	/**
	 * auditTime:���ʱ��
	 */
	@Column(name = "auditTime", length = 19)
	private Timestamp auditTime;// get auditTime

	/**
	 * remark:���
	 */
	@Column(name = "remark")
	private String remark;// get remark

	/**
	 * mallName:
	 */
	@Column(name = "mallName", length = 50)
	private String mallName;// get mallName

	/**
	 * username:
	 */
	@Column(name = "username", length = 50)
	private String username;// get username

	/**
	 * realname:
	 */
	@Column(name = "Realname", length = 50)
	private String realname;// get realname

	// Constructors

	/** default constructor */
	public VAliance() {
	}

	/** minimal constructor */
	public VAliance(Long alianceId, Long mallId, Long userId) {
		this.alianceId = alianceId;
		this.mallId = mallId;
		this.userId = userId;
	}

	/** full constructor */
	public VAliance(Long alianceId, String alianceName, Long mallId,
			Long userId, Date creTime, Short status, Long auditUserId,
			Timestamp auditTime, String remark, String mallName,
			String username, String realname) {
		this.alianceId = alianceId;
		this.alianceName = alianceName;
		this.mallId = mallId;
		this.userId = userId;
		this.creTime = creTime;
		this.status = status;
		this.auditUserId = auditUserId;
		this.auditTime = auditTime;
		this.remark = remark;
		this.mallName = mallName;
		this.username = username;
		this.realname = realname;
	}

	// Property accessors
	/**
	 * get alianceId
	 */
	public Long getAlianceId() {
		return this.alianceId;
	}

	public void setAlianceId(Long alianceId) {
		this.alianceId = alianceId;
	}

	/**
	 * get alianceName
	 */
	public String getAlianceName() {
		return this.alianceName;
	}

	public void setAlianceName(String alianceName) {
		this.alianceName = alianceName;
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
	 * get userId
	 */
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * get creTime
	 */
	public Date getCreTime() {
		return this.creTime;
	}

	public void setCreTime(Date creTime) {
		this.creTime = creTime;
	}

	/**
	 * get status
	 */
	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	/**
	 * get auditUserId
	 */
	public Long getAuditUserId() {
		return this.auditUserId;
	}

	public void setAuditUserId(Long auditUserId) {
		this.auditUserId = auditUserId;
	}

	/**
	 * get auditTime
	 */
	public Timestamp getAuditTime() {
		return this.auditTime;
	}

	public void setAuditTime(Timestamp auditTime) {
		this.auditTime = auditTime;
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
	 * get username
	 */
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * get realname
	 */
	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

}
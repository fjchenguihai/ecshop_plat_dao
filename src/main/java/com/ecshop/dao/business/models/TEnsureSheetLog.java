package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TEnsureSheetLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_ensure_sheet_log")
public class TEnsureSheetLog implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2143447351L;

	// Fields

	/**
	 * logId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "logId", unique = true, nullable = false)
	private Long logId;// get logId

	/**
	 * sheetId:
	 */
	@Column(name = "sheetId", nullable = false)
	private Long sheetId;// get sheetId

	/**
	 * adminId:
	 */
	@Column(name = "adminId", nullable = false)
	private Long adminId;// get adminId

	/**
	 * content:
	 */
	@Column(name = "content", nullable = false, length = 500)
	private String content;// get content

	/**
	 * creTime:
	 */
	@Column(name = "creTime", nullable = false, length = 19)
	private Timestamp creTime;// get creTime

	/**
	 * sheetNo:
	 */
	@Column(name = "sheetNo", nullable = false, length = 12)
	private String sheetNo;// get sheetNo

	// Constructors

	/** default constructor */
	public TEnsureSheetLog() {
	}

	/** full constructor */
	public TEnsureSheetLog(Long sheetId, Long adminId, String content,
			Timestamp creTime, String sheetNo) {
		this.sheetId = sheetId;
		this.adminId = adminId;
		this.content = content;
		this.creTime = creTime;
		this.sheetNo = sheetNo;
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
	 * get sheetId
	 */
	public Long getSheetId() {
		return this.sheetId;
	}

	public void setSheetId(Long sheetId) {
		this.sheetId = sheetId;
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
	 * get content
	 */
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * get creTime
	 */
	public Timestamp getCreTime() {
		return this.creTime;
	}

	public void setCreTime(Timestamp creTime) {
		this.creTime = creTime;
	}

	/**
	 * get sheetNo
	 */
	public String getSheetNo() {
		return this.sheetNo;
	}

	public void setSheetNo(String sheetNo) {
		this.sheetNo = sheetNo;
	}

}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TTemplateMessage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_template_message")
public class TTemplateMessage implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1356188871L;

	// Fields

	/**
	 * templateId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "templateId", unique = true, nullable = false)
	private Long templateId;// get templateId

	/**
	 * templateNo:
	 */
	@Column(name = "templateNo", length = 100)
	private String templateNo;// get templateNo

	/**
	 * templateTitle:
	 */
	@Column(name = "templateTitle", length = 100)
	private String templateTitle;// get templateTitle

	/**
	 * primaryIndustry:
	 */
	@Column(name = "primaryIndustry")
	private Integer primaryIndustry;// get primaryIndustry

	/**
	 * secondIndustry:
	 */
	@Column(name = "secondIndustry")
	private Integer secondIndustry;// get secondIndustry

	/**
	 * detailContent:
	 */
	@Column(name = "detailContent", length = 300)
	private String detailContent;// get detailContent

	/**
	 * contentSample:
	 */
	@Column(name = "contentSample", length = 300)
	private String contentSample;// get contentSample

	/**
	 * addTime:
	 */
	@Column(name = "addTime", length = 19)
	private Timestamp addTime;// get addTime

	/**
	 * modifyTime:
	 */
	@Column(name = "modifyTime", length = 19)
	private Timestamp modifyTime;// get modifyTime

	/**
	 * globalFlag:
	 */
	@Column(name = "globalFlag")
	private Integer globalFlag;// get globalFlag

	/**
	 * templateKey:
	 */
	@Column(name = "templateKey", length = 30)
	private String templateKey;// get templateKey

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * platType:
	 */
	@Column(name = "platType")
	private Integer platType;// get platType

	/**
	 * templateStatus:
	 */
	@Column(name = "templateStatus")
	private Integer templateStatus;// get templateStatus

	// Constructors

	/** default constructor */
	public TTemplateMessage() {
	}

	/** full constructor */
	public TTemplateMessage(String templateNo, String templateTitle,
			Integer primaryIndustry, Integer secondIndustry,
			String detailContent, String contentSample, Timestamp addTime,
			Timestamp modifyTime, Integer globalFlag, String templateKey,
			Long mallId, Integer platType, Integer templateStatus) {
		this.templateNo = templateNo;
		this.templateTitle = templateTitle;
		this.primaryIndustry = primaryIndustry;
		this.secondIndustry = secondIndustry;
		this.detailContent = detailContent;
		this.contentSample = contentSample;
		this.addTime = addTime;
		this.modifyTime = modifyTime;
		this.globalFlag = globalFlag;
		this.templateKey = templateKey;
		this.mallId = mallId;
		this.platType = platType;
		this.templateStatus = templateStatus;
	}

	// Property accessors
	/**
	 * get templateId
	 */
	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	/**
	 * get templateNo
	 */
	public String getTemplateNo() {
		return this.templateNo;
	}

	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}

	/**
	 * get templateTitle
	 */
	public String getTemplateTitle() {
		return this.templateTitle;
	}

	public void setTemplateTitle(String templateTitle) {
		this.templateTitle = templateTitle;
	}

	/**
	 * get primaryIndustry
	 */
	public Integer getPrimaryIndustry() {
		return this.primaryIndustry;
	}

	public void setPrimaryIndustry(Integer primaryIndustry) {
		this.primaryIndustry = primaryIndustry;
	}

	/**
	 * get secondIndustry
	 */
	public Integer getSecondIndustry() {
		return this.secondIndustry;
	}

	public void setSecondIndustry(Integer secondIndustry) {
		this.secondIndustry = secondIndustry;
	}

	/**
	 * get detailContent
	 */
	public String getDetailContent() {
		return this.detailContent;
	}

	public void setDetailContent(String detailContent) {
		this.detailContent = detailContent;
	}

	/**
	 * get contentSample
	 */
	public String getContentSample() {
		return this.contentSample;
	}

	public void setContentSample(String contentSample) {
		this.contentSample = contentSample;
	}

	/**
	 * get addTime
	 */
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	/**
	 * get modifyTime
	 */
	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * get globalFlag
	 */
	public Integer getGlobalFlag() {
		return this.globalFlag;
	}

	public void setGlobalFlag(Integer globalFlag) {
		this.globalFlag = globalFlag;
	}

	/**
	 * get templateKey
	 */
	public String getTemplateKey() {
		return this.templateKey;
	}

	public void setTemplateKey(String templateKey) {
		this.templateKey = templateKey;
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
	 * get platType
	 */
	public Integer getPlatType() {
		return this.platType;
	}

	public void setPlatType(Integer platType) {
		this.platType = platType;
	}

	/**
	 * get templateStatus
	 */
	public Integer getTemplateStatus() {
		return this.templateStatus;
	}

	public void setTemplateStatus(Integer templateStatus) {
		this.templateStatus = templateStatus;
	}

}
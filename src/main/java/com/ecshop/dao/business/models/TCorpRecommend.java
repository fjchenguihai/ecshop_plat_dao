package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCorpRecommend entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_corp_recommend")
public class TCorpRecommend implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1082599362L;

	// Fields

	/**
	 * recommendId:
	 */
	@Id
	@GeneratedValue
	@Column(name = "recommendId", unique = true, nullable = false)
	private Long recommendId;// get recommendId

	/**
	 * corpInfo:
	 */
	@Column(name = "corpInfo", length = 200)
	private String corpInfo;// get corpInfo

	/**
	 * bossName:
	 */
	@Column(name = "bossName", length = 50)
	private String bossName;// get bossName

	/**
	 * bossMobile:
	 */
	@Column(name = "bossMobile", length = 100)
	private String bossMobile;// get bossMobile

	/**
	 * operateProd:
	 */
	@Column(name = "operateProd", length = 100)
	private String operateProd;// get operateProd

	/**
	 * operateMode:1������ 2�������
	 */
	@Column(name = "operateMode")
	private Integer operateMode;// get operateMode

	/**
	 * recommendUser:
	 */
	@Column(name = "recommendUser", length = 50)
	private String recommendUser;// get recommendUser

	/**
	 * recommendMobile:
	 */
	@Column(name = "recommendMobile", length = 100)
	private String recommendMobile;// get recommendMobile

	/**
	 * relationship:1������ 2������ 3����ͨ��ϵ
	 */
	@Column(name = "relationship")
	private Integer relationship;// get relationship

	/**
	 * commMode:1���ֳ���ͨ 2������ģʽ 3����ʾ�̳�ǰ�� 4����ʾ�̳Ǻ�� 5�����绰��ͨ
	 */
	@Column(name = "commMode", length = 10)
	private String commMode;// get commMode

	/**
	 * judgment:
	 */
	@Column(name = "judgment")
	private Integer judgment;// get judgment

	/**
	 * remark:
	 */
	@Column(name = "remark", length = 500)
	private String remark;// get remark

	// Constructors

	/** default constructor */
	public TCorpRecommend() {
	}

	/** full constructor */
	public TCorpRecommend(String corpInfo, String bossName, String bossMobile,
			String operateProd, Integer operateMode, String recommendUser,
			String recommendMobile, Integer relationship, String commMode,
			Integer judgment, String remark) {
		this.corpInfo = corpInfo;
		this.bossName = bossName;
		this.bossMobile = bossMobile;
		this.operateProd = operateProd;
		this.operateMode = operateMode;
		this.recommendUser = recommendUser;
		this.recommendMobile = recommendMobile;
		this.relationship = relationship;
		this.commMode = commMode;
		this.judgment = judgment;
		this.remark = remark;
	}

	// Property accessors
	/**
	 * get recommendId
	 */
	public Long getRecommendId() {
		return this.recommendId;
	}

	public void setRecommendId(Long recommendId) {
		this.recommendId = recommendId;
	}

	/**
	 * get corpInfo
	 */
	public String getCorpInfo() {
		return this.corpInfo;
	}

	public void setCorpInfo(String corpInfo) {
		this.corpInfo = corpInfo;
	}

	/**
	 * get bossName
	 */
	public String getBossName() {
		return this.bossName;
	}

	public void setBossName(String bossName) {
		this.bossName = bossName;
	}

	/**
	 * get bossMobile
	 */
	public String getBossMobile() {
		return this.bossMobile;
	}

	public void setBossMobile(String bossMobile) {
		this.bossMobile = bossMobile;
	}

	/**
	 * get operateProd
	 */
	public String getOperateProd() {
		return this.operateProd;
	}

	public void setOperateProd(String operateProd) {
		this.operateProd = operateProd;
	}

	/**
	 * get operateMode
	 */
	public Integer getOperateMode() {
		return this.operateMode;
	}

	public void setOperateMode(Integer operateMode) {
		this.operateMode = operateMode;
	}

	/**
	 * get recommendUser
	 */
	public String getRecommendUser() {
		return this.recommendUser;
	}

	public void setRecommendUser(String recommendUser) {
		this.recommendUser = recommendUser;
	}

	/**
	 * get recommendMobile
	 */
	public String getRecommendMobile() {
		return this.recommendMobile;
	}

	public void setRecommendMobile(String recommendMobile) {
		this.recommendMobile = recommendMobile;
	}

	/**
	 * get relationship
	 */
	public Integer getRelationship() {
		return this.relationship;
	}

	public void setRelationship(Integer relationship) {
		this.relationship = relationship;
	}

	/**
	 * get commMode
	 */
	public String getCommMode() {
		return this.commMode;
	}

	public void setCommMode(String commMode) {
		this.commMode = commMode;
	}

	/**
	 * get judgment
	 */
	public Integer getJudgment() {
		return this.judgment;
	}

	public void setJudgment(Integer judgment) {
		this.judgment = judgment;
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

}
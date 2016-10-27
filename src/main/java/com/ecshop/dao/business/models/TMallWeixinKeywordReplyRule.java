package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallWeixinKeywordReplyRule entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_weixin_keyword_reply_rule")
public class TMallWeixinKeywordReplyRule implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 182860359L;

	// Fields

	/**
	 * ruleId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ruleID", unique = true, nullable = false)
	private Long ruleId;// get ruleId

	/**
	 * ruleName:
	 */
	@Column(name = "ruleName", nullable = false, length = 60)
	private String ruleName;// get ruleName

	/**
	 * mallId:
	 */
	@Column(name = "mallID", nullable = false)
	private Long mallId;// get mallId

	/**
	 * keyStr:
	 */
	@Column(name = "keyStr", nullable = false, length = 300)
	private String keyStr;// get keyStr

	/**
	 * matchType:
	 */
	@Column(name = "matchType", nullable = false)
	private Integer matchType = 1;// get matchType

	/**
	 * replyContent:
	 */
	@Column(name = "replyContent", nullable = false, length = 300)
	private String replyContent;// get replyContent

	/**
	 * replyContentType:
	 */
	@Column(name = "replyContentType", nullable = false)
	private Integer replyContentType;// get replyContentType

	/**
	 * weixinOriginalId:
	 */
	@Column(name = "weixinOriginalID", nullable = false, length = 50)
	private String weixinOriginalId;// get weixinOriginalId

	/**
	 * deployStatus:
	 */
	@Column(name = "deployStatus", nullable = false)
	private Integer deployStatus = 0;// get deployStatus

	/**
	 * deleteStatus:
	 */
	@Column(name = "deleteStatus", nullable = false)
	private Integer deleteStatus = 1;// get deleteStatus

	/**
	 * creUserId:
	 */
	@Column(name = "creUserId", nullable = false)
	private Long creUserId;// get creUserId

	/**
	 * creTime:
	 */
	@Column(name = "creTime", nullable = false, length = 19)
	private Timestamp creTime;// get creTime

	// Constructors

	/** default constructor */
	public TMallWeixinKeywordReplyRule() {
	}

	/** full constructor */
	public TMallWeixinKeywordReplyRule(String ruleName, Long mallId,
			String keyStr, Integer matchType, String replyContent,
			Integer replyContentType, String weixinOriginalId,
			Integer deployStatus, Integer deleteStatus, Long creUserId,
			Timestamp creTime) {
		this.ruleName = ruleName;
		this.mallId = mallId;
		this.keyStr = keyStr;
		this.matchType = matchType;
		this.replyContent = replyContent;
		this.replyContentType = replyContentType;
		this.weixinOriginalId = weixinOriginalId;
		this.deployStatus = deployStatus;
		this.deleteStatus = deleteStatus;
		this.creUserId = creUserId;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get ruleId
	 */
	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	/**
	 * get ruleName
	 */
	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
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
	 * get keyStr
	 */
	public String getKeyStr() {
		return this.keyStr;
	}

	public void setKeyStr(String keyStr) {
		this.keyStr = keyStr;
	}

	/**
	 * get matchType
	 */
	public Integer getMatchType() {
		return this.matchType;
	}

	public void setMatchType(Integer matchType) {
		this.matchType = matchType;
	}

	/**
	 * get replyContent
	 */
	public String getReplyContent() {
		return this.replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	/**
	 * get replyContentType
	 */
	public Integer getReplyContentType() {
		return this.replyContentType;
	}

	public void setReplyContentType(Integer replyContentType) {
		this.replyContentType = replyContentType;
	}

	/**
	 * get weixinOriginalId
	 */
	public String getWeixinOriginalId() {
		return this.weixinOriginalId;
	}

	public void setWeixinOriginalId(String weixinOriginalId) {
		this.weixinOriginalId = weixinOriginalId;
	}

	/**
	 * get deployStatus
	 */
	public Integer getDeployStatus() {
		return this.deployStatus;
	}

	public void setDeployStatus(Integer deployStatus) {
		this.deployStatus = deployStatus;
	}

	/**
	 * get deleteStatus
	 */
	public Integer getDeleteStatus() {
		return this.deleteStatus;
	}

	public void setDeleteStatus(Integer deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	/**
	 * get creUserId
	 */
	public Long getCreUserId() {
		return this.creUserId;
	}

	public void setCreUserId(Long creUserId) {
		this.creUserId = creUserId;
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

}
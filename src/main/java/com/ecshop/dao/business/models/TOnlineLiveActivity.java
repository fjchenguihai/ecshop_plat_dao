package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TOnlineLiveActivity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_online_live_activity")
public class TOnlineLiveActivity implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 234574210L;

	// Fields

	/**
	 * activityId:
	 */
	@Id
	@Column(name = "activityId", unique = true, nullable = false, length = 20)
	private String activityId;// get activityId

	/**
	 * activityName:
	 */
	@Column(name = "activityName", nullable = false, length = 200)
	private String activityName;// get activityName

	/**
	 * startTime:
	 */
	@Column(name = "startTime", nullable = false, length = 20)
	private String startTime;// get startTime

	/**
	 * endTime:
	 */
	@Column(name = "endTime", nullable = false, length = 20)
	private String endTime;// get endTime

	/**
	 * coverImgUrl:
	 */
	@Column(name = "coverImgUrl", nullable = false, length = 500)
	private String coverImgUrl;// get coverImgUrl

	/**
	 * description:
	 */
	@Column(name = "description", length = 1024)
	private String description;// get description

	/**
	 * codeRateTypes:,
	 */
	@Column(name = "codeRateTypes", nullable = false, length = 30)
	private String codeRateTypes;// get codeRateTypes

	/**
	 * activityCategory:
	 */
	@Column(name = "activityCategory", nullable = false, length = 30)
	private String activityCategory;// get activityCategory

	/**
	 * liveNum:
	 */
	@Column(name = "liveNum", nullable = false)
	private Integer liveNum;// get liveNum

	/**
	 * needRecord:
	 */
	@Column(name = "needRecord", nullable = false)
	private Integer needRecord;// get needRecord

	/**
	 * needTimeShift:
	 */
	@Column(name = "needTimeShift", nullable = false)
	private Integer needTimeShift;// get needTimeShift

	/**
	 * needFullView:
	 */
	@Column(name = "needFullView", nullable = false)
	private Integer needFullView;// get needFullView

	/**
	 * playMode:
	 */
	@Column(name = "playMode", nullable = false)
	private Integer playMode;// get playMode

	/**
	 * creTime:
	 */
	@Column(name = "creTime", nullable = false, length = 19)
	private Timestamp creTime;// get creTime

	// Constructors

	/** default constructor */
	public TOnlineLiveActivity() {
	}

	/** minimal constructor */
	public TOnlineLiveActivity(String activityId, String activityName,
			String startTime, String endTime, String coverImgUrl,
			String codeRateTypes, String activityCategory, Integer liveNum,
			Integer needRecord, Integer needTimeShift, Integer needFullView,
			Integer playMode, Timestamp creTime) {
		this.activityId = activityId;
		this.activityName = activityName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.coverImgUrl = coverImgUrl;
		this.codeRateTypes = codeRateTypes;
		this.activityCategory = activityCategory;
		this.liveNum = liveNum;
		this.needRecord = needRecord;
		this.needTimeShift = needTimeShift;
		this.needFullView = needFullView;
		this.playMode = playMode;
		this.creTime = creTime;
	}

	/** full constructor */
	public TOnlineLiveActivity(String activityId, String activityName,
			String startTime, String endTime, String coverImgUrl,
			String description, String codeRateTypes, String activityCategory,
			Integer liveNum, Integer needRecord, Integer needTimeShift,
			Integer needFullView, Integer playMode, Timestamp creTime) {
		this.activityId = activityId;
		this.activityName = activityName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.coverImgUrl = coverImgUrl;
		this.description = description;
		this.codeRateTypes = codeRateTypes;
		this.activityCategory = activityCategory;
		this.liveNum = liveNum;
		this.needRecord = needRecord;
		this.needTimeShift = needTimeShift;
		this.needFullView = needFullView;
		this.playMode = playMode;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get activityId
	 */
	public String getActivityId() {
		return this.activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	/**
	 * get activityName
	 */
	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	/**
	 * get startTime
	 */
	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * get endTime
	 */
	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * get coverImgUrl
	 */
	public String getCoverImgUrl() {
		return this.coverImgUrl;
	}

	public void setCoverImgUrl(String coverImgUrl) {
		this.coverImgUrl = coverImgUrl;
	}

	/**
	 * get description
	 */
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * get codeRateTypes
	 */
	public String getCodeRateTypes() {
		return this.codeRateTypes;
	}

	public void setCodeRateTypes(String codeRateTypes) {
		this.codeRateTypes = codeRateTypes;
	}

	/**
	 * get activityCategory
	 */
	public String getActivityCategory() {
		return this.activityCategory;
	}

	public void setActivityCategory(String activityCategory) {
		this.activityCategory = activityCategory;
	}

	/**
	 * get liveNum
	 */
	public Integer getLiveNum() {
		return this.liveNum;
	}

	public void setLiveNum(Integer liveNum) {
		this.liveNum = liveNum;
	}

	/**
	 * get needRecord
	 */
	public Integer getNeedRecord() {
		return this.needRecord;
	}

	public void setNeedRecord(Integer needRecord) {
		this.needRecord = needRecord;
	}

	/**
	 * get needTimeShift
	 */
	public Integer getNeedTimeShift() {
		return this.needTimeShift;
	}

	public void setNeedTimeShift(Integer needTimeShift) {
		this.needTimeShift = needTimeShift;
	}

	/**
	 * get needFullView
	 */
	public Integer getNeedFullView() {
		return this.needFullView;
	}

	public void setNeedFullView(Integer needFullView) {
		this.needFullView = needFullView;
	}

	/**
	 * get playMode
	 */
	public Integer getPlayMode() {
		return this.playMode;
	}

	public void setPlayMode(Integer playMode) {
		this.playMode = playMode;
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
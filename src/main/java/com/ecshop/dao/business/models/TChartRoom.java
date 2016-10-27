package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TChartRoom entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_chart_room")
public class TChartRoom implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -37032987L;

	// Fields

	/**
	 * chartRoomId:
	 */
	@Id
	@Column(name = "chartRoomId", unique = true, nullable = false, length = 20)
	private String chartRoomId;// get chartRoomId

	/**
	 * charRoomName:
	 */
	@Column(name = "charRoomName", nullable = false, length = 100)
	private String charRoomName;// get charRoomName

	/**
	 * activityId:
	 */
	@Column(name = "activityId", nullable = false, length = 20)
	private String activityId;// get activityId

	/**
	 * status:
	 */
	@Column(name = "status", nullable = false)
	private Integer status;// get status

	/**
	 * creTime:
	 */
	@Column(name = "creTime", nullable = false, length = 19)
	private Timestamp creTime;// get creTime

	// Constructors

	/** default constructor */
	public TChartRoom() {
	}

	/** full constructor */
	public TChartRoom(String chartRoomId, String charRoomName,
			String activityId, Integer status, Timestamp creTime) {
		this.chartRoomId = chartRoomId;
		this.charRoomName = charRoomName;
		this.activityId = activityId;
		this.status = status;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get chartRoomId
	 */
	public String getChartRoomId() {
		return this.chartRoomId;
	}

	public void setChartRoomId(String chartRoomId) {
		this.chartRoomId = chartRoomId;
	}

	/**
	 * get charRoomName
	 */
	public String getCharRoomName() {
		return this.charRoomName;
	}

	public void setCharRoomName(String charRoomName) {
		this.charRoomName = charRoomName;
	}

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
	 * get status
	 */
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
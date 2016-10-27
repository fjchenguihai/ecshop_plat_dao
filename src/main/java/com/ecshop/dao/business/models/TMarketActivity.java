package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMarketActivity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_market_activity")
public class TMarketActivity implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1523672865L;

	// Fields

	/**
	 * activityId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "activityId", unique = true, nullable = false)
	private Long activityId;// get activityId

	/**
	 * marketActivityTypeId:
	 */
	@Column(name = "marketActivityTypeId")
	private Long marketActivityTypeId;// get marketActivityTypeId

	/**
	 * activityName:
	 */
	@Column(name = "activityName", length = 100)
	private String activityName;// get activityName

	/**
	 * creUserId:
	 */
	@Column(name = "creUserId")
	private Long creUserId;// get creUserId

	/**
	 * cretime:
	 */
	@Column(name = "cretime", length = 19)
	private Timestamp cretime;// get cretime

	// Constructors

	/** default constructor */
	public TMarketActivity() {
	}

	/** full constructor */
	public TMarketActivity(Long marketActivityTypeId, String activityName,
			Long creUserId, Timestamp cretime) {
		this.marketActivityTypeId = marketActivityTypeId;
		this.activityName = activityName;
		this.creUserId = creUserId;
		this.cretime = cretime;
	}

	// Property accessors
	/**
	 * get activityId
	 */
	public Long getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	/**
	 * get marketActivityTypeId
	 */
	public Long getMarketActivityTypeId() {
		return this.marketActivityTypeId;
	}

	public void setMarketActivityTypeId(Long marketActivityTypeId) {
		this.marketActivityTypeId = marketActivityTypeId;
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
	 * get creUserId
	 */
	public Long getCreUserId() {
		return this.creUserId;
	}

	public void setCreUserId(Long creUserId) {
		this.creUserId = creUserId;
	}

	/**
	 * get cretime
	 */
	public Timestamp getCretime() {
		return this.cretime;
	}

	public void setCretime(Timestamp cretime) {
		this.cretime = cretime;
	}

}
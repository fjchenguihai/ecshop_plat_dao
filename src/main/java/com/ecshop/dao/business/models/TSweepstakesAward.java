package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TSweepstakesAward entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_sweepstakes_award")
public class TSweepstakesAward implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -958514260L;

	// Fields

	/**
	 * sweepstakesAwardId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "sweepstakesAwardId", unique = true, nullable = false)
	private Long sweepstakesAwardId;// get sweepstakesAwardId

	/**
	 * sweepstakesActivityId:
	 */
	@Column(name = "sweepstakesActivityId")
	private Long sweepstakesActivityId;// get sweepstakesActivityId

	/**
	 * probability:
	 */
	@Column(name = "probability", precision = 6)
	private Double probability;// get probability

	/**
	 * awardGrade:
	 */
	@Column(name = "awardGrade", length = 50)
	private String awardGrade;// get awardGrade

	/**
	 * awardName:
	 */
	@Column(name = "awardName", length = 200)
	private String awardName;// get awardName

	/**
	 * awardPrice:
	 */
	@Column(name = "awardPrice", precision = 12)
	private Double awardPrice;// get awardPrice

	/**
	 * awardAvailableAmount:
	 */
	@Column(name = "awardAvailableAmount")
	private Integer awardAvailableAmount;// get awardAvailableAmount

	/**
	 * awardUsedAmount:
	 */
	@Column(name = "awardUsedAmount")
	private Integer awardUsedAmount;// get awardUsedAmount

	/**
	 * pictureUrl:
	 */
	@Column(name = "pictureUrl", length = 200)
	private String pictureUrl;// get pictureUrl

	// Constructors

	/** default constructor */
	public TSweepstakesAward() {
	}

	/** full constructor */
	public TSweepstakesAward(Long sweepstakesActivityId, Double probability,
			String awardGrade, String awardName, Double awardPrice,
			Integer awardAvailableAmount, Integer awardUsedAmount,
			String pictureUrl) {
		this.sweepstakesActivityId = sweepstakesActivityId;
		this.probability = probability;
		this.awardGrade = awardGrade;
		this.awardName = awardName;
		this.awardPrice = awardPrice;
		this.awardAvailableAmount = awardAvailableAmount;
		this.awardUsedAmount = awardUsedAmount;
		this.pictureUrl = pictureUrl;
	}

	// Property accessors
	/**
	 * get sweepstakesAwardId
	 */
	public Long getSweepstakesAwardId() {
		return this.sweepstakesAwardId;
	}

	public void setSweepstakesAwardId(Long sweepstakesAwardId) {
		this.sweepstakesAwardId = sweepstakesAwardId;
	}

	/**
	 * get sweepstakesActivityId
	 */
	public Long getSweepstakesActivityId() {
		return this.sweepstakesActivityId;
	}

	public void setSweepstakesActivityId(Long sweepstakesActivityId) {
		this.sweepstakesActivityId = sweepstakesActivityId;
	}

	/**
	 * get probability
	 */
	public Double getProbability() {
		return this.probability;
	}

	public void setProbability(Double probability) {
		this.probability = probability;
	}

	/**
	 * get awardGrade
	 */
	public String getAwardGrade() {
		return this.awardGrade;
	}

	public void setAwardGrade(String awardGrade) {
		this.awardGrade = awardGrade;
	}

	/**
	 * get awardName
	 */
	public String getAwardName() {
		return this.awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	/**
	 * get awardPrice
	 */
	public Double getAwardPrice() {
		return this.awardPrice;
	}

	public void setAwardPrice(Double awardPrice) {
		this.awardPrice = awardPrice;
	}

	/**
	 * get awardAvailableAmount
	 */
	public Integer getAwardAvailableAmount() {
		return this.awardAvailableAmount;
	}

	public void setAwardAvailableAmount(Integer awardAvailableAmount) {
		this.awardAvailableAmount = awardAvailableAmount;
	}

	/**
	 * get awardUsedAmount
	 */
	public Integer getAwardUsedAmount() {
		return this.awardUsedAmount;
	}

	public void setAwardUsedAmount(Integer awardUsedAmount) {
		this.awardUsedAmount = awardUsedAmount;
	}

	/**
	 * get pictureUrl
	 */
	public String getPictureUrl() {
		return this.pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

}
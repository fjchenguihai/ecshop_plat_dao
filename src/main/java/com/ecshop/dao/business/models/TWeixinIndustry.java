package com.ecshop.dao.business.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TWeixinIndustry entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_weixin_industry")
public class TWeixinIndustry implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1041649620L;

	// Fields

	/**
	 * wexinIndustryId:΢����ҵ�����ID
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "wexinIndustryId", unique = true, nullable = false)
	private Integer wexinIndustryId;// get wexinIndustryId

	/**
	 * mainIndustry:����ҵ
	 */
	@Column(name = "mainIndustry", nullable = false, length = 30)
	private String mainIndustry;// get mainIndustry

	/**
	 * deputyIndustry:����ҵ
	 */
	@Column(name = "deputyIndustry", nullable = false, length = 30)
	private String deputyIndustry;// get deputyIndustry

	/**
	 * industryCode:��ҵ����
	 */
	@Column(name = "industryCode", nullable = false)
	private Integer industryCode;// get industryCode

	/**
	 * addTime:���ʱ��
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "addTime", length = 10)
	private Date addTime;// get addTime

	/**
	 * status:1-���ã�0-������
	 */
	@Column(name = "status")
	private Integer status;// get status

	// Constructors

	/** default constructor */
	public TWeixinIndustry() {
	}

	/** minimal constructor */
	public TWeixinIndustry(String mainIndustry, String deputyIndustry,
			Integer industryCode) {
		this.mainIndustry = mainIndustry;
		this.deputyIndustry = deputyIndustry;
		this.industryCode = industryCode;
	}

	/** full constructor */
	public TWeixinIndustry(String mainIndustry, String deputyIndustry,
			Integer industryCode, Date addTime, Integer status) {
		this.mainIndustry = mainIndustry;
		this.deputyIndustry = deputyIndustry;
		this.industryCode = industryCode;
		this.addTime = addTime;
		this.status = status;
	}

	// Property accessors
	/**
	 * get wexinIndustryId
	 */
	public Integer getWexinIndustryId() {
		return this.wexinIndustryId;
	}

	public void setWexinIndustryId(Integer wexinIndustryId) {
		this.wexinIndustryId = wexinIndustryId;
	}

	/**
	 * get mainIndustry
	 */
	public String getMainIndustry() {
		return this.mainIndustry;
	}

	public void setMainIndustry(String mainIndustry) {
		this.mainIndustry = mainIndustry;
	}

	/**
	 * get deputyIndustry
	 */
	public String getDeputyIndustry() {
		return this.deputyIndustry;
	}

	public void setDeputyIndustry(String deputyIndustry) {
		this.deputyIndustry = deputyIndustry;
	}

	/**
	 * get industryCode
	 */
	public Integer getIndustryCode() {
		return this.industryCode;
	}

	public void setIndustryCode(Integer industryCode) {
		this.industryCode = industryCode;
	}

	/**
	 * get addTime
	 */
	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
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

}
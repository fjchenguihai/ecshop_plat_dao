package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAppBanner entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_app_banner")
public class TAppBanner implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -622770503L;

	// Fields

	/**
	 * bannerId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "bannerId", unique = true, nullable = false)
	private Long bannerId;// get bannerId

	/**
	 * bannertType:banner���ͣ���Ʒ�����
	 */
	@Column(name = "bannertType", nullable = false)
	private Integer bannertType;// get bannertType

	/**
	 * targetId:Ŀ��ID
	 */
	@Column(name = "targetId")
	private Long targetId;// get targetId

	/**
	 * targetName:���
	 */
	@Column(name = "targetName")
	private String targetName;// get targetName

	/**
	 * bannerImg:bannerͼƬ
	 */
	@Column(name = "bannerImg")
	private String bannerImg;// get bannerImg

	/**
	 * scope:ƽ̨������ ƽ̨��0 ����1
	 */
	@Column(name = "scope")
	private Integer scope;// get scope

	/**
	 * centerId:������Ӫ����ID ���ΧΪ��������ֵ��ƽ̨ʱΪ0
	 */
	@Column(name = "centerId")
	private Long centerId;// get centerId

	/**
	 * stationId:��Ʒ������վID
	 */
	@Column(name = "stationId")
	private Long stationId;// get stationId

	/**
	 * orderNo:�������ڹ淶banner��˳��
	 */
	@Column(name = "orderNo")
	private Integer orderNo;// get orderNo

	/**
	 * creTime:
	 */
	@Column(name = "creTime", length = 19)
	private Timestamp creTime;// get creTime

	// Constructors

	/** default constructor */
	public TAppBanner() {
	}

	/** minimal constructor */
	public TAppBanner(Integer bannertType) {
		this.bannertType = bannertType;
	}

	/** full constructor */
	public TAppBanner(Integer bannertType, Long targetId, String targetName,
			String bannerImg, Integer scope, Long centerId, Long stationId,
			Integer orderNo, Timestamp creTime) {
		this.bannertType = bannertType;
		this.targetId = targetId;
		this.targetName = targetName;
		this.bannerImg = bannerImg;
		this.scope = scope;
		this.centerId = centerId;
		this.stationId = stationId;
		this.orderNo = orderNo;
		this.creTime = creTime;
	}

	// Property accessors
	/**
	 * get bannerId
	 */
	public Long getBannerId() {
		return this.bannerId;
	}

	public void setBannerId(Long bannerId) {
		this.bannerId = bannerId;
	}

	/**
	 * get bannertType
	 */
	public Integer getBannertType() {
		return this.bannertType;
	}

	public void setBannertType(Integer bannertType) {
		this.bannertType = bannertType;
	}

	/**
	 * get targetId
	 */
	public Long getTargetId() {
		return this.targetId;
	}

	public void setTargetId(Long targetId) {
		this.targetId = targetId;
	}

	/**
	 * get targetName
	 */
	public String getTargetName() {
		return this.targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	/**
	 * get bannerImg
	 */
	public String getBannerImg() {
		return this.bannerImg;
	}

	public void setBannerImg(String bannerImg) {
		this.bannerImg = bannerImg;
	}

	/**
	 * get scope
	 */
	public Integer getScope() {
		return this.scope;
	}

	public void setScope(Integer scope) {
		this.scope = scope;
	}

	/**
	 * get centerId
	 */
	public Long getCenterId() {
		return this.centerId;
	}

	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}

	/**
	 * get stationId
	 */
	public Long getStationId() {
		return this.stationId;
	}

	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}

	/**
	 * get orderNo
	 */
	public Integer getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
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
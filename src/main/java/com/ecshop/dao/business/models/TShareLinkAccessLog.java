package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TShareLinkAccessLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_share_link_access_log")
public class TShareLinkAccessLog implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1714665925L;

	// Fields

	/**
	 * visitLogId:������־ID
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "visitLogId", unique = true, nullable = false)
	private Long visitLogId;// get visitLogId

	/**
	 * linkId:����ID(������Ϣ��ID)
	 */
	@Column(name = "linkId")
	private Long linkId;// get linkId

	/**
	 * appId:
	 */
	@Column(name = "appId", length = 100)
	private String appId;// get appId

	/**
	 * ownerId:����������ID
	 */
	@Column(name = "ownerId")
	private Long ownerId;// get ownerId

	/**
	 * sex:�������Ա�
	 */
	@Column(name = "sex")
	private Integer sex;// get sex

	/**
	 * city:�����߳���
	 */
	@Column(name = "city", length = 30)
	private String city;// get city

	/**
	 * province:������ʡ��
	 */
	@Column(name = "province", length = 30)
	private String province;// get province

	/**
	 * country:�����߹��
	 */
	@Column(name = "country", length = 30)
	private String country;// get country

	/**
	 * visitorId:�������û�ID
	 */
	@Column(name = "visitorId")
	private Long visitorId;// get visitorId

	/**
	 * openId:������OPENID(��ǰָ΢��ƽ̨)
	 */
	@Column(name = "openId", length = 100)
	private String openId;// get openId

	/**
	 * nickname:�������ǳ�
	 */
	@Column(name = "nickname", length = 100)
	private String nickname;// get nickname

	/**
	 * visitTime:����ʱ��
	 */
	@Column(name = "visitTime", length = 19)
	private Timestamp visitTime;// get visitTime

	/**
	 * ipAddress:������IP��ַ
	 */
	@Column(name = "ipAddress", length = 15)
	private String ipAddress;// get ipAddress

	// Constructors

	/** default constructor */
	public TShareLinkAccessLog() {
	}

	/** full constructor */
	public TShareLinkAccessLog(Long linkId, String appId, Long ownerId,
			Integer sex, String city, String province, String country,
			Long visitorId, String openId, String nickname,
			Timestamp visitTime, String ipAddress) {
		this.linkId = linkId;
		this.appId = appId;
		this.ownerId = ownerId;
		this.sex = sex;
		this.city = city;
		this.province = province;
		this.country = country;
		this.visitorId = visitorId;
		this.openId = openId;
		this.nickname = nickname;
		this.visitTime = visitTime;
		this.ipAddress = ipAddress;
	}

	// Property accessors
	/**
	 * get visitLogId
	 */
	public Long getVisitLogId() {
		return this.visitLogId;
	}

	public void setVisitLogId(Long visitLogId) {
		this.visitLogId = visitLogId;
	}

	/**
	 * get linkId
	 */
	public Long getLinkId() {
		return this.linkId;
	}

	public void setLinkId(Long linkId) {
		this.linkId = linkId;
	}

	/**
	 * get appId
	 */
	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * get ownerId
	 */
	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * get sex
	 */
	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * get city
	 */
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * get province
	 */
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * get country
	 */
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * get visitorId
	 */
	public Long getVisitorId() {
		return this.visitorId;
	}

	public void setVisitorId(Long visitorId) {
		this.visitorId = visitorId;
	}

	/**
	 * get openId
	 */
	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**
	 * get nickname
	 */
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * get visitTime
	 */
	public Timestamp getVisitTime() {
		return this.visitTime;
	}

	public void setVisitTime(Timestamp visitTime) {
		this.visitTime = visitTime;
	}

	/**
	 * get ipAddress
	 */
	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

}
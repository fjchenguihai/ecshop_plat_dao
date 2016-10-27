package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TWeixinUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_weixin_user")
public class TWeixinUser implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2141873345L;

	// Fields

	/**
	 * weixinUserId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "weixinUserId", unique = true, nullable = false)
	private Long weixinUserId;// get weixinUserId

	/**
	 * mallId:�̳�Id
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * userId:�û�Id
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * referrerUserId:
	 */
	@Column(name = "referrerUserId")
	private Long referrerUserId;// get referrerUserId

	/**
	 * referrerUpTime:
	 */
	@Column(name = "referrerUpTime", length = 19)
	private Timestamp referrerUpTime;// get referrerUpTime

	/**
	 * sourceUserId:
	 */
	@Column(name = "sourceUserId")
	private Long sourceUserId;// get sourceUserId

	/**
	 * subscribe:1:�ѹ�ע 0:δ��ע
	 */
	@Column(name = "subscribe")
	private Integer subscribe;// get subscribe

	/**
	 * openid:openid
	 */
	@Column(name = "openid", nullable = false, length = 100)
	private String openid;// get openid

	/**
	 * veOpenId:
	 */
	@Column(name = "veOpenId", length = 100)
	private String veOpenId;// get veOpenId

	/**
	 * oldUnionid:��΢��UNIONID
	 */
	@Column(name = "oldUnionid", length = 100)
	private String oldUnionid;// get oldUnionid

	/**
	 * nickname:΢���ǳ�
	 */
	@Column(name = "nickname", length = 100)
	private String nickname;// get nickname

	/**
	 * sex:1:�� 0:Ů
	 */
	@Column(name = "sex")
	private Integer sex;// get sex

	/**
	 * city:����
	 */
	@Column(name = "city", length = 30)
	private String city;// get city

	/**
	 * province:ʡ��
	 */
	@Column(name = "province", length = 30)
	private String province;// get province

	/**
	 * country:���
	 */
	@Column(name = "country", length = 30)
	private String country;// get country

	/**
	 * language:����
	 */
	@Column(name = "language", length = 10)
	private String language;// get language

	/**
	 * headimgurl:ͷ���ַ
	 */
	@Column(name = "headimgurl", length = 300)
	private String headimgurl;// get headimgurl

	/**
	 * remark:
	 */
	@Column(name = "remark", length = 100)
	private String remark;// get remark

	/**
	 * creTime:
	 */
	@Column(name = "creTime", length = 19)
	private Timestamp creTime;// get creTime

	/**
	 * platType:1��ʾ΢�Ź��ں�,2��ʾQQ��3��ʾ���ˣ�4��ʾ������5��ʾ֧����
	 */
	@Column(name = "platType", nullable = false)
	private Integer platType;// get platType

	/**
	 * appId:
	 */
	@Column(name = "appId", length = 100)
	private String appId;// get appId

	/**
	 * platUnionid:
	 */
	@Column(name = "platUnionid", length = 100)
	private String platUnionid;// get platUnionid

	/**
	 * subscribeTime:
	 */
	@Column(name = "subscribeTime", length = 19)
	private Timestamp subscribeTime;// get subscribeTime

	/**
	 * weakReferrerUpTime:
	 */
	@Column(name = "weakReferrerUpTime", length = 19)
	private Timestamp weakReferrerUpTime;// get weakReferrerUpTime

	// Constructors

	/** default constructor */
	public TWeixinUser() {
	}

	/** minimal constructor */
	public TWeixinUser(String openid, Integer platType) {
		this.openid = openid;
		this.platType = platType;
	}

	/** full constructor */
	public TWeixinUser(Long mallId, Long userId, Long referrerUserId,
			Timestamp referrerUpTime, Long sourceUserId, Integer subscribe,
			String openid, String veOpenId, String oldUnionid, String nickname,
			Integer sex, String city, String province, String country,
			String language, String headimgurl, String remark,
			Timestamp creTime, Integer platType, String appId,
			String platUnionid, Timestamp subscribeTime,
			Timestamp weakReferrerUpTime) {
		this.mallId = mallId;
		this.userId = userId;
		this.referrerUserId = referrerUserId;
		this.referrerUpTime = referrerUpTime;
		this.sourceUserId = sourceUserId;
		this.subscribe = subscribe;
		this.openid = openid;
		this.veOpenId = veOpenId;
		this.oldUnionid = oldUnionid;
		this.nickname = nickname;
		this.sex = sex;
		this.city = city;
		this.province = province;
		this.country = country;
		this.language = language;
		this.headimgurl = headimgurl;
		this.remark = remark;
		this.creTime = creTime;
		this.platType = platType;
		this.appId = appId;
		this.platUnionid = platUnionid;
		this.subscribeTime = subscribeTime;
		this.weakReferrerUpTime = weakReferrerUpTime;
	}

	// Property accessors
	/**
	 * get weixinUserId
	 */
	public Long getWeixinUserId() {
		return this.weixinUserId;
	}

	public void setWeixinUserId(Long weixinUserId) {
		this.weixinUserId = weixinUserId;
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
	 * get userId
	 */
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * get referrerUserId
	 */
	public Long getReferrerUserId() {
		return this.referrerUserId;
	}

	public void setReferrerUserId(Long referrerUserId) {
		this.referrerUserId = referrerUserId;
	}

	/**
	 * get referrerUpTime
	 */
	public Timestamp getReferrerUpTime() {
		return this.referrerUpTime;
	}

	public void setReferrerUpTime(Timestamp referrerUpTime) {
		this.referrerUpTime = referrerUpTime;
	}

	/**
	 * get sourceUserId
	 */
	public Long getSourceUserId() {
		return this.sourceUserId;
	}

	public void setSourceUserId(Long sourceUserId) {
		this.sourceUserId = sourceUserId;
	}

	/**
	 * get subscribe
	 */
	public Integer getSubscribe() {
		return this.subscribe;
	}

	public void setSubscribe(Integer subscribe) {
		this.subscribe = subscribe;
	}

	/**
	 * get openid
	 */
	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	/**
	 * get veOpenId
	 */
	public String getVeOpenId() {
		return this.veOpenId;
	}

	public void setVeOpenId(String veOpenId) {
		this.veOpenId = veOpenId;
	}

	/**
	 * get oldUnionid
	 */
	public String getOldUnionid() {
		return this.oldUnionid;
	}

	public void setOldUnionid(String oldUnionid) {
		this.oldUnionid = oldUnionid;
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
	 * get language
	 */
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * get headimgurl
	 */
	public String getHeadimgurl() {
		return this.headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
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

	/**
	 * get creTime
	 */
	public Timestamp getCreTime() {
		return this.creTime;
	}

	public void setCreTime(Timestamp creTime) {
		this.creTime = creTime;
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
	 * get appId
	 */
	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * get platUnionid
	 */
	public String getPlatUnionid() {
		return this.platUnionid;
	}

	public void setPlatUnionid(String platUnionid) {
		this.platUnionid = platUnionid;
	}

	/**
	 * get subscribeTime
	 */
	public Timestamp getSubscribeTime() {
		return this.subscribeTime;
	}

	public void setSubscribeTime(Timestamp subscribeTime) {
		this.subscribeTime = subscribeTime;
	}

	/**
	 * get weakReferrerUpTime
	 */
	public Timestamp getWeakReferrerUpTime() {
		return this.weakReferrerUpTime;
	}

	public void setWeakReferrerUpTime(Timestamp weakReferrerUpTime) {
		this.weakReferrerUpTime = weakReferrerUpTime;
	}

}
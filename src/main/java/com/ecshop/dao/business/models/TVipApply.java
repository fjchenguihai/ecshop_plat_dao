package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TVipApply entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_vip_apply")
public class TVipApply implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 24061381L;

	// Fields

	/**
	 * vauthenticationId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "vAuthenticationId", unique = true, nullable = false)
	private Long vauthenticationId;// get vauthenticationId

	/**
	 * applyType:1-001�����֤��2-010ʵ����Ϣ��4-100���п���7-111ȫ��
	 */
	@Column(name = "applyType")
	private Integer applyType;// get applyType

	/**
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * usertypeId:����V�͡��˿�����
	 */
	@Column(name = "usertypeId")
	private Long usertypeId;// get usertypeId

	/**
	 * authenticationstatus:0��ʾ����� 1��ʾ����Ȩ -1��ʾ��Ȩʧ��
	 */
	@Column(name = "authenticationstatus")
	private Integer authenticationstatus;// get authenticationstatus

	/**
	 * applytime:
	 */
	@Column(name = "applytime", length = 19)
	private Timestamp applytime;// get applytime

	/**
	 * examinetime:
	 */
	@Column(name = "examinetime", length = 19)
	private Timestamp examinetime;// get examinetime

	/**
	 * invitationCode:������
	 */
	@Column(name = "invitationCode", length = 32)
	private String invitationCode;// get invitationCode

	/**
	 * vvestringcode:
	 */
	@Column(name = "VVEStringcode", length = 50)
	private String vvestringcode;// get vvestringcode

	/**
	 * examineReason:
	 */
	@Column(name = "examineReason", length = 100)
	private String examineReason;// get examineReason

	/**
	 * cardType:1��ʾ���֤��2��ʾ���գ�3��ʾ�۰�̨���֤��4��ʾ����֤��5��ʾ����
	 */
	@Column(name = "cardType")
	private Integer cardType;// get cardType

	/**
	 * picUrl:����ͼƬ�����Ÿ���
	 */
	@Column(name = "picUrl", length = 2000)
	private String picUrl;// get picUrl

	/**
	 * idcard:
	 */
	@Column(name = "iDCard", length = 100)
	private String idcard;// get idcard

	/**
	 * bank:��������
	 */
	@Column(name = "bank", length = 100)
	private String bank;// get bank

	/**
	 * openBank:��������
	 */
	@Column(name = "openBank", length = 100)
	private String openBank;// get openBank

	/**
	 * bankCard:���п���
	 */
	@Column(name = "bankCard", length = 100)
	private String bankCard;// get bankCard

	/**
	 * realName:��ʵ�����뿪����һ��
	 */
	@Column(name = "realName", length = 100)
	private String realName;// get realName

	/**
	 * provinceId:�����е�ʡ��
	 */
	@Column(name = "provinceId")
	private Integer provinceId;// get provinceId

	/**
	 * cityId:�����еĵ���
	 */
	@Column(name = "cityId")
	private Integer cityId;// get cityId

	/**
	 * districtId:�����е��س�
	 */
	@Column(name = "districtId")
	private Integer districtId;// get districtId

	// Constructors

	/** default constructor */
	public TVipApply() {
	}

	/** full constructor */
	public TVipApply(Integer applyType, Long userId, Long mallId,
			Long usertypeId, Integer authenticationstatus, Timestamp applytime,
			Timestamp examinetime, String invitationCode, String vvestringcode,
			String examineReason, Integer cardType, String picUrl,
			String idcard, String bank, String openBank, String bankCard,
			String realName, Integer provinceId, Integer cityId,
			Integer districtId) {
		this.applyType = applyType;
		this.userId = userId;
		this.mallId = mallId;
		this.usertypeId = usertypeId;
		this.authenticationstatus = authenticationstatus;
		this.applytime = applytime;
		this.examinetime = examinetime;
		this.invitationCode = invitationCode;
		this.vvestringcode = vvestringcode;
		this.examineReason = examineReason;
		this.cardType = cardType;
		this.picUrl = picUrl;
		this.idcard = idcard;
		this.bank = bank;
		this.openBank = openBank;
		this.bankCard = bankCard;
		this.realName = realName;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.districtId = districtId;
	}

	// Property accessors
	/**
	 * get vauthenticationId
	 */
	public Long getVauthenticationId() {
		return this.vauthenticationId;
	}

	public void setVauthenticationId(Long vauthenticationId) {
		this.vauthenticationId = vauthenticationId;
	}

	/**
	 * get applyType
	 */
	public Integer getApplyType() {
		return this.applyType;
	}

	public void setApplyType(Integer applyType) {
		this.applyType = applyType;
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
	 * get mallId
	 */
	public Long getMallId() {
		return this.mallId;
	}

	public void setMallId(Long mallId) {
		this.mallId = mallId;
	}

	/**
	 * get usertypeId
	 */
	public Long getUsertypeId() {
		return this.usertypeId;
	}

	public void setUsertypeId(Long usertypeId) {
		this.usertypeId = usertypeId;
	}

	/**
	 * get authenticationstatus
	 */
	public Integer getAuthenticationstatus() {
		return this.authenticationstatus;
	}

	public void setAuthenticationstatus(Integer authenticationstatus) {
		this.authenticationstatus = authenticationstatus;
	}

	/**
	 * get applytime
	 */
	public Timestamp getApplytime() {
		return this.applytime;
	}

	public void setApplytime(Timestamp applytime) {
		this.applytime = applytime;
	}

	/**
	 * get examinetime
	 */
	public Timestamp getExaminetime() {
		return this.examinetime;
	}

	public void setExaminetime(Timestamp examinetime) {
		this.examinetime = examinetime;
	}

	/**
	 * get invitationCode
	 */
	public String getInvitationCode() {
		return this.invitationCode;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}

	/**
	 * get vvestringcode
	 */
	public String getVvestringcode() {
		return this.vvestringcode;
	}

	public void setVvestringcode(String vvestringcode) {
		this.vvestringcode = vvestringcode;
	}

	/**
	 * get examineReason
	 */
	public String getExamineReason() {
		return this.examineReason;
	}

	public void setExamineReason(String examineReason) {
		this.examineReason = examineReason;
	}

	/**
	 * get cardType
	 */
	public Integer getCardType() {
		return this.cardType;
	}

	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}

	/**
	 * get picUrl
	 */
	public String getPicUrl() {
		return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	/**
	 * get idcard
	 */
	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	/**
	 * get bank
	 */
	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	/**
	 * get openBank
	 */
	public String getOpenBank() {
		return this.openBank;
	}

	public void setOpenBank(String openBank) {
		this.openBank = openBank;
	}

	/**
	 * get bankCard
	 */
	public String getBankCard() {
		return this.bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	/**
	 * get realName
	 */
	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * get provinceId
	 */
	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	/**
	 * get cityId
	 */
	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	/**
	 * get districtId
	 */
	public Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

}
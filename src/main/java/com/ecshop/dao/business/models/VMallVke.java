package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VMallVke entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_mall_vke")
public class VMallVke implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2056211558L;

	// Fields

	/**
	 * userId:
	 */
	@Id
	@Column(name = "userId", nullable = false)
	private Long userId;// get userId

	/**
	 * usertypeId:
	 */
	@Column(name = "usertypeId")
	private Long usertypeId;// get usertypeId

	/**
	 * realName:
	 */
	@Column(name = "realName", length = 50)
	private String realName;// get realName

	/**
	 * mobile:
	 */
	@Column(name = "mobile", length = 50)
	private String mobile;// get mobile

	/**
	 * addtime:
	 */
	@Column(name = "addtime", length = 19)
	private Timestamp addtime;// get addtime

	/**
	 * nickname:΢���ǳ�
	 */
	@Column(name = "nickname", length = 50)
	private String nickname;// get nickname

	/**
	 * headPic:
	 */
	@Column(name = "headPic")
	private String headPic;// get headPic

	/**
	 * invitationCode:
	 */
	@Column(name = "invitationCode", nullable = false, length = 32)
	private String invitationCode;// get invitationCode

	/**
	 * status:״̬ 0��δʹ�� 1����ʹ��
	 */
	@Column(name = "status")
	private Integer status;// get status

	/**
	 * mallDealersId:
	 */
	@Column(name = "mallDealersId", nullable = false)
	private Long mallDealersId;// get mallDealersId

	/**
	 * joinTime:����ʱ��
	 */
	@Column(name = "joinTime", length = 19)
	private Timestamp joinTime;// get joinTime

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * amount:
	 */
	@Column(name = "amount", precision = 48)
	private Double amount;// get amount

	// Constructors

	/** default constructor */
	public VMallVke() {
	}

	/** minimal constructor */
	public VMallVke(Long userId, String invitationCode, Long mallDealersId) {
		this.userId = userId;
		this.invitationCode = invitationCode;
		this.mallDealersId = mallDealersId;
	}

	/** full constructor */
	public VMallVke(Long userId, Long usertypeId, String realName,
			String mobile, Timestamp addtime, String nickname, String headPic,
			String invitationCode, Integer status, Long mallDealersId,
			Timestamp joinTime, Long mallId, Double amount) {
		this.userId = userId;
		this.usertypeId = usertypeId;
		this.realName = realName;
		this.mobile = mobile;
		this.addtime = addtime;
		this.nickname = nickname;
		this.headPic = headPic;
		this.invitationCode = invitationCode;
		this.status = status;
		this.mallDealersId = mallDealersId;
		this.joinTime = joinTime;
		this.mallId = mallId;
		this.amount = amount;
	}

	// Property accessors
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
	 * get usertypeId
	 */
	public Long getUsertypeId() {
		return this.usertypeId;
	}

	public void setUsertypeId(Long usertypeId) {
		this.usertypeId = usertypeId;
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
	 * get mobile
	 */
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * get addtime
	 */
	public Timestamp getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
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
	 * get headPic
	 */
	public String getHeadPic() {
		return this.headPic;
	}

	public void setHeadPic(String headPic) {
		this.headPic = headPic;
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
	 * get status
	 */
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * get mallDealersId
	 */
	public Long getMallDealersId() {
		return this.mallDealersId;
	}

	public void setMallDealersId(Long mallDealersId) {
		this.mallDealersId = mallDealersId;
	}

	/**
	 * get joinTime
	 */
	public Timestamp getJoinTime() {
		return this.joinTime;
	}

	public void setJoinTime(Timestamp joinTime) {
		this.joinTime = joinTime;
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
	 * get amount
	 */
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
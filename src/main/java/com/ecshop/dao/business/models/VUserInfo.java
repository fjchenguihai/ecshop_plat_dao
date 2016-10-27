package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VUserInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_user_info")
public class VUserInfo implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1024420465L;

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
	 * username:
	 */
	@Column(name = "username", length = 50)
	private String username;// get username

	/**
	 * realName:
	 */
	@Column(name = "realName", length = 50)
	private String realName;// get realName

	/**
	 * address:
	 */
	@Column(name = "address")
	private String address;// get address

	/**
	 * birthday:
	 */
	@Column(name = "birthday", length = 19)
	private Timestamp birthday;// get birthday

	/**
	 * mobile:
	 */
	@Column(name = "mobile", length = 50)
	private String mobile;// get mobile

	/**
	 * sex:1��ʾ�� 2��ʾŮ
	 */
	@Column(name = "sex")
	private Integer sex;// get sex

	/**
	 * telephone:
	 */
	@Column(name = "telephone", length = 50)
	private String telephone;// get telephone

	/**
	 * email:
	 */
	@Column(name = "email", length = 100)
	private String email;// get email

	/**
	 * addtime:
	 */
	@Column(name = "addtime", length = 19)
	private Timestamp addtime;// get addtime

	/**
	 * deletestatus:1��ʾ�� -1��ʾɾ��
	 */
	@Column(name = "deletestatus")
	private Integer deletestatus;// get deletestatus

	/**
	 * nickname:
	 */
	@Column(name = "nickname", length = 50)
	private String nickname;// get nickname

	/**
	 * userSource:1��ʾ΢�� 2��ʾPC
	 */
	@Column(name = "userSource")
	private Integer userSource;// get userSource

	/**
	 * vtime:
	 */
	@Column(name = "vTime", length = 19)
	private Timestamp vtime;// get vtime

	/**
	 * distributorTime:
	 */
	@Column(name = "distributorTime", length = 19)
	private Timestamp distributorTime;// get distributorTime

	/**
	 * password:
	 */
	@Column(name = "password", length = 55)
	private String password;// get password

	/**
	 * areacode:
	 */
	@Column(name = "areacode", length = 50)
	private String areacode;// get areacode

	/**
	 * headPic:
	 */
	@Column(name = "headPic")
	private String headPic;// get headPic

	/**
	 * refereeUserId:
	 */
	@Column(name = "refereeUserId")
	private Long refereeUserId;// get refereeUserId

	/**
	 * lastLoginTime:
	 */
	@Column(name = "lastLoginTime", length = 19)
	private Timestamp lastLoginTime;// get lastLoginTime

	/**
	 * cardType:1��ʾ���֤��2��ʾ���գ�3��ʾ�۰�̨���֤��4��ʾ����֤��5��ʾ����
	 */
	@Column(name = "cardType")
	private Integer cardType;// get cardType

	/**
	 * idcardPic:����ͼƬ
	 */
	@Column(name = "iDCardPic", length = 200)
	private String idcardPic;// get idcardPic

	/**
	 * idcardBackPic:����ͼƬ
	 */
	@Column(name = "iDCardBackPic", length = 200)
	private String idcardBackPic;// get idcardBackPic

	/**
	 * idcard:
	 */
	@Column(name = "iDCard", length = 100)
	private String idcard;// get idcard

	/**
	 * validTime:��Чʱ��
	 */
	@Column(name = "validTime", nullable = false, length = 19)
	private Timestamp validTime;// get validTime

	/**
	 * inValidTime:ʧЧʱ��
	 */
	@Column(name = "inValidTime", length = 19)
	private Timestamp inValidTime;// get inValidTime

	/**
	 * userRelationId:
	 */
	@Column(name = "userRelationId", nullable = false)
	private Long userRelationId;// get userRelationId

	/**
	 * upUserId:
	 */
	@Column(name = "upUserId", nullable = false)
	private Long upUserId;// get upUserId

	/**
	 * histypeid:
	 */
	@Column(name = "histypeid", nullable = false)
	private Long histypeid;// get histypeid

	/**
	 * histypename:
	 */
	@Column(name = "histypename", length = 50)
	private String histypename;// get histypename

	/**
	 * usertypename:
	 */
	@Column(name = "usertypename", length = 50)
	private String usertypename;// get usertypename

	// Constructors

	/** default constructor */
	public VUserInfo() {
	}

	/** minimal constructor */
	public VUserInfo(Long userId, Timestamp validTime, Long userRelationId,
			Long upUserId, Long histypeid) {
		this.userId = userId;
		this.validTime = validTime;
		this.userRelationId = userRelationId;
		this.upUserId = upUserId;
		this.histypeid = histypeid;
	}

	/** full constructor */
	public VUserInfo(Long userId, Long usertypeId, String username,
			String realName, String address, Timestamp birthday, String mobile,
			Integer sex, String telephone, String email, Timestamp addtime,
			Integer deletestatus, String nickname, Integer userSource,
			Timestamp vtime, Timestamp distributorTime, String password,
			String areacode, String headPic, Long refereeUserId,
			Timestamp lastLoginTime, Integer cardType, String idcardPic,
			String idcardBackPic, String idcard, Timestamp validTime,
			Timestamp inValidTime, Long userRelationId, Long upUserId,
			Long histypeid, String histypename, String usertypename) {
		this.userId = userId;
		this.usertypeId = usertypeId;
		this.username = username;
		this.realName = realName;
		this.address = address;
		this.birthday = birthday;
		this.mobile = mobile;
		this.sex = sex;
		this.telephone = telephone;
		this.email = email;
		this.addtime = addtime;
		this.deletestatus = deletestatus;
		this.nickname = nickname;
		this.userSource = userSource;
		this.vtime = vtime;
		this.distributorTime = distributorTime;
		this.password = password;
		this.areacode = areacode;
		this.headPic = headPic;
		this.refereeUserId = refereeUserId;
		this.lastLoginTime = lastLoginTime;
		this.cardType = cardType;
		this.idcardPic = idcardPic;
		this.idcardBackPic = idcardBackPic;
		this.idcard = idcard;
		this.validTime = validTime;
		this.inValidTime = inValidTime;
		this.userRelationId = userRelationId;
		this.upUserId = upUserId;
		this.histypeid = histypeid;
		this.histypename = histypename;
		this.usertypename = usertypename;
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
	 * get username
	 */
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
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
	 * get address
	 */
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * get birthday
	 */
	public Timestamp getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
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
	 * get sex
	 */
	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * get telephone
	 */
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * get email
	 */
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	 * get deletestatus
	 */
	public Integer getDeletestatus() {
		return this.deletestatus;
	}

	public void setDeletestatus(Integer deletestatus) {
		this.deletestatus = deletestatus;
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
	 * get userSource
	 */
	public Integer getUserSource() {
		return this.userSource;
	}

	public void setUserSource(Integer userSource) {
		this.userSource = userSource;
	}

	/**
	 * get vtime
	 */
	public Timestamp getVtime() {
		return this.vtime;
	}

	public void setVtime(Timestamp vtime) {
		this.vtime = vtime;
	}

	/**
	 * get distributorTime
	 */
	public Timestamp getDistributorTime() {
		return this.distributorTime;
	}

	public void setDistributorTime(Timestamp distributorTime) {
		this.distributorTime = distributorTime;
	}

	/**
	 * get password
	 */
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * get areacode
	 */
	public String getAreacode() {
		return this.areacode;
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode;
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
	 * get refereeUserId
	 */
	public Long getRefereeUserId() {
		return this.refereeUserId;
	}

	public void setRefereeUserId(Long refereeUserId) {
		this.refereeUserId = refereeUserId;
	}

	/**
	 * get lastLoginTime
	 */
	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
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
	 * get idcardPic
	 */
	public String getIdcardPic() {
		return this.idcardPic;
	}

	public void setIdcardPic(String idcardPic) {
		this.idcardPic = idcardPic;
	}

	/**
	 * get idcardBackPic
	 */
	public String getIdcardBackPic() {
		return this.idcardBackPic;
	}

	public void setIdcardBackPic(String idcardBackPic) {
		this.idcardBackPic = idcardBackPic;
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
	 * get validTime
	 */
	public Timestamp getValidTime() {
		return this.validTime;
	}

	public void setValidTime(Timestamp validTime) {
		this.validTime = validTime;
	}

	/**
	 * get inValidTime
	 */
	public Timestamp getInValidTime() {
		return this.inValidTime;
	}

	public void setInValidTime(Timestamp inValidTime) {
		this.inValidTime = inValidTime;
	}

	/**
	 * get userRelationId
	 */
	public Long getUserRelationId() {
		return this.userRelationId;
	}

	public void setUserRelationId(Long userRelationId) {
		this.userRelationId = userRelationId;
	}

	/**
	 * get upUserId
	 */
	public Long getUpUserId() {
		return this.upUserId;
	}

	public void setUpUserId(Long upUserId) {
		this.upUserId = upUserId;
	}

	/**
	 * get histypeid
	 */
	public Long getHistypeid() {
		return this.histypeid;
	}

	public void setHistypeid(Long histypeid) {
		this.histypeid = histypeid;
	}

	/**
	 * get histypename
	 */
	public String getHistypename() {
		return this.histypename;
	}

	public void setHistypename(String histypename) {
		this.histypename = histypename;
	}

	/**
	 * get usertypename
	 */
	public String getUsertypename() {
		return this.usertypename;
	}

	public void setUsertypename(String usertypename) {
		this.usertypename = usertypename;
	}

}
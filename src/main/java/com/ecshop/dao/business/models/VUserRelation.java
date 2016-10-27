package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VUserRelation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_user_relation")
public class VUserRelation implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -620899747L;

	// Fields

	/**
	 * userRelationId:
	 */
	@Id
	@Column(name = "userRelationId", nullable = false)
	private Long userRelationId;// get userRelationId

	/**
	 * userId:
	 */
	@Column(name = "userId", nullable = false)
	private Long userId;// get userId

	/**
	 * upUserId:
	 */
	@Column(name = "upUserId", nullable = false)
	private Long upUserId;// get upUserId

	/**
	 * usertypeId:
	 */
	@Column(name = "usertypeId", nullable = false)
	private Long usertypeId;// get usertypeId

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
	 * remark:��ע��ϵ���ԭ��
	 */
	@Column(name = "remark", length = 50)
	private String remark;// get remark

	/**
	 * username:
	 */
	@Column(name = "username", length = 50)
	private String username;// get username
	
	
	/**
	 * mobile:
	 */
	@Column(name = "mobile", length = 50)
	private String mobile;// get mobile
	
	

	/**
	 * headPic:
	 */
	@Column(name = "headPic")
	private String headPic;// get headPic

	/**
	 * nickname:
	 */
	@Column(name = "nickname", length = 50)
	private String nickname;// get nickname

	/**
	 * realName:
	 */
	@Column(name = "realName", length = 50)
	private String realName;// get realName
	
	/**
	 * upusername:
	 */
	@Column(name = "upusername", length = 50)
	private String upusername;// get upusername
	
	
	/**
	 * mobile:
	 */
	@Column(name = "upMobile", length = 50)
	private String upMobile;// get mobile

	/**
	 * usertypeName:
	 */
	@Column(name = "usertypeName", length = 50)
	private String usertypeName;// get usertypeName

	/**
	 * addtime:
	 */
	@Column(name = "addtime", length = 19)
	private Timestamp addtime;// get addtime

	/**
	 * teamlevel:
	 */
	@Column(name = "teamlevel", nullable = false)
	private Integer teamlevel;// get teamlevel

	// Constructors

	/** default constructor */
	public VUserRelation() {
	}

	/** minimal constructor */
	public VUserRelation(Long userRelationId, Long userId, Long upUserId,
			Long usertypeId, Timestamp validTime, Integer teamlevel) {
		this.userRelationId = userRelationId;
		this.userId = userId;
		this.upUserId = upUserId;
		this.usertypeId = usertypeId;
		this.validTime = validTime;
		this.teamlevel = teamlevel;  
	}

	/** full constructor */
	public VUserRelation(Long userRelationId, Long userId, Long upUserId,
			Long usertypeId, Timestamp validTime, Timestamp inValidTime,
			String remark, String username, String headPic, String nickname,
			String realName, String upusername, String usertypeName,
			Timestamp addtime, Integer teamlevel,String mobile,String upMobile) {
		this.userRelationId = userRelationId;
		this.userId = userId;
		this.upUserId = upUserId;
		this.usertypeId = usertypeId;
		this.validTime = validTime;
		this.inValidTime = inValidTime;
		this.remark = remark;
		this.username = username;
		this.headPic = headPic;
		this.nickname = nickname;
		this.realName = realName;
		this.upusername = upusername;
		this.usertypeName = usertypeName;
		this.addtime = addtime;
		this.teamlevel = teamlevel;
		this.mobile = mobile;
		this.upMobile = upMobile;
	}

	// Property accessors
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
	 * get userId
	 */
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
	 * get usertypeId
	 */
	public Long getUsertypeId() {
		return this.usertypeId;
	}

	public void setUsertypeId(Long usertypeId) {
		this.usertypeId = usertypeId;
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
	 * get remark
	 */
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
	 * get headPic
	 */
	public String getHeadPic() {
		return this.headPic;
	}

	public void setHeadPic(String headPic) {
		this.headPic = headPic;
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
	 * get realName
	 */
	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * get upusername
	 */
	public String getUpusername() {
		return this.upusername;
	}

	public void setUpusername(String upusername) {
		this.upusername = upusername;
	}

	/**
	 * get usertypeName
	 */
	public String getUsertypeName() {
		return this.usertypeName;
	}

	public void setUsertypeName(String usertypeName) {
		this.usertypeName = usertypeName;
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
	 * get teamlevel
	 */
	public Integer getTeamlevel() {
		return this.teamlevel;
	}

	public void setTeamlevel(Integer teamlevel) {
		this.teamlevel = teamlevel;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUpMobile() {
		return upMobile;
	}

	public void setUpMobile(String upMobile) {
		this.upMobile = upMobile;
	}
	
	

}
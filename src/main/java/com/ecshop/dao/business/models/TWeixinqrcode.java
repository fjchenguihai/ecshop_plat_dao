package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TWeixinqrcode entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_weixinqrcode")
public class TWeixinqrcode implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1851583204L;

	// Fields

	/**
	 * id:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;// get id

	/**
	 * mallId:
	 */
	@Column(name = "MallId")
	private Long mallId;// get mallId

	/**
	 * userId:
	 */
	@Column(name = "UserId")
	private Long userId;// get userId

	/**
	 * userName:
	 */
	@Column(name = "UserName", length = 100)
	private String userName;// get userName

	/**
	 * scanCounts:
	 */
	@Column(name = "ScanCounts")
	private Integer scanCounts;// get scanCounts

	/**
	 * sceneStr:
	 */
	@Column(name = "SceneStr", length = 500)
	private String sceneStr;// get sceneStr

	/**
	 * qrtype:
	 */
	@Column(name = "QRType", length = 50)
	private String qrtype;// get qrtype

	/**
	 * qrurl:
	 */
	@Column(name = "QRURL", length = 500)
	private String qrurl;// get qrurl

	/**
	 * zyqrurl:
	 */
	@Column(name = "ZYQRURL", length = 500)
	private String zyqrurl;// get zyqrurl

	/**
	 * createTime:
	 */
	@Column(name = "CreateTime", length = 19)
	private Timestamp createTime;// get createTime

	/**
	 * expiryTime:
	 */
	@Column(name = "ExpiryTime", length = 19)
	private Timestamp expiryTime;// get expiryTime

	/**
	 * sceneId:
	 */
	@Column(name = "SceneId")
	private Long sceneId;// get sceneId

	/**
	 * appid:
	 */
	@Column(name = "appid", length = 100)
	private String appid;// get appid

	// Constructors

	/** default constructor */
	public TWeixinqrcode() {
	}

	/** full constructor */
	public TWeixinqrcode(Long mallId, Long userId, String userName,
			Integer scanCounts, String sceneStr, String qrtype, String qrurl,
			String zyqrurl, Timestamp createTime, Timestamp expiryTime,
			Long sceneId, String appid) {
		this.mallId = mallId;
		this.userId = userId;
		this.userName = userName;
		this.scanCounts = scanCounts;
		this.sceneStr = sceneStr;
		this.qrtype = qrtype;
		this.qrurl = qrurl;
		this.zyqrurl = zyqrurl;
		this.createTime = createTime;
		this.expiryTime = expiryTime;
		this.sceneId = sceneId;
		this.appid = appid;
	}

	// Property accessors
	/**
	 * get id
	 */
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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
	 * get userName
	 */
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * get scanCounts
	 */
	public Integer getScanCounts() {
		return this.scanCounts;
	}

	public void setScanCounts(Integer scanCounts) {
		this.scanCounts = scanCounts;
	}

	/**
	 * get sceneStr
	 */
	public String getSceneStr() {
		return this.sceneStr;
	}

	public void setSceneStr(String sceneStr) {
		this.sceneStr = sceneStr;
	}

	/**
	 * get qrtype
	 */
	public String getQrtype() {
		return this.qrtype;
	}

	public void setQrtype(String qrtype) {
		this.qrtype = qrtype;
	}

	/**
	 * get qrurl
	 */
	public String getQrurl() {
		return this.qrurl;
	}

	public void setQrurl(String qrurl) {
		this.qrurl = qrurl;
	}

	/**
	 * get zyqrurl
	 */
	public String getZyqrurl() {
		return this.zyqrurl;
	}

	public void setZyqrurl(String zyqrurl) {
		this.zyqrurl = zyqrurl;
	}

	/**
	 * get createTime
	 */
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	/**
	 * get expiryTime
	 */
	public Timestamp getExpiryTime() {
		return this.expiryTime;
	}

	public void setExpiryTime(Timestamp expiryTime) {
		this.expiryTime = expiryTime;
	}

	/**
	 * get sceneId
	 */
	public Long getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
	}

	/**
	 * get appid
	 */
	public String getAppid() {
		return this.appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

}
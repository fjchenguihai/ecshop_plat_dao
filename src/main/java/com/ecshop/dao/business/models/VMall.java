package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VMall entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "v_mall")
public class VMall implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 81813386L;

	// Fields

	/**
	 * mallId:
	 */
	@Id
	@Column(name = "mallId", nullable = false)
	private Long mallId;// get mallId

	/**
	 * industryId:
	 */
	@Column(name = "industryId")
	private Long industryId;// get industryId

	/**
	 * industryId2:
	 */
	@Column(name = "industryId2")
	private Long industryId2;// get industryId2

	/**
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * mallNo:
	 */
	@Column(name = "mallNo", length = 20)
	private String mallNo;// get mallNo

	/**
	 * mallType:0����ͨ 1����Ӫ
	 */
	@Column(name = "mallType")
	private Integer mallType;// get mallType

	/**
	 * mallName:
	 */
	@Column(name = "mallName", length = 50)
	private String mallName;// get mallName

	/**
	 * mallLogo:
	 */
	@Column(name = "mallLogo", length = 2000)
	private String mallLogo;// get mallLogo

	/**
	 * mallLink:
	 */
	@Column(name = "mallLink", length = 2000)
	private String mallLink;// get mallLink

	/**
	 * mallIntro:
	 */
	@Column(name = "mallIntro", length = 2000)
	private String mallIntro;// get mallIntro

	/**
	 * qrcode:
	 */
	@Column(name = "qRCode", length = 2000)
	private String qrcode;// get qrcode

	/**
	 * examinestatus:0��ʾδ��� -1��ʾ���ʧ�� 1��ʾ���ͨ��
	 */
	@Column(name = "examinestatus")
	private Integer examinestatus;// get examinestatus

	/**
	 * examineCause:���δͨ���ԭ������
	 */
	@Column(name = "examineCause", length = 250)
	private String examineCause;// get examineCause

	/**
	 * examineAdminId:�����
	 */
	@Column(name = "examineAdminId")
	private Long examineAdminId;// get examineAdminId

	/**
	 * deletestatus:1��ʾ�� -1��ʾɾ��
	 */
	@Column(name = "deletestatus")
	private Integer deletestatus;// get deletestatus

	/**
	 * weixinAppid:
	 */
	@Column(name = "weixinAppid", length = 100)
	private String weixinAppid;// get weixinAppid

	/**
	 * weixinAppkey:
	 */
	@Column(name = "weixinAppkey", length = 100)
	private String weixinAppkey;// get weixinAppkey

	/**
	 * weixinAppsecret:
	 */
	@Column(name = "weixinAppsecret", length = 100)
	private String weixinAppsecret;// get weixinAppsecret

	/**
	 * provinceId:
	 */
	@Column(name = "provinceId")
	private Integer provinceId;// get provinceId

	/**
	 * districtId:
	 */
	@Column(name = "districtId")
	private Integer districtId;// get districtId

	/**
	 * detailAddress:
	 */
	@Column(name = "detailAddress", length = 200)
	private String detailAddress;// get detailAddress

	/**
	 * zipCode:
	 */
	@Column(name = "zipCode", length = 10)
	private String zipCode;// get zipCode

	/**
	 * cityId:
	 */
	@Column(name = "cityId")
	private Integer cityId;// get cityId

	/**
	 * creTime:
	 */
	@Column(name = "creTime", length = 19)
	private Timestamp creTime;// get creTime

	/**
	 * expireTime:
	 */
	@Column(name = "expireTime", length = 19)
	private Timestamp expireTime;// get expireTime

	/**
	 * minProfit:
	 */
	@Column(name = "minProfit", precision = 22, scale = 0)
	private Double minProfit;// get minProfit

	/**
	 * mallImage:�̼ҹ����ͼ
	 */
	@Column(name = "mallImage", length = 100)
	private String mallImage;// get mallImage

	/**
	 * mallImageDesc:��ͼ����
	 */
	@Column(name = "mallImageDesc", length = 100)
	private String mallImageDesc;// get mallImageDesc

	/**
	 * serviceCenter:�ͷ�����
	 */
	@Column(name = "serviceCenter", length = 200)
	private String serviceCenter;// get serviceCenter

	/**
	 * defaultFreight:Ĭ���˷�
	 */
	@Column(name = "defaultFreight", precision = 10)
	private Double defaultFreight;// get defaultFreight

	/**
	 * industryName:
	 */
	@Column(name = "industryName", length = 50)
	private String industryName;// get industryName

	/**
	 * provinceName:�����������
	 */
	@Column(name = "provinceName", length = 50)
	private String provinceName;// get provinceName

	/**
	 * cityName:�����������
	 */
	@Column(name = "cityName", length = 50)
	private String cityName;// get cityName

	/**
	 * districtName:�����������
	 */
	@Column(name = "districtName", length = 50)
	private String districtName;// get districtName

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
	 * mobile:
	 */
	@Column(name = "mobile", length = 50)
	private String mobile;// get mobile

	/**
	 * stationId:
	 */
	@Column(name = "stationId")
	private Long stationId;// get stationId

	/**
	 * stationName:
	 */
	@Column(name = "stationName", length = 100)
	private String stationName;// get stationName

	/**
	 * adminId:
	 */
	@Column(name = "adminId")
	private Long adminId;// get adminId

	/**
	 * account:
	 */
	@Column(name = "account", length = 50)
	private String account;// get account

	/**
	 * useMoney:
	 */
	@Column(name = "useMoney", precision = 15)
	private Double useMoney;// get useMoney

	/**
	 * promiseMoney:
	 */
	@Column(name = "promiseMoney", precision = 15)
	private Double promiseMoney;// get promiseMoney

	/**
	 * hostId:����ID������
	 */
	@Column(name = "hostId")
	private Long hostId;// get hostId

	/**
	 * host:���������ã�ȫ�ֲ����ظ���ÿ���̼�֧�����ö�����¼
	 */
	@Column(name = "host", length = 200)
	private String host;// get host

	// Constructors

	/** default constructor */
	public VMall() {
	}

	/** minimal constructor */
	public VMall(Long mallId) {
		this.mallId = mallId;
	}

	/** full constructor */
	public VMall(Long mallId, Long industryId, Long industryId2, Long userId,
			String mallNo, Integer mallType, String mallName, String mallLogo,
			String mallLink, String mallIntro, String qrcode,
			Integer examinestatus, String examineCause, Long examineAdminId,
			Integer deletestatus, String weixinAppid, String weixinAppkey,
			String weixinAppsecret, Integer provinceId, Integer districtId,
			String detailAddress, String zipCode, Integer cityId,
			Timestamp creTime, Timestamp expireTime, Double minProfit,
			String mallImage, String mallImageDesc, String serviceCenter,
			Double defaultFreight, String industryName, String provinceName,
			String cityName, String districtName, String username,
			String realName, String mobile, Long stationId, String stationName,
			Long adminId, String account, Double useMoney, Double promiseMoney,
			Long hostId, String host) {
		this.mallId = mallId;
		this.industryId = industryId;
		this.industryId2 = industryId2;
		this.userId = userId;
		this.mallNo = mallNo;
		this.mallType = mallType;
		this.mallName = mallName;
		this.mallLogo = mallLogo;
		this.mallLink = mallLink;
		this.mallIntro = mallIntro;
		this.qrcode = qrcode;
		this.examinestatus = examinestatus;
		this.examineCause = examineCause;
		this.examineAdminId = examineAdminId;
		this.deletestatus = deletestatus;
		this.weixinAppid = weixinAppid;
		this.weixinAppkey = weixinAppkey;
		this.weixinAppsecret = weixinAppsecret;
		this.provinceId = provinceId;
		this.districtId = districtId;
		this.detailAddress = detailAddress;
		this.zipCode = zipCode;
		this.cityId = cityId;
		this.creTime = creTime;
		this.expireTime = expireTime;
		this.minProfit = minProfit;
		this.mallImage = mallImage;
		this.mallImageDesc = mallImageDesc;
		this.serviceCenter = serviceCenter;
		this.defaultFreight = defaultFreight;
		this.industryName = industryName;
		this.provinceName = provinceName;
		this.cityName = cityName;
		this.districtName = districtName;
		this.username = username;
		this.realName = realName;
		this.mobile = mobile;
		this.stationId = stationId;
		this.stationName = stationName;
		this.adminId = adminId;
		this.account = account;
		this.useMoney = useMoney;
		this.promiseMoney = promiseMoney;
		this.hostId = hostId;
		this.host = host;
	}

	// Property accessors
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
	 * get industryId
	 */
	public Long getIndustryId() {
		return this.industryId;
	}

	public void setIndustryId(Long industryId) {
		this.industryId = industryId;
	}

	/**
	 * get industryId2
	 */
	public Long getIndustryId2() {
		return this.industryId2;
	}

	public void setIndustryId2(Long industryId2) {
		this.industryId2 = industryId2;
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
	 * get mallNo
	 */
	public String getMallNo() {
		return this.mallNo;
	}

	public void setMallNo(String mallNo) {
		this.mallNo = mallNo;
	}

	/**
	 * get mallType
	 */
	public Integer getMallType() {
		return this.mallType;
	}

	public void setMallType(Integer mallType) {
		this.mallType = mallType;
	}

	/**
	 * get mallName
	 */
	public String getMallName() {
		return this.mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	/**
	 * get mallLogo
	 */
	public String getMallLogo() {
		return this.mallLogo;
	}

	public void setMallLogo(String mallLogo) {
		this.mallLogo = mallLogo;
	}

	/**
	 * get mallLink
	 */
	public String getMallLink() {
		return this.mallLink;
	}

	public void setMallLink(String mallLink) {
		this.mallLink = mallLink;
	}

	/**
	 * get mallIntro
	 */
	public String getMallIntro() {
		return this.mallIntro;
	}

	public void setMallIntro(String mallIntro) {
		this.mallIntro = mallIntro;
	}

	/**
	 * get qrcode
	 */
	public String getQrcode() {
		return this.qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	/**
	 * get examinestatus
	 */
	public Integer getExaminestatus() {
		return this.examinestatus;
	}

	public void setExaminestatus(Integer examinestatus) {
		this.examinestatus = examinestatus;
	}

	/**
	 * get examineCause
	 */
	public String getExamineCause() {
		return this.examineCause;
	}

	public void setExamineCause(String examineCause) {
		this.examineCause = examineCause;
	}

	/**
	 * get examineAdminId
	 */
	public Long getExamineAdminId() {
		return this.examineAdminId;
	}

	public void setExamineAdminId(Long examineAdminId) {
		this.examineAdminId = examineAdminId;
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
	 * get weixinAppid
	 */
	public String getWeixinAppid() {
		return this.weixinAppid;
	}

	public void setWeixinAppid(String weixinAppid) {
		this.weixinAppid = weixinAppid;
	}

	/**
	 * get weixinAppkey
	 */
	public String getWeixinAppkey() {
		return this.weixinAppkey;
	}

	public void setWeixinAppkey(String weixinAppkey) {
		this.weixinAppkey = weixinAppkey;
	}

	/**
	 * get weixinAppsecret
	 */
	public String getWeixinAppsecret() {
		return this.weixinAppsecret;
	}

	public void setWeixinAppsecret(String weixinAppsecret) {
		this.weixinAppsecret = weixinAppsecret;
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
	 * get districtId
	 */
	public Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	/**
	 * get detailAddress
	 */
	public String getDetailAddress() {
		return this.detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	/**
	 * get zipCode
	 */
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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
	 * get creTime
	 */
	public Timestamp getCreTime() {
		return this.creTime;
	}

	public void setCreTime(Timestamp creTime) {
		this.creTime = creTime;
	}

	/**
	 * get expireTime
	 */
	public Timestamp getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Timestamp expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * get minProfit
	 */
	public Double getMinProfit() {
		return this.minProfit;
	}

	public void setMinProfit(Double minProfit) {
		this.minProfit = minProfit;
	}

	/**
	 * get mallImage
	 */
	public String getMallImage() {
		return this.mallImage;
	}

	public void setMallImage(String mallImage) {
		this.mallImage = mallImage;
	}

	/**
	 * get mallImageDesc
	 */
	public String getMallImageDesc() {
		return this.mallImageDesc;
	}

	public void setMallImageDesc(String mallImageDesc) {
		this.mallImageDesc = mallImageDesc;
	}

	/**
	 * get serviceCenter
	 */
	public String getServiceCenter() {
		return this.serviceCenter;
	}

	public void setServiceCenter(String serviceCenter) {
		this.serviceCenter = serviceCenter;
	}

	/**
	 * get defaultFreight
	 */
	public Double getDefaultFreight() {
		return this.defaultFreight;
	}

	public void setDefaultFreight(Double defaultFreight) {
		this.defaultFreight = defaultFreight;
	}

	/**
	 * get industryName
	 */
	public String getIndustryName() {
		return this.industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	/**
	 * get provinceName
	 */
	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	/**
	 * get cityName
	 */
	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * get districtName
	 */
	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
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
	 * get mobile
	 */
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	 * get stationName
	 */
	public String getStationName() {
		return this.stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	/**
	 * get adminId
	 */
	public Long getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	/**
	 * get account
	 */
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * get useMoney
	 */
	public Double getUseMoney() {
		return this.useMoney;
	}

	public void setUseMoney(Double useMoney) {
		this.useMoney = useMoney;
	}

	/**
	 * get promiseMoney
	 */
	public Double getPromiseMoney() {
		return this.promiseMoney;
	}

	public void setPromiseMoney(Double promiseMoney) {
		this.promiseMoney = promiseMoney;
	}

	/**
	 * get hostId
	 */
	public Long getHostId() {
		return this.hostId;
	}

	public void setHostId(Long hostId) {
		this.hostId = hostId;
	}

	/**
	 * get host
	 */
	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

}
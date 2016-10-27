package com.ecshop.dao.business.models;

import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TShareLink entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_share_link")
public class TShareLink implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1094429317L;

	// Fields

	/**
	 * linkId:����ID
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "linkId", unique = true, nullable = false)
	private Long linkId;// get linkId

	/**
	 * appId:Ӧ��ID(��ǰָ΢��APPID)
	 */
	@Column(name = "appId", nullable = false, length = 100)
	private String appId;// get appId

	/**
	 * subStationId:
	 */
	@Column(name = "subStationId")
	private Long subStationId;// get subStationId

	/**
	 * goodsId:��ƷID
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * ownerId:����������ID
	 */
	@Column(name = "ownerId")
	private Long ownerId;// get ownerId

	/**
	 * linkTitle:���ӱ���
	 */
	@Column(name = "linkTitle", length = 100)
	private String linkTitle;// get linkTitle

	/**
	 * linkIntro:���Ӽ��
	 */
	@Column(name = "linkIntro", length = 300)
	private String linkIntro;// get linkIntro

	/**
	 * linkPicture:����ͼƬ��ַ
	 */
	@Column(name = "linkPicture", length = 500)
	private String linkPicture;// get linkPicture

	/**
	 * linkSourceAddress:��������ָ��ĵ�ַ
	 */
	@Column(name = "linkSourceAddress", nullable = false, length = 500)
	private String linkSourceAddress;// get linkSourceAddress

	/**
	 * linkNewAddress:����ת����ĵ�ַ
	 */
	@Column(name = "linkNewAddress", length = 500)
	private String linkNewAddress;// get linkNewAddress

	/**
	 * addTime:�������ʱ��
	 */
	@Column(name = "addTime", length = 19)
	private Timestamp addTime;// get addTime

	/**
	 * totalShareCount:�ܳɹ�������
	 */
	@Column(name = "totalShareCount")
	private Long totalShareCount;// get totalShareCount

	/**
	 * totalAccessCount:�ܷ��ʴ���
	 */
	@Column(name = "totalAccessCount")
	private Long totalAccessCount;// get totalAccessCount

	/**
	 * totalRegCount:ͨ�������ע����û���
	 */
	@Column(name = "totalRegCount")
	private Long totalRegCount;// get totalRegCount

	/**
	 * linkQrcodeUrl:
	 */
	@Column(name = "linkQRCodeURL", length = 500)
	private String linkQrcodeUrl;// get linkQrcodeUrl

	/**
	 * linkQrcodeExpiryTime:
	 */
	@Column(name = "linkQRCodeExpiryTime", length = 19)
	private Timestamp linkQrcodeExpiryTime;// get linkQrcodeExpiryTime

	// Constructors

	/** default constructor */
	public TShareLink() {
	}

	/** minimal constructor */
	public TShareLink(String appId, String linkSourceAddress) {
		this.appId = appId;
		this.linkSourceAddress = linkSourceAddress;
	}

	/** full constructor */
	public TShareLink(String appId, Long subStationId, Long goodsId,
			Long ownerId, String linkTitle, String linkIntro,
			String linkPicture, String linkSourceAddress,
			String linkNewAddress, Timestamp addTime, Long totalShareCount,
			Long totalAccessCount, Long totalRegCount, String linkQrcodeUrl,
			Timestamp linkQrcodeExpiryTime) {
		this.appId = appId;
		this.subStationId = subStationId;
		this.goodsId = goodsId;
		this.ownerId = ownerId;
		this.linkTitle = linkTitle;
		this.linkIntro = linkIntro;
		this.linkPicture = linkPicture;
		this.linkSourceAddress = linkSourceAddress;
		this.linkNewAddress = linkNewAddress;
		this.addTime = addTime;
		this.totalShareCount = totalShareCount;
		this.totalAccessCount = totalAccessCount;
		this.totalRegCount = totalRegCount;
		this.linkQrcodeUrl = linkQrcodeUrl;
		this.linkQrcodeExpiryTime = linkQrcodeExpiryTime;
	}

	// Property accessors
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
	 * get subStationId
	 */
	public Long getSubStationId() {
		return this.subStationId;
	}

	public void setSubStationId(Long subStationId) {
		this.subStationId = subStationId;
	}

	/**
	 * get goodsId
	 */
	public Long getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
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
	 * get linkTitle
	 */
	public String getLinkTitle() {
		return this.linkTitle;
	}

	public void setLinkTitle(String linkTitle) {
		this.linkTitle = linkTitle;
	}

	/**
	 * get linkIntro
	 */
	public String getLinkIntro() {
		return this.linkIntro;
	}

	public void setLinkIntro(String linkIntro) {
		this.linkIntro = linkIntro;
	}

	/**
	 * get linkPicture
	 */
	public String getLinkPicture() {
		return this.linkPicture;
	}

	public void setLinkPicture(String linkPicture) {
		this.linkPicture = linkPicture;
	}

	/**
	 * get linkSourceAddress
	 */
	public String getLinkSourceAddress() {
		return this.linkSourceAddress;
	}

	public void setLinkSourceAddress(String linkSourceAddress) {
		this.linkSourceAddress = linkSourceAddress;
	}

	/**
	 * get linkNewAddress
	 */
	public String getLinkNewAddress() {
		return this.linkNewAddress;
	}

	public void setLinkNewAddress(String linkNewAddress) {
		this.linkNewAddress = linkNewAddress;
	}

	/**
	 * get addTime
	 */
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	/**
	 * get totalShareCount
	 */
	public Long getTotalShareCount() {
		return this.totalShareCount;
	}

	public void setTotalShareCount(Long totalShareCount) {
		this.totalShareCount = totalShareCount;
	}

	/**
	 * get totalAccessCount
	 */
	public Long getTotalAccessCount() {
		return this.totalAccessCount;
	}

	public void setTotalAccessCount(Long totalAccessCount) {
		this.totalAccessCount = totalAccessCount;
	}

	/**
	 * get totalRegCount
	 */
	public Long getTotalRegCount() {
		return this.totalRegCount;
	}

	public void setTotalRegCount(Long totalRegCount) {
		this.totalRegCount = totalRegCount;
	}

	/**
	 * get linkQrcodeUrl
	 */
	public String getLinkQrcodeUrl() {
		return this.linkQrcodeUrl;
	}

	public void setLinkQrcodeUrl(String linkQrcodeUrl) {
		this.linkQrcodeUrl = linkQrcodeUrl;
	}

	/**
	 * get linkQrcodeExpiryTime
	 */
	public Timestamp getLinkQrcodeExpiryTime() {
		return this.linkQrcodeExpiryTime;
	}

	public void setLinkQrcodeExpiryTime(Timestamp linkQrcodeExpiryTime) {
		this.linkQrcodeExpiryTime = linkQrcodeExpiryTime;
	}

}
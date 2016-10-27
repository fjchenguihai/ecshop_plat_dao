package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TPrivilegeGoodsExt entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_privilege_goods_ext")
public class TPrivilegeGoodsExt implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 989839048L;

	// Fields

	/**
	 * privilegeGoodId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "privilegeGoodId", unique = true, nullable = false)
	private Long privilegeGoodId;// get privilegeGoodId

	/**
	 * cover:
	 */
	@Column(name = "cover")
	private String cover;// get cover

	/**
	 * coverDesc:
	 */
	@Column(name = "coverDesc")
	private String coverDesc;// get coverDesc

	/**
	 * privilegeBeginTime:����
	 */
	@Column(name = "privilegeBeginTime", nullable = false, length = 19)
	private Timestamp privilegeBeginTime;// get privilegeBeginTime

	/**
	 * privilegeEndTime:����
	 */
	@Column(name = "privilegeEndTime", nullable = false, length = 19)
	private Timestamp privilegeEndTime;// get privilegeEndTime

	/**
	 * userTypeStr:�Զ��ŷָ��� 0:���� 1��VIP 2:V�� 3�������� 4���˿� 5����ͨ�����
	 */
	@Column(name = "userTypeStr", length = 20)
	private String userTypeStr;// get userTypeStr

	/**
	 * quotaNum:
	 */
	@Column(name = "quotaNum")
	private Integer quotaNum;// get quotaNum

	/**
	 * goodsId:
	 */
	@Column(name = "goodsId", nullable = false)
	private Long goodsId;// get goodsId

	/**
	 * platReleaseStatus:0��δ���� 1�������У�����ˣ� 2�����ͨ�� 3����˲�ͨ��
	 */
	@Column(name = "platReleaseStatus", nullable = false)
	private Integer platReleaseStatus;// get platReleaseStatus

	// Constructors

	/** default constructor */
	public TPrivilegeGoodsExt() {
	}

	/** minimal constructor */
	public TPrivilegeGoodsExt(Timestamp privilegeBeginTime,
			Timestamp privilegeEndTime, Long goodsId, Integer platReleaseStatus) {
		this.privilegeBeginTime = privilegeBeginTime;
		this.privilegeEndTime = privilegeEndTime;
		this.goodsId = goodsId;
		this.platReleaseStatus = platReleaseStatus;
	}

	/** full constructor */
	public TPrivilegeGoodsExt(String cover, String coverDesc,
			Timestamp privilegeBeginTime, Timestamp privilegeEndTime,
			String userTypeStr, Integer quotaNum, Long goodsId,
			Integer platReleaseStatus) {
		this.cover = cover;
		this.coverDesc = coverDesc;
		this.privilegeBeginTime = privilegeBeginTime;
		this.privilegeEndTime = privilegeEndTime;
		this.userTypeStr = userTypeStr;
		this.quotaNum = quotaNum;
		this.goodsId = goodsId;
		this.platReleaseStatus = platReleaseStatus;
	}

	// Property accessors
	/**
	 * get privilegeGoodId
	 */
	public Long getPrivilegeGoodId() {
		return this.privilegeGoodId;
	}

	public void setPrivilegeGoodId(Long privilegeGoodId) {
		this.privilegeGoodId = privilegeGoodId;
	}

	/**
	 * get cover
	 */
	public String getCover() {
		return this.cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	/**
	 * get coverDesc
	 */
	public String getCoverDesc() {
		return this.coverDesc;
	}

	public void setCoverDesc(String coverDesc) {
		this.coverDesc = coverDesc;
	}

	/**
	 * get privilegeBeginTime
	 */
	public Timestamp getPrivilegeBeginTime() {
		return this.privilegeBeginTime;
	}

	public void setPrivilegeBeginTime(Timestamp privilegeBeginTime) {
		this.privilegeBeginTime = privilegeBeginTime;
	}

	/**
	 * get privilegeEndTime
	 */
	public Timestamp getPrivilegeEndTime() {
		return this.privilegeEndTime;
	}

	public void setPrivilegeEndTime(Timestamp privilegeEndTime) {
		this.privilegeEndTime = privilegeEndTime;
	}

	/**
	 * get userTypeStr
	 */
	public String getUserTypeStr() {
		return this.userTypeStr;
	}

	public void setUserTypeStr(String userTypeStr) {
		this.userTypeStr = userTypeStr;
	}

	/**
	 * get quotaNum
	 */
	public Integer getQuotaNum() {
		return this.quotaNum;
	}

	public void setQuotaNum(Integer quotaNum) {
		this.quotaNum = quotaNum;
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
	 * get platReleaseStatus
	 */
	public Integer getPlatReleaseStatus() {
		return this.platReleaseStatus;
	}

	public void setPlatReleaseStatus(Integer platReleaseStatus) {
		this.platReleaseStatus = platReleaseStatus;
	}

}
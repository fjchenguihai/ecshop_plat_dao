package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TBank entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_bank")
public class TBank implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 79638704L;

	// Fields

	/**
	 * bankId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "bankId", unique = true, nullable = false)
	private Long bankId;// get bankId

	/**
	 * bankName:
	 */
	@Column(name = "bankName", length = 50)
	private String bankName;// get bankName

	/**
	 * bankCity:
	 */
	@Column(name = "bankCity", length = 50)
	private String bankCity;// get bankCity

	/**
	 * bankNo:
	 */
	@Column(name = "bankNo", length = 50)
	private String bankNo;// get bankNo

	/**
	 * holderName:
	 */
	@Column(name = "holderName", length = 50)
	private String holderName;// get holderName

	/**
	 * bankBranch:
	 */
	@Column(name = "bankBranch", length = 50)
	private String bankBranch;// get bankBranch

	/**
	 * bankType:1���Թ���2����˽
	 */
	@Column(name = "bankType")
	private Integer bankType;// get bankType

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
	 * bankImg:���п�ͼƬ��ַ
	 */
	@Column(name = "bankImg", length = 200)
	private String bankImg;// get bankImg

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
	public TBank() {
	}

	/** full constructor */
	public TBank(String bankName, String bankCity, String bankNo,
			String holderName, String bankBranch, Integer bankType,
			Long userId, Long mallId, String bankImg, Integer provinceId,
			Integer cityId, Integer districtId) {
		this.bankName = bankName;
		this.bankCity = bankCity;
		this.bankNo = bankNo;
		this.holderName = holderName;
		this.bankBranch = bankBranch;
		this.bankType = bankType;
		this.userId = userId;
		this.mallId = mallId;
		this.bankImg = bankImg;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.districtId = districtId;
	}

	// Property accessors
	/**
	 * get bankId
	 */
	public Long getBankId() {
		return this.bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	/**
	 * get bankName
	 */
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * get bankCity
	 */
	public String getBankCity() {
		return this.bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	/**
	 * get bankNo
	 */
	public String getBankNo() {
		return this.bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	/**
	 * get holderName
	 */
	public String getHolderName() {
		return this.holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	/**
	 * get bankBranch
	 */
	public String getBankBranch() {
		return this.bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	/**
	 * get bankType
	 */
	public Integer getBankType() {
		return this.bankType;
	}

	public void setBankType(Integer bankType) {
		this.bankType = bankType;
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
	 * get bankImg
	 */
	public String getBankImg() {
		return this.bankImg;
	}

	public void setBankImg(String bankImg) {
		this.bankImg = bankImg;
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
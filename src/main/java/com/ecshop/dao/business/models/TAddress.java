package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAddress entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_address")
public class TAddress implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 884141312L;

	// Fields

	/**
	 * addressId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "addressId", unique = true, nullable = false)
	private Long addressId;// get addressId

	/**
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * address:
	 */
	@Column(name = "address", length = 100)
	private String address;// get address

	/**
	 * telephone:
	 */
	@Column(name = "telephone", length = 20)
	private String telephone;// get telephone

	/**
	 * addressee:
	 */
	@Column(name = "addressee", length = 20)
	private String addressee;// get addressee

	/**
	 * ifDefault:1��ʾ�� 2��ʾ��
	 */
	@Column(name = "ifDefault")
	private Integer ifDefault;// get ifDefault

	/**
	 * provinceId:
	 */
	@Column(name = "provinceId")
	private Integer provinceId;// get provinceId

	/**
	 * cityId:
	 */
	@Column(name = "cityId")
	private Integer cityId;// get cityId

	/**
	 * districtId:
	 */
	@Column(name = "districtId")
	private Integer districtId;// get districtId

	/**
	 * mobile:
	 */
	@Column(name = "mobile", length = 50)
	private String mobile;// get mobile

	/**
	 * zipCode:
	 */
	@Column(name = "zipCode", length = 10)
	private String zipCode;// get zipCode

	/**
	 * addressalias:
	 */
	@Column(name = "addressalias", length = 50)
	private String addressalias;// get addressalias

	// Constructors

	/** default constructor */
	public TAddress() {
	}

	/** full constructor */
	public TAddress(Long userId, String address, String telephone,
			String addressee, Integer ifDefault, Integer provinceId,
			Integer cityId, Integer districtId, String mobile, String zipCode,
			String addressalias) {
		this.userId = userId;
		this.address = address;
		this.telephone = telephone;
		this.addressee = addressee;
		this.ifDefault = ifDefault;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.districtId = districtId;
		this.mobile = mobile;
		this.zipCode = zipCode;
		this.addressalias = addressalias;
	}

	// Property accessors
	/**
	 * get addressId
	 */
	public Long getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
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
	 * get address
	 */
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
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
	 * get addressee
	 */
	public String getAddressee() {
		return this.addressee;
	}

	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}

	/**
	 * get ifDefault
	 */
	public Integer getIfDefault() {
		return this.ifDefault;
	}

	public void setIfDefault(Integer ifDefault) {
		this.ifDefault = ifDefault;
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
	 * get zipCode
	 */
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * get addressalias
	 */
	public String getAddressalias() {
		return this.addressalias;
	}

	public void setAddressalias(String addressalias) {
		this.addressalias = addressalias;
	}

}
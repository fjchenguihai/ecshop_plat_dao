package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TDeliveryAddress entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_delivery_address")
public class TDeliveryAddress implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 115671660L;

	// Fields

	/**
	 * deliveryAddrId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "deliveryAddrId", unique = true, nullable = false)
	private Long deliveryAddrId;// get deliveryAddrId

	/**
	 * mallId:
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * addressee:
	 */
	@Column(name = "addressee", length = 20)
	private String addressee;// get addressee

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
	 * address:
	 */
	@Column(name = "address", length = 100)
	private String address;// get address

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
	 * ifDefault:1��ʾ�� 2��ʾ��
	 */
	@Column(name = "ifDefault")
	private Integer ifDefault;// get ifDefault

	/**
	 * addressalias:
	 */
	@Column(name = "addressalias", length = 50)
	private String addressalias;// get addressalias

	// Constructors

	/** default constructor */
	public TDeliveryAddress() {
	}

	/** full constructor */
	public TDeliveryAddress(Long mallId, String addressee, Integer provinceId,
			Integer cityId, Integer districtId, String address, String mobile,
			String zipCode, Integer ifDefault, String addressalias) {
		this.mallId = mallId;
		this.addressee = addressee;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.districtId = districtId;
		this.address = address;
		this.mobile = mobile;
		this.zipCode = zipCode;
		this.ifDefault = ifDefault;
		this.addressalias = addressalias;
	}

	// Property accessors
	/**
	 * get deliveryAddrId
	 */
	public Long getDeliveryAddrId() {
		return this.deliveryAddrId;
	}

	public void setDeliveryAddrId(Long deliveryAddrId) {
		this.deliveryAddrId = deliveryAddrId;
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
	 * get addressee
	 */
	public String getAddressee() {
		return this.addressee;
	}

	public void setAddressee(String addressee) {
		this.addressee = addressee;
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
	 * get address
	 */
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
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
	 * get ifDefault
	 */
	public Integer getIfDefault() {
		return this.ifDefault;
	}

	public void setIfDefault(Integer ifDefault) {
		this.ifDefault = ifDefault;
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
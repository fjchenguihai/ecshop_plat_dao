package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCountryAndRegion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_country_and_region")
public class TCountryAndRegion implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -226386647L;

	// Fields

	/**
	 * id:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;// get id

	/**
	 * chineseName:
	 */
	@Column(name = "chineseName", length = 50)
	private String chineseName;// get chineseName

	/**
	 * englishName:
	 */
	@Column(name = "englishName", length = 50)
	private String englishName;// get englishName

	/**
	 * domainNameAbbreviation:
	 */
	@Column(name = "domainNameAbbreviation", length = 2)
	private String domainNameAbbreviation;// get domainNameAbbreviation

	/**
	 * phoneCode:
	 */
	@Column(name = "phoneCode", length = 4)
	private String phoneCode;// get phoneCode

	// Constructors

	/** default constructor */
	public TCountryAndRegion() {
	}

	/** full constructor */
	public TCountryAndRegion(String chineseName, String englishName,
			String domainNameAbbreviation, String phoneCode) {
		this.chineseName = chineseName;
		this.englishName = englishName;
		this.domainNameAbbreviation = domainNameAbbreviation;
		this.phoneCode = phoneCode;
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
	 * get chineseName
	 */
	public String getChineseName() {
		return this.chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}

	/**
	 * get englishName
	 */
	public String getEnglishName() {
		return this.englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	/**
	 * get domainNameAbbreviation
	 */
	public String getDomainNameAbbreviation() {
		return this.domainNameAbbreviation;
	}

	public void setDomainNameAbbreviation(String domainNameAbbreviation) {
		this.domainNameAbbreviation = domainNameAbbreviation;
	}

	/**
	 * get phoneCode
	 */
	public String getPhoneCode() {
		return this.phoneCode;
	}

	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}

}
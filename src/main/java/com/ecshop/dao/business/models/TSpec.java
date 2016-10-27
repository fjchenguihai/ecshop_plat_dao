package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TSpec entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_spec")
public class TSpec implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 80159279L;

	// Fields

	/**
	 * specId:���ID
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "specId", unique = true, nullable = false)
	private Long specId;// get specId

	/**
	 * specName:������
	 */
	@Column(name = "specName", nullable = false, length = 50)
	private String specName;// get specName

	/**
	 * specValues:�������ѡ��ֵ,�ö��ŷָ�
	 */
	@Column(name = "specValues", length = 512)
	private String specValues;// get specValues

	/**
	 * isColor:1��0��
	 */
	@Column(name = "isColor")
	private Integer isColor;// get isColor

	/**
	 * status:״̬,0:ɾ��1����
	 */
	@Column(name = "status")
	private Integer status;// get status

	// Constructors

	/** default constructor */
	public TSpec() {
	}

	/** minimal constructor */
	public TSpec(String specName) {
		this.specName = specName;
	}

	/** full constructor */
	public TSpec(String specName, String specValues, Integer isColor,
			Integer status) {
		this.specName = specName;
		this.specValues = specValues;
		this.isColor = isColor;
		this.status = status;
	}

	// Property accessors
	/**
	 * get specId
	 */
	public Long getSpecId() {
		return this.specId;
	}

	public void setSpecId(Long specId) {
		this.specId = specId;
	}

	/**
	 * get specName
	 */
	public String getSpecName() {
		return this.specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

	/**
	 * get specValues
	 */
	public String getSpecValues() {
		return this.specValues;
	}

	public void setSpecValues(String specValues) {
		this.specValues = specValues;
	}

	/**
	 * get isColor
	 */
	public Integer getIsColor() {
		return this.isColor;
	}

	public void setIsColor(Integer isColor) {
		this.isColor = isColor;
	}

	/**
	 * get status
	 */
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
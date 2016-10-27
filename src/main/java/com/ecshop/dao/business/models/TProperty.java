package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TProperty entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_property")
public class TProperty implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1864150601L;

	// Fields

	/**
	 * propertyId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "propertyId", unique = true, nullable = false)
	private Long propertyId;// get propertyId

	/**
	 * propertyName:�������
	 */
	@Column(name = "propertyName", nullable = false, length = 50)
	private String propertyName;// get propertyName

	/**
	 * selectType:0����ѡ 1����ѡ 2���Զ���
	 */
	@Column(name = "selectType", nullable = false)
	private Integer selectType;// get selectType

	/**
	 * selectValue:ѡ�����ݣ�JSON�洢
	 */
	@Column(name = "selectValue")
	private String selectValue;// get selectValue

	/**
	 * isNotNull:�Ƿ����
	 */
	@Column(name = "isNotNull")
	private Integer isNotNull;// get isNotNull

	/**
	 * propertyType:���/���ԣ�1-��� 2-���ԣ�
	 */
	@Column(name = "propertyType")
	private Integer propertyType;// get propertyType

	// Constructors

	/** default constructor */
	public TProperty() {
	}

	/** minimal constructor */
	public TProperty(String propertyName, Integer selectType) {
		this.propertyName = propertyName;
		this.selectType = selectType;
	}

	/** full constructor */
	public TProperty(String propertyName, Integer selectType,
			String selectValue, Integer isNotNull, Integer propertyType) {
		this.propertyName = propertyName;
		this.selectType = selectType;
		this.selectValue = selectValue;
		this.isNotNull = isNotNull;
		this.propertyType = propertyType;
	}

	// Property accessors
	/**
	 * get propertyId
	 */
	public Long getPropertyId() {
		return this.propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}

	/**
	 * get propertyName
	 */
	public String getPropertyName() {
		return this.propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	/**
	 * get selectType
	 */
	public Integer getSelectType() {
		return this.selectType;
	}

	public void setSelectType(Integer selectType) {
		this.selectType = selectType;
	}

	/**
	 * get selectValue
	 */
	public String getSelectValue() {
		return this.selectValue;
	}

	public void setSelectValue(String selectValue) {
		this.selectValue = selectValue;
	}

	/**
	 * get isNotNull
	 */
	public Integer getIsNotNull() {
		return this.isNotNull;
	}

	public void setIsNotNull(Integer isNotNull) {
		this.isNotNull = isNotNull;
	}

	/**
	 * get propertyType
	 */
	public Integer getPropertyType() {
		return this.propertyType;
	}

	public void setPropertyType(Integer propertyType) {
		this.propertyType = propertyType;
	}

}
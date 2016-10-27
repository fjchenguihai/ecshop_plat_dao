package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TGoodsProperty entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_goods_property")
public class TGoodsProperty implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -127698089L;

	// Fields

	/**
	 * goodsPropertyId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "goodsPropertyId", unique = true, nullable = false)
	private Long goodsPropertyId;// get goodsPropertyId

	/**
	 * goodsId:��ƷID
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * propertyId:����ID
	 */
	@Column(name = "propertyId")
	private Long propertyId;// get propertyId

	/**
	 * propertyName:�������
	 */
	@Column(name = "propertyName", length = 50)
	private String propertyName;// get propertyName

	/**
	 * propertyValue:����ֵ
	 */
	@Column(name = "propertyValue", length = 50)
	private String propertyValue;// get propertyValue

	// Constructors

	/** default constructor */
	public TGoodsProperty() {
	}

	/** full constructor */
	public TGoodsProperty(Long goodsId, Long propertyId, String propertyName,
			String propertyValue) {
		this.goodsId = goodsId;
		this.propertyId = propertyId;
		this.propertyName = propertyName;
		this.propertyValue = propertyValue;
	}

	// Property accessors
	/**
	 * get goodsPropertyId
	 */
	public Long getGoodsPropertyId() {
		return this.goodsPropertyId;
	}

	public void setGoodsPropertyId(Long goodsPropertyId) {
		this.goodsPropertyId = goodsPropertyId;
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
	 * get propertyValue
	 */
	public String getPropertyValue() {
		return this.propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

}
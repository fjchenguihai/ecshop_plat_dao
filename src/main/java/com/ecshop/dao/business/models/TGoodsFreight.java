package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TGoodsFreight entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_goods_freight")
public class TGoodsFreight implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1268494975L;

	// Fields

	/**
	 * goodsFreight:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "goodsFreight", unique = true, nullable = false)
	private Long goodsFreight;// get goodsFreight

	/**
	 * goodsId:
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * type:0�������� 1��������
	 */
	@Column(name = "type")
	private Integer type;// get type

	/**
	 * addFreight:�����˷�
	 */
	@Column(name = "addFreight", precision = 12)
	private Double addFreight;// get addFreight

	/**
	 * regionId:����ID
	 */
	@Column(name = "regionId")
	private Long regionId;// get regionId

	/**
	 * regionName:�������
	 */
	@Column(name = "regionName", length = 150)
	private String regionName;// get regionName

	// Constructors

	/** default constructor */
	public TGoodsFreight() {
	}

	/** full constructor */
	public TGoodsFreight(Long goodsId, Integer type, Double addFreight,
			Long regionId, String regionName) {
		this.goodsId = goodsId;
		this.type = type;
		this.addFreight = addFreight;
		this.regionId = regionId;
		this.regionName = regionName;
	}

	// Property accessors
	/**
	 * get goodsFreight
	 */
	public Long getGoodsFreight() {
		return this.goodsFreight;
	}

	public void setGoodsFreight(Long goodsFreight) {
		this.goodsFreight = goodsFreight;
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
	 * get type
	 */
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * get addFreight
	 */
	public Double getAddFreight() {
		return this.addFreight;
	}

	public void setAddFreight(Double addFreight) {
		this.addFreight = addFreight;
	}

	/**
	 * get regionId
	 */
	public Long getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	/**
	 * get regionName
	 */
	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

}
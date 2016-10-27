package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TGoodsSpec entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_goods_spec")
public class TGoodsSpec implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -223697347L;

	// Fields

	/**
	 * goodsSpecId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "goodsSpecId", unique = true, nullable = false)
	private Long goodsSpecId;// get goodsSpecId

	/**
	 * specId:��Ӧt_spec�������ID�������Ϊ�Զ�����ʱ�����ֶ�Ϊ��
	 */
	@Column(name = "specId")
	private Long specId;// get specId

	/**
	 * specName:������
	 */
	@Column(name = "specName", length = 50)
	private String specName;// get specName

	/**
	 * goodsId:��Ʒ��ID
	 */
	@Column(name = "goodsId")
	private Long goodsId;// get goodsId

	/**
	 * specValue:�����Զ�����ѡ��ֵ,�ö��ŷָ�
	 */
	@Column(name = "specValue", length = 2000)
	private String specValue;// get specValue

	/**
	 * defaultSpecValue:Ĭ�Ϲ��ѡ��ֵ,�ö��ŷָ�
	 */
	@Column(name = "defaultSpecValue", length = 512)
	private String defaultSpecValue;// get defaultSpecValue

	// Constructors

	/** default constructor */
	public TGoodsSpec() {
	}

	/** full constructor */
	public TGoodsSpec(Long specId, String specName, Long goodsId,
			String specValue, String defaultSpecValue) {
		this.specId = specId;
		this.specName = specName;
		this.goodsId = goodsId;
		this.specValue = specValue;
		this.defaultSpecValue = defaultSpecValue;
	}

	// Property accessors
	/**
	 * get goodsSpecId
	 */
	public Long getGoodsSpecId() {
		return this.goodsSpecId;
	}

	public void setGoodsSpecId(Long goodsSpecId) {
		this.goodsSpecId = goodsSpecId;
	}

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
	 * get goodsId
	 */
	public Long getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * get specValue
	 */
	public String getSpecValue() {
		return this.specValue;
	}

	public void setSpecValue(String specValue) {
		this.specValue = specValue;
	}

	/**
	 * get defaultSpecValue
	 */
	public String getDefaultSpecValue() {
		return this.defaultSpecValue;
	}

	public void setDefaultSpecValue(String defaultSpecValue) {
		this.defaultSpecValue = defaultSpecValue;
	}

}
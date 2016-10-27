package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TMallHost entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_host", uniqueConstraints = @UniqueConstraint(columnNames = "host"))
public class TMallHost implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1362422192L;

	// Fields

	/**
	 * hostId:����ID������
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "hostId", unique = true, nullable = false)
	private Long hostId;// get hostId

	/**
	 * mallId:�̼����
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * host:���������ã�ȫ�ֲ����ظ���ÿ���̼�֧�����ö�����¼
	 */
	@Column(name = "host", unique = true, nullable = false, length = 200)
	private String host;// get host

	/**
	 * isDefault:һ���̼�ֻ������һ��Ĭ������1Ĭ�ϣ�0��
	 */
	@Column(name = "isDefault")
	private Short isDefault;// get isDefault

	// Constructors

	/** default constructor */
	public TMallHost() {
	}

	/** minimal constructor */
	public TMallHost(String host) {
		this.host = host;
	}

	/** full constructor */
	public TMallHost(Long mallId, String host, Short isDefault) {
		this.mallId = mallId;
		this.host = host;
		this.isDefault = isDefault;
	}

	// Property accessors
	/**
	 * get hostId
	 */
	public Long getHostId() {
		return this.hostId;
	}

	public void setHostId(Long hostId) {
		this.hostId = hostId;
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
	 * get host
	 */
	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * get isDefault
	 */
	public Short getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Short isDefault) {
		this.isDefault = isDefault;
	}

}
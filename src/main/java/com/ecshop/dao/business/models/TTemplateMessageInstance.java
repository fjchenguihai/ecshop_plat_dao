package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TTemplateMessageInstance entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_template_message_instance")
public class TTemplateMessageInstance implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1351294226L;

	// Fields

	/**
	 * templateInstanceId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "templateInstanceId", unique = true, nullable = false)
	private Long templateInstanceId;// get templateInstanceId

	/**
	 * templateNo:ģ����Ϣ���
	 */
	@Column(name = "templateNo", length = 100)
	private String templateNo;// get templateNo

	/**
	 * templateId:���ÿ���̼�ÿ��ģ���ŵ�ģ����ϢID
	 */
	@Column(name = "templateId", length = 100)
	private String templateId;// get templateId

	/**
	 * templateKey:ģ��KEY��ģ�����һ��
	 */
	@Column(name = "templateKey", length = 30)
	private String templateKey;// get templateKey

	/**
	 * mallId:�̳�ID
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * addTime:
	 */
	@Column(name = "addTime", length = 19)
	private Timestamp addTime;// get addTime

	/**
	 * modifyTime:
	 */
	@Column(name = "modifyTime", length = 19)
	private Timestamp modifyTime;// get modifyTime

	// Constructors

	/** default constructor */
	public TTemplateMessageInstance() {
	}

	/** full constructor */
	public TTemplateMessageInstance(String templateNo, String templateId,
			String templateKey, Long mallId, Timestamp addTime,
			Timestamp modifyTime) {
		this.templateNo = templateNo;
		this.templateId = templateId;
		this.templateKey = templateKey;
		this.mallId = mallId;
		this.addTime = addTime;
		this.modifyTime = modifyTime;
	}

	// Property accessors
	/**
	 * get templateInstanceId
	 */
	public Long getTemplateInstanceId() {
		return this.templateInstanceId;
	}

	public void setTemplateInstanceId(Long templateInstanceId) {
		this.templateInstanceId = templateInstanceId;
	}

	/**
	 * get templateNo
	 */
	public String getTemplateNo() {
		return this.templateNo;
	}

	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}

	/**
	 * get templateId
	 */
	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	/**
	 * get templateKey
	 */
	public String getTemplateKey() {
		return this.templateKey;
	}

	public void setTemplateKey(String templateKey) {
		this.templateKey = templateKey;
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
	 * get addTime
	 */
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	/**
	 * get modifyTime
	 */
	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

}
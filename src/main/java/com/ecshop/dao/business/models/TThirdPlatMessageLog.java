package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TThirdPlatMessageLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_third_plat_message_log")
public class TThirdPlatMessageLog implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1557249377L;

	// Fields

	/**
	 * id:��־ID
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;// get id

	/**
	 * appId:Ӧ��ID(ĿǰΪ���ں�APPID)
	 */
	@Column(name = "appId", length = 100)
	private String appId;// get appId

	/**
	 * request:������
	 */
	@Column(name = "request", length = 65535)
	private String request;// get request

	/**
	 * response:��Ӧ����
	 */
	@Column(name = "response", length = 65535)
	private String response;// get response

	/**
	 * action:������
	 */
	@Column(name = "action", length = 30)
	private String action;// get action

	/**
	 * addTime:��־��¼ʱ��
	 */
	@Column(name = "addTime", length = 19)
	private Timestamp addTime;// get addTime

	/**
	 * platType:����ƽ̨����
	 */
	@Column(name = "platType")
	private Integer platType;// get platType

	// Constructors

	/** default constructor */
	public TThirdPlatMessageLog() {
	}

	/** full constructor */
	public TThirdPlatMessageLog(String appId, String request, String response,
			String action, Timestamp addTime, Integer platType) {
		this.appId = appId;
		this.request = request;
		this.response = response;
		this.action = action;
		this.addTime = addTime;
		this.platType = platType;
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
	 * get appId
	 */
	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * get request
	 */
	public String getRequest() {
		return this.request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	/**
	 * get response
	 */
	public String getResponse() {
		return this.response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	/**
	 * get action
	 */
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
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
	 * get platType
	 */
	public Integer getPlatType() {
		return this.platType;
	}

	public void setPlatType(Integer platType) {
		this.platType = platType;
	}

}
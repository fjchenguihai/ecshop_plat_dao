package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAccessToken entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_access_token")
public class TAccessToken implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1416774143L;

	// Fields

	/**
	 * id:ID
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	private Long id;// get id

	/**
	 * appid:���ں�Appid
	 */
	@Column(name = "Appid", length = 100)
	private String appid;// get appid

	/**
	 * token:����token
	 */
	@Column(name = "Token")
	private String token;// get token

	/**
	 * refreshToken:����RefreshToken
	 */
	@Column(name = "RefreshToken")
	private String refreshToken;// get refreshToken

	/**
	 * type:
	 */
	@Column(name = "Type")
	private Integer type;// get type

	/**
	 * time:
	 */
	@Column(name = "Time", length = 19)
	private Timestamp time;// get time

	/**
	 * userName:
	 */
	@Column(name = "UserName", length = 100)
	private String userName;// get userName

	/**
	 * ticket:
	 */
	@Column(name = "Ticket")
	private String ticket;// get ticket

	// Constructors

	/** default constructor */
	public TAccessToken() {
	}

	/** full constructor */
	public TAccessToken(String appid, String token, String refreshToken,
			Integer type, Timestamp time, String userName, String ticket) {
		this.appid = appid;
		this.token = token;
		this.refreshToken = refreshToken;
		this.type = type;
		this.time = time;
		this.userName = userName;
		this.ticket = ticket;
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
	 * get appid
	 */
	public String getAppid() {
		return this.appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	/**
	 * get token
	 */
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * get refreshToken
	 */
	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
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
	 * get time
	 */
	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	/**
	 * get userName
	 */
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * get ticket
	 */
	public String getTicket() {
		return this.ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

}
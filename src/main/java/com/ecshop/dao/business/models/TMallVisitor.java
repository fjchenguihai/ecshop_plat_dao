package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TMallVisitor entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_mall_visitor")
public class TMallVisitor implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1110412602L;

	// Fields

	/**
	 * mallVisitorId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "mallVisitorId", unique = true, nullable = false)
	private Long mallVisitorId;// get mallVisitorId

	/**
	 * mallId:�̼�ID
	 */
	@Column(name = "mallId")
	private Long mallId;// get mallId

	/**
	 * userId:�û�ID
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * firstTime:�״η���ʱ��
	 */
	@Column(name = "firstTime", length = 19)
	private Timestamp firstTime;// get firstTime

	/**
	 * lastTime:������ʱ��
	 */
	@Column(name = "lastTime", length = 19)
	private Timestamp lastTime;// get lastTime

	/**
	 * visitCount:���ʴ���
	 */
	@Column(name = "visitCount")
	private Integer visitCount;// get visitCount

	// Constructors

	/** default constructor */
	public TMallVisitor() {
	}

	/** full constructor */
	public TMallVisitor(Long mallId, Long userId, Timestamp firstTime,
			Timestamp lastTime, Integer visitCount) {
		this.mallId = mallId;
		this.userId = userId;
		this.firstTime = firstTime;
		this.lastTime = lastTime;
		this.visitCount = visitCount;
	}

	// Property accessors
	/**
	 * get mallVisitorId
	 */
	public Long getMallVisitorId() {
		return this.mallVisitorId;
	}

	public void setMallVisitorId(Long mallVisitorId) {
		this.mallVisitorId = mallVisitorId;
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
	 * get userId
	 */
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * get firstTime
	 */
	public Timestamp getFirstTime() {
		return this.firstTime;
	}

	public void setFirstTime(Timestamp firstTime) {
		this.firstTime = firstTime;
	}

	/**
	 * get lastTime
	 */
	public Timestamp getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(Timestamp lastTime) {
		this.lastTime = lastTime;
	}

	/**
	 * get visitCount
	 */
	public Integer getVisitCount() {
		return this.visitCount;
	}

	public void setVisitCount(Integer visitCount) {
		this.visitCount = visitCount;
	}

}
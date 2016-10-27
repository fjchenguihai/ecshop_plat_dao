package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TStringcode entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_stringcode")
public class TStringcode implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -199221006L;

	// Fields

	/**
	 * stringcodeId:
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "stringcodeId", unique = true, nullable = false)
	private Long stringcodeId;// get stringcodeId

	/**
	 * stringcode:
	 */
	@Column(name = "stringcode", length = 100)
	private String stringcode;// get stringcode

	/**
	 * addtime:
	 */
	@Column(name = "addtime", length = 19)
	private Timestamp addtime;// get addtime

	/**
	 * status:0��ʾδʹ�� 1��ʾ���ڰ�V��
	 */
	@Column(name = "status")
	private Integer status;// get status

	/**
	 * orderType:1��ʾ���϶�����2��ʾ���¶�����3��ʾV��Ȩ����
	 */
	@Column(name = "orderType")
	private Integer orderType;// get orderType

	/**
	 * orderId:
	 */
	@Column(name = "orderId")
	private Long orderId;// get orderId

	/**
	 * orderGoodsId:
	 */
	@Column(name = "orderGoodsId")
	private Long orderGoodsId;// get orderGoodsId

	/**
	 * orderNo:
	 */
	@Column(name = "orderNo", length = 200)
	private String orderNo;// get orderNo

	/**
	 * userId:
	 */
	@Column(name = "userId")
	private Long userId;// get userId

	/**
	 * usetime:
	 */
	@Column(name = "usetime", length = 19)
	private Timestamp usetime;// get usetime

	/**
	 * usetype:0��ʾδʹ�ã�1��ʾͨ��������ʹ�ã�2��ʾͨ�������ʹ��
	 */
	@Column(name = "usetype")
	private Integer usetype;// get usetype

	// Constructors

	/** default constructor */
	public TStringcode() {
	}

	/** full constructor */
	public TStringcode(String stringcode, Timestamp addtime, Integer status,
			Integer orderType, Long orderId, Long orderGoodsId, String orderNo,
			Long userId, Timestamp usetime, Integer usetype) {
		this.stringcode = stringcode;
		this.addtime = addtime;
		this.status = status;
		this.orderType = orderType;
		this.orderId = orderId;
		this.orderGoodsId = orderGoodsId;
		this.orderNo = orderNo;
		this.userId = userId;
		this.usetime = usetime;
		this.usetype = usetype;
	}

	// Property accessors
	/**
	 * get stringcodeId
	 */
	public Long getStringcodeId() {
		return this.stringcodeId;
	}

	public void setStringcodeId(Long stringcodeId) {
		this.stringcodeId = stringcodeId;
	}

	/**
	 * get stringcode
	 */
	public String getStringcode() {
		return this.stringcode;
	}

	public void setStringcode(String stringcode) {
		this.stringcode = stringcode;
	}

	/**
	 * get addtime
	 */
	public Timestamp getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
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

	/**
	 * get orderType
	 */
	public Integer getOrderType() {
		return this.orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	/**
	 * get orderId
	 */
	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * get orderGoodsId
	 */
	public Long getOrderGoodsId() {
		return this.orderGoodsId;
	}

	public void setOrderGoodsId(Long orderGoodsId) {
		this.orderGoodsId = orderGoodsId;
	}

	/**
	 * get orderNo
	 */
	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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
	 * get usetime
	 */
	public Timestamp getUsetime() {
		return this.usetime;
	}

	public void setUsetime(Timestamp usetime) {
		this.usetime = usetime;
	}

	/**
	 * get usetype
	 */
	public Integer getUsetype() {
		return this.usetype;
	}

	public void setUsetype(Integer usetype) {
		this.usetype = usetype;
	}

}
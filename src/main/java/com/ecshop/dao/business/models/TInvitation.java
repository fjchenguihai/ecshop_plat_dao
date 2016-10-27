package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TInvitation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_invitation"
)

public class TInvitation  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1726219507L;

    // Fields    

 
  /**   
  * invitationId:������id
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="invitationId", unique=true, nullable=false)

    private Long invitationId;// get invitationId  
 
  /**   
  * invitationCode:������
  */     
    @Column(name="invitationCode", length=32)

    private String invitationCode;// get invitationCode  
 
  /**   
  * mallId:�̼�ID
  */     
    @Column(name="mallId")

    private Long mallId;// get mallId  
 
  /**   
  * usertypeId:
  */     
    @Column(name="usertypeId")

    private Long usertypeId;// get usertypeId  
 
  /**   
  * fromUserId:�û�ID
  */     
    @Column(name="fromUserId")

    private Long fromUserId;// get fromUserId  
 
  /**   
  * toUserId:ʹ����ID
  */     
    @Column(name="toUserId")

    private Long toUserId;// get toUserId  
 
  /**   
  * status:״̬ 0��δʹ�� 1����ʹ��
  */     
    @Column(name="status")

    private Integer status;// get status  
 
  /**   
  * fromTime:���ʱ��
  */     
    @Column(name="fromTime", length=19)

    private Timestamp fromTime;// get fromTime  
 
  /**   
  * toTime:ʹ��ʱ��
  */     
    @Column(name="toTime", length=19)

    private Timestamp toTime;// get toTime  
 
  /**   
  * source:��������Դ 0���û������� 1��ϵͳ����
  */     
    @Column(name="source")

    private Short source = 0;// get source  


    // Constructors

    /** default constructor */
    public TInvitation() {
    }

    
    /** full constructor */
    public TInvitation(String invitationCode, Long mallId, Long usertypeId, Long fromUserId, Long toUserId, Integer status, Timestamp fromTime, Timestamp toTime, Short source) {
        this.invitationCode = invitationCode;
        this.mallId = mallId;
        this.usertypeId = usertypeId;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.status = status;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.source = source;
    }

   
    // Property accessors
	/**
	* get invitationId  
	*/
    public Long getInvitationId() {
        return this.invitationId;
    }
    
    public void setInvitationId(Long invitationId) {
        this.invitationId = invitationId;
    }
	/**
	* get invitationCode  
	*/
    public String getInvitationCode() {
        return this.invitationCode;
    }
    
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
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
	* get usertypeId  
	*/
    public Long getUsertypeId() {
        return this.usertypeId;
    }
    
    public void setUsertypeId(Long usertypeId) {
        this.usertypeId = usertypeId;
    }
	/**
	* get fromUserId  
	*/
    public Long getFromUserId() {
        return this.fromUserId;
    }
    
    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }
	/**
	* get toUserId  
	*/
    public Long getToUserId() {
        return this.toUserId;
    }
    
    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
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
	* get fromTime  
	*/
    public Timestamp getFromTime() {
        return this.fromTime;
    }
    
    public void setFromTime(Timestamp fromTime) {
        this.fromTime = fromTime;
    }
	/**
	* get toTime  
	*/
    public Timestamp getToTime() {
        return this.toTime;
    }
    
    public void setToTime(Timestamp toTime) {
        this.toTime = toTime;
    }
	/**
	* get source  
	*/
    public Short getSource() {
        return this.source;
    }
    
    public void setSource(Short source) {
        this.source = source;
    }
   








}
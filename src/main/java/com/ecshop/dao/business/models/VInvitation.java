package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * VInvitation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="v_invitation"
)

public class VInvitation  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1025154929L;

    // Fields    

 
  /**   
  * invitationId:邀请码id
  */     @Id 
    
    @Column(name="invitationId", nullable=false)

    private Long invitationId;// get invitationId  
 
  /**   
  * invitationCode:邀请码
  */     
    @Column(name="invitationCode", length=32)

    private String invitationCode;// get invitationCode  
 
  /**   
  * mallId:商家ID
  */     
    @Column(name="mallId")

    private Long mallId;// get mallId  
 
  /**   
  * usertypeId:
  */     
    @Column(name="usertypeId")

    private Long usertypeId;// get usertypeId  
 
  /**   
  * fromUserId:用户ID
  */     
    @Column(name="fromUserId")

    private Long fromUserId;// get fromUserId  
 
  /**   
  * toUserId:使用者ID
  */     
    @Column(name="toUserId")

    private Long toUserId;// get toUserId  
 
  /**   
  * status:状态 0：未使用 1：已使用
  */     
    @Column(name="status")

    private Integer status;// get status  
 
  /**   
  * fromTime:生成时间
  */     
    @Column(name="fromTime", length=19)

    private Timestamp fromTime;// get fromTime  
 
  /**   
  * toTime:使用时间
  */     
    @Column(name="toTime", length=19)

    private Timestamp toTime;// get toTime  
 
  /**   
  * mallName:
  */     
    @Column(name="mallName", length=50)

    private String mallName;// get mallName  
 
  /**   
  * mallNo:
  */     
    @Column(name="mallNo", length=20)

    private String mallNo;// get mallNo  
 
  /**   
  * mallLogo:
  */     
    @Column(name="mallLogo", length=2000)

    private String mallLogo;// get mallLogo  
 
  /**   
  * usertypeName:
  */     
    @Column(name="usertypeName", length=50)

    private String usertypeName;// get usertypeName  
 
  /**   
  * fromNickname:微信昵称
  */     
    @Column(name="fromNickname", length=50)

    private String fromNickname;// get fromNickname  
 
  /**   
  * fromRealName:
  */     
    @Column(name="fromRealName", length=50)

    private String fromRealName;// get fromRealName  
 
  /**   
  * fromPic:
  */     
    @Column(name="fromPic")

    private String fromPic;// get fromPic  
 
  /**   
  * toNickname:微信昵称
  */     
    @Column(name="toNickname", length=50)

    private String toNickname;// get toNickname  
 
  /**   
  * toRealName:
  */     
    @Column(name="toRealName", length=50)

    private String toRealName;// get toRealName  
 
  /**   
  * toPic:
  */     
    @Column(name="toPic")

    private String toPic;// get toPic  
 
  /**   
  * statusDesc:
  */     
    @Column(name="statusDesc", length=3)

    private String statusDesc;// get statusDesc  
 
  /**   
  * source:邀请码来源 0：用户消费生成 1：系统导入
  */     
    @Column(name="source")

    private Short source;// get source  


    // Constructors

    /** default constructor */
    public VInvitation() {
    }

	/** minimal constructor */
    public VInvitation(Long invitationId) {
        this.invitationId = invitationId;
    }
    
    /** full constructor */
    public VInvitation(Long invitationId, String invitationCode, Long mallId, Long usertypeId, Long fromUserId, Long toUserId, Integer status, Timestamp fromTime, Timestamp toTime, String mallName, String mallNo, String mallLogo, String usertypeName, String fromNickname, String fromRealName, String fromPic, String toNickname, String toRealName, String toPic, String statusDesc, Short source) {
        this.invitationId = invitationId;
        this.invitationCode = invitationCode;
        this.mallId = mallId;
        this.usertypeId = usertypeId;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.status = status;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.mallName = mallName;
        this.mallNo = mallNo;
        this.mallLogo = mallLogo;
        this.usertypeName = usertypeName;
        this.fromNickname = fromNickname;
        this.fromRealName = fromRealName;
        this.fromPic = fromPic;
        this.toNickname = toNickname;
        this.toRealName = toRealName;
        this.toPic = toPic;
        this.statusDesc = statusDesc;
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
	* get mallName  
	*/
    public String getMallName() {
        return this.mallName;
    }
    
    public void setMallName(String mallName) {
        this.mallName = mallName;
    }
	/**
	* get mallNo  
	*/
    public String getMallNo() {
        return this.mallNo;
    }
    
    public void setMallNo(String mallNo) {
        this.mallNo = mallNo;
    }
	/**
	* get mallLogo  
	*/
    public String getMallLogo() {
        return this.mallLogo;
    }
    
    public void setMallLogo(String mallLogo) {
        this.mallLogo = mallLogo;
    }
	/**
	* get usertypeName  
	*/
    public String getUsertypeName() {
        return this.usertypeName;
    }
    
    public void setUsertypeName(String usertypeName) {
        this.usertypeName = usertypeName;
    }
	/**
	* get fromNickname  
	*/
    public String getFromNickname() {
        return this.fromNickname;
    }
    
    public void setFromNickname(String fromNickname) {
        this.fromNickname = fromNickname;
    }
	/**
	* get fromRealName  
	*/
    public String getFromRealName() {
        return this.fromRealName;
    }
    
    public void setFromRealName(String fromRealName) {
        this.fromRealName = fromRealName;
    }
	/**
	* get fromPic  
	*/
    public String getFromPic() {
        return this.fromPic;
    }
    
    public void setFromPic(String fromPic) {
        this.fromPic = fromPic;
    }
	/**
	* get toNickname  
	*/
    public String getToNickname() {
        return this.toNickname;
    }
    
    public void setToNickname(String toNickname) {
        this.toNickname = toNickname;
    }
	/**
	* get toRealName  
	*/
    public String getToRealName() {
        return this.toRealName;
    }
    
    public void setToRealName(String toRealName) {
        this.toRealName = toRealName;
    }
	/**
	* get toPic  
	*/
    public String getToPic() {
        return this.toPic;
    }
    
    public void setToPic(String toPic) {
        this.toPic = toPic;
    }
	/**
	* get statusDesc  
	*/
    public String getStatusDesc() {
        return this.statusDesc;
    }
    
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
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
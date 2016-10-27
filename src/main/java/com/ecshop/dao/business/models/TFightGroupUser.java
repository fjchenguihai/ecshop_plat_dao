package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TFightGroupUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_fight_group_user"
)

public class TFightGroupUser  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2014917166L;

    // Fields    

 
  /**   
  * fightGroupUserId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="fightGroupUserId", unique=true, nullable=false)

    private Long fightGroupUserId;// get fightGroupUserId  
 
  /**   
  * fightGroupId:
  */     
    @Column(name="fightGroupId")

    private Long fightGroupId;// get fightGroupId  
 
  /**   
  * userId:
  */     
    @Column(name="userId")

    private Long userId;// get userId  
 
  /**   
  * isHead:0：否  1：是
  */     
    @Column(name="isHead")

    private Integer isHead;// get isHead  
 
  /**   
  * joinGroupTime:
  */     
    @Column(name="joinGroupTime", length=19)

    private Timestamp joinGroupTime;// get joinGroupTime  
 
  /**   
  * leaveGroupTime:
  */     
    @Column(name="leaveGroupTime", length=19)

    private Timestamp leaveGroupTime;// get leaveGroupTime  
 
  /**   
  * headPic:
  */     
    @Column(name="headPic")

    private String headPic;// get headPic  
 
  /**   
  * nickname:
  */     
    @Column(name="nickname", length=50)

    private String nickname;// get nickname  
 
  /**   
  * remark:
  */     
    @Column(name="remark")

    private String remark;// get remark  
 
  /**   
  * orderId:
  */     
    @Column(name="orderId")

    private Long orderId;// get orderId  
 
  /**   
  * status:状态(0：参团就绪 1：参团成功)
  */     
    @Column(name="status")

    private Integer status = 0;// get status  


    // Constructors

    /** default constructor */
    public TFightGroupUser() {
    }

    
    /** full constructor */
    public TFightGroupUser(Long fightGroupId, Long userId, Integer isHead, Timestamp joinGroupTime, Timestamp leaveGroupTime, String headPic, String nickname, String remark, Long orderId, Integer status) {
        this.fightGroupId = fightGroupId;
        this.userId = userId;
        this.isHead = isHead;
        this.joinGroupTime = joinGroupTime;
        this.leaveGroupTime = leaveGroupTime;
        this.headPic = headPic;
        this.nickname = nickname;
        this.remark = remark;
        this.orderId = orderId;
        this.status = status;
    }

   
    // Property accessors
	/**
	* get fightGroupUserId  
	*/
    public Long getFightGroupUserId() {
        return this.fightGroupUserId;
    }
    
    public void setFightGroupUserId(Long fightGroupUserId) {
        this.fightGroupUserId = fightGroupUserId;
    }
	/**
	* get fightGroupId  
	*/
    public Long getFightGroupId() {
        return this.fightGroupId;
    }
    
    public void setFightGroupId(Long fightGroupId) {
        this.fightGroupId = fightGroupId;
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
	* get isHead  
	*/
    public Integer getIsHead() {
        return this.isHead;
    }
    
    public void setIsHead(Integer isHead) {
        this.isHead = isHead;
    }
	/**
	* get joinGroupTime  
	*/
    public Timestamp getJoinGroupTime() {
        return this.joinGroupTime;
    }
    
    public void setJoinGroupTime(Timestamp joinGroupTime) {
        this.joinGroupTime = joinGroupTime;
    }
	/**
	* get leaveGroupTime  
	*/
    public Timestamp getLeaveGroupTime() {
        return this.leaveGroupTime;
    }
    
    public void setLeaveGroupTime(Timestamp leaveGroupTime) {
        this.leaveGroupTime = leaveGroupTime;
    }
	/**
	* get headPic  
	*/
    public String getHeadPic() {
        return this.headPic;
    }
    
    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }
	/**
	* get nickname  
	*/
    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
	/**
	* get remark  
	*/
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
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
	* get status  
	*/
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
   








}
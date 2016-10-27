package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TFightGroupReleaseLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_fight_group_release_log"
)

public class TFightGroupReleaseLog  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1791958560L;

    // Fields    

 
  /**   
  * fightGroupReleaseLogId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="fightGroupReleaseLogId", unique=true, nullable=false)

    private Long fightGroupReleaseLogId;// get fightGroupReleaseLogId  
 
  /**   
  * groupGoodId:
  */     
    @Column(name="groupGoodId", nullable=false)

    private Long groupGoodId;// get groupGoodId  
 
  /**   
  * applyUserId:
  */     
    @Column(name="applyUserId")

    private Long applyUserId;// get applyUserId  
 
  /**   
  * auditUserId:
  */     
    @Column(name="auditUserId")

    private Long auditUserId;// get auditUserId  
 
  /**   
  * remark:
  */     
    @Column(name="remark", length=500)

    private String remark;// get remark  
 
  /**   
  * creTime:
  */     
    @Column(name="creTime", nullable=false, length=19)

    private Timestamp creTime;// get creTime  


    // Constructors

    /** default constructor */
    public TFightGroupReleaseLog() {
    }

	/** minimal constructor */
    public TFightGroupReleaseLog(Long groupGoodId, Timestamp creTime) {
        this.groupGoodId = groupGoodId;
        this.creTime = creTime;
    }
    
    /** full constructor */
    public TFightGroupReleaseLog(Long groupGoodId, Long applyUserId, Long auditUserId, String remark, Timestamp creTime) {
        this.groupGoodId = groupGoodId;
        this.applyUserId = applyUserId;
        this.auditUserId = auditUserId;
        this.remark = remark;
        this.creTime = creTime;
    }

   
    // Property accessors
	/**
	* get fightGroupReleaseLogId  
	*/
    public Long getFightGroupReleaseLogId() {
        return this.fightGroupReleaseLogId;
    }
    
    public void setFightGroupReleaseLogId(Long fightGroupReleaseLogId) {
        this.fightGroupReleaseLogId = fightGroupReleaseLogId;
    }
	/**
	* get groupGoodId  
	*/
    public Long getGroupGoodId() {
        return this.groupGoodId;
    }
    
    public void setGroupGoodId(Long groupGoodId) {
        this.groupGoodId = groupGoodId;
    }
	/**
	* get applyUserId  
	*/
    public Long getApplyUserId() {
        return this.applyUserId;
    }
    
    public void setApplyUserId(Long applyUserId) {
        this.applyUserId = applyUserId;
    }
	/**
	* get auditUserId  
	*/
    public Long getAuditUserId() {
        return this.auditUserId;
    }
    
    public void setAuditUserId(Long auditUserId) {
        this.auditUserId = auditUserId;
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
	* get creTime  
	*/
    public Timestamp getCreTime() {
        return this.creTime;
    }
    
    public void setCreTime(Timestamp creTime) {
        this.creTime = creTime;
    }
   








}
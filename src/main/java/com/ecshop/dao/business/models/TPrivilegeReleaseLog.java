package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TPrivilegeReleaseLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_privilege_release_log"
)

public class TPrivilegeReleaseLog  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 261175898L;

    // Fields    

 
  /**   
  * privilegeReleaseLogId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="privilegeReleaseLogId", unique=true, nullable=false)

    private Long privilegeReleaseLogId;// get privilegeReleaseLogId  
 
  /**   
  * privilegeGoodExtId:
  */     
    @Column(name="privilegeGoodExtId", nullable=false)

    private Long privilegeGoodExtId;// get privilegeGoodExtId  
 
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
    public TPrivilegeReleaseLog() {
    }

	/** minimal constructor */
    public TPrivilegeReleaseLog(Long privilegeGoodExtId, Timestamp creTime) {
        this.privilegeGoodExtId = privilegeGoodExtId;
        this.creTime = creTime;
    }
    
    /** full constructor */
    public TPrivilegeReleaseLog(Long privilegeGoodExtId, Long applyUserId, Long auditUserId, String remark, Timestamp creTime) {
        this.privilegeGoodExtId = privilegeGoodExtId;
        this.applyUserId = applyUserId;
        this.auditUserId = auditUserId;
        this.remark = remark;
        this.creTime = creTime;
    }

   
    // Property accessors
	/**
	* get privilegeReleaseLogId  
	*/
    public Long getPrivilegeReleaseLogId() {
        return this.privilegeReleaseLogId;
    }
    
    public void setPrivilegeReleaseLogId(Long privilegeReleaseLogId) {
        this.privilegeReleaseLogId = privilegeReleaseLogId;
    }
	/**
	* get privilegeGoodExtId  
	*/
    public Long getPrivilegeGoodExtId() {
        return this.privilegeGoodExtId;
    }
    
    public void setPrivilegeGoodExtId(Long privilegeGoodExtId) {
        this.privilegeGoodExtId = privilegeGoodExtId;
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
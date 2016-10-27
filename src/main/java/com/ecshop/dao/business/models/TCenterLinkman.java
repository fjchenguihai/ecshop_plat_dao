package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TCenterLinkman entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_center_linkman"
)

public class TCenterLinkman  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1824507159L;

    // Fields    

 
  /**   
  * centerLinkmanId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="centerLinkmanId", unique=true, nullable=false)

    private Long centerLinkmanId;// get centerLinkmanId  
 
  /**   
  * centerId:
  */     
    @Column(name="centerId")

    private Long centerId;// get centerId  
 
  /**   
  * userName:
  */     
    @Column(name="userName", length=30)

    private String userName;// get userName  
 
  /**   
  * mobile:
  */     
    @Column(name="mobile", length=20)

    private String mobile;// get mobile  
 
  /**   
  * email:
  */     
    @Column(name="email", length=50)

    private String email;// get email  


    // Constructors

    /** default constructor */
    public TCenterLinkman() {
    }

    
    /** full constructor */
    public TCenterLinkman(Long centerId, String userName, String mobile, String email) {
        this.centerId = centerId;
        this.userName = userName;
        this.mobile = mobile;
        this.email = email;
    }

   
    // Property accessors
	/**
	* get centerLinkmanId  
	*/
    public Long getCenterLinkmanId() {
        return this.centerLinkmanId;
    }
    
    public void setCenterLinkmanId(Long centerLinkmanId) {
        this.centerLinkmanId = centerLinkmanId;
    }
	/**
	* get centerId  
	*/
    public Long getCenterId() {
        return this.centerId;
    }
    
    public void setCenterId(Long centerId) {
        this.centerId = centerId;
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
	* get mobile  
	*/
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
	/**
	* get email  
	*/
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
   








}
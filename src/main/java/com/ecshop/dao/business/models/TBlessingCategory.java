package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TBlessingCategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_blessing_category"
)

public class TBlessingCategory  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -170633319L;

    // Fields    

 
  /**   
  * categoryId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="categoryId", unique=true, nullable=false)

    private Long categoryId;// get categoryId  
 
  /**   
  * categoryName:
  */     
    @Column(name="categoryName", length=20)

    private String categoryName;// get categoryName  
 
  /**   
  * categoryLogo:
  */     
    @Column(name="categoryLogo", length=200)

    private String categoryLogo;// get categoryLogo  
 
  /**   
  * createTime:
  */     
    @Column(name="createTime", length=19)

    private Timestamp createTime;// get createTime  
 
  /**   
  * remark:
  */     
    @Column(name="remark", length=1000)

    private String remark;// get remark  


    // Constructors

    /** default constructor */
    public TBlessingCategory() {
    }

    
    /** full constructor */
    public TBlessingCategory(String categoryName, String categoryLogo, Timestamp createTime, String remark) {
        this.categoryName = categoryName;
        this.categoryLogo = categoryLogo;
        this.createTime = createTime;
        this.remark = remark;
    }

   
    // Property accessors
	/**
	* get categoryId  
	*/
    public Long getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
	/**
	* get categoryName  
	*/
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
	/**
	* get categoryLogo  
	*/
    public String getCategoryLogo() {
        return this.categoryLogo;
    }
    
    public void setCategoryLogo(String categoryLogo) {
        this.categoryLogo = categoryLogo;
    }
	/**
	* get createTime  
	*/
    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
   








}
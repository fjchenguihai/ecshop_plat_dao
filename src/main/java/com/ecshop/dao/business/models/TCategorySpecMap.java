package com.ecshop.dao.business.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TCategorySpecMap entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_category_spec_map"
)

public class TCategorySpecMap  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 420298191L;

    // Fields    

 
  /**   
  * categorySpecMapId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="categorySpecMapId", unique=true, nullable=false)

    private Long categorySpecMapId;// get categorySpecMapId  
 
  /**   
  * categoryId:����ID
  */     
    @Column(name="categoryId", nullable=false)

    private Long categoryId;// get categoryId  
 
  /**   
  * specId:���ID
  */     
    @Column(name="specId")

    private Long specId;// get specId  


    // Constructors

    /** default constructor */
    public TCategorySpecMap() {
    }

	/** minimal constructor */
    public TCategorySpecMap(Long categoryId) {
        this.categoryId = categoryId;
    }
    
    /** full constructor */
    public TCategorySpecMap(Long categoryId, Long specId) {
        this.categoryId = categoryId;
        this.specId = specId;
    }

   
    // Property accessors
	/**
	* get categorySpecMapId  
	*/
    public Long getCategorySpecMapId() {
        return this.categorySpecMapId;
    }
    
    public void setCategorySpecMapId(Long categorySpecMapId) {
        this.categorySpecMapId = categorySpecMapId;
    }
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
	* get specId  
	*/
    public Long getSpecId() {
        return this.specId;
    }
    
    public void setSpecId(Long specId) {
        this.specId = specId;
    }
   








}
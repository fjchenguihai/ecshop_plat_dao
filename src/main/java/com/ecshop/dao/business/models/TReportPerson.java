package com.ecshop.dao.business.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * TReportPerson entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_report_person"
)

public class TReportPerson  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1791925277L;

    // Fields    

 
  /**   
  * id:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID", unique=true, nullable=false)

    private Long id;// get id  
 
  /**   
  * attentionIncrement:
  */     
    @Column(name="attentionIncrement")

    private Integer attentionIncrement;// get attentionIncrement  
 
  /**   
  * userIncrement:
  */     
    @Column(name="userIncrement")

    private Integer userIncrement;// get userIncrement  
 
  /**   
  * vincrement:
  */     
    @Column(name="vIncrement")

    private Integer vincrement;// get vincrement  
 
  /**   
  * dincrement:
  */     
    @Column(name="dIncrement")

    private Integer dincrement;// get dincrement  
 
  /**   
  * statisticDate:
  */     @Temporal(TemporalType.DATE)
    @Column(name="statisticDate", length=10)

    private Date statisticDate;// get statisticDate  


    // Constructors

    /** default constructor */
    public TReportPerson() {
    }

    
    /** full constructor */
    public TReportPerson(Integer attentionIncrement, Integer userIncrement, Integer vincrement, Integer dincrement, Date statisticDate) {
        this.attentionIncrement = attentionIncrement;
        this.userIncrement = userIncrement;
        this.vincrement = vincrement;
        this.dincrement = dincrement;
        this.statisticDate = statisticDate;
    }

   
    // Property accessors
	/**
	* get id  
	*/
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
	/**
	* get attentionIncrement  
	*/
    public Integer getAttentionIncrement() {
        return this.attentionIncrement;
    }
    
    public void setAttentionIncrement(Integer attentionIncrement) {
        this.attentionIncrement = attentionIncrement;
    }
	/**
	* get userIncrement  
	*/
    public Integer getUserIncrement() {
        return this.userIncrement;
    }
    
    public void setUserIncrement(Integer userIncrement) {
        this.userIncrement = userIncrement;
    }
	/**
	* get vincrement  
	*/
    public Integer getVincrement() {
        return this.vincrement;
    }
    
    public void setVincrement(Integer vincrement) {
        this.vincrement = vincrement;
    }
	/**
	* get dincrement  
	*/
    public Integer getDincrement() {
        return this.dincrement;
    }
    
    public void setDincrement(Integer dincrement) {
        this.dincrement = dincrement;
    }
	/**
	* get statisticDate  
	*/
    public Date getStatisticDate() {
        return this.statisticDate;
    }
    
    public void setStatisticDate(Date statisticDate) {
        this.statisticDate = statisticDate;
    }
   








}
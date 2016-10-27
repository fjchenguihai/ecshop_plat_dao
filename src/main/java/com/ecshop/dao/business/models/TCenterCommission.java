package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TCenterCommission entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_center_commission"
)

public class TCenterCommission  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 530029460L;

    // Fields    

 
  /**   
  * centerCommissionId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="centerCommissionId", unique=true, nullable=false)

    private Long centerCommissionId;// get centerCommissionId  
 
  /**   
  * centerId:
  */     
    @Column(name="centerId")

    private Long centerId;// get centerId  
 
  /**   
  * commissionYear:
  */     
    @Column(name="commissionYear")

    private Integer commissionYear;// get commissionYear  
 
  /**   
  * commissionMonth:
  */     
    @Column(name="commissionMonth")

    private Integer commissionMonth;// get commissionMonth  
 
  /**   
  * commissiontime:
  */     
    @Column(name="commissiontime", length=19)

    private Timestamp commissiontime;// get commissiontime  
 
  /**   
  * totalMoney:
  */     
    @Column(name="totalMoney", precision=15)

    private Double totalMoney;// get totalMoney  
 
  /**   
  * isPayCommission:
  */     
    @Column(name="isPayCommission")

    private Integer isPayCommission;// get isPayCommission  
 
  /**   
  * payCommissionTime:
  */     
    @Column(name="payCommissionTime", length=19)

    private Timestamp payCommissionTime;// get payCommissionTime  


    // Constructors

    /** default constructor */
    public TCenterCommission() {
    }

    
    /** full constructor */
    public TCenterCommission(Long centerId, Integer commissionYear, Integer commissionMonth, Timestamp commissiontime, Double totalMoney, Integer isPayCommission, Timestamp payCommissionTime) {
        this.centerId = centerId;
        this.commissionYear = commissionYear;
        this.commissionMonth = commissionMonth;
        this.commissiontime = commissiontime;
        this.totalMoney = totalMoney;
        this.isPayCommission = isPayCommission;
        this.payCommissionTime = payCommissionTime;
    }

   
    // Property accessors
	/**
	* get centerCommissionId  
	*/
    public Long getCenterCommissionId() {
        return this.centerCommissionId;
    }
    
    public void setCenterCommissionId(Long centerCommissionId) {
        this.centerCommissionId = centerCommissionId;
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
	* get commissionYear  
	*/
    public Integer getCommissionYear() {
        return this.commissionYear;
    }
    
    public void setCommissionYear(Integer commissionYear) {
        this.commissionYear = commissionYear;
    }
	/**
	* get commissionMonth  
	*/
    public Integer getCommissionMonth() {
        return this.commissionMonth;
    }
    
    public void setCommissionMonth(Integer commissionMonth) {
        this.commissionMonth = commissionMonth;
    }
	/**
	* get commissiontime  
	*/
    public Timestamp getCommissiontime() {
        return this.commissiontime;
    }
    
    public void setCommissiontime(Timestamp commissiontime) {
        this.commissiontime = commissiontime;
    }
	/**
	* get totalMoney  
	*/
    public Double getTotalMoney() {
        return this.totalMoney;
    }
    
    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }
	/**
	* get isPayCommission  
	*/
    public Integer getIsPayCommission() {
        return this.isPayCommission;
    }
    
    public void setIsPayCommission(Integer isPayCommission) {
        this.isPayCommission = isPayCommission;
    }
	/**
	* get payCommissionTime  
	*/
    public Timestamp getPayCommissionTime() {
        return this.payCommissionTime;
    }
    
    public void setPayCommissionTime(Timestamp payCommissionTime) {
        this.payCommissionTime = payCommissionTime;
    }
   








}
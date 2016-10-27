package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TCommission entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_commission"
)

public class TCommission  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1903296417L;

    // Fields    

 
  /**   
  * commissionId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="commissionId", unique=true, nullable=false)

    private Long commissionId;// get commissionId  
 
  /**   
  * userId:
  */     
    @Column(name="userId")

    private Long userId;// get userId  
 
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
  * vmoney:V客身份提成总额
  */     
    @Column(name="vMoney", precision=15)

    private Double vmoney;// get vmoney  
 
  /**   
  * mmoney:盟客身份提成总额
  */     
    @Column(name="mMoney", precision=15)

    private Double mmoney;// get mmoney  
 
  /**   
  * distributorMoney:经销商身份提成总额
  */     
    @Column(name="distributorMoney", precision=15)

    private Double distributorMoney;// get distributorMoney  
 
  /**   
  * directMoney:直接经销商提成总额
  */     
    @Column(name="directMoney", precision=15)

    private Double directMoney;// get directMoney  
 
  /**   
  * indirectMoney:间接经销商提成总额
  */     
    @Column(name="indirectMoney", precision=15)

    private Double indirectMoney;// get indirectMoney  
 
  /**   
  * taxation:
  */     
    @Column(name="taxation", precision=15)

    private Double taxation;// get taxation  
 
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
 
  /**   
  * offlineMoney:
  */     
    @Column(name="offlineMoney", precision=15)

    private Double offlineMoney;// get offlineMoney  


    // Constructors

    /** default constructor */
    public TCommission() {
    }

    
    /** full constructor */
    public TCommission(Long userId, Integer commissionYear, Integer commissionMonth, Timestamp commissiontime, Double totalMoney, Double vmoney, Double mmoney, Double distributorMoney, Double directMoney, Double indirectMoney, Double taxation, Integer isPayCommission, Timestamp payCommissionTime, Double offlineMoney) {
        this.userId = userId;
        this.commissionYear = commissionYear;
        this.commissionMonth = commissionMonth;
        this.commissiontime = commissiontime;
        this.totalMoney = totalMoney;
        this.vmoney = vmoney;
        this.mmoney = mmoney;
        this.distributorMoney = distributorMoney;
        this.directMoney = directMoney;
        this.indirectMoney = indirectMoney;
        this.taxation = taxation;
        this.isPayCommission = isPayCommission;
        this.payCommissionTime = payCommissionTime;
        this.offlineMoney = offlineMoney;
    }

   
    // Property accessors
	/**
	* get commissionId  
	*/
    public Long getCommissionId() {
        return this.commissionId;
    }
    
    public void setCommissionId(Long commissionId) {
        this.commissionId = commissionId;
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
	* get vmoney  
	*/
    public Double getVmoney() {
        return this.vmoney;
    }
    
    public void setVmoney(Double vmoney) {
        this.vmoney = vmoney;
    }
	/**
	* get mmoney  
	*/
    public Double getMmoney() {
        return this.mmoney;
    }
    
    public void setMmoney(Double mmoney) {
        this.mmoney = mmoney;
    }
	/**
	* get distributorMoney  
	*/
    public Double getDistributorMoney() {
        return this.distributorMoney;
    }
    
    public void setDistributorMoney(Double distributorMoney) {
        this.distributorMoney = distributorMoney;
    }
	/**
	* get directMoney  
	*/
    public Double getDirectMoney() {
        return this.directMoney;
    }
    
    public void setDirectMoney(Double directMoney) {
        this.directMoney = directMoney;
    }
	/**
	* get indirectMoney  
	*/
    public Double getIndirectMoney() {
        return this.indirectMoney;
    }
    
    public void setIndirectMoney(Double indirectMoney) {
        this.indirectMoney = indirectMoney;
    }
	/**
	* get taxation  
	*/
    public Double getTaxation() {
        return this.taxation;
    }
    
    public void setTaxation(Double taxation) {
        this.taxation = taxation;
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
	/**
	* get offlineMoney  
	*/
    public Double getOfflineMoney() {
        return this.offlineMoney;
    }
    
    public void setOfflineMoney(Double offlineMoney) {
        this.offlineMoney = offlineMoney;
    }
   








}
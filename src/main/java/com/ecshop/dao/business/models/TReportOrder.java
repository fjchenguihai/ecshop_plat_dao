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
 * TReportOrder entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_report_order"
)

public class TReportOrder  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -635482746L;

    // Fields    

 
  /**   
  * id:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID", unique=true, nullable=false)

    private Long id;// get id  
 
  /**   
  * totalOrderCnt:
  */     
    @Column(name="totalOrderCnt")

    private Integer totalOrderCnt;// get totalOrderCnt  
 
  /**   
  * payOrderCnt:
  */     
    @Column(name="payOrderCnt")

    private Integer payOrderCnt;// get payOrderCnt  
 
  /**   
  * we8quantity:
  */     
    @Column(name="We8Quantity")

    private Integer we8quantity;// get we8quantity  
 
  /**   
  * wepicoQuantity:
  */     
    @Column(name="WepicoQuantity")

    private Integer wepicoQuantity;// get wepicoQuantity  
 
  /**   
  * i12quantity:
  */     
    @Column(name="I12Quantity")

    private Integer i12quantity;// get i12quantity  
 
  /**   
  * we1quantity:
  */     
    @Column(name="We1Quantity")

    private Integer we1quantity;// get we1quantity  
 
  /**   
  * i18quantity:
  */     
    @Column(name="I18Quantity")

    private Integer i18quantity;// get i18quantity  
 
  /**   
  * i6sQuantity:
  */     
    @Column(name="I6sQuantity")

    private Integer i6sQuantity;// get i6sQuantity  
 
  /**   
  * subTotalOrderCnt:
  */     
    @Column(name="subTotalOrderCnt")

    private Integer subTotalOrderCnt;// get subTotalOrderCnt  
 
  /**   
  * subPayOrderCnt:
  */     
    @Column(name="subPayOrderCnt")

    private Integer subPayOrderCnt;// get subPayOrderCnt  
 
  /**   
  * subTotalQuantity:
  */     
    @Column(name="subTotalQuantity")

    private Integer subTotalQuantity;// get subTotalQuantity  
 
  /**   
  * subTotalAmount:
  */     
    @Column(name="subTotalAmount", precision=12)

    private Float subTotalAmount;// get subTotalAmount  
 
  /**   
  * statisticDate:
  */     @Temporal(TemporalType.DATE)
    @Column(name="statisticDate", length=10)

    private Date statisticDate;// get statisticDate  


    // Constructors

    /** default constructor */
    public TReportOrder() {
    }

    
    /** full constructor */
    public TReportOrder(Integer totalOrderCnt, Integer payOrderCnt, Integer we8quantity, Integer wepicoQuantity, Integer i12quantity, Integer we1quantity, Integer i18quantity, Integer i6sQuantity, Integer subTotalOrderCnt, Integer subPayOrderCnt, Integer subTotalQuantity, Float subTotalAmount, Date statisticDate) {
        this.totalOrderCnt = totalOrderCnt;
        this.payOrderCnt = payOrderCnt;
        this.we8quantity = we8quantity;
        this.wepicoQuantity = wepicoQuantity;
        this.i12quantity = i12quantity;
        this.we1quantity = we1quantity;
        this.i18quantity = i18quantity;
        this.i6sQuantity = i6sQuantity;
        this.subTotalOrderCnt = subTotalOrderCnt;
        this.subPayOrderCnt = subPayOrderCnt;
        this.subTotalQuantity = subTotalQuantity;
        this.subTotalAmount = subTotalAmount;
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
	* get totalOrderCnt  
	*/
    public Integer getTotalOrderCnt() {
        return this.totalOrderCnt;
    }
    
    public void setTotalOrderCnt(Integer totalOrderCnt) {
        this.totalOrderCnt = totalOrderCnt;
    }
	/**
	* get payOrderCnt  
	*/
    public Integer getPayOrderCnt() {
        return this.payOrderCnt;
    }
    
    public void setPayOrderCnt(Integer payOrderCnt) {
        this.payOrderCnt = payOrderCnt;
    }
	/**
	* get we8quantity  
	*/
    public Integer getWe8quantity() {
        return this.we8quantity;
    }
    
    public void setWe8quantity(Integer we8quantity) {
        this.we8quantity = we8quantity;
    }
	/**
	* get wepicoQuantity  
	*/
    public Integer getWepicoQuantity() {
        return this.wepicoQuantity;
    }
    
    public void setWepicoQuantity(Integer wepicoQuantity) {
        this.wepicoQuantity = wepicoQuantity;
    }
	/**
	* get i12quantity  
	*/
    public Integer getI12quantity() {
        return this.i12quantity;
    }
    
    public void setI12quantity(Integer i12quantity) {
        this.i12quantity = i12quantity;
    }
	/**
	* get we1quantity  
	*/
    public Integer getWe1quantity() {
        return this.we1quantity;
    }
    
    public void setWe1quantity(Integer we1quantity) {
        this.we1quantity = we1quantity;
    }
	/**
	* get i18quantity  
	*/
    public Integer getI18quantity() {
        return this.i18quantity;
    }
    
    public void setI18quantity(Integer i18quantity) {
        this.i18quantity = i18quantity;
    }
	/**
	* get i6sQuantity  
	*/
    public Integer getI6sQuantity() {
        return this.i6sQuantity;
    }
    
    public void setI6sQuantity(Integer i6sQuantity) {
        this.i6sQuantity = i6sQuantity;
    }
	/**
	* get subTotalOrderCnt  
	*/
    public Integer getSubTotalOrderCnt() {
        return this.subTotalOrderCnt;
    }
    
    public void setSubTotalOrderCnt(Integer subTotalOrderCnt) {
        this.subTotalOrderCnt = subTotalOrderCnt;
    }
	/**
	* get subPayOrderCnt  
	*/
    public Integer getSubPayOrderCnt() {
        return this.subPayOrderCnt;
    }
    
    public void setSubPayOrderCnt(Integer subPayOrderCnt) {
        this.subPayOrderCnt = subPayOrderCnt;
    }
	/**
	* get subTotalQuantity  
	*/
    public Integer getSubTotalQuantity() {
        return this.subTotalQuantity;
    }
    
    public void setSubTotalQuantity(Integer subTotalQuantity) {
        this.subTotalQuantity = subTotalQuantity;
    }
	/**
	* get subTotalAmount  
	*/
    public Float getSubTotalAmount() {
        return this.subTotalAmount;
    }
    
    public void setSubTotalAmount(Float subTotalAmount) {
        this.subTotalAmount = subTotalAmount;
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
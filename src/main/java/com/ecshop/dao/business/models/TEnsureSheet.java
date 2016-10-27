package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TEnsureSheet entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_ensure_sheet"
)

public class TEnsureSheet  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -205081907L;

    // Fields    

 
  /**   
  * sheetId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="sheetId", unique=true, nullable=false)

    private Long sheetId;// get sheetId  
 
  /**   
  * sheetNo:必填
  */     
    @Column(name="sheetNo", nullable=false, length=12)

    private String sheetNo;// get sheetNo  
 
  /**   
  * stringCode:必填
  */     
    @Column(name="stringCode", nullable=false, length=50)

    private String stringCode;// get stringCode  
 
  /**   
  * saleTime:必填
  */     
    @Column(name="saleTime", nullable=false, length=19)

    private Timestamp saleTime;// get saleTime  
 
  /**   
  * sheetPic:必填
  */     
    @Column(name="sheetPic", nullable=false, length=128)

    private String sheetPic;// get sheetPic  
 
  /**   
  * userId:必填
  */     
    @Column(name="userId", nullable=false)

    private Long userId;// get userId  
 
  /**   
  * creTime:
  */     
    @Column(name="creTime", nullable=false, length=19)

    private Timestamp creTime;// get creTime  
 
  /**   
  * goodsName:
  */     
    @Column(name="goodsName", nullable=false, length=100)

    private String goodsName;// get goodsName  


    // Constructors

    /** default constructor */
    public TEnsureSheet() {
    }

    
    /** full constructor */
    public TEnsureSheet(String sheetNo, String stringCode, Timestamp saleTime, String sheetPic, Long userId, Timestamp creTime, String goodsName) {
        this.sheetNo = sheetNo;
        this.stringCode = stringCode;
        this.saleTime = saleTime;
        this.sheetPic = sheetPic;
        this.userId = userId;
        this.creTime = creTime;
        this.goodsName = goodsName;
    }

   
    // Property accessors
	/**
	* get sheetId  
	*/
    public Long getSheetId() {
        return this.sheetId;
    }
    
    public void setSheetId(Long sheetId) {
        this.sheetId = sheetId;
    }
	/**
	* get sheetNo  
	*/
    public String getSheetNo() {
        return this.sheetNo;
    }
    
    public void setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo;
    }
	/**
	* get stringCode  
	*/
    public String getStringCode() {
        return this.stringCode;
    }
    
    public void setStringCode(String stringCode) {
        this.stringCode = stringCode;
    }
	/**
	* get saleTime  
	*/
    public Timestamp getSaleTime() {
        return this.saleTime;
    }
    
    public void setSaleTime(Timestamp saleTime) {
        this.saleTime = saleTime;
    }
	/**
	* get sheetPic  
	*/
    public String getSheetPic() {
        return this.sheetPic;
    }
    
    public void setSheetPic(String sheetPic) {
        this.sheetPic = sheetPic;
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
	* get creTime  
	*/
    public Timestamp getCreTime() {
        return this.creTime;
    }
    
    public void setCreTime(Timestamp creTime) {
        this.creTime = creTime;
    }
	/**
	* get goodsName  
	*/
    public String getGoodsName() {
        return this.goodsName;
    }
    
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
   








}
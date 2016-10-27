package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TOrderGoodsOffline entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_order_goods_offline"
)

public class TOrderGoodsOffline  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2095122983L;

    // Fields    

 
  /**   
  * offlineOrderGoodsId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="offlineOrderGoodsId", unique=true, nullable=false)

    private Long offlineOrderGoodsId;// get offlineOrderGoodsId  
 
  /**   
  * goodsId:
  */     
    @Column(name="goodsId", nullable=false)

    private Long goodsId;// get goodsId  
 
  /**   
  * goodsItemsId:
  */     
    @Column(name="goodsItemsId", nullable=false)

    private Long goodsItemsId;// get goodsItemsId  
 
  /**   
  * spec:规格（json）
  */     
    @Column(name="spec", length=200)

    private String spec;// get spec  
 
  /**   
  * offlineOrderId:
  */     
    @Column(name="offlineOrderId", nullable=false)

    private Long offlineOrderId;// get offlineOrderId  
 
  /**   
  * goodsName:
  */     
    @Column(name="goodsName", nullable=false, length=100)

    private String goodsName;// get goodsName  
 
  /**   
  * goodsNum:
  */     
    @Column(name="goodsNum", nullable=false)

    private Integer goodsNum;// get goodsNum  
 
  /**   
  * goodsPrice:
  */     
    @Column(name="goodsPrice", nullable=false, precision=15)

    private Double goodsPrice;// get goodsPrice  
 
  /**   
  * goodsNetPrice:
  */     
    @Column(name="goodsNetPrice", precision=15)

    private Double goodsNetPrice;// get goodsNetPrice  
 
  /**   
  * goodsPic:
  */     
    @Column(name="goodsPic")

    private String goodsPic;// get goodsPic  
 
  /**   
  * bcommission:
  */     
    @Column(name="bCommission", nullable=false, precision=15, scale=4)

    private Double bcommission;// get bcommission  
 
  /**   
  * mcommission:
  */     
    @Column(name="mCommission", nullable=false, precision=15, scale=4)

    private Double mcommission;// get mcommission  
 
  /**   
  * dcommission:
  */     
    @Column(name="dCommission", nullable=false, precision=15, scale=4)

    private Double dcommission;// get dcommission  
 
  /**   
  * directCommission:
  */     
    @Column(name="directCommission", nullable=false, precision=15, scale=4)

    private Double directCommission;// get directCommission  
 
  /**   
  * indirectCommission:
  */     
    @Column(name="IndirectCommission", nullable=false, precision=15, scale=4)

    private Double indirectCommission;// get indirectCommission  
 
  /**   
  * serviceCommission:
  */     
    @Column(name="serviceCommission", nullable=false, precision=15, scale=4)

    private Double serviceCommission;// get serviceCommission  
 
  /**   
  * operationCommission:
  */     
    @Column(name="operationCommission", nullable=false, precision=15, scale=4)

    private Double operationCommission;// get operationCommission  
 
  /**   
  * platformCommission:
  */     
    @Column(name="platformCommission", nullable=false, precision=15, scale=4)

    private Double platformCommission;// get platformCommission  
 
  /**   
  * regionRate:
  */     
    @Column(name="regionRate", nullable=false, precision=15, scale=4)

    private Double regionRate;// get regionRate  
 
  /**   
  * creTime:
  */     
    @Column(name="creTime", nullable=false, length=19)

    private Timestamp creTime;// get creTime  


    // Constructors

    /** default constructor */
    public TOrderGoodsOffline() {
    }

	/** minimal constructor */
    public TOrderGoodsOffline(Long goodsId, Long goodsItemsId, Long offlineOrderId, String goodsName, Integer goodsNum, Double goodsPrice, Double bcommission, Double mcommission, Double dcommission, Double directCommission, Double indirectCommission, Double serviceCommission, Double operationCommission, Double platformCommission, Double regionRate, Timestamp creTime) {
        this.goodsId = goodsId;
        this.goodsItemsId = goodsItemsId;
        this.offlineOrderId = offlineOrderId;
        this.goodsName = goodsName;
        this.goodsNum = goodsNum;
        this.goodsPrice = goodsPrice;
        this.bcommission = bcommission;
        this.mcommission = mcommission;
        this.dcommission = dcommission;
        this.directCommission = directCommission;
        this.indirectCommission = indirectCommission;
        this.serviceCommission = serviceCommission;
        this.operationCommission = operationCommission;
        this.platformCommission = platformCommission;
        this.regionRate = regionRate;
        this.creTime = creTime;
    }
    
    /** full constructor */
    public TOrderGoodsOffline(Long goodsId, Long goodsItemsId, String spec, Long offlineOrderId, String goodsName, Integer goodsNum, Double goodsPrice, Double goodsNetPrice, String goodsPic, Double bcommission, Double mcommission, Double dcommission, Double directCommission, Double indirectCommission, Double serviceCommission, Double operationCommission, Double platformCommission, Double regionRate, Timestamp creTime) {
        this.goodsId = goodsId;
        this.goodsItemsId = goodsItemsId;
        this.spec = spec;
        this.offlineOrderId = offlineOrderId;
        this.goodsName = goodsName;
        this.goodsNum = goodsNum;
        this.goodsPrice = goodsPrice;
        this.goodsNetPrice = goodsNetPrice;
        this.goodsPic = goodsPic;
        this.bcommission = bcommission;
        this.mcommission = mcommission;
        this.dcommission = dcommission;
        this.directCommission = directCommission;
        this.indirectCommission = indirectCommission;
        this.serviceCommission = serviceCommission;
        this.operationCommission = operationCommission;
        this.platformCommission = platformCommission;
        this.regionRate = regionRate;
        this.creTime = creTime;
    }

   
    // Property accessors
	/**
	* get offlineOrderGoodsId  
	*/
    public Long getOfflineOrderGoodsId() {
        return this.offlineOrderGoodsId;
    }
    
    public void setOfflineOrderGoodsId(Long offlineOrderGoodsId) {
        this.offlineOrderGoodsId = offlineOrderGoodsId;
    }
	/**
	* get goodsId  
	*/
    public Long getGoodsId() {
        return this.goodsId;
    }
    
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
	/**
	* get goodsItemsId  
	*/
    public Long getGoodsItemsId() {
        return this.goodsItemsId;
    }
    
    public void setGoodsItemsId(Long goodsItemsId) {
        this.goodsItemsId = goodsItemsId;
    }
	/**
	* get spec  
	*/
    public String getSpec() {
        return this.spec;
    }
    
    public void setSpec(String spec) {
        this.spec = spec;
    }
	/**
	* get offlineOrderId  
	*/
    public Long getOfflineOrderId() {
        return this.offlineOrderId;
    }
    
    public void setOfflineOrderId(Long offlineOrderId) {
        this.offlineOrderId = offlineOrderId;
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
	/**
	* get goodsNum  
	*/
    public Integer getGoodsNum() {
        return this.goodsNum;
    }
    
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
	/**
	* get goodsPrice  
	*/
    public Double getGoodsPrice() {
        return this.goodsPrice;
    }
    
    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
	/**
	* get goodsNetPrice  
	*/
    public Double getGoodsNetPrice() {
        return this.goodsNetPrice;
    }
    
    public void setGoodsNetPrice(Double goodsNetPrice) {
        this.goodsNetPrice = goodsNetPrice;
    }
	/**
	* get goodsPic  
	*/
    public String getGoodsPic() {
        return this.goodsPic;
    }
    
    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic;
    }
	/**
	* get bcommission  
	*/
    public Double getBcommission() {
        return this.bcommission;
    }
    
    public void setBcommission(Double bcommission) {
        this.bcommission = bcommission;
    }
	/**
	* get mcommission  
	*/
    public Double getMcommission() {
        return this.mcommission;
    }
    
    public void setMcommission(Double mcommission) {
        this.mcommission = mcommission;
    }
	/**
	* get dcommission  
	*/
    public Double getDcommission() {
        return this.dcommission;
    }
    
    public void setDcommission(Double dcommission) {
        this.dcommission = dcommission;
    }
	/**
	* get directCommission  
	*/
    public Double getDirectCommission() {
        return this.directCommission;
    }
    
    public void setDirectCommission(Double directCommission) {
        this.directCommission = directCommission;
    }
	/**
	* get indirectCommission  
	*/
    public Double getIndirectCommission() {
        return this.indirectCommission;
    }
    
    public void setIndirectCommission(Double indirectCommission) {
        this.indirectCommission = indirectCommission;
    }
	/**
	* get serviceCommission  
	*/
    public Double getServiceCommission() {
        return this.serviceCommission;
    }
    
    public void setServiceCommission(Double serviceCommission) {
        this.serviceCommission = serviceCommission;
    }
	/**
	* get operationCommission  
	*/
    public Double getOperationCommission() {
        return this.operationCommission;
    }
    
    public void setOperationCommission(Double operationCommission) {
        this.operationCommission = operationCommission;
    }
	/**
	* get platformCommission  
	*/
    public Double getPlatformCommission() {
        return this.platformCommission;
    }
    
    public void setPlatformCommission(Double platformCommission) {
        this.platformCommission = platformCommission;
    }
	/**
	* get regionRate  
	*/
    public Double getRegionRate() {
        return this.regionRate;
    }
    
    public void setRegionRate(Double regionRate) {
        this.regionRate = regionRate;
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
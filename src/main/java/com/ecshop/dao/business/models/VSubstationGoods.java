package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * VSubstationGoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="v_substation_goods"
)

public class VSubstationGoods  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1743709580L;

    // Fields    

 
  /**   
  * goodsId:
  */     @Id 
    
    @Column(name="goodsId", nullable=false)

    private Long goodsId;// get goodsId  
 
  /**   
  * mallId:
  */     
    @Column(name="mallId")

    private Long mallId;// get mallId  
 
  /**   
  * categoryId:
  */     
    @Column(name="categoryId")

    private Long categoryId;// get categoryId  
 
  /**   
  * mallGoodsName:
  */     
    @Column(name="mallGoodsName", length=100)

    private String mallGoodsName;// get mallGoodsName  
 
  /**   
  * propertyJson:属性json
  */     
    @Column(name="propertyJson", length=200)

    private String propertyJson;// get propertyJson  
 
  /**   
  * specJson:规格json
  */     
    @Column(name="specJson", length=200)

    private String specJson;// get specJson  
 
  /**   
  * goodsPic:
  */     
    @Column(name="goodsPic")

    private String goodsPic;// get goodsPic  
 
  /**   
  * addtime:
  */     
    @Column(name="addtime", length=19)

    private Timestamp addtime;// get addtime  
 
  /**   
  * salePrice:
  */     
    @Column(name="salePrice", precision=15)

    private Double salePrice;// get salePrice  
 
  /**   
  * marketPrice:
  */     
    @Column(name="marketPrice", precision=15)

    private Double marketPrice;// get marketPrice  
 
  /**   
  * profitPercent:
  */     
    @Column(name="profitPercent", precision=15)

    private Double profitPercent;// get profitPercent  
 
  /**   
  * goodsStatus:0表示待审核，1表示正常，2表示锁定，-1表示删除
  */     
    @Column(name="goodsStatus")

    private Integer goodsStatus;// get goodsStatus  
 
  /**   
  * goodsNo:
  */     
    @Column(name="goodsNo", length=30)

    private String goodsNo;// get goodsNo  
 
  /**   
  * packList:
  */     
    @Column(name="packList", length=65535)

    private String packList;// get packList  
 
  /**   
  * afterSale:
  */     
    @Column(name="afterSale", length=65535)

    private String afterSale;// get afterSale  
 
  /**   
  * isFreeMail:
  */     
    @Column(name="isFreeMail")

    private Integer isFreeMail;// get isFreeMail  
 
  /**   
  * description:
  */     
    @Column(name="description", length=65535)

    private String description;// get description  
 
  /**   
  * salesCount:销售总数量
  */     
    @Column(name="salesCount")

    private Integer salesCount;// get salesCount  
 
  /**   
  * isBoutique:是否精品  0：否 1：是
  */     
    @Column(name="isBoutique")

    private Integer isBoutique;// get isBoutique  
 
  /**   
  * highPraise:好评度
  */     
    @Column(name="highPraise", precision=4, scale=3)

    private Double highPraise;// get highPraise  
 
  /**   
  * commentCount:评论总数
  */     
    @Column(name="commentCount")

    private Integer commentCount;// get commentCount  
 
  /**   
  * isTop:
  */     
    @Column(name="isTop", nullable=false)

    private Integer isTop;// get isTop  
 
  /**   
  * isVirtualProduct:
  */     
    @Column(name="isVirtualProduct", nullable=false)

    private Integer isVirtualProduct;// get isVirtualProduct  
 
  /**   
  * saleType:0：普通  1：团购
  */     
    @Column(name="saleType")

    private Integer saleType;// get saleType  
 
  /**   
  * originalGoodsId:所属原商品    可为空
  */     
    @Column(name="originalGoodsId")

    private Long originalGoodsId;// get originalGoodsId  
 
  /**   
  * stationId:
  */     
    @Column(name="stationId")

    private Long stationId;// get stationId  
 
  /**   
  * stationName:
  */     
    @Column(name="stationName", length=100)

    private String stationName;// get stationName  
 
  /**   
  * stationType:0总站（商家有且仅只有一个），1分站
  */     
    @Column(name="stationType", nullable=false)

    private Integer stationType;// get stationType  
 
  /**   
  * mallName:
  */     
    @Column(name="mallName", length=50)

    private String mallName;// get mallName  
 
  /**   
  * mallType:0：普通 1：自营
  */     
    @Column(name="mallType")

    private Integer mallType;// get mallType  
 
  /**   
  * linkmallId:
  */     
    @Column(name="linkmallId")

    private Long linkmallId;// get linkmallId  
 
  /**   
  * linkmallName:
  */     
    @Column(name="linkmallName", length=50)

    private String linkmallName;// get linkmallName  
 
  /**   
  * linkmallType:0：普通 1：自营
  */     
    @Column(name="linkmallType")

    private Integer linkmallType;// get linkmallType  


    // Constructors

    /** default constructor */
    public VSubstationGoods() {
    }

	/** minimal constructor */
    public VSubstationGoods(Long goodsId, Integer isTop, Integer isVirtualProduct, Integer stationType) {
        this.goodsId = goodsId;
        this.isTop = isTop;
        this.isVirtualProduct = isVirtualProduct;
        this.stationType = stationType;
    }
    
    /** full constructor */
    public VSubstationGoods(Long goodsId, Long mallId, Long categoryId, String mallGoodsName, String propertyJson, String specJson, String goodsPic, Timestamp addtime, Double salePrice, Double marketPrice, Double profitPercent, Integer goodsStatus, String goodsNo, String packList, String afterSale, Integer isFreeMail, String description, Integer salesCount, Integer isBoutique, Double highPraise, Integer commentCount, Integer isTop, Integer isVirtualProduct, Integer saleType, Long originalGoodsId, Long stationId, String stationName, Integer stationType, String mallName, Integer mallType, Long linkmallId, String linkmallName, Integer linkmallType) {
        this.goodsId = goodsId;
        this.mallId = mallId;
        this.categoryId = categoryId;
        this.mallGoodsName = mallGoodsName;
        this.propertyJson = propertyJson;
        this.specJson = specJson;
        this.goodsPic = goodsPic;
        this.addtime = addtime;
        this.salePrice = salePrice;
        this.marketPrice = marketPrice;
        this.profitPercent = profitPercent;
        this.goodsStatus = goodsStatus;
        this.goodsNo = goodsNo;
        this.packList = packList;
        this.afterSale = afterSale;
        this.isFreeMail = isFreeMail;
        this.description = description;
        this.salesCount = salesCount;
        this.isBoutique = isBoutique;
        this.highPraise = highPraise;
        this.commentCount = commentCount;
        this.isTop = isTop;
        this.isVirtualProduct = isVirtualProduct;
        this.saleType = saleType;
        this.originalGoodsId = originalGoodsId;
        this.stationId = stationId;
        this.stationName = stationName;
        this.stationType = stationType;
        this.mallName = mallName;
        this.mallType = mallType;
        this.linkmallId = linkmallId;
        this.linkmallName = linkmallName;
        this.linkmallType = linkmallType;
    }

   
    // Property accessors
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
	* get mallId  
	*/
    public Long getMallId() {
        return this.mallId;
    }
    
    public void setMallId(Long mallId) {
        this.mallId = mallId;
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
	* get mallGoodsName  
	*/
    public String getMallGoodsName() {
        return this.mallGoodsName;
    }
    
    public void setMallGoodsName(String mallGoodsName) {
        this.mallGoodsName = mallGoodsName;
    }
	/**
	* get propertyJson  
	*/
    public String getPropertyJson() {
        return this.propertyJson;
    }
    
    public void setPropertyJson(String propertyJson) {
        this.propertyJson = propertyJson;
    }
	/**
	* get specJson  
	*/
    public String getSpecJson() {
        return this.specJson;
    }
    
    public void setSpecJson(String specJson) {
        this.specJson = specJson;
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
	* get addtime  
	*/
    public Timestamp getAddtime() {
        return this.addtime;
    }
    
    public void setAddtime(Timestamp addtime) {
        this.addtime = addtime;
    }
	/**
	* get salePrice  
	*/
    public Double getSalePrice() {
        return this.salePrice;
    }
    
    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }
	/**
	* get marketPrice  
	*/
    public Double getMarketPrice() {
        return this.marketPrice;
    }
    
    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }
	/**
	* get profitPercent  
	*/
    public Double getProfitPercent() {
        return this.profitPercent;
    }
    
    public void setProfitPercent(Double profitPercent) {
        this.profitPercent = profitPercent;
    }
	/**
	* get goodsStatus  
	*/
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }
    
    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }
	/**
	* get goodsNo  
	*/
    public String getGoodsNo() {
        return this.goodsNo;
    }
    
    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }
	/**
	* get packList  
	*/
    public String getPackList() {
        return this.packList;
    }
    
    public void setPackList(String packList) {
        this.packList = packList;
    }
	/**
	* get afterSale  
	*/
    public String getAfterSale() {
        return this.afterSale;
    }
    
    public void setAfterSale(String afterSale) {
        this.afterSale = afterSale;
    }
	/**
	* get isFreeMail  
	*/
    public Integer getIsFreeMail() {
        return this.isFreeMail;
    }
    
    public void setIsFreeMail(Integer isFreeMail) {
        this.isFreeMail = isFreeMail;
    }
	/**
	* get description  
	*/
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
	/**
	* get salesCount  
	*/
    public Integer getSalesCount() {
        return this.salesCount;
    }
    
    public void setSalesCount(Integer salesCount) {
        this.salesCount = salesCount;
    }
	/**
	* get isBoutique  
	*/
    public Integer getIsBoutique() {
        return this.isBoutique;
    }
    
    public void setIsBoutique(Integer isBoutique) {
        this.isBoutique = isBoutique;
    }
	/**
	* get highPraise  
	*/
    public Double getHighPraise() {
        return this.highPraise;
    }
    
    public void setHighPraise(Double highPraise) {
        this.highPraise = highPraise;
    }
	/**
	* get commentCount  
	*/
    public Integer getCommentCount() {
        return this.commentCount;
    }
    
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }
	/**
	* get isTop  
	*/
    public Integer getIsTop() {
        return this.isTop;
    }
    
    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }
	/**
	* get isVirtualProduct  
	*/
    public Integer getIsVirtualProduct() {
        return this.isVirtualProduct;
    }
    
    public void setIsVirtualProduct(Integer isVirtualProduct) {
        this.isVirtualProduct = isVirtualProduct;
    }
	/**
	* get saleType  
	*/
    public Integer getSaleType() {
        return this.saleType;
    }
    
    public void setSaleType(Integer saleType) {
        this.saleType = saleType;
    }
	/**
	* get originalGoodsId  
	*/
    public Long getOriginalGoodsId() {
        return this.originalGoodsId;
    }
    
    public void setOriginalGoodsId(Long originalGoodsId) {
        this.originalGoodsId = originalGoodsId;
    }
	/**
	* get stationId  
	*/
    public Long getStationId() {
        return this.stationId;
    }
    
    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }
	/**
	* get stationName  
	*/
    public String getStationName() {
        return this.stationName;
    }
    
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
	/**
	* get stationType  
	*/
    public Integer getStationType() {
        return this.stationType;
    }
    
    public void setStationType(Integer stationType) {
        this.stationType = stationType;
    }
	/**
	* get mallName  
	*/
    public String getMallName() {
        return this.mallName;
    }
    
    public void setMallName(String mallName) {
        this.mallName = mallName;
    }
	/**
	* get mallType  
	*/
    public Integer getMallType() {
        return this.mallType;
    }
    
    public void setMallType(Integer mallType) {
        this.mallType = mallType;
    }
	/**
	* get linkmallId  
	*/
    public Long getLinkmallId() {
        return this.linkmallId;
    }
    
    public void setLinkmallId(Long linkmallId) {
        this.linkmallId = linkmallId;
    }
	/**
	* get linkmallName  
	*/
    public String getLinkmallName() {
        return this.linkmallName;
    }
    
    public void setLinkmallName(String linkmallName) {
        this.linkmallName = linkmallName;
    }
	/**
	* get linkmallType  
	*/
    public Integer getLinkmallType() {
        return this.linkmallType;
    }
    
    public void setLinkmallType(Integer linkmallType) {
        this.linkmallType = linkmallType;
    }
   








}
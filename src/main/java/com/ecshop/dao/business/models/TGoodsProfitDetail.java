package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TGoodsProfitDetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_goods_profit_detail"
)

public class TGoodsProfitDetail  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -992965577L;

    // Fields    

 
  /**   
  * profitDeatilId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="profitDeatilId", unique=true, nullable=false)

    private Long profitDeatilId;// get profitDeatilId  
 
  /**   
  * orderGoodsId:订单商品ID
  */     
    @Column(name="orderGoodsId")

    private Long orderGoodsId;// get orderGoodsId  
 
  /**   
  * mallId:
  */     
    @Column(name="mallId")

    private Long mallId;// get mallId  
 
  /**   
  * goodsId:商品ID
  */     
    @Column(name="goodsId")

    private Long goodsId;// get goodsId  
 
  /**   
  * goodsItemsId:商品货号
  */     
    @Column(name="goodsItemsId")

    private Long goodsItemsId;// get goodsItemsId  
 
  /**   
  * orderId:订单ID
  */     
    @Column(name="orderId")

    private Long orderId;// get orderId  
 
  /**   
  * goodsprofitId:商品分润ID
  */     
    @Column(name="goodsprofitId")

    private Long goodsprofitId;// get goodsprofitId  
 
  /**   
  * fromUserId:下单人
  */     
    @Column(name="fromUserId")

    private Long fromUserId;// get fromUserId  
 
  /**   
  * vuserId:拿V客奖金的用户ID（可能是经销商、大V、盟客）
  */     
    @Column(name="vUserID")

    private Long vuserId;// get vuserId  
 
  /**   
  * muserId:拿盟客奖金的用户ID
  */     
    @Column(name="mUserId")

    private Long muserId;// get muserId  
 
  /**   
  * duserId:
  */     
    @Column(name="dUserID")

    private Long duserId;// get duserId  
 
  /**   
  * directUserId:
  */     
    @Column(name="directUserId")

    private Long directUserId;// get directUserId  
 
  /**   
  * indirectUserId:
  */     
    @Column(name="indirectUserId")

    private Long indirectUserId;// get indirectUserId  
 
  /**   
  * serviceUserId:
  */     
    @Column(name="serviceUserId")

    private Long serviceUserId;// get serviceUserId  
 
  /**   
  * operationUserId:
  */     
    @Column(name="operationUserId")

    private Long operationUserId;// get operationUserId  
 
  /**   
  * platformUserId:
  */     
    @Column(name="platformUserId")

    private Long platformUserId;// get platformUserId  
 
  /**   
  * mallAmount:
  */     
    @Column(name="mallAmount", precision=15)

    private Double mallAmount;// get mallAmount  
 
  /**   
  * vamount:金额
  */     
    @Column(name="vAmount", precision=15)

    private Double vamount;// get vamount  
 
  /**   
  * mamount:
  */     
    @Column(name="mAmount", precision=15)

    private Double mamount;// get mamount  
 
  /**   
  * damount:
  */     
    @Column(name="dAmount", precision=15)

    private Double damount;// get damount  
 
  /**   
  * directAmount:
  */     
    @Column(name="directAmount", precision=15)

    private Double directAmount;// get directAmount  
 
  /**   
  * indirectAmount:
  */     
    @Column(name="indirectAmount", precision=15)

    private Double indirectAmount;// get indirectAmount  
 
  /**   
  * operationAmount:
  */     
    @Column(name="operationAmount", precision=15)

    private Double operationAmount;// get operationAmount  
 
  /**   
  * serviceAmout:
  */     
    @Column(name="serviceAmout", precision=15)

    private Double serviceAmout;// get serviceAmout  
 
  /**   
  * platFormAmount:
  */     
    @Column(name="platFormAmount", precision=15)

    private Double platFormAmount;// get platFormAmount  
 
  /**   
  * vuserType:拿到V客奖金的身份类型
  */     
    @Column(name="vUserType")

    private Integer vuserType;// get vuserType  
 
  /**   
  * muserType:拿到盟客奖金的身份类型
  */     
    @Column(name="mUserType")

    private Integer muserType;// get muserType  
 
  /**   
  * checkStatus:0：可核算 1：已核算  2：冻结  
  */     
    @Column(name="checkStatus")

    private Integer checkStatus;// get checkStatus  
 
  /**   
  * afterSaleId:售后单（仅限于退款和退货）
  */     
    @Column(name="afterSaleId")

    private Long afterSaleId;// get afterSaleId  
 
  /**   
  * payTime:订单支付完成时间（如果退款，时间填充所对应的订单的支付时间）
            对于会员，保证在同一个结算周期内
  */     
    @Column(name="payTime", length=19)

    private Timestamp payTime;// get payTime  
 
  /**   
  * mallsettlementTime:结算时间
  */     
    @Column(name="mallsettlementTime", length=19)

    private Timestamp mallsettlementTime;// get mallsettlementTime  
 
  /**   
  * settlementTime:个人结算时间
  */     
    @Column(name="settlementTime", length=19)

    private Timestamp settlementTime;// get settlementTime  
 
  /**   
  * vamountRate:V客奖金总百分比
  */     
    @Column(name="vAmountRate", precision=15, scale=4)

    private Double vamountRate;// get vamountRate  
 
  /**   
  * mamountRate:盟客奖金总百分比
  */     
    @Column(name="mAmountRate", precision=15, scale=4)

    private Double mamountRate;// get mamountRate  
 
  /**   
  * damountRate:经销商奖金总百分比
  */     
    @Column(name="dAmountRate", precision=15, scale=4)

    private Double damountRate;// get damountRate  
 
  /**   
  * directAmountRate:直接经销商奖金总百分比
  */     
    @Column(name="directAmountRate", precision=15, scale=4)

    private Double directAmountRate;// get directAmountRate  
 
  /**   
  * indirectAmountRate:间接经销商奖金总百分比
  */     
    @Column(name="indirectAmountRate", precision=15, scale=4)

    private Double indirectAmountRate;// get indirectAmountRate  
 
  /**   
  * operationAmountRate:运营中心奖金总百分比
  */     
    @Column(name="operationAmountRate", precision=15, scale=4)

    private Double operationAmountRate;// get operationAmountRate  
 
  /**   
  * serviceAmoutRate:服务中心奖金总百分比
  */     
    @Column(name="serviceAmoutRate", precision=15, scale=4)

    private Double serviceAmoutRate;// get serviceAmoutRate  
 
  /**   
  * platFormAmountRate:平台奖金总百分比
  */     
    @Column(name="platFormAmountRate", precision=15, scale=4)

    private Double platFormAmountRate;// get platFormAmountRate  
 
  /**   
  * regionOperationId:
  */     
    @Column(name="regionOperationId")

    private Long regionOperationId;// get regionOperationId  
 
  /**   
  * regionAmount:
  */     
    @Column(name="regionAmount", precision=15)

    private Double regionAmount;// get regionAmount  
 
  /**   
  * regionRate:
  */     
    @Column(name="regionRate", precision=15, scale=4)

    private Double regionRate;// get regionRate  


    // Constructors

    /** default constructor */
    public TGoodsProfitDetail() {
    }

    
    /** full constructor */
    public TGoodsProfitDetail(Long orderGoodsId, Long mallId, Long goodsId, Long goodsItemsId, Long orderId, Long goodsprofitId, Long fromUserId, Long vuserId, Long muserId, Long duserId, Long directUserId, Long indirectUserId, Long serviceUserId, Long operationUserId, Long platformUserId, Double mallAmount, Double vamount, Double mamount, Double damount, Double directAmount, Double indirectAmount, Double operationAmount, Double serviceAmout, Double platFormAmount, Integer vuserType, Integer muserType, Integer checkStatus, Long afterSaleId, Timestamp payTime, Timestamp mallsettlementTime, Timestamp settlementTime, Double vamountRate, Double mamountRate, Double damountRate, Double directAmountRate, Double indirectAmountRate, Double operationAmountRate, Double serviceAmoutRate, Double platFormAmountRate, Long regionOperationId, Double regionAmount, Double regionRate) {
        this.orderGoodsId = orderGoodsId;
        this.mallId = mallId;
        this.goodsId = goodsId;
        this.goodsItemsId = goodsItemsId;
        this.orderId = orderId;
        this.goodsprofitId = goodsprofitId;
        this.fromUserId = fromUserId;
        this.vuserId = vuserId;
        this.muserId = muserId;
        this.duserId = duserId;
        this.directUserId = directUserId;
        this.indirectUserId = indirectUserId;
        this.serviceUserId = serviceUserId;
        this.operationUserId = operationUserId;
        this.platformUserId = platformUserId;
        this.mallAmount = mallAmount;
        this.vamount = vamount;
        this.mamount = mamount;
        this.damount = damount;
        this.directAmount = directAmount;
        this.indirectAmount = indirectAmount;
        this.operationAmount = operationAmount;
        this.serviceAmout = serviceAmout;
        this.platFormAmount = platFormAmount;
        this.vuserType = vuserType;
        this.muserType = muserType;
        this.checkStatus = checkStatus;
        this.afterSaleId = afterSaleId;
        this.payTime = payTime;
        this.mallsettlementTime = mallsettlementTime;
        this.settlementTime = settlementTime;
        this.vamountRate = vamountRate;
        this.mamountRate = mamountRate;
        this.damountRate = damountRate;
        this.directAmountRate = directAmountRate;
        this.indirectAmountRate = indirectAmountRate;
        this.operationAmountRate = operationAmountRate;
        this.serviceAmoutRate = serviceAmoutRate;
        this.platFormAmountRate = platFormAmountRate;
        this.regionOperationId = regionOperationId;
        this.regionAmount = regionAmount;
        this.regionRate = regionRate;
    }

   
    // Property accessors
	/**
	* get profitDeatilId  
	*/
    public Long getProfitDeatilId() {
        return this.profitDeatilId;
    }
    
    public void setProfitDeatilId(Long profitDeatilId) {
        this.profitDeatilId = profitDeatilId;
    }
	/**
	* get orderGoodsId  
	*/
    public Long getOrderGoodsId() {
        return this.orderGoodsId;
    }
    
    public void setOrderGoodsId(Long orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
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
	* get orderId  
	*/
    public Long getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
	/**
	* get goodsprofitId  
	*/
    public Long getGoodsprofitId() {
        return this.goodsprofitId;
    }
    
    public void setGoodsprofitId(Long goodsprofitId) {
        this.goodsprofitId = goodsprofitId;
    }
	/**
	* get fromUserId  
	*/
    public Long getFromUserId() {
        return this.fromUserId;
    }
    
    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }
	/**
	* get vuserId  
	*/
    public Long getVuserId() {
        return this.vuserId;
    }
    
    public void setVuserId(Long vuserId) {
        this.vuserId = vuserId;
    }
	/**
	* get muserId  
	*/
    public Long getMuserId() {
        return this.muserId;
    }
    
    public void setMuserId(Long muserId) {
        this.muserId = muserId;
    }
	/**
	* get duserId  
	*/
    public Long getDuserId() {
        return this.duserId;
    }
    
    public void setDuserId(Long duserId) {
        this.duserId = duserId;
    }
	/**
	* get directUserId  
	*/
    public Long getDirectUserId() {
        return this.directUserId;
    }
    
    public void setDirectUserId(Long directUserId) {
        this.directUserId = directUserId;
    }
	/**
	* get indirectUserId  
	*/
    public Long getIndirectUserId() {
        return this.indirectUserId;
    }
    
    public void setIndirectUserId(Long indirectUserId) {
        this.indirectUserId = indirectUserId;
    }
	/**
	* get serviceUserId  
	*/
    public Long getServiceUserId() {
        return this.serviceUserId;
    }
    
    public void setServiceUserId(Long serviceUserId) {
        this.serviceUserId = serviceUserId;
    }
	/**
	* get operationUserId  
	*/
    public Long getOperationUserId() {
        return this.operationUserId;
    }
    
    public void setOperationUserId(Long operationUserId) {
        this.operationUserId = operationUserId;
    }
	/**
	* get platformUserId  
	*/
    public Long getPlatformUserId() {
        return this.platformUserId;
    }
    
    public void setPlatformUserId(Long platformUserId) {
        this.platformUserId = platformUserId;
    }
	/**
	* get mallAmount  
	*/
    public Double getMallAmount() {
        return this.mallAmount;
    }
    
    public void setMallAmount(Double mallAmount) {
        this.mallAmount = mallAmount;
    }
	/**
	* get vamount  
	*/
    public Double getVamount() {
        return this.vamount;
    }
    
    public void setVamount(Double vamount) {
        this.vamount = vamount;
    }
	/**
	* get mamount  
	*/
    public Double getMamount() {
        return this.mamount;
    }
    
    public void setMamount(Double mamount) {
        this.mamount = mamount;
    }
	/**
	* get damount  
	*/
    public Double getDamount() {
        return this.damount;
    }
    
    public void setDamount(Double damount) {
        this.damount = damount;
    }
	/**
	* get directAmount  
	*/
    public Double getDirectAmount() {
        return this.directAmount;
    }
    
    public void setDirectAmount(Double directAmount) {
        this.directAmount = directAmount;
    }
	/**
	* get indirectAmount  
	*/
    public Double getIndirectAmount() {
        return this.indirectAmount;
    }
    
    public void setIndirectAmount(Double indirectAmount) {
        this.indirectAmount = indirectAmount;
    }
	/**
	* get operationAmount  
	*/
    public Double getOperationAmount() {
        return this.operationAmount;
    }
    
    public void setOperationAmount(Double operationAmount) {
        this.operationAmount = operationAmount;
    }
	/**
	* get serviceAmout  
	*/
    public Double getServiceAmout() {
        return this.serviceAmout;
    }
    
    public void setServiceAmout(Double serviceAmout) {
        this.serviceAmout = serviceAmout;
    }
	/**
	* get platFormAmount  
	*/
    public Double getPlatFormAmount() {
        return this.platFormAmount;
    }
    
    public void setPlatFormAmount(Double platFormAmount) {
        this.platFormAmount = platFormAmount;
    }
	/**
	* get vuserType  
	*/
    public Integer getVuserType() {
        return this.vuserType;
    }
    
    public void setVuserType(Integer vuserType) {
        this.vuserType = vuserType;
    }
	/**
	* get muserType  
	*/
    public Integer getMuserType() {
        return this.muserType;
    }
    
    public void setMuserType(Integer muserType) {
        this.muserType = muserType;
    }
	/**
	* get checkStatus  
	*/
    public Integer getCheckStatus() {
        return this.checkStatus;
    }
    
    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }
	/**
	* get afterSaleId  
	*/
    public Long getAfterSaleId() {
        return this.afterSaleId;
    }
    
    public void setAfterSaleId(Long afterSaleId) {
        this.afterSaleId = afterSaleId;
    }
	/**
	* get payTime  
	*/
    public Timestamp getPayTime() {
        return this.payTime;
    }
    
    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }
	/**
	* get mallsettlementTime  
	*/
    public Timestamp getMallsettlementTime() {
        return this.mallsettlementTime;
    }
    
    public void setMallsettlementTime(Timestamp mallsettlementTime) {
        this.mallsettlementTime = mallsettlementTime;
    }
	/**
	* get settlementTime  
	*/
    public Timestamp getSettlementTime() {
        return this.settlementTime;
    }
    
    public void setSettlementTime(Timestamp settlementTime) {
        this.settlementTime = settlementTime;
    }
	/**
	* get vamountRate  
	*/
    public Double getVamountRate() {
        return this.vamountRate;
    }
    
    public void setVamountRate(Double vamountRate) {
        this.vamountRate = vamountRate;
    }
	/**
	* get mamountRate  
	*/
    public Double getMamountRate() {
        return this.mamountRate;
    }
    
    public void setMamountRate(Double mamountRate) {
        this.mamountRate = mamountRate;
    }
	/**
	* get damountRate  
	*/
    public Double getDamountRate() {
        return this.damountRate;
    }
    
    public void setDamountRate(Double damountRate) {
        this.damountRate = damountRate;
    }
	/**
	* get directAmountRate  
	*/
    public Double getDirectAmountRate() {
        return this.directAmountRate;
    }
    
    public void setDirectAmountRate(Double directAmountRate) {
        this.directAmountRate = directAmountRate;
    }
	/**
	* get indirectAmountRate  
	*/
    public Double getIndirectAmountRate() {
        return this.indirectAmountRate;
    }
    
    public void setIndirectAmountRate(Double indirectAmountRate) {
        this.indirectAmountRate = indirectAmountRate;
    }
	/**
	* get operationAmountRate  
	*/
    public Double getOperationAmountRate() {
        return this.operationAmountRate;
    }
    
    public void setOperationAmountRate(Double operationAmountRate) {
        this.operationAmountRate = operationAmountRate;
    }
	/**
	* get serviceAmoutRate  
	*/
    public Double getServiceAmoutRate() {
        return this.serviceAmoutRate;
    }
    
    public void setServiceAmoutRate(Double serviceAmoutRate) {
        this.serviceAmoutRate = serviceAmoutRate;
    }
	/**
	* get platFormAmountRate  
	*/
    public Double getPlatFormAmountRate() {
        return this.platFormAmountRate;
    }
    
    public void setPlatFormAmountRate(Double platFormAmountRate) {
        this.platFormAmountRate = platFormAmountRate;
    }
	/**
	* get regionOperationId  
	*/
    public Long getRegionOperationId() {
        return this.regionOperationId;
    }
    
    public void setRegionOperationId(Long regionOperationId) {
        this.regionOperationId = regionOperationId;
    }
	/**
	* get regionAmount  
	*/
    public Double getRegionAmount() {
        return this.regionAmount;
    }
    
    public void setRegionAmount(Double regionAmount) {
        this.regionAmount = regionAmount;
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
   








}
package com.ecshop.dao.business.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TFightGroup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_fight_group"
)

public class TFightGroup  implements java.io.Serializable {


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1973261373L;

    // Fields    

 
  /**   
  * fightGroupId:
  */     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="fightGroupId", unique=true, nullable=false)

    private Long fightGroupId;// get fightGroupId  
 
  /**   
  * foundedTime:
  */     
    @Column(name="foundedTime", length=19)

    private Timestamp foundedTime;// get foundedTime  
 
  /**   
  * groupStatus:
  */     
    @Column(name="groupStatus")

    private Integer groupStatus=0;// get groupStatus  
 
  /**   
  * groupUserNum:拼团最终有效人数
  */     
    @Column(name="groupUserNum")

    private Integer groupUserNum=0;// get groupUserNum  
 
  /**   
  * groupGoodNum:拼团最终有效商品数量
  */     
    @Column(name="groupGoodNum")

    private Integer groupGoodNum=0;// get groupGoodNum  
 
  /**   
  * remark:
  */     
    @Column(name="remark", length=1000)

    private String remark;// get remark  


    // Constructors

    /** default constructor */
    public TFightGroup() {
    }

    
    /** full constructor */
    public TFightGroup(Timestamp foundedTime, Integer groupStatus, Integer groupUserNum, Integer groupGoodNum, String remark) {
        this.foundedTime = foundedTime;
        this.groupStatus = groupStatus;
        this.groupUserNum = groupUserNum;
        this.groupGoodNum = groupGoodNum;
        this.remark = remark;
    }

   
    // Property accessors
	/**
	* get fightGroupId  
	*/
    public Long getFightGroupId() {
        return this.fightGroupId;
    }
    
    public void setFightGroupId(Long fightGroupId) {
        this.fightGroupId = fightGroupId;
    }
	/**
	* get foundedTime  
	*/
    public Timestamp getFoundedTime() {
        return this.foundedTime;
    }
    
    public void setFoundedTime(Timestamp foundedTime) {
        this.foundedTime = foundedTime;
    }
	/**
	* get groupStatus  
	*/
    public Integer getGroupStatus() {
        return this.groupStatus;
    }
    
    public void setGroupStatus(Integer groupStatus) {
        this.groupStatus = groupStatus;
    }
	/**
	* get groupUserNum  
	*/
    public Integer getGroupUserNum() {
        return this.groupUserNum;
    }
    
    public void setGroupUserNum(Integer groupUserNum) {
        this.groupUserNum = groupUserNum;
    }
	/**
	* get groupGoodNum  
	*/
    public Integer getGroupGoodNum() {
        return this.groupGoodNum;
    }
    
    public void setGroupGoodNum(Integer groupGoodNum) {
        this.groupGoodNum = groupGoodNum;
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
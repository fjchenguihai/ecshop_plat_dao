package com.ecshop.dao.common;


import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 系统常量表
 *
 * @author 
 *
 * 2015-07-28
 */
public class Const {
	
	public static final int CPU_CORES =  Runtime.getRuntime().availableProcessors();
		
    public static final class SystemExecutorConst{
    	/**
    	 * 核心线程数为默认cpu数+1
    	 */
    	public static final int CORE_THREAD_NUMS = CPU_CORES + 1;
    	/**
    	 * 最大线程数为核心线程数*2
    	 */
    	public static final int MAX_THREAD_NUMS = CORE_THREAD_NUMS * 2;
    	/**
    	 * 最大队列数为核心线程数 * 6
    	 */
    	public static final int QUEUE_LENGTH = CORE_THREAD_NUMS * 6;
    	
    	/**
    	 * 若队列过长，则当前线程内执行
    	 */
    	public static final RejectedExecutionHandler REJECTED_HANDLER = new ThreadPoolExecutor.CallerRunsPolicy();
    	
    	/**
    	 * 线程销毁时间：60秒
    	 */
    	public static final int KEEPALIVE_SECONDS = 60;
    	
    }
    
    
    //定义经销商的角色key
    public static final String DISTRIBUTOR_ROLE_KEY = "SYS_DISTRIBUTOR";
    
    //用户session名称
    public static final String USER_SESSION = "userSession";
    
    //后台管理，用户所有权限信息
    public static final String SESSION_PERMISSION_CODE = "session_permission_code";
    
    //有效状态
    public static final Integer VALID_STATUS = 1;
    
    //无效状态
    public static final Integer INVALID_STAUS = 0;
    
    //用户类型表
    public static final class UserType{
    	/**
    	 * 1-普通用户
    	 */
    	public static final int COMMON_USER = 1;
    	
    	/**
    	 * 2-V客
    	 */
    	public static final int V_CUSTOMER_USER = 2;
    	
    	/**
    	 * 3-经销商
    	 */
    	public static final int DISTRIBUTOR = 3;
    }

    
    //支付状态
    public static final class PaymentStatus{
    	/**
    	 * 0-待支付
    	 */
    	public static final int NOT_PAY = 0;
    	/**
    	 * 1-已支付
    	 */
    	public static final int PAYED = 1;
    	/**
    	 * 2-已结算
    	 */
    	public static final int SETTLED = 2;
    	/**
    	 * 3-支付失败
    	 */
    	public static final int CANCELED = 3;
    	
    	/**
    	 * 4-状态未知
    	 */
    	public static final int UNKNOWN = 4;
    }
    
    //资源
    public static final class Resource{
    	/**
    	 * 0-顶级菜单id
    	 */
    	public static final Long ROOT_RESOURCE_ID = 0L;
    	/**
    	 * 
    	 */
    	public static final String ROOT_RESOURCE_Name = "顶级菜单";

    }
    
    //站点类型
    public static final class StationType{
    	public static final Integer ALL_STATION = 0;
    	public static final Integer SUB_STATION = 1;
    }
  
    
    //商家类型
    public static final class MallType{
    	public static final Integer NORMAL_MALL = 0;
    	public static final Integer SELF_SUPPORT_MALL = 1;	
    }

    //商家角色类型
    public static final class MallRoleType{
    	public static final String MALL_ROOT = "MALL_ROOT"; //自营商家超级管理员
    	public static final String MALL_MANAGER = "MALL_MANAGER"; //自营商家操作员
    	public static final String SITE_MANAGER = "SITE_MANAGER";//站点管理员
    	
    	public static final String COMMON_MALL_ROOT = "COMMON_MALL_ROOT"; //普通商家超级管理员
    	public static final String COMMON_MALL_MANAGER = "COMMON_MALL_MANAGER"; //普通商家操作员员
    }



	
}

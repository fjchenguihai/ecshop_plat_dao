package com.ecshop.dao.exception;

/**
 * 自定义异常
 * @author 
 *
 */
public class AppBizException extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5920992412075434662L;
	
	
	private Integer code; //错误码
	
	public AppBizException(String msg){  
        super(msg);  
    }  
	
	public AppBizException(Integer code,String msg){
		super(msg);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}
   
	

}

package com.ecshop.dao.util;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class StringUtils extends org.apache.commons.lang.StringUtils{

	/**
	 * 隐藏手机字符串部分字段
	 * @param mobileStr
	 * @return
	 */
	public static String mobileFilter(String mobileStr) {
		return mobileStr.substring(0, 3) + "****" + mobileStr.substring(7, 11);
	}
	
	/**
	 * 隐藏邮箱字符串部分字段
	 * @param mailStr
	 * @return
	 */
	public static String mailFilter(String mailStr) { 
		String[] email = mailStr.split("@");
		String tempStr = email[0].substring(0, 3);
		for(int i = 0; i < email[0].length() - 3; i++) {
			tempStr += "*";
		}
		tempStr += "@";
		tempStr += email[1];
		return tempStr;
	}
	
	/**
	 * 隐藏银行卡号字符串部分字段,只显示前6后4位
	 * @param mobileStr
	 * @return
	 */
	public static String cardNoFilter(String cardNoStr) {
		StringBuffer sb = new StringBuffer();
		int length = cardNoStr.length();
		for(int i=0;i<length;i++){
			if(i<6||(i>length-5)){
				sb.append(cardNoStr.charAt(i));
			}else{
				sb.append("*");
			}
		}
		return sb.toString();

	}
	
	/**
	 * BigDecimal格式的金额 转 BCD格式的金额  示例：1.11 转 000000000111
	 * @param bigDecimalAmt
	 * @return
	 */
	public static String amtToBCD(BigDecimal bigDecimalAmt){
		bigDecimalAmt.setScale(2,RoundingMode.HALF_UP);
		bigDecimalAmt = bigDecimalAmt.abs().multiply(new BigDecimal("100"));
		return StringUtils.leftPad(bigDecimalAmt.longValue()+"", 12, "0");
	}
	
	/**
	 * BCD格式的金额 转 BigDecimal格式的金额  示例：000000000111 转 1.11
	 * @param bcdAmt
	 * @return
	 */
	public static BigDecimal amtToBigDecimal(String bcdAmt){
		BigDecimal bigDecimal = new BigDecimal(bcdAmt);
		bigDecimal.setScale(2,RoundingMode.HALF_UP);
		bigDecimal=bigDecimal.divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
		return bigDecimal;
	}
	
	public static boolean isAmountFormat(String amount){
		boolean isAmountFormat = false;
		if(amount.contains(".")){
			String[] amounts = amount.split("\\.");
			if(amounts[0].length()<=8 && amounts[0].length()>0){
				isAmountFormat = true;
			}
		}
		return isAmountFormat;
	}
	
    /**
     * 字节级切割,确保切割出的字符对应的字节数小等于传入参数。<p>
     * 且字符完整 
     * 
     * @param input 输入字符串
     * @param charset 字符集
     * @param max 最大字节数
     * @return
     * @throws UnsupportedEncodingException 
     */
    public static String spiltByByteMaxLength(String input,String charset,int max) throws UnsupportedEncodingException{
    	if(input == null)
    		return null;
    	int offset = 0;
    	StringBuilder sb = new StringBuilder(max);
    	for(int i = 0;i<input.length();i++){
    		offset += input.substring(i, i+1).getBytes(charset).length;
    		if(offset > max)
    			break;
    		
    		sb.append(input.charAt(i));
    	}
    	return sb.toString();
    }
    
    public static String toRemark(String input) {
    	try{
    		return spiltByByteMaxLength(input, "utf-8", 210);
    	}catch(Exception e){
    		return input.substring(0,210/3);
    	}
    }
    
    public static void main(String[] args){
    	System.out.println(amtToBCD(amtToBigDecimal("1255644444411")));
    	System.out.println(new BigDecimal("1255644444411").longValue());
    	System.out.println(new BigDecimal("2056444499").intValue());
    }
    
}

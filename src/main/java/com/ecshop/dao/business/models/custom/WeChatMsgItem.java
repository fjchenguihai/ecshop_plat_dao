
/**
 * @Project		vve_plat_wxserver_v2.1.1
 * @File		WeChatMsgItem.java
 * @Package		com.qq.weixin.model
 * @Version		V1.0
 * @Date		2016年1月20日 下午2:39:45
 * @Author		@vvetime.com
 * Copyright (c) All Rights Reserved, 2016.
 */
	
package com.ecshop.dao.business.models.custom;


/** 微信图文消息报文的item项
 * @Description	TODO
 * @ClassName	WeChatMsgItem
 * @Date		2016年1月20日 下午2:39:45
 * @Author		@vvetime.com
 * Copyright (c) All Rights Reserved, 2016.
 */

public class WeChatMsgItem {
	private String title;
	private String description;
	private String picurl;
	private String url;
	
	/**
	 * @return title
	 */
	
	public String getTitle() {
		return title;
	}
	
	/**
	 * @param title title
	 */
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * @return description
	 */
	
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param description description
	 */
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @return picurl
	 */
	
	public String getPicurl() {
		return picurl;
	}
	
	/**
	 * @param picurl picurl
	 */
	
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
	
	/**
	 * @return url
	 */
	
	public String getUrl() {
		return url;
	}
	
	/**
	 * @param url url
	 */
	
	public void setUrl(String url) {
		this.url = url;
	}
	
//	<Title><![CDATA[title1]]></Title> 
//	<Description><![CDATA[description1]]></Description>
//	<PicUrl><![CDATA[picurl]]></PicUrl>
//	<Url><![CDATA[url]]></Url>
}

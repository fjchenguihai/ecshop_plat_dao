package com.ecshop.dao.wxserver.qrcode;

import java.util.Map;

public interface WeixinQRCodeDao {
	
	/**
	 * 依据sceneid查询二维码场景ID与USERID映射信息
	 * @param sceneId
	 * @return
	 */
	public Map getWeixinQRCode(Long sceneId);
}

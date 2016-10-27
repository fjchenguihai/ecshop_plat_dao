package com.ecshop.dao.wxserver.qrcode.impl;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
import com.ecshop.dao.wxserver.qrcode.WeixinQRCodeDao;


@Repository("weixinQRCodeDao")
public class WeixinQRCodeDaoImpl extends HibernateGenericDao<Object,Long> implements WeixinQRCodeDao {

	
	@Override
	public Map getWeixinQRCode(Long sceneId) {
		String sql="select userid from t_weixinqrcode where sceneid=?";
		Object userid = findUniqueBySql(sql, sceneId);
		Map map = new HashMap();
		map.put("userid", userid);
		return map;
	}

}


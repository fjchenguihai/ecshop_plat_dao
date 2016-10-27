package com.ecshop.dao.wxserver.api.dao;

import java.util.List;

import com.ecshop.dao.base.GenericDao;
import com.ecshop.dao.wxserver.api.model.AccessToken;

public interface AccessTokenDao extends GenericDao<AccessToken, Long>{
	
	public AccessToken getByAppidType(String appid,int type);
	public AccessToken getByUsernameType(String userName,int type);
	public List<AccessToken> getRefreshToken();
}

package com.ecshop.dao.wxserver.api.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
import com.ecshop.dao.wxserver.api.dao.AccessTokenDao;
import com.ecshop.dao.wxserver.api.model.AccessToken;

@Repository("accessTokenDao")
public class AccessTokenDaoImpl extends HibernateGenericDao<AccessToken, Long>  implements AccessTokenDao{



	@Override
	public AccessToken getByAppidType(String appid, int type) {
		List<AccessToken> list = findByProperty(new String[]{"appid","type"}, new Object[]{appid,type});
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public AccessToken getByUsernameType(String userName, int type) {
		List<AccessToken> list = findByProperty(new String[]{"userName","type"}, new Object[]{userName,type});
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<AccessToken> getRefreshToken() {
		String sql="SELECT * from t_access_token where Type = 2 and TIMESTAMPDIFF(MINUTE,Time,now()) > 90 and UserName is NOT null ";
		
		List<AccessToken> mallList = findBySql(sql, null);
		return mallList;
	}
	


	

}

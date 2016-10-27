package com.ecshop.dao.wxserver.sms;


import java.util.List;

import com.ecshop.dao.base.GenericDao;
import com.ecshop.dao.business.models.TSmsRecord;

/**
 * 短信及验证码相关
 * @author jerry
 *
 */
public interface SmsRecordDao extends GenericDao<TSmsRecord, Long>{
	
	/**
	 * 依据手机号码查询短信信息
	 * @param mobile
	 * @return
	 */
	public List<TSmsRecord> getSmsRecordByMobile(String mobile);
	
	/**
	 * 通过sql修改短信信息
	 * @param sql
	 * @param values
	 * @return
	 */
	public int updateSmsRecord(String sql,Object...values);
	
}

package com.ecshop.dao.wxserver.sms.impl;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecshop.dao.base.hibernate.HibernateGenericDao;
import com.ecshop.dao.business.models.TSmsRecord;
import com.ecshop.dao.wxserver.sms.SmsRecordDao;


@Repository("smsRecordDao")
public class SmsRecordDaoImpl extends HibernateGenericDao<TSmsRecord, Long>implements SmsRecordDao {

	

	@SuppressWarnings("unchecked")
	@Override
	public List<TSmsRecord> getSmsRecordByMobile(String mobile) {
		StringBuffer sb = new StringBuffer();
		sb.append(" select * from t_sms_record where endtime >= now() and captchasStatus = 0 ");
		sb.append("and mobile= ? order by endtime desc limit 1");
		final String sql = sb.toString();
		List<TSmsRecord> smsRecordList = new ArrayList<TSmsRecord>();
		smsRecordList = findBySql(sql, mobile);
		return smsRecordList;
		
	}

	@Override
	public int updateSmsRecord(String sql, Object... values) {
		return excuteBySql(sql, values);
	}



}

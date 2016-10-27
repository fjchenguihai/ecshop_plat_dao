package com.vveplat.dao.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 基础测试
 * 实现对Resource自动注入的功能
 * 
 * @author 
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:sysBase.xml"})
public abstract class BeanBaseTestCase { 
	
}

package com.wwq.shop;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.junit4.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class JustTest{
	@BeforeClass
	public static void init(){
	}
	
	@Test
	public void testProduct(){
		ApplicationContext actx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
		Product aaa = (Battery)actx.getBean("aaa");
		Product cdrw = (Disc)actx.getBean("cdrw");
		System.out.println(aaa.toString());
		System.out.println(cdrw.toString());
	}
}

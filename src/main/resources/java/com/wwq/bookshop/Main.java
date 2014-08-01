package com.wwq.bookshop;

import org.apache.log4j.Logger;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/applicationContext.xml");
		
		logger.info("TEST START!");
		
		BookShop bookShop = (BookShop) context.getBean("bookShop");
		bookShop.purchase("0001","user1");
	}

}

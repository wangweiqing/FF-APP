package com.wwq.calculator;

import org.apache.log4j.Logger;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/applicationContext.xml");
		ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) context
				.getBean("arithmeticCalculator");
	/*	arithmeticCalculator.add(1, 2);*/
		arithmeticCalculator.sub(4, 3);
	/*	arithmeticCalculator.mul(2, 3);
		arithmeticCalculator.div(4, -1);*/
		MaxCalculator maxCalculator = (MaxCalculator) arithmeticCalculator;
		maxCalculator.max(1, 2);
		MinCalculator minCalculator = (MinCalculator) arithmeticCalculator;
		minCalculator.min(1, 2);
		

		UnitCalculator unitCalculator = (UnitCalculator) context
				.getBean("unitCalculator");
		unitCalculator.kilogramToMile(5);
		unitCalculator.kilogramToPound(10);
		
		Counter arithmeticCounter = (Counter) arithmeticCalculator;
		logger.info(arithmeticCounter.getCount());

		Counter unitCounter = (Counter) unitCalculator;
		logger.info(unitCounter.getCount());
		
	}

}

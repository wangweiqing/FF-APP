package com.wwq.calculator;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

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

	/*	UnitCalculator unitCalculator = (UnitCalculator) context
				.getBean("unitCalculator");
		unitCalculator.kilogramToMile(5);
		unitCalculator.kilogramToPound(10);*/
	}

}

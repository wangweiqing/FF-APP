package com.wwq.calculator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class CalculatorLoggingAspect {

	private Log log = LogFactory.getLog(this.getClass());
	
	@Before("execution(* ArithmeticCalculator.add(..))")
	public void logBefore(){
		log.info("The method add() begins");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

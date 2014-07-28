package com.wwq.calculator;

import org.apache.log4j.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CalculatorLoggingAspect {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(CalculatorLoggingAspect.class);

	
	@Before("execution(* ArithmeticCalculator.add(..))")
	public void logBefore(){
		logger.info("The method add() begins");
		System.out.println("The method add() begins test!!!");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

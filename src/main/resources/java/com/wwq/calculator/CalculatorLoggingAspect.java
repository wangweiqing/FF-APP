package com.wwq.calculator;

import java.util.Arrays;

import org.apache.log4j.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CalculatorLoggingAspect {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(CalculatorLoggingAspect.class);

	
	@Before("execution(* ArithmeticCalculator.add(..))")
	public void logBefore(){
		logger.info("The method add() begins");
	}
	
	@Before("execution(* *.*(..))")
	public void logBefore(JoinPoint joinPoint){
		logger.info("The method " + joinPoint.getSignature().getName()
				+ "() begins with " + Arrays.toString(joinPoint.getArgs()));
	}
	
	@After("execution(* *.*(..))")
	public void logAfter(JoinPoint joinPoint){
		logger.info("The method " + joinPoint.getSignature().getName()
				+ "() ends");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package com.wwq.calculator;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;

@Aspect
public class CalculatorLoggingAspect implements Ordered{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(CalculatorLoggingAspect.class);

	@Before("execution(* *.*(..))")
	public void logJoinPoint(JoinPoint joinPoint) {
		logger.info("Join Point kind : " + joinPoint.getKind());
		logger.info("Signature declaring type : "
				+ joinPoint.getSignature().getDeclaringTypeName());
		logger.info("Signature name : " + joinPoint.getSignature().getName());
		logger.info("Arguments : " + Arrays.toString(joinPoint.getArgs()));
		logger.info("Target class : "
				+ joinPoint.getTarget().getClass().getName());
		logger.info("This class : " + joinPoint.getThis().getClass().getName());
	}
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
	
	@AfterReturning("execution(* *.*(..))")
	public void logAfterReturning(JoinPoint joinPoint){
		logger.info("The method " + joinPoint.getSignature().getName()
				+ "() ends");
	}
	
	@AfterReturning(pointcut = "execution(* *.*(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		logger.info("The method " + joinPoint.getSignature().getName()
				+ "() ends with " + result);
	}
	
	@AfterThrowing("execution(* *.*(..))")
	public void logAfterThrowing(JoinPoint joinPoint) {
		logger.error("An exception has been thrown in "
				+ joinPoint.getSignature().getName() + "()");
	}
	
	@AfterThrowing(pointcut = "execution(* *.*(..))", throwing = "e")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
		logger.error("An exception has been thrown in "
				+ joinPoint.getSignature().getName() + "()");
	}
	
	@AfterThrowing(pointcut = "execution(* *.*(..))", throwing = "e")
	public void logAfterThrowing(JoinPoint joinPoint, IllegalArgumentException e) {
		logger.error("Illegal argument " + Arrays.toString(joinPoint.getArgs())
				+ " in " + joinPoint.getSignature().getName() + "()");
	}
	
	@Around("execution(* *.*(..))")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		logger.info("The method " + joinPoint.getSignature().getName()
				+ "() begins with " + Arrays.toString(joinPoint.getArgs()));
		try {
			Object result = joinPoint.proceed();
			logger.info("The method " + joinPoint.getSignature().getName()
					+ "() ends with " + result);
			return result;
		} catch (IllegalArgumentException e) {
			logger.error("Illegal argument "
					+ Arrays.toString(joinPoint.getArgs()) + " in "
					+ joinPoint.getSignature().getName() + "()");
			throw e;
		}
	}
	
	@After(value = "@annotation (com.wwq.calculator.LoggingRequired)")
	public void loggingRequired(){
		logger.info("JUST TEST!!!JUST TEST!!!JUST TEST!!!");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}

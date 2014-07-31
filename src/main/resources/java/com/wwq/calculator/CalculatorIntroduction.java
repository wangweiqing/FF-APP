package com.wwq.calculator;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class CalculatorIntroduction {
	@DeclareParents(
			value = "com.wwq.calculator.ArithmeticCalculatorImpl", 
			defaultImpl = MaxCalculatorImpl.class)
	public MaxCalculator maxCalculator;

	@DeclareParents(
			value = "com.wwq.calculator.ArithmeticCalculatorImpl", 
			defaultImpl = MinCalculatorImpl.class)
	public MinCalculator minCalculator;
	
	@DeclareParents(
			value = "com.wwq.calculator.*CalculatorImpl",
			defaultImpl = CounterImpl.class)
	public Counter counter;
	
	@After("execution(* com.wwq.calculator.*Calculator.*(..))"
			+ " && this(counter)")
	public void increaseCount(Counter counter) {
		counter.increase();
	}
}

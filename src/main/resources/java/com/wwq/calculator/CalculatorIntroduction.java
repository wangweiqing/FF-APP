package com.wwq.calculator;

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
}

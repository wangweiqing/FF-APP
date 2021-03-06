package com.wwq.calculator;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CalculatorPointcuts {

	@Pointcut("within(ArithmeticCalculator+)")
	public void arithmeticOperation() {
	}

	@Pointcut("within(UnitCalculator+)")
	public void unitOperation() {
	}

	@Pointcut("arithmeticOperation() || unitOperation()")
	public void loggingOperation() {
	}
}

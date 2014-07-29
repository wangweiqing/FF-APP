package com.wwq.calculator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;

@Aspect
public class CalculatorValidationAspect implements Ordered{
	@Before("execution(* *.*(double,double))")
	public void validateBefore(JoinPoint joinPoint) {
		for (Object arg : joinPoint.getArgs()) {
			validate((Double) arg);
		}
	}

	private void validate(double a) {
		if (a < 0) {
			throw new IllegalArgumentException("Positive number only");
		}
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
}

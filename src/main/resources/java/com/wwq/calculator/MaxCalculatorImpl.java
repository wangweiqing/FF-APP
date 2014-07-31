package com.wwq.calculator;

import org.apache.log4j.Logger;

public class MaxCalculatorImpl implements MaxCalculator {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(MaxCalculatorImpl.class);

	@Override
	public double max(double a, double b) {
		// TODO Auto-generated method stub
		double result = (a >= b) ? a : b;
		logger.info("max(" + a + ", " + b + ") = " + result);
		return result;
	}

}

package com.wwq.calculator;

import org.apache.log4j.Logger;

public class MinCalculatorImpl implements MinCalculator {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(MinCalculatorImpl.class);

	@Override
	public double min(double a, double b) {
		// TODO Auto-generated method stub
		double result = (a <= b) ? a : b;
		logger.info("min(" + a + ", " + b + ") = " + result);
		return result;
	}

}

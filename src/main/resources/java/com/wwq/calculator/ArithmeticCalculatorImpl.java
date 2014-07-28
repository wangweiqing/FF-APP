package com.wwq.calculator;

public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	public double add(double a, double b) {
		// TODO Auto-generated method stub
		double result = a + b;
		System.out.println(a + " + " + b + " = " + result);
		return result;
	}

	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		double result = a - b;
		System.out.println(a + " - " + b + " = " + result);
		return result;
	}

	public double mul(double a, double b) {
		// TODO Auto-generated method stub
		double result = a * b;
		System.out.println(a + " * " + b + " = " + result);
		return result;
	}

	public double div(double a, double b) {
		// TODO Auto-generated method stub
		if (b == 0)
			throw new IllegalArgumentException("Devision by zero");
		double result = a / b;
		System.out.println(a + " / " + b + " = " + result);
		return result;
	}
}

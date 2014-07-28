package com.wwq.calculator;

public class UnitCalculatorImpl implements UnitCalculator {

	public double kilogramToPound(double kilogram) {
		// TODO Auto-generated method stub
		double pound = kilogram * 2.2;
		System.out.println(kilogram + " kilogram = " + pound + " pound");
		return pound;
	}

	public double kilogramToMile(double kilometer) {
		// TODO Auto-generated method stub
		double mile = kilometer * 0.62;
		System.out.println(kilometer + " kilometer = " + mile + " mile");
		return mile;
	}
}


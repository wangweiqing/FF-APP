package com.wwq.calculator;

public class CounterImpl implements Counter {

	private int count;

	@Override
	public void increase() {
		// TODO Auto-generated method stub
		count++;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

}

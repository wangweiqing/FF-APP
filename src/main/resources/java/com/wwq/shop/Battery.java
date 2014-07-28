package com.wwq.shop;

public class Battery extends Product {
	
	private boolean rechargeable;
	
	public Battery(){
		super();
	}

	public Battery(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public boolean isRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}
	
	
}

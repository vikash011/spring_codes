package com.nit.service;

public class Shopping {

	public double doShopping(double price, double qty) {
		System.out.println("Shopping.doShopping()");
		double billAmt = 0.0;

		if (price <= 0 || qty <= 0) {
			throw new IllegalArgumentException("Invalid price or quantity");
		}

//		calculating billAmout
		billAmt = price * qty;
		return billAmt;
	}

}

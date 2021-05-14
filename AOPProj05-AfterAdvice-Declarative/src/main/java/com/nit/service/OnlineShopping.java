package com.nit.service;

public class OnlineShopping {

	public double purchase(String items[], float price[]) {

		System.out.println("OnlineShopping.purchase()__started");
		double billAmt = 0.0;

//		calculating BillAmount
		for (double p : price) {
			billAmt = billAmt + p;
		}
		System.out.println("OnlineShopping.purchase()__ended");

		return billAmt;
	}

}

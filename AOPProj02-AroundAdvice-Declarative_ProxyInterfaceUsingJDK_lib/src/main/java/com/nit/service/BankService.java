package com.nit.service;

public final class BankService implements IBankService {

	public BankService() {
		System.out.println("BankService.0-param constructor");
	}

	public final double calSimpleInterestAmount(double pAmt, double rate, double time) {
		System.out.println("BankService.calSimpleInterestAmount()");
		return (pAmt * rate * time) / 100.0f;
	}

	public final double calCompoundInterestAmount(double pAmt, double rate, double time) {
		System.out.println("BankService.calCompoundInterestAmount()");
		return Math.pow((pAmt + rate * pAmt / 100.0f), time);
	}

}

package com.nit.service;

public interface IBankService {

	public double calSimpleInterestAmount(double pAmt, double rate, double time);

	public double calCompoundInterestAmount(double pAmt, double rate, double time);
}

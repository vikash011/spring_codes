package com.nit.service;

public interface IBankMgmtService {

	public String moneyTransfer(long srcAcc, long dstAcc, double amount) throws IllegalAccessException;

}

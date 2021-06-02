package com.nit.dao;

public interface IBankDAO {

	public int withdraw(long srcAcc, double amount);

	public int deposit(long dstAcc, double amount);

}

package com.nit.service;

import com.nit.dao.IBankDAO;

public class BankMgmtServiceImpl implements IBankMgmtService {

	private IBankDAO dao;

	public BankMgmtServiceImpl(IBankDAO dao) {
		this.dao = dao;
	}

	@Override
	public String moneyTransfer(long srcAcc, long dstAcc, double amount) throws IllegalAccessException {

		
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException iae) {
			iae.printStackTrace();
		}
		// use DAO

		int count1 = dao.withdraw(srcAcc, amount);
		int count2 = dao.deposit(dstAcc, amount);


		if (count1 == 0 || count2 == 0) {
			throw new IllegalAccessException("Transaction RolledBack:: Money Not Transffered");// must be Unchecked
																								// Exception
		} else
			return "Transcation Committed::Money is Transffered";
	}

}

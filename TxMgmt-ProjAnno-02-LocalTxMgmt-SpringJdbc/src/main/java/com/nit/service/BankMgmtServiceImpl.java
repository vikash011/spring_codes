package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nit.dao.IBankDAO;

@Service("bankService")
public class BankMgmtServiceImpl implements IBankMgmtService {

	@Autowired
	private IBankDAO dao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = IllegalAccessException.class)
	public String moneyTransfer(long srcAcc, long dstAcc, double amount) throws IllegalAccessException {

		int count1 = dao.withdraw(srcAcc, amount);
		int count2 = dao.deposit(dstAcc, amount);

		if (count1 == 0 || count2 == 0) {
			throw new IllegalAccessException("Transaction RolledBack:: Money Not Transffered");// must be Unchecked
																								// Exception
		} else
			return "Transcation Committed::Money is Transffered";
	}

}

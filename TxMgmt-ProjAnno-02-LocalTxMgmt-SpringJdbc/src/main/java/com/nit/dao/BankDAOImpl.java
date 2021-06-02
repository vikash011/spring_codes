package com.nit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bankDAO")
public class BankDAOImpl implements IBankDAO {

	private static String withdraw_query = "update TX_MGMT_BANK set balance=balance-? where accno=?";
	private static String deposite_query = "update TX_MGMT_BANK set balance=balance+? where accno=?";

	@Autowired
	private JdbcTemplate jt;

	@Override
	public int withdraw(long srcAcc, double amount) {
		int count1 = jt.update(withdraw_query, amount, srcAcc);
		return count1;
	}

	@Override
	public int deposit(long dstAcc, double amount) {
		int count2 = jt.update(deposite_query, amount, dstAcc);
		return count2;
	}

}

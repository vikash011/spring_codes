package com.nit.test;

import com.nit.beans.Customer;

public class LombokTest {
	
	public static void main(String[] args) {
		Customer c = new Customer();
		
		c.setCid(101);
		c.setCname("Raja");
		c.setCaddr("Lucknow");
		c.setBillAmt(22626.65f);
		
		
	System.out.println(c.getCid()+" "+c.getCname()+" "+c.getCaddr()+" "+c.getBillAmt());
		
	}

}

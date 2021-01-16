package com.nit.test;

import com.nit.beans.Customer;

public class LombokTest {

	public static void main(String[] args) {

		Customer c3 = new Customer(100);
		c3.setCno(102);
		c3.setCname("Mohan");
		c3.setCaddr("Delhi");
		c3.setBillsAmt(76767.756f);

		Customer c4 = new Customer(100);
		c4.setCno(105);
		c4.setCname("sohan");
		c4.setCaddr("Delhi-Ncr");
		c4.setBillsAmt(2672.756f);
		
		System.out.println(c3);
		System.out.println(c4);

	}

}

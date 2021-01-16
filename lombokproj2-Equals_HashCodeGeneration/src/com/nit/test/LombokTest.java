package com.nit.test;

import com.nit.beans.Customer;

public class LombokTest {

	public static void main(String[] args) {
		
		//calls NOArgsConstructor
		Customer c1 = new Customer();
		c1.setCno(102);
		c1.setCname("Mohan");
		c1.setCaddr("Delhi");
		c1.setBillsAmt(76767.756f);
		
		System.out.println(c1.getCno()+" "+c1.getCname()+" "+c1.getCaddr()+" "+c1.getBillsAmt());
		
		
//		calls AllArgsConstructor
		Customer c2 = new Customer(103,"Ramu","Mumbai",6675.43f);
		System.out.println(c2);
		
		
//		
		Customer c3 = new Customer();
		c3.setCno(102);
		c3.setCname("Mohan");
		c3.setCaddr("Delhi");
		c3.setBillsAmt(76767.756f);
		
		
		Customer c4 = new Customer();
		c4.setCno(102);
		c4.setCname("Mohan");
		c4.setCaddr("Delhi");
		c4.setBillsAmt(76767.756f);
		
		
		System.out.println(c3.equals(c4));//true =>due equals() overriden in our class 
		System.out.println(c3.hashCode()+"  "+c4.hashCode());//same hashcode
		
	}
	
}

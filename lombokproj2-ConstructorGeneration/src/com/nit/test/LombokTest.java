package com.nit.test;

import com.nit.beans.Customer;

public class LombokTest {

	public static void main(String[] args) {
		
		//calls RequiredArgsConstructor
		Customer c1 = new Customer("Mohan","Delhi");
		
		
		System.out.println(c1.getCno()+" "+c1.getCname()+" "+c1.getCaddr()+" "+c1.getBillsAmt());
		
		
       //calls AllArgsConstructor
//		Customer c2 = new Customer(103,"Ramu","Mumbai",6675.43f);
//		System.out.println(c2);
	}
	
}

package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.VotingEligibility;

public class SpringBeanLifeTest {

	public static void main(String[] args) {

//		creating IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		  // creating object having bean id voter
		VotingEligibility voter = ctx.getBean("voter", VotingEligibility.class);
		  
		  System.out.println(voter);
		  
		  
		  // closing ApplicationContext container
		  ((AbstractApplicationContext)ctx).close();
		  
		 
	}

}

package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Cricketer;

public class TraditionalDLookupTest {

	public static void main(String[] args) {

//		 creating IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

//		 getting target bean class object
		Cricketer cricket = ctx.getBean("cricket", Cricketer.class);
		System.out.println("..........................................................");

//          invoking metghods
		cricket.batting();
		System.out.println("...........................................................");
		cricket.bowling();
		System.out.println(".............................................................");
		cricket.fielding();

//          closing container
		((AbstractApplicationContext) ctx).close();

	}

}

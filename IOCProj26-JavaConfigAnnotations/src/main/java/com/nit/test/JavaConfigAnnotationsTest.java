package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Flipkart;

public class JavaConfigAnnotationsTest {

	public static void main(String[] args) {

//		creating IOC(Application Context Container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

//		creating object for Flipkart class
		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
		System.out.println(fpkt);

//	   calling business method of Flipkart class
		String message = fpkt.shopping("vikash");
		System.out.println(message);

//		closing appicationContext container
		((AbstractApplicationContext) ctx).close();

	}
}

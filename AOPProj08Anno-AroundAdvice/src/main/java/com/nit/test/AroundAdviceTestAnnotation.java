package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.service.BankService;

public class AroundAdviceTestAnnotation {

	public static void main(String[] args) {

//		creating IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

//	creating Object for service class
		BankService proxy = ctx.getBean("bank", BankService.class);

//		invoking method
		System.out.println("simple Interest is::" + proxy.calSimpleInterestAmount(1324525d, 5, 8));
		System.out.println();
		System.out.println("compound Interest is::" + proxy.calCompoundInterestAmount(56565, 6, 9));
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");

		System.out.println("simple Interest is::" + proxy.calSimpleInterestAmount(1324525d, 5, 8));
		System.out.println();
		System.out.println("simple Interest is::" + proxy.calSimpleInterestAmount(1324525d, 5, 8));

//		close IOC container
		((AbstractApplicationContext) ctx).close();
	}

}

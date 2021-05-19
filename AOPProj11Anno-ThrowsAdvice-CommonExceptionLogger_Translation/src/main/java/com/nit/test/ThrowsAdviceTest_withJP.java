package com.nit.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.service.Shopping;

public class ThrowsAdviceTest_withJP {

	public static void main(String[] args) {
		System.out.println("ThrowsAdviceTest_withJP.main()");

//	creating IOC container

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

//		creating proxy class object
		Shopping proxy = ctx.getBean("shopping", Shopping.class);

		System.out.println("Total BillAmount::" + proxy.doShopping(0, 2998));

//		closing IOC
		ctx.close();

	}

}

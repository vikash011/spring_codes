package com.nit.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.service.OnlineShopping;


public class AfterAdviceTest_WithOut_JoinPoint {

	public static void main(String[] args) {

//		creating IOC 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

		OnlineShopping proxy = ctx.getBean("OShopping", OnlineShopping.class);
		System.out.println(proxy.getClass().getName() + "    " + proxy.getClass().getSuperclass());

		try {
			double result = proxy.purchase(new String[] { "cap", "Halleem", "Cent", "Dress" },
					new float[] { 200, 1000, 2000, 500000 });
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();

		}
//		closing IOC
		ctx.close();

	}

}

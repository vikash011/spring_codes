package com.nit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.service.Shopping;

public class ThrowsAdviceTest_withJP {

	public static void main(String[] args) {
		System.out.println("ThrowsAdviceTest_withJP.main()");

//	creating IOC container

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//		creating proxy class object
		Shopping proxy = ctx.getBean("shopping", Shopping.class);

		System.out.println("Total BillAmount::" + proxy.doShopping(0, 2998));

//		closing IOC
		ctx.close();

	}

}

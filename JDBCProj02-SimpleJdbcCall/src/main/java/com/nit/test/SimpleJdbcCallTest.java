package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.service.ILoginMgmtService;

public class SimpleJdbcCallTest {

	public static void main(String[] args) {

		System.out.println("IOC started");
//		creating IOC
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

//		creating object for service class
		ILoginMgmtService service = ctx.getBean("loginservice", ILoginMgmtService.class);

//		invoke method
		System.out.println(service.login("raja", "raja123"));

		System.out.println("IOC closed");
//		close IOC
		((AbstractApplicationContext) ctx).close();

	}

}

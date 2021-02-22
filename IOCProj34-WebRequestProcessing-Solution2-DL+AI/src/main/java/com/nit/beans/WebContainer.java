package com.nit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {

	public void handleRequest(String data) {

		System.out.println("WebContainer.handleRequest()");

//		using traditional dependency lookup
//		creating 2nd IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		RequestHandler handle = ctx.getBean("handle", RequestHandler.class);

		System.out.println("WebContainer:started handling Request with data  " + data);
		handle.processingRequest(data);
		System.out.println("WebContainer:completed hadling Request with data  " + data);

//		closing Container
		((AbstractApplicationContext) ctx).close();
	}

}

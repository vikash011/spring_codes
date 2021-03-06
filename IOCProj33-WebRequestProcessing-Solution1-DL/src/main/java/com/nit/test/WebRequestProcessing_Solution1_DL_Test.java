package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.WebContainer;

public class WebRequestProcessing_Solution1_DL_Test {

	public static void main(String[] args) {

//		 creating IOC Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

//		creating object for Target class
		WebContainer container = ctx.getBean("container", WebContainer.class);
      System.out.println(".................................................");
//	invoking target class method
       container.handleRequest("hi...");
       System.out.println("....................................................");
       container.handleRequest("hello...");
       System.out.println("....................................................");
       container.handleRequest("how are u...");
       System.out.println("....................................................");
       container.handleRequest("i am fine...");
       
//       closing Container
       ((AbstractApplicationContext) ctx).close();
	}
}

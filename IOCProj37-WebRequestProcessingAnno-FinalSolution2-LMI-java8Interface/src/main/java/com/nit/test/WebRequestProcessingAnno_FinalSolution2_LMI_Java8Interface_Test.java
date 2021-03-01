package com.nit.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.WebContainer;

public class WebRequestProcessingAnno_FinalSolution2_LMI_Java8Interface_Test {

	public static void main(String[] args) {

//		 creating IOC Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

//		creating object for Target class
		WebContainer container = ctx.getBean("container", WebContainer.class);
		System.out.println("Proxy class object name:"+container.getClass()+"  "+container.getClass().getSuperclass());
      System.out.println(".................................................");
//	invoking target class method
       container.handleRequest("hi...");
       System.out.println("....................................................");
       container.handleRequest("hello...");
       System.out.println("....................................................");
       container.handleRequest("how are u...");
       System.out.println("....................................................");
       container.handleRequest("i am fine...");
       
       System.out.println("........................................................");
       Date date = ctx.getBean("mi", Date.class);
       System.out.println("Date and Time::"+date);
       
       
//       closing Container
       ((AbstractApplicationContext) ctx).close();
	}
}

package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Person1;
import com.nit.beans.Person2;

public class ValueAnnotationTest {

	public static void main(String[] args) {

//		creating IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//		creating object for Person1 class
		Person1 per1 = ctx.getBean("per1", Person1.class);
		System.out.println(per1);
		System.out.println("............................................................");
	
		
//		creating object for Person2 class
		Person2 per2 = ctx.getBean("per2", Person2.class);
		System.out.println(per2);
		
		
		
		
		

		((AbstractApplicationContext) ctx).close();

	}

}

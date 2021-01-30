package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.comps.Vechicle;

public class ApplicationContextTest {

	public static void main(String[] args) {

//creating ApplicationContext Container(IOC container)(various types)

		// use for StandaloneApplication by locating xml file using FileSystem
		// 1) ApplicationContext ctx= new
		// FileSystemXmlApplicationContext("src/com/nit/cfgs/applicationContext.xml");

		
		
		// 2)
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		// (or)
		//com.nit.cfgs use as SRC folder
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		// 3) ApplicationContext ctx = new XmlWebApplicationContext();
		// 4) ApplicationContext ctx= new AnnotationConfigApplicationContext();

//	getting target class object using bean id
		Vechicle vehicle = ctx.getBean("vechicle", Vechicle.class);

//	invoking method
		vehicle.journey("Delhi", "banglore");

		((AbstractApplicationContext) ctx).close();

	}

}

package com.nit.test;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.WelcomeGreetings;

public class SpringBasicsTest {
	
	
	public static void main(String[] args) {
		
		//locate and hold Spring Bean Configuration file
		FileSystemResource  res =  new FileSystemResource("src/com/nit/cfgs/applicationcontext.xml");
		
		//creating IOC container(XML Bean Factory)
		XmlBeanFactory  factory = new XmlBeanFactory(res);
	
		
		//get Spring Bean class object from Spring Container/IOC Container
		 Date d = (Date)factory.getBean("dt");
		 WelcomeGreetings wg1=(WelcomeGreetings)factory.getBean("wg");
		 
		 
		 //displaying result
		 System.out.println("--------------------------------------");
		 System.out.println("d class object data:"+d);
		 System.out.println("---------------------------------------");
		 
		 System.out.println("Welocome Greeting::"+wg1.welcome("vikash"));
		System.out.println("-------------------------------------------");
	}

}

package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Person;

public class PersonTest {

	public static void main(String[] args) {

//		creating IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

//		creating object of Person class
		Person person = ctx.getBean("person", Person.class);

//	printing data of person class

		System.out.println(person);

		//((AbstractApplicationContext) ctx).close();

	}

}

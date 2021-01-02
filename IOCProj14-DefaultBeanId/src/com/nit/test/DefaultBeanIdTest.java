package com.nit.test;

import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.Person;

public class DefaultBeanIdTest {
	
	
	public static void main(String[] args) {
		
		
//		creating IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/apllicationContext.xml");
		
		
		Person person1= (Person) factory.getBean("com.nit.beans.Person");
		System.out.println(person1);
		
		Person person2= (Person) factory.getBean("com.nit.beans.Person#1");
		System.out.println(person2);
		
		Person person3= (Person) factory.getBean("com.nit.beans.Person#2");
		System.out.println(person3);
		
		
		Date date1 = (Date) factory.getBean("java.util.Date");
		System.out.println(date1);
		
		Date date2 = (Date) factory.getBean("java.util.Date#1");
		System.out.println(date2);
		
	}

}

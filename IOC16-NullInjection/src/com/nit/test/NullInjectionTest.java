package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.Info;
import com.nit.beans.PersonInfo;

public class NullInjectionTest {

	public static void main(String[] args) {
		
		
//		creating IOC /Spring Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader =  new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		
//	creating object for  Raja and printing its data
		PersonInfo rajaInfo= factory.getBean("rajaInfo",PersonInfo.class);
		System.out.println(rajaInfo);

//	creating object for Ramu and printing its data
		PersonInfo ramuInfo= factory.getBean("ramuInfo",PersonInfo.class);
		System.out.println(ramuInfo);
	
//		creating object for Shyam and printing its data
		PersonInfo shyamInfo= factory.getBean("shyamInfo",PersonInfo.class);
		System.out.println(shyamInfo);
		System.out.println("=====================================================================================");
		
		
//		creating object  for Info class
		Info info = factory.getBean("DOJ", Info.class);
		System.out.println(info);
	}
	
}

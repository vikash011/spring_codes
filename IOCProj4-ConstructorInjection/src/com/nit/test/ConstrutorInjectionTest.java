package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.bean.WishMessageGenerator;

public class ConstrutorInjectionTest {

	public static void main(String[] args) {

//		locating and holding Spring bean configuration file
		FileSystemResource res = new FileSystemResource("src/com/nit/cfgs/applicationContext.xml");

//		creating IOC/Spring Container
		XmlBeanFactory factory = new XmlBeanFactory(res);

//		Creating object(Target class) using Bean Id
		WishMessageGenerator generator = (WishMessageGenerator) factory.getBean("wmg");
		
//		Printing output
		String result = generator.wishMessage("vikash");
		
		System.out.println("Message::"+result);

	}

}

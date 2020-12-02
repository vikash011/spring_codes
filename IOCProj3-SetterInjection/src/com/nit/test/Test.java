package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.bean.WishMessageGeneratror;

public class Test {
	
	public static void main  (String[] args) {
		
		//hold and locate Spring Bean Configuration file by FileSystemResource
		FileSystemResource  res = new FileSystemResource("src/com/nit/cfgs/applicationContext.xml");
		
		
		//Creating IOC/Spring Container
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		//generating object corresponding spring bean id
		   WishMessageGeneratror message=(WishMessageGeneratror)factory.getBean("wmg");
		
		   System.out.println("Message::"+message.wishMeassage("vikash Kumar Gupta"));
		   
	}

}

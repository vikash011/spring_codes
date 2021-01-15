package com.nit.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodTest {
	
	
	
	public static void main (String[] args) {
		
		
//		creating IOC/Spring Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		
		
		Calendar cal = factory.getBean("cal", Calendar.class);
		System.out.println("cal obj class::"+cal.getClass()+"    "+"cal obj data::"+cal.toString());
		
		Class<?> clazz= factory.getBean("clazz",Class.class);
		System.out.println("clazz obj class::"+clazz.getClass()+"   "+"clazz obj data::"+clazz.toString());
		
		
		Properties props = factory.getBean("props", Properties.class);
		System.out.println("props obj class::"+props.getClass()+"   "+"props obj data::"+props.toString());
		
		
		
		String s3 = factory.getBean("s2",String.class);
		System.out.println("s3 obj class::"+s3.getClass()+"   "+"s3 obj data::"+s3.toString());
	
		
		
		StringBuffer s4 = factory.getBean("sb1",StringBuffer.class);
		System.out.println("s4 obj class::"+s4.getClass()+"   "+"s4 obj data::"+s4.toString());
		
		
		Iterator<?> itr = factory.getBean("itr", Iterator.class);
		System.out.println("itr obj class::"+itr.getClass()+"   "+"itr obj data::"+itr.toString());
		
	}

}

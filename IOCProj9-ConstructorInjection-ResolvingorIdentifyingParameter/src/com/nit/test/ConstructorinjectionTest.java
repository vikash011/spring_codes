package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.comps.Marks;
import com.nit.comps.Person;
import com.nit.comps.Student;

public class ConstructorinjectionTest {

	public static void main(String[] args) {

//		creating IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

//		XmlBeanDefinitionReader object
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

//      loading Spring bean configuration file using ( XmlBeanDefinition)	  
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");

//		creating student class object using bean id(st)
		Student data = factory.getBean("st", Student.class);
//		printing object data
		System.out.println("object data:: " + data);
		System.out.println("====================================================================");
//		creating student class object using bean id(st)
		Student data1 = factory.getBean("st1", Student.class);
//		printing object data
		System.out.println("object data::" + data1);
		System.out.println("====================================================================");
//		creating student class object using bean id(st)
		Student data2 = factory.getBean("st2", Student.class);
//		printing object data
		System.out.println("object data::" + data2);

//		creating Marks class object  and printing object data
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Marks data3 =factory.getBean("m1",Marks.class);
		System.out.println("object data::"+data3);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
//		creating Person class object and printing object data
		Person data4=factory.getBean("pr", Person.class);
		System.out.println("object data4::"+data4);
	}
}

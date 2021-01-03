package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.College;
import com.nit.beans.CourseInfo;
import com.nit.beans.FacultyInfo;
import com.nit.beans.FruitStore;
import com.nit.beans.Student;

public class Array_CollectionInjectionTest {

	public static void main(String[] args) {

//		Creating IOC Container

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");

//		creating object of College class using bean Id
		System.out.println("College class output");
		College clg = factory.getBean("clg", College.class);
		System.out.println(clg);
		System.out.println("___________________________________________________________________________");
		
//		creating object of Student class using bean Id
		System.out.println("Student class output");
		Student stud = factory.getBean("stud", Student.class);
		System.out.println(stud);
		System.out.println("------------------------------------------------------------------------------");
		
//		creating Object  of FacultyInfo class using bean Id
		System.out.println("FacultyInfo class OutPut");
		
		FacultyInfo  fac = factory.getBean("fac", FacultyInfo.class);
		System.out.println(fac);
		System.out.println("_------------------------------------------------------------------------------");

//		creating object of FruitInfo class using bean Id
		
		System.out.println("FruitStore class Output");
		FruitStore fstore = factory.getBean("fstore", FruitStore.class);
		System.out.println(fstore);
		System.out.println("----------------------------------------------------------------------------------");
		
//		creating object of FruitInfo class using bean Id
		System.out.println("CourseInfo class output");
		CourseInfo cinfo =factory.getBean("cinfo", CourseInfo.class); 
		System.out.println(cinfo);
	}

}

package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.beans.Printer;
import com.nit.beans.WishMessageGeneratror;

public class ScopeTest {

	public static void main(String[] args) {

//		creating IOC/Spring Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");

		WishMessageGeneratror gen1 = factory.getBean("wmg1", WishMessageGeneratror.class);
		WishMessageGeneratror gen2 = factory.getBean("wmg2", WishMessageGeneratror.class);
		System.out.println(gen1.hashCode() + "  " + gen2.hashCode());// different

		// scope="singleton" factory-method="getInstance"
		Printer prin1 = factory.getBean("p1", Printer.class);
		Printer prin2 = factory.getBean("p2", Printer.class);
		System.out.println(prin1.hashCode() + "  " + prin2.hashCode());// same

		// scope="singleton"
		Printer prin3 = factory.getBean("p3", Printer.class);
		Printer prin4 = factory.getBean("p4", Printer.class);
		System.out.println(prin3.hashCode() + "  " + prin4.hashCode());// different

		// scope="prototype"
		WishMessageGeneratror gen5 = factory.getBean("wmg3", WishMessageGeneratror.class);
		WishMessageGeneratror gen6 = factory.getBean("wmg3", WishMessageGeneratror.class);
		WishMessageGeneratror gen7 = factory.getBean("wmg3", WishMessageGeneratror.class);
		System.out.println(gen5.hashCode() + "  " + gen6.hashCode() + "  " + gen7.hashCode());// different

		Printer prin5 = factory.getBean("p5", Printer.class);
		Printer prin6 = factory.getBean("p5", Printer.class);
		System.out.println(prin5.hashCode() + "  " + prin6.hashCode());//

		// scope="prototype" factory-method="getInstance"
		Printer prin7 = factory.getBean("p7", Printer.class);
		Printer prin8 = factory.getBean("p7", Printer.class);
		System.out.println(prin7.hashCode() + "  " + prin8.hashCode());// same

	}
}

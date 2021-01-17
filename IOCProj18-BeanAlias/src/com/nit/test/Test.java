package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.bean.WishMessageGeneratror;

public class Test {

	public static void main(String[] args) {

//		creating IOC/spring Container

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");

		// all values are same due to "class Object" is same and all ref pointing to
		// same object
		WishMessageGeneratror gen1 = factory.getBean("wishMessageGenerator", WishMessageGeneratror.class);
		System.out.println(gen1.getClass().getName() + "  " + gen1.hashCode());

		WishMessageGeneratror gen2 = factory.getBean("wmg1", WishMessageGeneratror.class);
		System.out.println(gen1.getClass().getName() + "  " + gen2.hashCode());

		WishMessageGeneratror gen3 = factory.getBean("wmg2", WishMessageGeneratror.class);
		System.out.println(gen1.getClass().getName() + "  " + gen3.hashCode());

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		WishMessageGeneratror gen4 = factory.getBean("wmg3", WishMessageGeneratror.class);
		System.out.println(gen4.getClass().getName() + "  " + gen4.hashCode());
	
//		it throws error
		/*
		 * WishMessageGeneratror gen5 = (WishMessageGeneratror)
		 * factory.getBean("WishMessageGeneratror");
		 * System.out.println(gen5.getClass().getName()+"  "+gen5.hashCode());
		 */
		
		
		System.out.println("---------------------------------------------------------------");
		System.out.println(gen1.getClass().getName() + "  " + gen1.hashCode());
		System.out.println(gen1.getClass().getName() + "  " + gen2.hashCode());
		System.out.println(gen1.getClass().getName() + "  " + gen3.hashCode());
		System.out.println();
		WishMessageGeneratror gen6 = factory.getBean("msg1", WishMessageGeneratror.class);
		WishMessageGeneratror gen7 = factory.getBean("msg2", WishMessageGeneratror.class);
		WishMessageGeneratror gen8 = factory.getBean("msg3", WishMessageGeneratror.class);
		WishMessageGeneratror gen9 = factory.getBean("msg4", WishMessageGeneratror.class);
		System.out.println();
		System.out.println(gen6.getClass().getName() + "  " + gen6.hashCode());
		System.out.println(gen7.getClass().getName() + "  " + gen7.hashCode());
		System.out.println(gen8.getClass().getName() + "  " + gen8.hashCode());
		System.out.println(gen9.getClass().getName() + "  " + gen9.hashCode());
	
	}

}

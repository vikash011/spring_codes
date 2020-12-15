package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;

import com.nit.comps.Vechicle;

@SuppressWarnings("deprecation")
public class StrategyDPTest1 {

	public static void main(String[] args) {

//		creating Spring container/IOC  and locating spring bean configuration file
		
	  BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/nit/cfgs/applicationContext.xml"));

//	getting target class object using bean id
	Vechicle vehicle = factory.getBean("vechicle", Vechicle.class);
	
//	invoking method
	vehicle.journey("Delhi", "banglore");
	
	
	}

}

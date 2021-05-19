package com.nit.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.service.ShowRoom;

public class BeforeAdviceAnnotationTest {

	public static void main(String[] args) {

//		creating IOC 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

		ShowRoom proxy = ctx.getBean("showroom", ShowRoom.class);
		System.out.println(proxy.getClass().getName() + "    " + proxy.getClass().getSuperclass());

		try {
			String result = proxy.sellCar("vikash", "baleno", 125525.97);
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();

		}
//		closing IOC
		ctx.close();

	}

}

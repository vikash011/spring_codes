package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Robot;

public class RobotTest {
	
	
	public static void main(String[] args) {
		
//		creating IOC Container
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
//		creating object of Robot class
		Robot robo=ctx.getBean("robo", Robot.class);
		
//		printing data of Robot
		System.out.println(robo);
		
		
//		closing ApplicationContext container
		((AbstractApplicationContext) ctx).close();
		
	}

}

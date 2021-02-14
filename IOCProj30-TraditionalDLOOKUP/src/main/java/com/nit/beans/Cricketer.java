package com.nit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {

	private String name;
	private String jersyNo;
	private String beanId;

	public Cricketer() {
		System.out.println("Cricketer.0-param constructor");
	}

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void setName(String name) {
		System.out.println("Cricketer.setName()");
		this.name = name;
	}

	public void setJersyNo(String jersyNo) {
		System.out.println("Cricketer.setJersyNo()");
		this.jersyNo = jersyNo;
	}

	public void bowling() {
		System.out.println("Cricketer.bowling()");
		System.out.println("Mr." + name + " is bowling having jersyNO " + jersyNo);
	}

	public void fielding() {
		System.out.println("Cricketer.fielding()");
		System.out.println("Mr." + name + "is fielding having jersyNo " + jersyNo);
	}

	public void batting() {
		System.out.println("Cricketer.batting()");

		// Creating IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

//		creating dependent spring class object in Specific method of Target spring class
		CricketBat bat = ctx.getBean(beanId, CricketBat.class);

//		calling dependent class method
		int score = bat.scoreRuns();

//	   closing ApplicationContext Container	
		((AbstractApplicationContext) ctx).close();

		System.out.println("Mr." + name + " is batting  having jersyNo " + jersyNo + "  scores " + score + " runs");

	}

}

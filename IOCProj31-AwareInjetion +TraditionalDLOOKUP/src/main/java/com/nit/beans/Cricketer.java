package com.nit.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;

public class Cricketer implements ApplicationContextAware {

	private String name;
	private String jersyNo;
	private String beanId;
	private ApplicationContext applicationContext;

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

//	overriden method of ApplicationContextAware Interface
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

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

//		creating dependent spring class object in Specific method of Target spring class
		CricketBat bat = applicationContext.getBean(beanId, CricketBat.class);

//		calling dependent class method
		int score = bat.scoreRuns();

//	   closing ApplicationContext Container	
		((AbstractApplicationContext) applicationContext).close();

		System.out.println("Mr." + name + " is batting  having jersyNo " + jersyNo + "  scores " + score + " runs");

	}

}

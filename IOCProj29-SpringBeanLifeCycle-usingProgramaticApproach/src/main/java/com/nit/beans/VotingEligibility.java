package com.nit.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//class must Implements InitiazingBean(I),Diaposable(I)
public class VotingEligibility implements InitializingBean, DisposableBean {

	private String name;

	private float age;

	private Date verificationDate;

	public VotingEligibility() {
		System.out.println("VotingEligibility.0-param constructor");
	}

	public void setName(String name) {
		System.out.println("VotingEligibility.setName()");
		this.name = name;
	}

	public void setAge(float age) {
		System.out.println("VotingEligibility.setAge()");
		this.age = age;
	}

//	pedefined life cycle method or custom init() method

	public void afterPropertiesSet() {
		System.out.println("VotingEligibility.myinit()");

//		initialize those properties which are not participating in injection
		verificationDate = new Date();

//		validation logic
		if (name == null || name.equals("") || age < 18 || age > 125) {
			throw new IllegalArgumentException("Invalid Input");
		}

	}

//	b.logic
	public String checkEligibility() {
		System.out.println("VotingEligibility.checkEligibility()");
		if (age < 18)
			return "Mr./Mrs/Miss you are not Eligibility::";
		else
			return "Mr./Mrs/Miss you are not Eligibility::";

	}

//	predfined life cycle method or custom destroy() method

	public void destroy() {
		System.out.println("VotingEligibility.destroy()");
		name = null;
		age = 0;
		verificationDate = null;

	}

	@Override
	public String toString() {
		return "VotingEligibility [name=" + name + ", age=" + age + ", verificationDate=" + verificationDate + "]";
	}

}

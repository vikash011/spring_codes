package com.nit.bean;

import java.util.Date;

public class WishMessageGenerator {

	// Date - Property
	private Date date;

	static {
		System.out.println("WishMessageGenerator.Static_block");
	}

	// Constructor with parameter -using constructor injection

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.WishMessageGenerator() 1 param-constructor");
		this.date = date;
	}

	@SuppressWarnings("deprecation")
	public String wishMessage(String user) {

//		get hour of day(24 hour format)
		int d1 = date.getDate();

//		b.logic

		if (d1 < 12) {
			return "Good Morning " + user;
		} else if (d1 < 16) {
			return "Good Afternoon " + user;
		} else if (d1 < 20) {
			return "Good Evening " + user;
		} else {
			return "Good Night " + user;
		}

	}

}

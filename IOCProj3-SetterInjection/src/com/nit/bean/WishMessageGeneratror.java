
//WishMessageGenerator.java(spring bean class)
package com.nit.bean;

import java.util.Date;

public class WishMessageGeneratror {//(Target class)

	// Date property
	private Date date;

	// setter method for setter injection for (Dependent class)
	public void setDate(Date date) {
		this.date = date;
	}

	
	//Wish Message Generator Method
	public String wishMeassage(String user) {
		@SuppressWarnings("deprecation")
		int hour = date.getHours(); // 24 hour format

		// b.logic
		if (hour < 12) {
		return "GoodMorning  "+user;

		} else if (hour < 16) {
		     return "Message::Good Afternoon  "+ user;
		} else if (hour < 20) {
			return "Good Evening  "+ user;
		} else {
			return "Good Night  "+user;
		}

	}

}

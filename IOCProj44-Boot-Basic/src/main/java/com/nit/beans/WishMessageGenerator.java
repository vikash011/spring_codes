package com.nit.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("wish")
public class WishMessageGenerator {

	@Autowired
	private LocalDateTime sysDateTime;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.0-param constructor");
	}

	public String Wish(String user) {

//		getting current hour of day
		int hour = sysDateTime.getHour();

		if (hour < 12) {
			return "GoodMorning" + "  " + user;
		} else if (hour < 16) {
			return "GoodAfterNoon" + "  " + user;
		} else if (hour < 20) {
			return "GoodEvening" + "  " + user;
		} else {
			return "GoodNight" + "  " + user;
		}

	}

}

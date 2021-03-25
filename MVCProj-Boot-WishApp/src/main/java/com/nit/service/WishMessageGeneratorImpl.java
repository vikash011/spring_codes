package com.nit.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("wishService")
public class WishMessageGeneratorImpl implements IWishMessageService {

	@Override
	public String wishMessageGenerator() {

//		getting System date and time
		LocalDateTime sysdate = LocalDateTime.now();

//		getting hour of day
		int hour = sysdate.getHour() + 1;

//		b.logic

		if (hour < 12) {
			return "GoodMorning";
		} else if (hour < 16) {
			return "GoodAfterNoon";

		} else if (hour < 20) {
			return "GoodEvening";
		} else {
			return "GoodNight";
		}

	}

}

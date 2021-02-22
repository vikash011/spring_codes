package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("wish")
public class WishMessage {

	private WishMessage() {
		System.out.println("WishMessage.0-param private contaructor");
	}

	public String wishGenerator(String user) {
		return "Good Morning" + user;

	}

}

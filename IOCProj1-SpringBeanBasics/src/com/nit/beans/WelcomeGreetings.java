package com.nit.beans;

public class WelcomeGreetings {

	static {
		System.out.println("WelcomeGreetings. static block loading");
	}

	public WelcomeGreetings() {
		System.out.println("WelcomeGreetings. 0 param constructor loading");
	}

	public String welcome(String user) {

		return "welcome to Spring " + user;
	}

}

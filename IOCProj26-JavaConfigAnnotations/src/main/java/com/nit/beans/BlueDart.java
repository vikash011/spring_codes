package com.nit.beans;

import javax.inject.Named;

@Named("bdart")
public class BlueDart implements ICourier {

	@Override
	public String deliver() {
		System.out.println("BlueDart.deliver()");
		return " BlueDart";
	}

}

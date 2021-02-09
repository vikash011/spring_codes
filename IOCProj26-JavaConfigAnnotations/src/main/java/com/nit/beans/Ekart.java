package com.nit.beans;

import javax.inject.Named;

@Named("ekart")
public class Ekart implements ICourier {

	@Override
	public String deliver() {
		System.out.println("Ekart.deliver()");
		return "Ekart";
	}

}

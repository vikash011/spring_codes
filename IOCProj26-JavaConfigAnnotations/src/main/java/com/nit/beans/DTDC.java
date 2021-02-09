package com.nit.beans;

import javax.inject.Named;

@Named("dtdc")
public class DTDC implements ICourier {

	@Override
	public String deliver() {
		System.out.println("DTDC.deliver()");
		return "DTDC" ;

	}

}

package com.nit.beans;

//target Spring bean class must be abstract class
public abstract class WebContainer {

	public WebContainer() {
		System.out.println("WebContainer.0-param constructor " + this.getClass());
	}

//	this abstract method Whose return type is Dependent class Spring bean is
//implemented in proxy class generated at run time
	public abstract RequestHandler getHandler();

	public void handleRequest(String data) {

		System.out.println("WebContainer.handleRequest()");
		RequestHandler rh = getHandler();

		System.out.println("WebContainer:started handling Request with data  " + data);
		rh.processingRequest(data);
		System.out.println("WebContainer:completed hadling Request with data  " + data);

	}

}

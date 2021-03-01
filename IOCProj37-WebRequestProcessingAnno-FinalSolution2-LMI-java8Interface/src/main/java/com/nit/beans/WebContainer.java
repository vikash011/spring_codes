package com.nit.beans;


public interface WebContainer {

	public abstract RequestHandler getHandler();

	default void handleRequest(String data) {

		System.out.println("WebContainer.handleRequest()");
		RequestHandler rh = getHandler();

		System.out.println("WebContainer:started handling Request with data  " + data);
		rh.processingRequest(data);
		System.out.println("WebContainer:completed hadling Request with data  " + data);

	}

}

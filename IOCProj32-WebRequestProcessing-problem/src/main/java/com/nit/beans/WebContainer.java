package com.nit.beans;

public class WebContainer {

	private RequestHandler rh;

	public WebContainer(RequestHandler rh) {
		this.rh = rh;
	}

	public void handleRequest(String data) {

		System.out.println("WebContainer.handleRequest()");

		System.out.println("WebContainer:started handling Request with data  " + data);
		rh.processingRequest(data);
		System.out.println("WebContainer:completed hadling Request with data  " + data);

	}

}

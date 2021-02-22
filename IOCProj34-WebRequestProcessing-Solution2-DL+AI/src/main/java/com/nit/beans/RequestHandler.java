package com.nit.beans;

public class RequestHandler {

	private static int count;

	public RequestHandler() {
		System.out.println("RequestHandler.RequestHandler()");
		count++;
	}

	public void processingRequest(String data) {
		System.out.println("RequestHandler.processingRequest()");

		System.out.println("RequestHandler:processing the data with  " + data + "  having count:" + count+" "+this.hashCode());
	}

}

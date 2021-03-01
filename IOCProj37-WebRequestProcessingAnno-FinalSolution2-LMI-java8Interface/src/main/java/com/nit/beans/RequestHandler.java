package com.nit.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("handle")
@Scope("prototype")
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

package com.nit.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("container")
@Scope("singleton")
public interface WebContainer {

	@Lookup
	public abstract RequestHandler getHandler();

	default void handleRequest(String data) {

		System.out.println("WebContainer.handleRequest()");
		RequestHandler rh = getHandler();

		System.out.println("WebContainer:started handling Request with data  " + data);
		rh.processingRequest(data);
		System.out.println("WebContainer:completed hadling Request with data  " + data);

	}

}

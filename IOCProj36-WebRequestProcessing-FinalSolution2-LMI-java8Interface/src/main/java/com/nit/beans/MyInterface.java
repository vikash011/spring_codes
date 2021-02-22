package com.nit.beans;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("mi")
public interface MyInterface {

	public static Date getDate() {
		return new Date();
	}

}

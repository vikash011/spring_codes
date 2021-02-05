package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("per1") // makes java class as Spring class
public class Person1 {

//	hard coding value to fields using @value annotation 

	@Value("1001")
	private int Id;
	@Value("Ramesh")
	private String Name;
	@Value("Kolkatta")
	private String Addr;
	@Value("78.76f")
	private float Age;

	@Override
	public String toString() {
		return "Person1 [Id=" + Id + ", Name=" + Name + ", Addr=" + Addr + ", Age=" + Age + "]";
	}

}

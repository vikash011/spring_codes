package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component("per2") // makes java class as Spring class

//@PropertySource("com/nit/commons/myfile1.properties")
//@PropertySource("com/nit/commons/myfile2.properties")

@PropertySource(value= {"com/nit/commons/myfile1.properties","com/nit/commons/myfile2.properties"})

//@PropertySources(value = { @PropertySource("com/nit/commons/myfile1.properties"),
// @PropertySource("com/nit/commons/myfile2.properties") }) //
// RepeatableAnnotations allowed from java 8
public class Person2 {

//	injecting value to fields using @value annotation 

	@Value("${per.id}") // injecting values using properties placeholder
	private int Id;

	@Value("${per.name}") // injecting values using properties placeholder
	private String Name;

	@Value("${per.addr}") // injecting values using properties placeholder
	private String Addr;

	@Value("${per.age}") // injecting values using properties placeholder
	private float Age;

	@Override
	public String toString() {
		return "Person2 [Id=" + Id + ", Name=" + Name + ", Addr=" + Addr + ", Age=" + Age + "]";
	}

}

package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.model.Person;

@SpringBootApplication
public class IocProj48BootConfigurationPropertiesApplication {

	public static void main(String[] args) {
//		crating IOC container
		ApplicationContext ctx = SpringApplication.run(IocProj48BootConfigurationPropertiesApplication.class, args);

//		creating Person class Object
		Person per = ctx.getBean("per", Person.class);
		System.out.println(per);

	}

}

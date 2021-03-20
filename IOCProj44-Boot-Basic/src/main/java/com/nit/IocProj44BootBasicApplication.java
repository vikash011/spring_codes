package com.nit;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.beans.WishMessageGenerator;

@SpringBootApplication
public class IocProj44BootBasicApplication {

	@Bean("dt")
	public LocalDateTime createDateTime() {
		System.out.println("IocProj44BootBasicApplication.createDateTime()");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {

//		creating IOC container
		ApplicationContext ctx = SpringApplication.run(IocProj44BootBasicApplication.class, args);

//		creating Object for Target class
		WishMessageGenerator wmg = ctx.getBean("wish", WishMessageGenerator.class);

//		invoke method
		String result = wmg.Wish("vikash");
		System.out.println(result);

		((ConfigurableApplicationContext) ctx).close();
	}

}

package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nit.service.BankService;

@SpringBootApplication
public class AopProj14BootAroundAdviceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AopProj14BootAroundAdviceApplication.class, args);

//	creating Object for service class
		BankService proxy = ctx.getBean("bank", BankService.class);

//		invoking method
		System.out.println("simple Interest is::" + proxy.calSimpleInterestAmount(1324525d, 5, 8));
		System.out.println();
		System.out.println("compound Interest is::" + proxy.calCompoundInterestAmount(56565, 6, 9));

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");

		System.out.println("simple Interest is::" + proxy.calSimpleInterestAmount(1324525d, 5, 8));
		System.out.println();
		System.out.println("simple Interest is::" + proxy.calSimpleInterestAmount(1324525d, 5, 8));

//		close IOC container
		((AbstractApplicationContext) ctx).close();
	}

}

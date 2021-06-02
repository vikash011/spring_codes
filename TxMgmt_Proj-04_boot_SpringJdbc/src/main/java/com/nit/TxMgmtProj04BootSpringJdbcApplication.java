package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.service.IBankMgmtService;

@SpringBootApplication
public class TxMgmtProj04BootSpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(TxMgmtProj04BootSpringJdbcApplication.class, args);

		IBankMgmtService proxy = ctx.getBean("bankService", IBankMgmtService.class);

		try {
			System.out.println(proxy.moneyTransfer(1001, 1003, 5000));
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		}

		((ConfigurableApplicationContext) ctx).close();

	}

}

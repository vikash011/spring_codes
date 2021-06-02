package com.nit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.service.IBankMgmtService;

public final class LocalTxMgmt_SpringJdbc_100Code_Test {

	public static void main(String[] args) {

		// creating IOC
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		IBankMgmtService proxy = ctx.getBean("bankService", IBankMgmtService.class);

		try {
			System.out.println(proxy.moneyTransfer(1001, 1002, 5000));
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		}

		ctx.close();

	}

}

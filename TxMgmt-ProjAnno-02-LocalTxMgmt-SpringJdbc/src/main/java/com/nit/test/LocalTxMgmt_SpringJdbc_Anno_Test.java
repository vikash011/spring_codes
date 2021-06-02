package com.nit.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.service.IBankMgmtService;

public final class LocalTxMgmt_SpringJdbc_Anno_Test {

	public static void main(String[] args) {

		// creating IOC

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

		IBankMgmtService proxy = ctx.getBean("bankService", IBankMgmtService.class);

		try {
			System.out.println(proxy.moneyTransfer(1001, 1002, 5000));
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		}
		
		ctx.close();

	}

}

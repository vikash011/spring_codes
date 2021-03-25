package com.nit;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.AbstractApplicationContext;

import com.nit.controller.BankController;
import com.nit.vo.CustomerVO;

@SpringBootApplication
@ImportResource("com/nit/cfgs/applicationContext.xml")
public class IocProj44BootLayeredAppCustomerApplication {

	public static void main(String[] args) {
//		creating IOC container
		ApplicationContext ctx = SpringApplication.run(IocProj44BootLayeredAppCustomerApplication.class, args);

		BankController controller = ctx.getBean("BankController", BankController.class);

//		read Inputs from End user
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		String cName = scn.next();

		System.out.println("Enter Customer Address:");
		String cAddr = scn.next();

		System.out.println("Enter Principle Amount:");
		String pAmt = scn.next();

		System.out.println("Enter Time:");
		String time = scn.next();

		System.out.println("Enter Rate:");
		String rate = scn.next();

//		closing Scanner class object
		scn.close();

//		creating CustomerVO object to Send End User Input values
		CustomerVO vo = new CustomerVO();

		vo.setCName(cName);
		vo.setCAddr(cAddr);
		vo.setPAmt(pAmt);
		vo.setRate(rate);
		vo.setTime(time);

//		use Controller class
		try {
			String result = controller.processCustomer(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Problem in Customer Registration");
			e.printStackTrace();
		}

		((AbstractApplicationContext) ctx).close();

	}// main

}

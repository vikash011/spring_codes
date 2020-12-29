package com.nit.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.controller.BankController;
import com.nit.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {

//		creating IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");

//		creating BankController Class Object
		BankController controller = factory.getBean("BankController", BankController.class);

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

		vo.setcName(cName);
		vo.setcAddr(cAddr);
		vo.setpAmt(pAmt);
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

	}// main

}// class

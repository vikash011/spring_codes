package com.nit.advice;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Date;

public class EnquiryAuditAdvice {

	public void enquiry(String custName, String model, double price) throws Throwable {

		String auditMessage = null;

		System.out.println("EnquiryAdvice.enquiry()--started");

		System.out.println(custName + " " + model + " " + price);

		auditMessage = custName + " buys  car of model " + model + " with price " + price + "::" + new Date();

//		creating writer object to generated enquiry audit  message  into file

		Writer writer = new FileWriter("c://vikash/logs/enquiry_audit.txt", true);
		writer.write(auditMessage + "\n");
		writer.flush();
		writer.close();

		System.out.println("EnquiryAdvice.enquiry()--ended");

	}

}

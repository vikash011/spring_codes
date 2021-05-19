package com.nit.advice;

import java.io.FileWriter;
import java.io.Writer;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class EnquiryAuditAdvice {

	@Before(value = "execution(String com.nit.service.ShowRoom.*(..))")
	public void enquiry(JoinPoint jp) throws Throwable {

		String auditMessage = null;

		System.out.println("EnquiryAdvice.enquiry()--started");

		Object[] args = jp.getArgs();
		System.out.println(args[0] + " " + args[1] + " " + args[2]);

		auditMessage = args[0] + " buys  car of model " + args[1] + " with price " + args[2];

//		creating writer object to generated enquiry audit  message  into file

		Writer writer = new FileWriter("c://vikash/logs/enquiry_audit.txt", true);
		writer.write(auditMessage + "\n");
		writer.flush();
		writer.close();

		System.out.println("EnquiryAdvice.enquiry()--ended");

	}

}

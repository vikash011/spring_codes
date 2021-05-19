package com.nit.advice;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.nit.exception.InternalProblemException;

@Component
@Aspect
@EnableAspectJAutoProxy
public class CommonExceptionLogger_Translator {

	@AfterThrowing(value = "execution(double com.nit.service.Shopping.*(..))", throwing = "iae")
	public void loggerException(JoinPoint jp, IllegalArgumentException iae) throws Throwable {

		System.out.println("CommonExceptionLogger_Translator.loggerException()");

//		generating CommonExceptionLogger in file
		Writer writer = new FileWriter("C://Vikash/logs/commonExceptionLogger.txt");
		writer.write(jp.getSignature() + " with args" + Arrays.toString(jp.getArgs()) + " throws " + iae + "\n");
		writer.flush();
		writer.close();

//		Exception Translation/Graphing
		throw new InternalProblemException(
				jp.getSignature() + " with args" + Arrays.toString(jp.getArgs()) + " throws" + iae + "\n");

	}

}

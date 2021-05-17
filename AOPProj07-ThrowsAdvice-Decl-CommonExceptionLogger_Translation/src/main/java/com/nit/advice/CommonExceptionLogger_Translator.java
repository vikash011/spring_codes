package com.nit.advice;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

import com.nit.exception.InternalProblemException;

public class CommonExceptionLogger_Translator {

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

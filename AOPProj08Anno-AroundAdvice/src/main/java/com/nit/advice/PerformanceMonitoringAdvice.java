package com.nit.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class PerformanceMonitoringAdvice {

	@Around(value = "execution(double com.nit.service.BankService.*(..))")
	public Object performance(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("PerformanceMonitoringAdvice.performance()__before entering");
//        Pre logic
		long start = System.currentTimeMillis();

//		controlling Target class method arguments
		Object args[] = pjp.getArgs();
		if ((double) args[0] <= 50000) {
			args[1] = (double) args[1] - 0.5;
		}

//      controlling Target class method Execution

		if ((double) args[0] <= 0 || (double) args[1] <= 0 || (double) args[2] <= 0) {
			throw new IllegalArgumentException("invalid Inputs");
		}

		Object retVal = pjp.proceed(args);// call target call primary logic

//		post Logic
		long end = System.currentTimeMillis();

		System.out.println("PerformanceMonitoringAdvice.performance()__after exit");

		System.out.println(
				pjp.getSignature() + "has taken" + (end - start) + " ms with" + Arrays.toString(pjp.getArgs()));
		return retVal;

	}

}

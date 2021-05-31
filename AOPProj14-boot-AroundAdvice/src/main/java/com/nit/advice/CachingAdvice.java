package com.nit.advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CachingAdvice {

//	creating  HashMap for caching
	private Map<String, Object> cacheMap = new HashMap<>();

	@Around(value = "execution( double com.nit.service.BankService.*(..))")
	public Object caching(ProceedingJoinPoint pjp) throws Throwable {

		Object retVal = null;

//		prepare Key
		String key = pjp.getSignature() + Arrays.deepToString(pjp.getArgs());

		if (!cacheMap.containsKey(key)) {// checking Key present in cache or not

			retVal = pjp.proceed(); // collecting Output

			cacheMap.put(key, retVal); // putting key,value in the cache

			System.out.println("from Target Class b.method");

		} else {
			retVal = cacheMap.get(key);// collecting value from cache
			System.out.println(" from  collecting Value from Cache");

		}

		return retVal;

	}

}

package com.nit.advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

public class CachingAdvice {

//	creating  Hashmap for caching
	private Map<String, Object> cacheMap = new HashMap<>();

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

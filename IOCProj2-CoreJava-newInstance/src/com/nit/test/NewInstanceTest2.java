package com.nit.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceTest2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// loading class
		Class<?> c = Class.forName(args[0]);

		// getting all Declared constructors
		@SuppressWarnings("rawtypes")
		Constructor[] cons = c.getDeclaredConstructors();

		// creating first object using newInstance() of Constructor class and printing
		Object obj1 = cons[0].newInstance();
		System.out.println("obj1 data::" + obj1);
		
		//creating second object using newInstance() of Constructor class and printing 
		Object obj2 = cons[1].newInstance(10,20);
		System.out.println("obj2 data::"+obj2);

	}

}

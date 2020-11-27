package com.nit.test;

import com.nit.bean.Test;

public class NewInstanceTest1 {

	public static void main(String[] args)
			throws ClassNotFoundException, IllegalAccessException, InstantiationException {

		// loading class
		Class<?> c = Class.forName(args[0]);
		

		// object creation of loading class
		@SuppressWarnings("deprecation")
		Test t1 = (Test) c.newInstance();
		
        //Printing Test class Object Data
		System.out.println("t1 object data::"+t1);
		
	}

}

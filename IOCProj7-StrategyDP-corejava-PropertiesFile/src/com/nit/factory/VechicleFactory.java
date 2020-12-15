package com.nit.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import com.nit.comps.IEngine;
import com.nit.comps.Vechicle;

public class VechicleFactory {

	private static Properties props;

	static {

		try {
//	locating properties file and creating  InputStraem connection		
			InputStream is = new FileInputStream("src/com/nit/commons/Strategy.properties");

//			creating Properties Object
			props = new Properties();

//			loading Properties  file 
			props.load(is);

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();

		} catch (IOException io) {
			io.printStackTrace();
		}

	}

	@SuppressWarnings("rawtypes")
	public static Vechicle getInstance() {

		Vechicle vcle = null;

		try {
//			loading Properties file value(Dependent class name from properties file)
			String dependentclazz = props.getProperty("dependent.className");

//	    	loading dependent class  	
			Class clazz = Class.forName(dependentclazz);

//       	getting all declared contructor in the loaded class 	    
			Constructor[] cons = clazz.getConstructors();

//          creating dependent class object
			IEngine engg = (IEngine) cons[0].newInstance();

//			creating Target class object
			vcle = new Vechicle();
//         invoking method(assigning dependent class object to target class using setter method) 			
			vcle.setEngg(engg);

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (InvocationTargetException ite) {
			ite.printStackTrace();

		} catch (InstantiationException ie) {

			ie.printStackTrace();
		} catch (IllegalAccessException iae) {

			iae.printStackTrace();
		} catch (IllegalArgumentException iae) {

			iae.printStackTrace();
		}
		return vcle;

	}

}

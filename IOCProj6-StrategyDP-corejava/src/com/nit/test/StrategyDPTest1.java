package com.nit.test;

import com.nit.comps.Vechicle;
import com.nit.factory.VechicleFactory;

public class StrategyDPTest1 {

	public static void main(String[] args) {

		try {
//		getting target class object(Vechicle class object)
			Vechicle vehicle = VechicleFactory.getInstance("diesel");
			//Vechicle vehicle = VechicleFactory.getInstance("petrol");
			//Vechicle vehicle = VechicleFactory.getInstance("CNG");
          
//      invoking method		
			vehicle.journey("lucknow", "hyderabad");
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();

		}

	}

}

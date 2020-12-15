package com.nit.test;

import com.nit.comps.Vechicle;
import com.nit.factory.VechicleFactory;

public class StrategyDPTest1 {

	public static void main(String[] args) {
		
		Vechicle vehicle = VechicleFactory.getInstance();
		vehicle.journey("lucknow", "Hyderabad");
	}

}

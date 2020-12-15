
//VehicleFactory.java
package com.nit.factory;

import com.nit.comps.CNGEngine;
import com.nit.comps.DieselEngine;
import com.nit.comps.IEngine;
import com.nit.comps.PetrolEngine;
import com.nit.comps.Vechicle;

public class VechicleFactory {

	public static Vechicle getInstance(String enggType) {
		IEngine engg = null;

		// Creating Dependent class object
		if (enggType.equalsIgnoreCase("petrol")) {
			engg = new PetrolEngine();
		} else if (enggType.equalsIgnoreCase("CNG")) {
			engg = new CNGEngine();
		} else if (enggType.equalsIgnoreCase("Diesel")) {
			engg = new DieselEngine();
		} else {
			throw new IllegalArgumentException("Invalid engine Type");

		}

		// creating Target class object
		Vechicle vcle = new Vechicle();

		// assigning dependent class to target class
		vcle.setEngg(engg);

		return vcle;

	}

}

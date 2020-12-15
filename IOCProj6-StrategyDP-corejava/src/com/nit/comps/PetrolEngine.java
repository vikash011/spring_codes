//PetrolEngine.java(dependent class=> sub class)
package com.nit.comps;

public final class PetrolEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("PetrolEngine.start()");

	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop()");

	}

}

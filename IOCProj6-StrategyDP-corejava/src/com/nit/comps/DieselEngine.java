//DieselEngine.java(dependent class=> sub class)

package com.nit.comps;

public final class DieselEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("DieselEngine.start()");

	}

	@Override
	public void stop() {
		System.out.println("DeiselEngine.stop()");

	}

}

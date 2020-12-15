
//Vehicle.java(target class)
package com.nit.comps;

public class Vechicle {

	private IEngine engg;

	public void setEngg(IEngine engg) {
		this.engg = engg;
	}

	public void journey(String source, String destination) {
		engg.start();
		System.out.println("journey started at " + source);
		System.out.println("journey is going on....");
		engg.stop();
		System.out.println("journey ended at " + destination);

	}

}

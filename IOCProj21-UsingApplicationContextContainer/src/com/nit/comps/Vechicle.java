
//Vehicle.java(target class)
package com.nit.comps;

public class Vechicle {

	private IEngine engg;
	private String type;

	public void setType(String type) {
		this.type = type;
	}

	public Vechicle(IEngine engg) {
		this.engg = engg;
	}

	public void journey(String source, String destination) {
		engg.start();
		System.out.println("journey started at " + source+"  with  "+type);
		System.out.println("journey is going on....");
		engg.stop();
		System.out.println("journey ended at " + destination+"   with   "+type);

	}

}

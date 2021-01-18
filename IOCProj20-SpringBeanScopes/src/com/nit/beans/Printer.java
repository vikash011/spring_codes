package com.nit.beans;

public class Printer {

	private static Printer INSTANCE; // static reference variable

	private Printer() { // private Constructor

	}

	public static Printer getInstance() { // getInstance() that returns only one Object
		if (INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}

//	b.logic
	public void printData(String message) {
		System.out.println(message);

	}

}

package com.nit.test;

import com.nit.beans.Printer;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer1 = Printer.getInstance();
		Printer printer2 = Printer.getInstance();

		System.out.println(printer1.hashCode() + "  " + printer2.hashCode());// same hashcode due on Object

		//Printer printer = new Printer();//throws error due to Constructor is Private
		
	}
}

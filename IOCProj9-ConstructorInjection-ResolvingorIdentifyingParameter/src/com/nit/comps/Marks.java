/*
 * Constructor Injection with index
 * 

*/
package com.nit.comps;

public class Marks {

	private int marks1;
	private int marks2;
	private int marks3;

	public Marks(int marks1, int marks2, int marks3) {
		System.out.println("Marks. 3 param construtor Marks()");
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	@Override
	public String toString() {
		return "Marks [marks1=" + marks1 + ", marks2=" + marks2 + ", marks3=" + marks3 + "]";
	}
	
	

}

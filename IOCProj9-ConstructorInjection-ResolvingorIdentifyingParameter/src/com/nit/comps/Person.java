package com.nit.comps;

public class Person {

	private int pid;
	private String pname;
	private long phone;

	public Person(int pid, String pname, long phone) {
		System.out.println("Person.3-param construtor Person()");
		this.pid = pid;
		this.pname = pname;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", phone=" + phone + "]";
	}
	

}

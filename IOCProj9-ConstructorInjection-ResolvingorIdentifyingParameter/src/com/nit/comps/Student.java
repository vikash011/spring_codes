package com.nit.comps;

public class Student {

	private int sno;
	private String sname;
	private String saddres;
	private float savg;


	public Student(int sno, String sname, String saddres, float savg) {
		System.out.println("Student.4-param constructor Student() ");

		this.sno = sno;
		this.sname = sname;
		this.saddres = saddres;
		this.savg = savg;
	}

	public Student(int sno, String sname, String saddres) {
		System.out.println("Student. 3-param constructor Student()");
		this.sno = sno;
		this.sname = sname;
		this.saddres = saddres;
	}

	public Student(int sno, String sname) {
	System.out.println("Student.2-param contructor Student()");
		this.sno = sno;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", saddres=" + saddres + ", savg=" + savg + "]";
	}

}

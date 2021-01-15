package com.nit.beans;

import java.util.Date;

public class PersonInfo {

	private String pName;
	private String pAddress;
	private Date dob;
	private Date doj;
	private Date dom;

	public PersonInfo(String pName, String pAddress, Date dob, Date doj, Date dom) {
		
		this.pName = pName;
		this.pAddress = pAddress;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "PersonInfo [pName=" + pName + ", pAddress=" + pAddress + ", dob=" + dob + ", doj=" + doj + ", dom="
				+ dom + "]";
	}

}

//NullInjection using SetterMethod

package com.nit.beans;

import java.util.Date;

public class Info {
	
	private Date doj ;// new Date();//initialize with default sysDate

	public void setDoJ(Date doJ) {
		doj = doJ;
	}

	@Override
	public String toString() {
		return "Info [DoJ=" + doj + "]";
	}

	
	
	
}

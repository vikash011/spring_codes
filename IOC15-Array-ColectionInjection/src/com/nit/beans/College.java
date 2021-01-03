
//College.java
//Array Injection
package com.nit.beans;

import java.util.Arrays;
import java.util.Date;

public class College {

	private String[] favStudent;
	private Date[] impDate;

	public void setFavStudent(String[] favStudent) {
		this.favStudent = favStudent;
	}

	public void setImpDate(Date[] impDate) {
		this.impDate = impDate;
	}

	@Override
	public String toString() {
		return "College [favStudent=" + Arrays.toString(favStudent) + ", impDate=" + Arrays.toString(impDate) + "]"

				+ "-->" + favStudent.getClass();
	}

}

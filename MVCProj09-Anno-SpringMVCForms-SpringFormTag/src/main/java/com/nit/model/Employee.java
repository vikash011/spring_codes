package com.nit.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer empid = 1001;
	private String empName = "Teja";
	private Double empsal = 20000.0;
	private String empJOB = "Clerk";

	public Employee() {
		System.out.println("Employee.Employee()");
	}

}

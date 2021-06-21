package com.nit.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer empid;
	private String empName;
	private Double empsal;
	private String empJOB;

	public Employee() {
		System.out.println("Employee.Employee()");
	}

}

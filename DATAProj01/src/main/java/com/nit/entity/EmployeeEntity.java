package com.nit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

	@Id
	private Integer empId;
	private String empName;
	private Float empSal;

}

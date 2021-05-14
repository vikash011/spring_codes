package com.nit.repo;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.EmployeeEntity;

public interface EmployeeRepo extends CrudRepository<EmployeeEntity, Integer> {

//	creating findBy method
//	select * from EmployeeEntity where emp_Name="name";
	public EmployeeEntity findByEmpName(String name);

	public EmployeeEntity findByEmpNameAndEmpSal(String name, Float sal);

}

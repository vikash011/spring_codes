package com.nit.service;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public interface IEmployeeServiceMgmt {

	public int fetchEmpCount();

	public List<Map<String, Object>> fetchEmployeeByDesgs(String deseg1, String deseg2, String deseg3);

	public float fetchEmployeeSalByEmpno(int empno);

	public Map<String, Object> fetchEmployeeDetailsByEmpno(int empno);

	public SqlRowSet fetchEmployeeDeatailsBySalRange(Float startSalary, Float endSalary);

	public String addEmployee(int empno, String ename, Float sal, String job);

	public String modifyEmployeeSalById(Float newSal, int empno);

	public String fireEmployeeBySalrange(Float startSal, Float endSal);

	public String hikeSalaryById(int empno, Float incrPercent);
}

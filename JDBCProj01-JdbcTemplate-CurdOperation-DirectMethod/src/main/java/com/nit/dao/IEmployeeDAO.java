package com.nit.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public interface IEmployeeDAO {

	public int getEmpCount();

	public List<Map<String, Object>> getEmployeeDetailsByDesgs(String deseg1, String deseg2, String deseg3);

	public float getEmployeeSalByEmpno(int empno);

	public Map<String, Object> getEmployeeDetailsByEmpno(int empno);

	public SqlRowSet getEmployeesDeatilsBySalaryRange(Float startSalary, Float endSalary);

	public int insertEmployee(int empno, String ename, Float sal, String job);

	public int updateEmployeeSalBYEmpId(Float newSal, int empno);

	public int deleteEmployeeBySalRange(Float startSal, Float endSal);

}

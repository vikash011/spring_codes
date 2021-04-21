package com.nit.service;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.nit.dao.IEmployeeDAO;

public class EmployeeServiceMgmtImpl implements IEmployeeServiceMgmt {

	private IEmployeeDAO dao;

	public EmployeeServiceMgmtImpl(IEmployeeDAO dao) {
		System.out.println("EmployeeServiceMgmtImpl.1-parmam constructor");
		this.dao = dao;
	}

	@Override
	public int fetchEmpCount() {
		System.out.println("EmployeeServiceMgmtImpl.fetchEmpCount()");
//		use DAO
		int count = dao.getEmpCount();

		return count;
	}

	@Override
	public List<Map<String, Object>> fetchEmployeeByDesgs(String deseg1, String deseg2, String deseg3) {
		List<Map<String, Object>> list = dao.getEmployeeDetailsByDesgs(deseg1, deseg2, deseg3);
		return list;
	}

	@Override
	public float fetchEmployeeSalByEmpno(int empno) {
		float sal = dao.getEmployeeSalByEmpno(empno);
		return sal;
	}

	@Override
	public Map<String, Object> fetchEmployeeDetailsByEmpno(int empno) {
		Map<String, Object> map = dao.getEmployeeDetailsByEmpno(empno);
		return map;
	}

	@Override
	public SqlRowSet fetchEmployeeDeatailsBySalRange(Float startSalary, Float endSalary) {
		SqlRowSet srs = dao.getEmployeesDeatilsBySalaryRange(startSalary, endSalary);
		return srs;
	}

	@Override
	public String addEmployee(int empno, String ename, Float sal, String job) {
		int result = dao.insertEmployee(empno, ename, sal, job);
		return result == 0 ? "problem in employee adding" : "employee added sucessfully";
	}

	@Override
	public String modifyEmployeeSalById(Float newSal, int empno) {
		int result = dao.updateEmployeeSalBYEmpId(newSal, empno);
		return result == 0 ? "problem in updating  Employee salary" : "updating Employee salary sucessfully";
	}

	@Override
	public String fireEmployeeBySalrange(Float startSal, Float endSal) {
		int count = dao.deleteEmployeeBySalRange(startSal, endSal);
		return count == 0 ? "No employee deleted in salRange" : "Employee deleted in salRange having count " + count;
	}

	@Override
	public String hikeSalaryById(int empno, Float incrPercent) {

//		getting oldSal from DB
		Float oldSal = dao.getEmployeeSalByEmpno(empno);

//		increment salary
		Float newSal = oldSal + (oldSal * incrPercent) / 100;

		int count = dao.updateEmployeeSalBYEmpId(newSal, empno);

		return count == 1 ? "Employee  salary updated with newSalary" + newSal : "Problem in updating Employee salary";
	}

}

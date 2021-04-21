package com.nit.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String Emp_select_Querry = "select count(*) from Emp";
	private static final String Emp_Details_by_Desgs = "select empno,ename,job,sal from emp where job in (?,?,?)";
	private static final String Emp_Sal_By_Empno = "select sal from emp where empno=?";
	private static final String Emp_Deatils_By_EmpNo = "select empno,ename,sal,hiredate,job,comm,deptno from emp where empno=?";
	private static final String Get_Emp_Deatils_by_salrange = "select empno,ename,sal,job,hiredate from emp where sal>=? and sal<=?";
	private static final String insert_employee = "insert into emp(empno,ename,sal,job) values(?,?,?,?)";
	private static final String update_Emp_sal_ByEmpId = "update emp set sal=? where empno=?";
	private static final String delete_Emp_By_SalRange = "delete  from emp where sal>=? and sal<=?";

	private JdbcTemplate jt;

	public EmployeeDAOImpl(JdbcTemplate jt) {
		System.out.println("EmployeeDAOImpl.1-parma constructor");
		this.jt = jt;
	}

	@Override
	public int getEmpCount() {
		System.out.println("EmployeeDAOImpl.getEmpCount()");
		int count = jt.queryForObject(Emp_select_Querry, Integer.class);
		return count;
	}

	@Override
	public List<Map<String, Object>> getEmployeeDetailsByDesgs(String deseg1, String deseg2, String deseg3) {
		List<Map<String, Object>> list = jt.queryForList(Emp_Details_by_Desgs, deseg1, deseg2, deseg3);
		return list;
	}

	@Override
	public float getEmployeeSalByEmpno(int empno) {
		float sal = jt.queryForObject(Emp_Sal_By_Empno, Float.class, empno);
		return sal;
	}

	@Override
	public Map<String, Object> getEmployeeDetailsByEmpno(int empno) {
		Map<String, Object> map = jt.queryForMap(Emp_Deatils_By_EmpNo, empno);
		return map;
	}

	@Override
	public SqlRowSet getEmployeesDeatilsBySalaryRange(Float startSalary, Float endSalary) {
		SqlRowSet srs = jt.queryForRowSet(Get_Emp_Deatils_by_salrange, startSalary, endSalary);
		return srs;
	}

	@Override
	public int insertEmployee(int empno, String ename, Float sal, String job) {
		int count = jt.update(insert_employee, empno, ename, sal, job);
		return count;
	}

	@Override
	public int updateEmployeeSalBYEmpId(Float newSal, int empno) {
		int count = jt.update(update_Emp_sal_ByEmpId, newSal, empno);
		return count;
	}

	@Override
	public int deleteEmployeeBySalRange(Float startSal, Float endSal) {
		int result = jt.update(delete_Emp_By_SalRange, startSal, endSal);
		return result;
	}

}

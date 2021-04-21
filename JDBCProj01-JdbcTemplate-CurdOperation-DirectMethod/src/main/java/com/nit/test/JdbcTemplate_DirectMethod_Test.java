package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.nit.service.EmployeeServiceMgmtImpl;
import com.nit.service.IEmployeeServiceMgmt;

public class JdbcTemplate_DirectMethod_Test {

	public static void main(String[] args) {

//		creating IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");

//		creating service class object
		IEmployeeServiceMgmt service = ctx.getBean("empService", EmployeeServiceMgmtImpl.class);

//		invoking method

		try {
			int result = service.fetchEmpCount();

			System.out.println("Employee count is::" + result);

		} catch (DataAccessException e) {
			e.printStackTrace();
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++==");
		try {
//		System.out.println(
//					"Employee details by Designation:" + service.fetchEmployeeByDesgs("Clerk", "Manger", "Salesman"));

			System.out.println("Clerk deatils are:");
			service.fetchEmployeeByDesgs("Clerk", "Manger", "Salesman").forEach(map -> {
				map.entrySet().forEach(row -> {
					System.out.println(row.getKey() + " " + row.getValue());
				});
				System.out.println("\n");
			});
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");

		} catch (DataAccessException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("Employee sal for empno:7499:" + service.fetchEmployeeSalByEmpno(7499));
		} catch (DataAccessException e) {
			e.printStackTrace();
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");

		try {
			// System.out.println("Employee details having empno 7499 is:" +
			// service.fetchEmployeeDetailsByEmpno(7499));
			System.out.println("Employee details having empno 7499:\n");
			service.fetchEmployeeDetailsByEmpno(7499).entrySet().forEach(map -> {
				System.out.println(map.getKey() + " " + map.getValue());
			});

		} catch (DataAccessException e) {
			e.printStackTrace();
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");

		try {
			System.out.println("Empoyee details having having sal range::1200 to 2500");
			SqlRowSet srs = service.fetchEmployeeDeatailsBySalRange(1200.0f, 2500.0f);

			while (srs.next()) {
				System.out.println(srs.getInt(1) + " " + srs.getString(2) + " " + srs.getFloat(3) + " "
						+ srs.getString(4) + " " + srs.getString(5));
			}

		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
		try {

			System.out.println("adding employee details having empno:5766 ename:raja,sal:1500.0f,job:housekeeping");
			String result = service.addEmployee(5766, "raja", 1500.0f, "housekeeping");
			System.out.println(result);

		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");

		try {
			System.out.println("updating employee newsSalary:24500.f for empno:5766");
			String result = service.modifyEmployeeSalById(24500.0f, 5766);
			System.out.println(result);

		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
//
//		try {
//
//			System.out.println("firing Employee having SalRange startSal:20000,endSal:25000");
//			String result = service.fireEmployeeBySalrange(20000.0f, 25000.0f);
//			System.out.println(result);
//
//		} catch (DataAccessException dae) {
//			dae.printStackTrace();
//		}

		try {

			System.out.println("salary hike for Employee having empno:5766 with increment:10%");
			String result = service.hikeSalaryById(5766, 10.0f);
			System.out.println(result);

		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}

		((AbstractApplicationContext) ctx).close();

	}

}

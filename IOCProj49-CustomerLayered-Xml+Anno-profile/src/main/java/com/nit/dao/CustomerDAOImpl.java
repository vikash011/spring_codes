package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nit.bo.CustomerBO;

@Repository("custDAO")
@Profile({ "dev", "test", "prod", "uat" })
public class CustomerDAOImpl implements ICustomerDAO {

	private static final String CUSTOMER_LAYERD_INSERT_QUERY = "INSERT INTO customer_layered_db (CNAME,CADDR,PAMT,RATE,TIME,INTRAMT) VALUES(?,?,?,?,?,?)";

	@Autowired
	private DataSource ds;

	@Override
	public int insert(CustomerBO bo) throws Exception {

//		getting DataSource
		System.out.println("DataSource class name::" + ds.getClass().getName());

//		get Jdbc pooled Connection
		Connection con = ds.getConnection();
//      creating prepared statement object 
		PreparedStatement ps = con.prepareStatement(CUSTOMER_LAYERD_INSERT_QUERY);

//		setting query parameter values
		ps.setString(1, bo.getCName());
		ps.setString(2, bo.getCAddr());
		ps.setFloat(3, bo.getIntrAmt());
		ps.setFloat(4, bo.getRate());
		ps.setFloat(5, bo.getTime());
		ps.setFloat(6, bo.getIntrAmt());

//		inserting record
		int count = ps.executeUpdate();

//		closing jdbc objects
		ps.close();
		con.close();

		return count;
	}
}

package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nit.bo.CustomerBO;

public class CustomerDAOImpl implements ICustomerDAO {

	private static final String CUSTOMER_LAYERD_INSERT_QUERY = "INSERT INTO customer_layered_db (CNAME,CADDR,PAMT,RATE,TIME,INTRAMT) VALUES(?,?,?,?,?,?)";

	private DataSource ds;

	public CustomerDAOImpl(DataSource ds) {
		this.ds = ds;

	}

	@Override
	public int insert(CustomerBO bo) throws Exception {

//		get Jdbc pooled Connection
		Connection con = ds.getConnection();
//      creating prepared statement object 
		PreparedStatement ps = con.prepareStatement(CUSTOMER_LAYERD_INSERT_QUERY);

//		setting query parameter values
		ps.setString(1, bo.getcName());
		ps.setString(2, bo.getcAddr());
		ps.setFloat(3, bo.getpAmt());
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

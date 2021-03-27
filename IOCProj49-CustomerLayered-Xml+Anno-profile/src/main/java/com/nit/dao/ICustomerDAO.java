package com.nit.dao;

import com.nit.bo.CustomerBO;

public interface ICustomerDAO {

	public int insert(CustomerBO bo) throws Exception;
}

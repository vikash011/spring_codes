package com.nit.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository("logindao")
public class AuthenticationDAOImpl implements IAuthenticationDAO {

	@Autowired
	private SimpleJdbcCall sjc;

	public AuthenticationDAOImpl() {
		System.out.println("AuthenticationDAOImpl.0-param constructor");
	}

	@Override
	public String authenticate(String user, String pwd) {

//		setting name of Stored Procedure
		sjc.setProcedureName("p_Authentication");

//		creating Map of in parameter
		Map<String, Object> inParam = Map.of("USER", user, "PASS", pwd);

//		creating Map of Out parameter/execute PL/SQL Procedure
		Map<String, Object> outParam = sjc.execute(inParam);

//		checking whether "result" key as OutParm is present
		Boolean isResultAsKey = outParam.containsKey("result");
		System.out.println(isResultAsKey);

//		gathering result as Map Object 
		Object result = outParam.get("result");

		return (String) result;
	}

}

package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.IAuthenticationDAO;

@Service("loginservice")
public class loginMgmtServiceImpl implements ILoginMgmtService {

	@Autowired
	private IAuthenticationDAO dao;

	public loginMgmtServiceImpl() {
		System.out.println("loginMgmtServiceImpl.0-param contsructor");
	}

	@Override
	public String login(String user, String pass) {

//		use DAO
		String result = dao.authenticate(user, pass);

		return result;
	}

}

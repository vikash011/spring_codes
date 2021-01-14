package com.nit.service;

import com.nit.bo.CustomerBO;
import com.nit.dao.ICustomerDAO;
import com.nit.dto.CustomerDTO;

public class   CustomerMgmtServiceImpl implements ICustomerMgmtService {

	private ICustomerDAO dao;

	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String generateSimpleInterestAmount(CustomerDTO dto) throws Exception {

//		b.logic to calculate simple interest using pAmt,rate,time

		float intrAmt = (dto.getpAmt() * dto.getRate() * dto.getTime()) / 100.0f;

//		creating CustomerBo class object 
		CustomerBO bo = new CustomerBO();

		bo.setcName(dto.getcName());
		bo.setcAddr(dto.getcAddr());
		bo.setpAmt(dto.getpAmt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntrAmt(intrAmt);

//		use DAO
		int count = dao.insert(bo);

		return count == 0 ? "Customer Registration failed"
				: "Customer Resgistration Sucessfully " + " Deatils:: Principle Amt:" + dto.getpAmt() + "   Time:"
						+ dto.getTime() + "   Rate:" + dto.getRate() + "   InterestAmt:" + intrAmt;
	}

}

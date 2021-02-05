package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.bo.CustomerBO;
import com.nit.dao.ICustomerDAO;
import com.nit.dto.CustomerDTO;

@Service("custService")
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	@Autowired
	private ICustomerDAO dao;

	@Override
	public String generateSimpleInterestAmount(CustomerDTO dto) throws Exception {

//		b.logic to calculate simple interest using pAmt,rate,time

		float intrAmt = (dto.getPAmt() * dto.getRate() * dto.getTime()) / (12 * 100.0f);

//		creating CustomerBo class object 
		CustomerBO bo = new CustomerBO();

		bo.setCName(dto.getCName());
		bo.setCAddr(dto.getCAddr());
		bo.setIntrAmt(dto.getPAmt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntrAmt(intrAmt);

//		use DAO
		int count = dao.insert(bo);

		return count == 0 ? "Customer Registration failed"
				: "Customer Resgistration Sucessfully " + " Deatils:: Principle Amt:" + dto.getPAmt() + "   Time:"
						+ dto.getTime() + "   Rate:" + dto.getRate() + "   InterestAmt:" + intrAmt;
	}
}

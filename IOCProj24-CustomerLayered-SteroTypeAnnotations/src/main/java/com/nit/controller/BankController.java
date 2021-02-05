package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.dto.CustomerDTO;
import com.nit.service.ICustomerMgmtService;
import com.nit.vo.CustomerVO;

@Controller("BankController")
public class BankController {

	@Autowired
	private ICustomerMgmtService service;

	public String processCustomer(CustomerVO vo) throws Exception {

//		convert CustomerVo into CustomerDTO
		CustomerDTO dto = new CustomerDTO();

		dto.setCName(vo.getCName());
		dto.setCAddr(vo.getCAddr());
		dto.setPAmt(Float.parseFloat(vo.getPAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));

//		use Service class
		String result = service.generateSimpleInterestAmount(dto);

		return result;
	}
}

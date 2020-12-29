package com.nit.controller;

import com.nit.dto.CustomerDTO;
import com.nit.service.ICustomerMgmtService;
import com.nit.vo.CustomerVO;

public final class BankController {

	private ICustomerMgmtService service;

	public BankController(ICustomerMgmtService service) {
		this.service = service;

	}

	public String processCustomer(CustomerVO vo) throws Exception {

//		convert CustomerVo into CustomerDTO
		CustomerDTO dto = new CustomerDTO();

		dto.setcName(vo.getcName());
		dto.setcAddr(vo.getcAddr());
		dto.setpAmt(Float.parseFloat(vo.getpAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));

//		use Service class
		String result = service.generateSimpleInterestAmount(dto);

		return result;
	}

}

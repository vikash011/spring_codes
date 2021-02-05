package com.nit.service;

import com.nit.dto.CustomerDTO;

public interface ICustomerMgmtService {

	public String generateSimpleInterestAmount(CustomerDTO dto) throws Exception;
}

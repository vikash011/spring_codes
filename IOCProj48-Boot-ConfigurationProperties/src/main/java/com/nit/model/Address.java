package com.nit.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("Addr")
public class Address {

	private String StreetNO;
	private String Loc;

}

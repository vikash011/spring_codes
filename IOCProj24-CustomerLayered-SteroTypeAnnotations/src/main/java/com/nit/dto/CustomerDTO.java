package com.nit.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cName;
	private String cAddr;
	private float pAmt;
	private float rate;
	private float time;

}

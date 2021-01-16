package com.nit.beans;

import lombok.Getter;
import lombok.Setter;

@Getter // generates Getter methods
@Setter // generates Setter methods

public class Customer {

	private int cid;
	private String cname;
	private String caddr;
	private float billAmt;

}

package com.nit.beans;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE) // generates private Constructor
@RequiredArgsConstructor

public class Customer {

	private int cno;
	@NonNull
	private String cname;
	@NonNull
	private String caddr;
	private float billsAmt;

}
